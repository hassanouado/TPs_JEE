package presentation;

import metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class APPanotationSpring {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("Dao","metier","ext");
        Imetier imetier = context.getBean(Imetier.class);
        System.out.println("resulate==>"+imetier.calculer());

    }
}
