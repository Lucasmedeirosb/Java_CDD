package Encapsulamento;

public class Retangulo {
	private double Base;
	private double Altura;
	
	public Retangulo(double _base, double _altura) {
		this.Base=_base;
		this.Altura=_altura;
		
	}
	
	public double CalculoArea() {
		return this.Base*this.Altura;
	}
	
	public double CalculoPerimetro() {
		return (this.Base+this.Altura)*2;
	}

	public double getBase() {
		return Base;
	}

	public void setBase(double base) {
		Base = base;
	}

	public double getAltura() {
		return Altura;
	}

	public void setAltura(double altura) {
		Altura = altura;
	}
	
}
