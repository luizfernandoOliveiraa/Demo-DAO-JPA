package src.application;

import src.model.dao.DaoFactory;
import src.model.dao.SellerDao;
import src.model.entities.Department;
import src.model.entities.Seller;

import java.sql.SQLException;
import java.util.Date;

public class Main {

    static void main() throws SQLException {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);


    }
}
