package Polimorfismo;

public class triangulo {
public double ladoesquerdo;
public double ladodireito;
public double base;

public triangulo(double _ladoesquerdo, double _ladodireito, double _base) {
	this.base=_base;
	this.ladodireito=_ladodireito;
	this.ladoesquerdo=_ladoesquerdo;
}
public double altura() {
	return (this.ladoesquerdo+this.ladodireito+this.base)/2;
}
public double area() {
	return (this.base*((this.ladoesquerdo+this.ladodireito+this.base)/2))/2;
}
public double perimetro() {
	return this.ladoesquerdo+this.ladodireito+this.base;
}
}