package com.mycompany.quanlykhahchang;

import java.util.Scanner;

public class App {
		
		public static void ChucNang() {
   	 	System.out.println("                           ");
   	 	System.out.println("Nhap 1: Tim kiem va hien thi thong tin khach hang  ");
        System.out.println("Nhap 2: Them moi khach hang ");
        System.out.println("Nhap 3: Tich diem cho khach hang ");
        System.out.println("Nhap 4 : Exit");
        System.out.println("                                  ");
        }


	public static void main(String[] args) {
		
                Customer cus1 = new Customer (1,"Y","0357808432",0);
		Customer cus2 = new Customer (2,"H","200",4);
		Customer cus3 = new Customer (3,"T","300",7);
                Customer cus4 = new Customer (4,"Test","400",10);
                
		
                
                int test=10;
		System.out.println("---------Chuc Nang ---------");
		do
		{
			ChucNang();
		System.out.println("Chon chuc nang: ");
       	Scanner inputs = new Scanner(System.in);
       	int line = inputs.nextInt();
       	switch (line) {
         case 1 ->  {
        	 CustomerService.searchCustomer();
         }
         case 2 ->  {
        	 CustomerService.insert();
         }
         case 3 ->  {
        	 CustomerService.getPoint();
         }
         case 4 ->  {
        	 test=0;
         }
         default -> System.out.println("Khong ton tai chuc nang");
             
         }
		} while (test!=0);
		
         }
  
}



 
