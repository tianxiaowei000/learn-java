package chapter_13;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

public class Question1 {
	public static void main(String[] args) {
	  String path = ("C:\\Users\\user\\Desktop\\tian\\mensetu.txt");

      DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
      
      int row = jTable1.getSelectedRow();
      
      int column = 0;

      String xxNo = jTable1.getValueAt(row, column).toString();

      List<String> userInfoList = new ArrayList<String>();

      try (FileInputStream fs = new FileInputStream(path);
              InputStreamReader fr = new InputStreamReader(fs, "Shift-JIS");
              BufferedReader br = new BufferedReader(fr)) {

          String line;
          
          while ((line = br.readLine()) != null) {

              String[] userInfo = line.split(",");

              if (xxNo.equals(userInfo[0])) {
                  continue;

              }
              userInfoList.add(line);

          }

      } catch (FileNotFoundException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      }

      for (String line : userInfoList) {
          System.out.println(line);
      }
}
