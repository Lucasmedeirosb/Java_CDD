package basico2;

public class forImpar {

	public static void main(String[] args) {
		for (int i = 1; i < 50; i++) {
			if (i % 2 == 0) {
			continue;
		}
		System.out.printf("%d,",i);
	}

	}}
