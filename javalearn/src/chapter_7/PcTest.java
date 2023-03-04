package chapter_7;

import java.util.ArrayList;
import java.util.List;

import jp.dcnet.www.obj.Pc;

public class PcTest {

	public static void main(String[] args) {
		
		
		// array
		
		// List
		
		List<String> list = new ArrayList<>();
		
		list.add("apple");
		
		list.add("orange");
		
		for(String x : list) {
			System.out.println(x);
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
		

//		Pc pc = new Pc();
//
//		Pc pcDell = new Pc("DellXX", "red", "Dell", 1000);
//
//		
//		Pc pc2Huawei = new Pc("Huawei", "red", "Huawei", 9999);
//		
//		
//		
//		System.out.println(pcDell.name);
//		System.out.println(pc2Huawei.name);
		
		Pc  p = new Pc();
		
		String xx = "   xxxxxxxxxx   ";
		
		System.out.println(xx.trim());
		
		
		p.setName("xiaotian");
		
		System.out.println(p.getName());
		
		p.shutdown();
		
	}

}
