package presentation;

import Dao.DaoImp;
import metier.Impmetier;

public class AppInstanciationStatique {
    public static void main(String[] args) {
        DaoImp daoImp = new DaoImp();
        Impmetier impmetier = new Impmetier(daoImp);
        System.out.println(impmetier.calculer());
    }
}
