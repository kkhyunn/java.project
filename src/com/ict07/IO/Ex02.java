package com.ict07.IO;

import java.io.File;

public class Ex02 {
	public static void main(String[] args) {
		String pathname1 = "C:\\Study\\Util"; // 운영체제가 window일 때
		String pathname2 = "C:/Study/Util"; // 운영체제가 Linux, Unix일 때
		
		// 운영체제와 상관없이 사용하는 방법
		String pathname3 = "C:" + File.separator + "Study" + File.separator + "Util" + File.separator + "01_프로그래밍 활용";
		
		File file = new File(pathname3);
		String[] arr = file.list();
		for (String k : arr) {
			// System.out.println(k);
			File file2 = new File(pathname3, k);
			// System.out.println(file2);
			if (file2.isDirectory()) {
				System.out.println("디렉토리 : " + file2);
			} else {
				System.out.println("파일 : " + file2);
			}
		}
	}
}
