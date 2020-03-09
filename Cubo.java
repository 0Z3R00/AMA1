package Ex1;

public class Cubo extends Quadrado implements Volume{
	protected double alturavertical;
	
	public Cubo (String nome, double base, double altura, double alturavertical) {
		super(nome,base,altura);
		this.alturavertical = alturavertical;
	}
	
	@Override
	public double volume() {
		return this.base * this.altura * this.alturavertical;
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
