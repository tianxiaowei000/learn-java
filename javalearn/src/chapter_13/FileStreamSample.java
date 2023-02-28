package chapter_13;

import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileStreamSample {

	public static void main(String... args) {
		
		try {
			File file = new File("C:\\Test\\data.dat");
			
			FileInputStream in = new FileInputStream(file); // 1. ストリームを開く
			
			byte[] data = new byte[20];
			
			in.read(data); // 2. データ操作
			
			in.close(); // 3. ストリームを閉じる
			
		} catch (Exception ex) {
			
			Logger.getLogger(FileStreamSample.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}
}
