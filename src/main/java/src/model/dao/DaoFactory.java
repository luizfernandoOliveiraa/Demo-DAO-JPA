package src.model.dao;

import src.model.dao.impl.SellerDaoJPA;

public class DaoFactory {

    public static SellerDao createSellerDao(){
        return new SellerDaoJPA();
    }
}
