package example;
import QiYeJianMo.*;

public class HelloWorldClient {
  public static void main(String[] argv) {
      try {
          WeatherWebServiceLocator locator = new WeatherWebServiceLocator();
          WeatherWebServiceSoap_PortType service = locator.getWeatherWebServiceSoap();

          String[] reply = service.getWeatherbyCityName("汕头");

          for (int i = 0; i < reply.length; i++) {
              System.out.println(reply[i]);
          }

      } catch (javax.xml.rpc.ServiceException ex) {
          ex.printStackTrace();
      } catch (java.rmi.RemoteException ex) {
          ex.printStackTrace();
      }  
  }
}
