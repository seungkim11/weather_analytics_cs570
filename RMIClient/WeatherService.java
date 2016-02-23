package main.java.rmi;


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface WeatherService extends Remote{
  
  public String getWeatherData() throws RemoteException;
  
  
}
