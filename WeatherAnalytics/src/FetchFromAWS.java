

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONValue;

public class FetchFromAWS {

  public static void main(String[] args) {
    String urlString = "http://52.53.219.101:5700/weathers";

    try {
      URL url = new URL(urlString);
      HttpURLConnection http = (HttpURLConnection) url.openConnection();
      http.connect();

      BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));

      String line = br.readLine();

      Object obj = JSONValue.parse(line);
      JSONArray jsonarray = (JSONArray) obj;
      Util util = new Util();
      FileWriter fw = new FileWriter(util.datafile1);
            
      fw.write("[" + "\n");
      
      for (int i = 0; i < jsonarray.size(); i++) {
        String str = jsonarray.get(i).toString();
        
        if (i != jsonarray.size() - 1) str += ",\n";
               
        fw.write(str);
        fw.flush();
        
      }
      
      fw.write("\n" + "]");
      System.out.println("Successfully Copied JSON Object to File...");
      fw.close();

    } catch (MalformedURLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }



  }

}
