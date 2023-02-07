package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== Test FindById ===");
		DepartmentDao departmentDao = DaoFactory.CreateDepartmentDao();

		Department dep = departmentDao.findById(3);
		
		System.out.println(dep);
		
		
		
		System.out.println("=== Test FindAll ===");
		List<Department> obj = departmentDao.findAll();
		
		for(Department dp : obj) {
			System.out.println(dp);
		}
		
		
		System.out.println("=== Test Insert ===");
		//departmentDao.insert(new Department());
		
		
		System.out.println("=== Test update ===");
		
		Department oii = departmentDao.findById(2);
		oii.setName("musica");
		departmentDao.update(oii);
		System.out.println("=== Update okkk ===");
		
		
		System.out.println("=== Test Delete ===");
		
		departmentDao.deleteById(sc.nextInt());
		
		System.out.println("=== Delete completed ===");
		
		sc.close();
	}

}
