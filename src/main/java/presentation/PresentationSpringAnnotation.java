package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationSpringAnnotation {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("metier", "dao");

        IMetier metier = context.getBean(IMetier.class);

        System.out.println(metier.calcul());

    }
}
