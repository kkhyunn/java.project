package com.ict07.IO;

public class Ex01 {
	// File Ŭ���� : Ư�� ��ġ�� �����ϴ� �����̳� ���丮(����)�� ó���ϴ� Ŭ����
	// ������ : File(File parent, String child), File(String pathname)
	//			File(String parent, String child), File(URI uri)
	//		** parent => �������, child => �������
	//		   parent + child => ��ü���
	//		   pathname => ��ü���
	//		   uri => ���� ��Ʈ��ũ�� �� �ʿ�
	
	// �ֿ� �޼ҵ�
	// - createNewFile() : boolean => ������ �����ϸ� true, ���ϸ� false
	// - mkdir(), mkdirs() : boolean => ���丮�� �����ϸ� true, ���ϸ� false
	// - mkdir(), mkdirs() ������
	//  ������� �ϴ� ���丮�� ���� ���丮�� �������� ���� ��� ���� �Ұ� => mkdir();
	//  ��) c:\base\want => want ���丮�� ���� ��, base ���丮�� ���� ��� ���� �Ұ�
	//						���� ���丮�� base�� want ���丮���� ������ش� => mkdirs();
	
	// - delete() : ����, ���丮 ����
	// - isDirectory() : ���丮�̸� true
	// - isFile() : �����̸� true
	// ** �������鿡�� ��ǻ�Ϳ��� ���ϰ� ���丮�� �����Ѵ�.
	//	  ��, ������ �ƴϸ� ���丮�̴�. ���丮�� �ƴϸ� �����̴�.
	
	// - list() : ������ ��ġ�� ���� �� ���丮�� String[]�� ��´�.
	// - length() : �迭�̳� String������ ���̸� ��������
	//				File Ŭ���������� ���̰� �ƴ϶� ������ ũ�⸦ byte�� ǥ���� ��
	//				(�뷮 : byte => KB => MB => GB => TB ())
	
	// - getAbsolutePath() : ������ ǥ��
	//						 ����� Ǯ����(���ۺ��� ������) => ���⼭ ������ ��Ʈ�� ���Ѵ�.
	// - getPath() : ����� ǥ��
	//				 ���� ��ġ���� �ش� ���ϱ��� �����ϱ����� ���ľ��ϴ� ���
	// - getCanonicalPath() : ����ȭ ���
	
	// - lastModified() : ������ ���� ��¥
	
	
}