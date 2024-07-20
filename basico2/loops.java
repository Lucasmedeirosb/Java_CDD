package basico2;

public class loops {

	public static void main(String[] args) {
		for(int i = 1; i< 100; i++) {
			if(i % 3 == 0) {
				System.out.printf("Achei um número divisível por 3 entre x e y: %d", i);
				break;
			}
		}
	}
	}
	
