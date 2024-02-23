package presentation;

import dao.IDao;
import dao.IDaoImpl;
import metier.IMetierImpl;

public class PresentationStatic {
    public static void main(String[] args) {
        IDao iDao= new IDaoImpl();
        IMetierImpl metier = new IMetierImpl(iDao);

        System.out.println(metier.calcul());
    }
}
