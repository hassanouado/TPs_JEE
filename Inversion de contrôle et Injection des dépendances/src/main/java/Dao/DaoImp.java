package Dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImp implements Idao{
    @Override
    public double getDATA() {
        System.out.println("version base de donnes");
        double m= 4;
        return m;
    }
}
