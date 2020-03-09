package Ex1;

public class Piramide extends Cubo implements Volume{
	
	public Piramide (String nome, double base, double altura, double alturavertical) {
		super(nome,base,altura,alturavertical);
	}
	
	@Override
	public double volume() {
		return this.base * this.altura * this.alturavertical * 1/3;
	}
	
	@Override
	public double perimetro() {
		return 0;
	}
	
	@Override
	public double diagonal() {
		return 0;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
}
