package main.java.rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClientController {
  private static final String HOST = "localhost";
  private static final int PORT = 1099;
  private static Registry registry;

  @RequestMapping(value = "/weathers", produces = "application/json")
  @ResponseBody
    public String getWeatherData(String location) throws RemoteException, NotBoundException {
      registry = LocateRegistry.getRegistry(HOST, PORT);

      WeatherService service = (WeatherService) registry.lookup(WeatherService.class.getSimpleName());

      String res = service.getWeatherData();
      
      return "[" + res + "]";
    }
}
