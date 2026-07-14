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

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        for (Seller obj : sellerDao.findByDepartment(
                department)) {
            System.out.println(obj);
        }

    }
}
