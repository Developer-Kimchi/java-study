package randomClass;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random random = new Random();
		random.nextInt(2);
		
		for (int i = 0; i < 100; i++) {
			System.out.println(random.nextInt(2));
		}
	}
}
