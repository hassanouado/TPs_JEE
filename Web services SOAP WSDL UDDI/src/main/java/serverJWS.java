import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class serverJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:4545/",new BanqueService());
        System.out.println("web server deployee sur http://0.0.0.0:9191/  ");
    }
}
