package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main (String[] args) {
		
		Department obj = new Department(1, "books");
		System.out.println(obj);
		
		Seller seller = new Seller(21, "Fulano", "fulano@gmail",new Date() , 3000.0, obj);
		
		SellerDao sellerDao = DaoFactory.CreateSellerDao();
		
		System.out.println(seller);
	}
}
