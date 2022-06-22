package ch13;

import java.io.File;

public class FileClassExample {
public static void main(String[] args) {
	File f1=new File("c:\\windows\\system.ini");
	System.out.println(f1.getAbsolutePath()+", "+f1.getParent()+", "+f1.getName());
	String res="";
	
	if(f1.isFile()) {
		res="����";
		
	}else if(f1.isDirectory()) res="���丮";
	System.out.println(f1.getPath()+"��"+ res+"�Դϴ�.");
	
	File f2= new File("c:\\temp\\java_sample");
	if(!f2.exists()) f2.mkdir();
	listDirectory(new File("c:\\temp"));
	f2.renameTo(new File("c:\\temp\\javasample"));
	listDirectory(new File("c:\\temp"));
	
}

public static void listDirectory(File dir) {
	System.out.println("---- "+dir.getPath()+"�� ���� ����Ʈ ��-----");
	File[] subFiles=dir.listFiles();
	
	for(int i=0;i<subFiles.length;i++) {
		File f= subFiles[i];
		long t=f.lastModified();
		System.out.print(f.getName());
		System.out.print("\t ���� ũ�� : "+f.length());
		System.out.printf("\t������ �ð�:%tb %td %ta %tT\n",t,t,t,t);
	}
}
}
