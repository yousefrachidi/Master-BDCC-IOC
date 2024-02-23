package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class IDaoImpl implements IDao {


    @Override
    public double getData() {
        return 21;
    }
}
