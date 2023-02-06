package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("=== TEST 1: Seller FindByID ===");
		
		SellerDao sellerDao = DaoFactory.CreateSellerDao();
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println();
		
		System.out.println("=== TEST 2: Seller FindByDepartment  ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("=== TEST 3: Seller FindAll  ===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== TEST 4: Seller Insert  ===");
		Seller newSeller = new Seller(null, "greg", "greg@email.com", new Date(), 4000.0,department );
		sellerDao.insert(newSeller);
		System.out.println("Inserted! new id = " + newSeller.getId());
		
		System.out.println("=== TEST 5: Seller Update  ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Seller update!");
		
		System.out.println("=== TEST 6: Seller Delete  ===");
		System.out.println("=== Enter id for delete test  ===");
		sellerDao.deleteById(sc.nextInt());
		System.out.println("=== Delete completed === ");
		
		sc.close();
	}
}
