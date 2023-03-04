package chapter_13;

import java.io.File;
import java.io.FileFilter;

public class Kicker {
	

	public static void main(String... args) {
		
	
	 File[] excels = new File("home").listFiles(new FileFilter() {
		 
	 
	 @Override
	 
	 public boolean accept(File file) {
		 
	 
	 return file.getName().endsWith(".xlsx") // Excel 2007 以後
			 
	 || file.getName().endsWith(".xls"); // Excel 97 以後
	 
	 }

	
