package Ex1;

public class Quadrado extends Quadrilatero implements Diagonal{
	
	public Quadrado (String nome, double base, double altura) {
		super(nome,base,altura);
		
	}
	
	@Override
	public double perimetro() {
		return this.perimetro;
	}
	
	@Override
	public double diagonal() {
		return this.base * Math.sqrt(2);
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return area;
	}

}