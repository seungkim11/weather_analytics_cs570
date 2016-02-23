package main.java.rmi;


import java.net.UnknownHostException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Iterator;
import java.util.List;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class WeatherServiceImpl extends UnicastRemoteObject implements WeatherService{

  private static final long serialVersionUID = 1L;
  private DBCollection collection;
  
  protected WeatherServiceImpl() throws RemoteException {
    super();
    try {
      MongoClient mongo = new MongoClient("localhost", 27017);
      DB db = mongo.getDB("cs570");
      collection = db.getCollection("weathers_cities");
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }
  }

  @Override
  public String getWeatherData() throws RemoteException {
    DBCursor cursor = collection.find();
    
    String res = "";
    
    while (cursor.hasNext()){
      DBObject doc = cursor.next();
      res += doc.toString();
      // add a comma if not the last element
      if (cursor.hasNext()) res += ", ";
    }
    return res;
  }

}
