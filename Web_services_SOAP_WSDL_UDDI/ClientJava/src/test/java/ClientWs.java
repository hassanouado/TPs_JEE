
import mypackage.BanqueServiceService;
import mypackage.BanqueWS;
import mypackage.Compte;

public class ClientWs {
    public static void main(String[] args) {
    BanqueWS banqueWS = new BanqueServiceService().getBanqueWSPort();
        System.out.println(banqueWS.convertEuroToDH(5));
        Compte compte = banqueWS.getCompte(4);
        System.out.println(compte.getCode());
        System.out.println(compte.getSolde());
    }
}
