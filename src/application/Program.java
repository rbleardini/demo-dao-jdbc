package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao(); //injecao de dependencia -> sem explicitar a implementacao
		
		System.out.println("=== TEST 1: seller findById ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("=== TEST 2: List<seller> findByDepartment ====");
		List<Seller> sellers = sellerDao.findByDepartment(new Department(2, null));
		System.out.println(sellers);
	}

}
