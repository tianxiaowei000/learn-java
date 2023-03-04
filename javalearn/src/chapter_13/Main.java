package chapter_13;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		//Fileクラスに読み込むファイルを指定する
		String path = ("C:\\Users\\user\\Desktop\\tian\\mensetu.txt");

		try (FileInputStream fs = new FileInputStream(path);

				InputStreamReader fr = new InputStreamReader(fs, "Shift-JIS");

				BufferedReader br = new BufferedReader(fr)) {
			 String line;
			while ((line = br.readLine()) != null) {
				 //String[] temp = line.split(",");
				  //df.addRow(temp);
				System.out.println(line);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
