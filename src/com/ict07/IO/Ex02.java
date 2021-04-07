package com.ict07.IO;

import java.io.File;

public class Ex02 {
	public static void main(String[] args) {
		String pathname1 = "C:\\Study\\Util"; // �ü���� window�� ��
		String pathname2 = "C:/Study/Util"; // �ü���� Linux, Unix�� ��
		
		// �ü���� ������� ����ϴ� ���
		String pathname3 = "C:" + File.separator + "Study" + File.separator + "Util" + File.separator + "01_���α׷��� Ȱ��";
		
		File file = new File(pathname3);
		String[] arr = file.list();
		for (String k : arr) {
			// System.out.println(k);
			File file2 = new File(pathname3, k);
			// System.out.println(file2);
			if (file2.isDirectory()) {
				System.out.println("���丮 : " + file2);
			} else {
				System.out.println("���� : " + file2);
			}
		}
	}
}
