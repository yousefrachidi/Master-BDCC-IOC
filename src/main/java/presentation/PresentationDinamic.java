package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationDinamic {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("config.txt"));

            String className = scanner.nextLine();
            Class cDao = Class.forName(className);
            IDao dao = (IDao) cDao.getConstructor().newInstance();
            System.out.println(dao.getData());

            String metierClassName = scanner.nextLine();
            Class cMeter = Class.forName(metierClassName);
            IMetier metier = (IMetier) cMeter.getConstructor().newInstance();

            Method setDao = cMeter.getDeclaredMethod("setDao", IDao.class);
            setDao.invoke(metier, dao);
            System.out.println(metier.calcul());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
