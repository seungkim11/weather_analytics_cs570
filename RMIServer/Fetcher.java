package main.java.rmi;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.TimerTask;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

public class Fetcher extends TimerTask{
  private String urlString;
  private HttpURLConnection request;
  private URL url;
  
  public Fetcher(Integer woeid){
    this.urlString = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast"
        + "%20where%20woeid%3D" + woeid +"&format=json&diagnostics=true&callback=";
  }
    
  @Override
  public void run() {
    
    try {
      this.url = new URL(urlString);
      this.request = (HttpURLConnection) url.openConnection();
      request.connect();
      System.out.println("Connecting to yahoo weather..");
      BufferedReader in = new BufferedReader(new InputStreamReader(request.getInputStream()));
      System.out.println("Getting data..");
      String jsonstring = in.readLine();
      
      MongoClient mongo = new MongoClient("localhost", 27017);
      DB db = mongo.getDB("cs570");
      DBCollection collection = db.getCollection("weathers_cities");
      
      DBObject dbObject = (DBObject) JSON.parse(jsonstring);
      System.out.println("Saving to mongodb at port 27017, db: cs570, collection: weathers");
      collection.insert(dbObject);
      System.out.println("Data fetched on: " + new Date() + "\n");
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } 
  }
}
