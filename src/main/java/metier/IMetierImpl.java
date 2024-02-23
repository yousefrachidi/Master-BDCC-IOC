package metier;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("metier")
public class IMetierImpl implements IMetier {

    private IDao dao;


    @Override
    public double calcul() {
        double t = dao.getData();
        return t*23;
    }



    public IMetierImpl(IDao iDao) {
        this.dao = iDao;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }


}
