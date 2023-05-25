package com.demo.dao;
import java.util.List;

import com.dem.bean.*;
public interface ProductDao {
public void addProduct(Product p) ;
public List<Product> getallproduct();
public Product searchbyId(Product p);
public void updateProduct(Product p);
public int deletebyId(Product p);

}
