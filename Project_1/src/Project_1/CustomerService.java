package Project_1;

import java.io.*;
import java.util.*;

class CustomerService {
	// Customer Main에서 필드값 리스트로 만들기
	ArrayList<CustomerMain> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	// 고객 정보 입력
	public void insert() {
		// id입력받기 
		System.out.println("id을 입력하세요. ");
		String id = sc.next();		
		
		// 이름 입력받기
		System.out.println("이름을 입력하세요. ");
		String name = sc.next();
		
		// 나이 입력받기 
		System.out.println("나이를 입력하세요. ");
		int age = sc.nextInt();
		
		
		//성별 입력받기 
		System.out.println("성별를 입력하세요.(남/여)"); 
		String gender = sc.next();		
		while(!(gender.equals("남") || gender.equals("여"))) {
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			gender = sc.next();
		}
		
		//주소 입력받기 
		System.out.println("주소를 입력하세요. ");
		String address = sc.nextLine();
		sc.nextLine();
		
		// 휴대폰 번호 입력받기 
		System.out.println("휴대폰 번호를 입력하세요. ");
		String phonenumber = sc.next();        		
		
		// 입력받은 값을을 리스트에 저장
		list.add(new CustomerMain(id,name,age,gender,address,phonenumber));
		
		// 저장한 리스트 값 출력
//		System.out.println("--test--");
//		
//		for(int i = 0; i < list.size(); i++) {
//			CustomerMain member = list.get(i);
//			System.out.println("id : "+id+" "+", name : "+name+", age : "+age);
//		}
	}
	
	
	// 고객정보 수정
	public void edit(){
		
		
		
	}
	
	// 고객정보 삭제
	public void delete(){
		
	}
	
	
}
