package ext;

import Dao.Idao;
import org.springframework.stereotype.Component;

@Component("dao2")

public class DaoImp2 implements Idao {
    @Override
    public double getDATA() {
        System.out.println("version capture");
        double temp = 6000;
        return temp;
    }
}
