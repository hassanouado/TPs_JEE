package presentation;

import Dao.Idao;
import metier.Imetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class AppInstanciationDynamique {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));
        String DaoClassNmae = scanner.nextLine();
        Class cDao = Class.forName(DaoClassNmae);
        Idao dao = (Idao) cDao.newInstance();
        String metierClassNmae = scanner.nextLine();
        Class cmetier = Class.forName(metierClassNmae);
        Imetier metier = (Imetier) cmetier.newInstance();
        Method method = cmetier.getMethod("setIdao",Idao.class);
        method.invoke(metier,dao);
         System.out.println(metier.calculer());
    }
}
