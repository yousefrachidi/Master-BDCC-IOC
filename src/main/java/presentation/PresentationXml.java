package presentation;


import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationXml {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

        IMetier metier = (IMetier) applicationContext.getBean("metier");

        System.out.println(metier.calcul());
    }
}
