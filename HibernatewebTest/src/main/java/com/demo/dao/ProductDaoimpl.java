package com.demo.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dem.bean.Product;

public class ProductDaoimpl implements ProductDao{
Session s;
public ProductDaoimpl() {
	Configuration cfg=new Configuration();
	cfg.configure().addAnnotatedClass(Product.class);
	SessionFactory sf=cfg.buildSessionFactory();
	s=sf.openSession();
	
}
	
	
	public void addProduct(Product p) {
		Transaction t=s.beginTransaction();
		s.save(p);
		t.commit();
		s.close();
	}


	public List<Product> getallproduct() {
		Query q=s.createQuery("from Product");
		List<Product>l=q.list();
		return l;
	}


	public Product searchbyId(Product p) {
		Transaction t= s.beginTransaction();
		Product pd=(Product)s.load(Product.class, p.getProductid());
		t.commit();
		return pd;
	}


	public void updateProduct(Product p) {
		Transaction t=s.beginTransaction();
		Product pd=(Product)s.get(Product.class, p.getProductid());
		pd.setCatagory(p.getCatagory());
		pd.setPrice(p.getPrice());
		pd.setProdname(p.getProdname());
		pd.setQuantity(p.getQuantity());
		System.out.println("update");
		t.commit();
	}


	public int deletebyId(Product p) {
		Transaction t=s.beginTransaction();
		s.delete(p);
		System.out.println("deleted");
		t.commit();
		return 1;
	}

}
