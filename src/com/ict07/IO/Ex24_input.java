package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

// ��ü ������ȭ : ObjectInputStream : readObject()

public class Ex24_input {
	public static void main(String[] args) {
		// ��ü ������ȭ : ����ȭ�� �����̳� ������ ���� �������� �����ϴ� ������ ��
		
		String pathname = "c:" + File.separator + "Study" + File.separator 
				+ "Util" + File.separator + "ict08.ser";
		File file = new File(pathname);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			// ������ȭ : ���� ��ü�� �ǵ��� ����.
			ArrayList<Ex24_VO> list = (ArrayList<Ex24_VO>) ois.readObject();
			
			// for���̳� Iterator�� ���
			System.out.println("�̸�\t����\t������\t����");
			for (Ex24_VO k : list) {
				System.out.print(k.getName() + "\t");			
				System.out.print(k.getAge() + "\t");			
				System.out.print(k.getWeight() + "\t");			
				boolean b = k.isGender();
				if (b == true) {
					System.out.println("����");
				} else {
					System.out.println("����");
				}
			}
			
		} catch (Exception e) {
		} finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
	}
}