package src.application;

import src.model.dao.DaoFactory;
import src.model.dao.SellerDao;
import src.model.entities.Department;
import src.model.entities.Seller;

import java.util.Date;

public class Main {

    static void main() {

        Department obj = new Department(1, "Books");

        Seller seller = new Seller(2000.0, new Date(), obj, "bob@gmail.com", 1, "Bob");

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(obj);
        System.out.println(seller);
    }
}
