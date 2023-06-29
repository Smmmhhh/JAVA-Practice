package Project_1;

import java.io.*;
import java.util.*;

public class ShoppingService{
	
	
	public void productBuy() throws IOException{
		Scanner sc = new Scanner(System.in);
		CustomerService customerService = new CustomerService();
		ProductService productService = new ProductService();
		
		// 고객 정보, 제품정보 파일로 받아와서 ShoppingList에 넣어주기
		customerService.Fileread();
		productService.Fileread();
		ArrayList<CustomerMain> customerList = new ArrayList();
		ArrayList<ProductMain> producList = new ArrayList();
		
		customerList.addAll(customerService.list);
		
		
		
		
	}
	
	public void productRefund() {
		
	}


	
	
	



	

}