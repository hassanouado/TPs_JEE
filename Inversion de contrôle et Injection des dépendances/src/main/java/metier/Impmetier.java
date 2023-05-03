package metier;

import Dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class Impmetier implements  Imetier{
    public Impmetier(Idao idao) {
        this.idao = idao;
    }

    @Autowired
    @Qualifier("dao")
    private Idao idao;
    @Override
    public double calculer() {
        System.out.println("vesrion baase");
        double m = idao.getDATA();
        return m*3;
    }

    public void setIdao(Idao idao) {
        this.idao = idao;
    }
}
