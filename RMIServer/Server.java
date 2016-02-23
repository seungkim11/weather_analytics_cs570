package main.java.rmi;


import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Date;
import java.util.HashMap;
import java.util.Timer;

public class Server {
  private static final int PORT = 1099;
  private static Registry registry;
  private static HashMap<String, Integer> woeids;

  public static void startRegistry() throws RemoteException {
    registry = LocateRegistry.createRegistry(PORT);
  }

  public static void registerObject(String name, Remote remoteObj)
      throws AccessException, RemoteException, AlreadyBoundException {
    registry.bind(name, remoteObj);
    System.out.println(
        "Registered: " + name + " -> " + remoteObj.getClass().getName() + "[" + remoteObj + "]");
  }

  public static void main(String[] args) throws RemoteException, AlreadyBoundException {
    System.out.println("Server starting.. ");
    startRegistry();
    registerObject(WeatherService.class.getSimpleName(), new WeatherServiceImpl());
    System.out.println("Server started on " + new Date());

    Timer timer = new Timer();
    int second = 3600;
    woeids = new HashMap<>();
    woeids.put("la", 2442047);
    woeids.put("ny", 2459115);
    woeids.put("chicago", 2379574);
    woeids.put("seattle", 2490383);
    woeids.put("denver", 2391279);
    woeids.put("sf", 2487956);
    woeids.put("austin", 12590014);
    
    
    for (String key: woeids.keySet()){
      Fetcher fetcher = new Fetcher(woeids.get(key));

      // runs every 1 hour
      timer.scheduleAtFixedRate(fetcher, 0, second * 1000);
    }
  }
}
