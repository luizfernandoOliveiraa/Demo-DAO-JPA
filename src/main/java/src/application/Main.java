package src.application;

import src.model.entities.Department;
import src.model.entities.Seller;

import java.util.Date;

public class Main {

    static void main() {

        Department obj = new Department(1, "Books");

        Seller seller = new Seller(2000.0, new Date(), obj, "bob@gmail.com", 1, "Bob");

        System.out.println(obj);
        System.out.println(seller);
    }
}
