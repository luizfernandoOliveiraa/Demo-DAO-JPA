package src.model.dao;

import src.model.entities.Department;
import src.model.entities.Seller;

import java.sql.SQLException;
import java.util.List;

public interface SellerDao {

    void insert(Seller obj);

    void update(Seller ob);

    void deleteById(Integer id);

    Seller findById(Integer id) throws SQLException;

    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}