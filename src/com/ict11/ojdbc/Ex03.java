package com.ict11.ojdbc;

import java.util.Scanner;

import com.ict10.jdbc.DAO2;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		esc:while(true) {
			// book���̺��� ��ü ���� ���� 
			DAO.getInstance().getList();
			
			System.out.println("=================================");
			System.out.println("������ �����ϼ���");
			System.out.println("1.�����ϱ�");
			System.out.println("2.�����ϱ�");
			System.out.println("3.�����ϱ�");
			System.out.println("4.�˻��ϱ�");
			System.out.print("���ù�ȣ : ");
			String su = scan.next();
			switch (su) {
			case "1":
				System.out.print("bookid : ");
				int i_bookid = scan.nextInt();
				
				System.out.print("bookname : ");
				String i_bookname = scan.next();
				
				System.out.print("publisher : ");
				String i_publisher = scan.next();
				
				System.out.print("price : ");
				int i_price = scan.nextInt();
				
				// �����ϴ� �޼ҵ� ȣ��
				DAO.getInstance().getInsert(i_bookid, i_bookname, i_publisher, i_price);
				break;
			case "2":
				System.out.println("������ id : ");
				int delete_id = scan.nextInt(); 
				// ������ �޼ҵ�
				DAO.getInstance().getDelete(delete_id);
				break;
			case "3":
				System.out.print("bookid : ");
				int u_bookid = scan.nextInt();
				System.out.print("bookname : ");
				String u_bookname = scan.next();
				System.out.print("publisher : ");
				String u_publisher = scan.next();
				System.out.print("price : ");
				int u_price = scan.nextInt();
				// �����ϴ� �޼ҵ�
				DAO.getInstance().getUpdate(u_bookid, u_bookname, u_publisher, u_price);
				break;
			case "4":
				System.out.println("�˻��� id : ");
				int select_id = scan.nextInt(); 
				// �˻��� �޼ҵ�
				DAO.getInstance().getSelect(select_id);
				break;
			default: 
				System.out.println("����� �����ϼ���"); 
				continue esc;
			}
			while(true) {
				System.out.print("����ұ��(y/n)? ");
				String msg = scan.next();
				if(msg.equalsIgnoreCase("y")) {
					continue esc;
				}else if(msg.equalsIgnoreCase("n")) {
					break esc;
				}else {
					continue;
				}
			}
		}
		
		System.out.println("���� ����� ���� �Դϴ�."); 
		DAO.getInstance().getList();
		System.out.println("�����ϼ̽��ϴ�.");
	}
}
