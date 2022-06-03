package com.mycompany.quanlykhahchang;


import com.mycompany.quanlykhahchang.Customer;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerService {
        public static void searchCustomer() {
            Scanner sc = new Scanner ( System.in);
            System.out.println("Nhap sdt: ");
            String phone = sc.nextLine();
            try {
                Customer.searchCustomer(phone).Display();
            }
            catch (Exception e) {
                System.out.println("Khong co khach hang");
            }
        }


	
	
//Thêm mới khách hàng
		public static void insert() {
		Scanner inputs = new Scanner(System.in);
		System.out.println ("Nhap sdt: ");
		String phone = inputs.nextLine();
		try {
				if (Customer.searchCustomer(phone)== null) {
				System.out.println("Thong tin:");
				System.out.print("ID: ");
				int id = inputs.nextInt();	
				System.out.println("Ten KH: ");
				String name = inputs.next();
				System.out.println("Diem tich luy :");
				int point = inputs.nextInt();
				
				Customer a = new Customer(id, name, phone, point);
				System.out.print("Them moi thanh cong");
				}
				else {
					System.out.println("Da ton tai khach hang");
				}
				
				

			} catch (InputMismatchException ei) {
				System.out.println("Khong hop le");
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

//Tích điểm cho khách hàng
			public static void getPoint() {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Sdt : ");
		        String a=sc.nextLine();
		        System.out.println("so diem : ");
		        int b=sc.nextInt();
		        Customer.searchCustomer(a).setPoint(b+Customer.searchCustomer(a).getPoint());
				System.out.println("so diem hien tai: " + Customer.searchCustomer(a).getPoint());
		        
		}
}

