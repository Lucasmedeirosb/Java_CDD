package Polimorfismo;

public class main {

	public static void main(String[] args) {
		triangulo t1 = new triangulo(4.0, 5.0, 3.0);
		retangulo r1 = new retangulo(4.0, 2.0);
		double alturat1=t1.altura();
		System.out.println(alturat1);
		double perimetror1=r1.perimetro();
		double arear1=r1.area();
		System.out.printf("Perimetro do retângulo = %.2f, Área do retangulo = %.2f", perimetror1, arear1);
		
	}

}