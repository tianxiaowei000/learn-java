package base_2;

/**
 * ⽇本のコインを１円、５円、１０円、１００円、５００円があります。３３４０
円のコイン数をもとめください。
 * @author user
 *
 */
public class Money {

	public static void main(String[] args) {

		int yen, m1, m5, m10, m50, m100, m500;

		yen = 3340;

		m1 = (yen % 10) % 5;
		m5 = (yen % 10) / 5;
		m10 = ((yen % 100) / 10) % 5;
		m50 = (yen % 100) / 50;
		m100 = ((yen % 1000) / 100) % ５;
		m500 = (yen / 500) % 1000;
		System.out.println(m1);
		System.out.println(m5);
		System.out.println(m10);
		System.out.println(m50);
		System.out.println(m100);
		System.out.println(m500);

	}

}
