package Ex1;

public class Retangulo extends Quadrilatero implements Diagonal {
	
	public Retangulo (String nome, double base, double altura) {
		super(nome,base,altura);
	}
	
	@Override
	public double diagonal() {
		return Math.sqrt(Math.pow(this.base,2) + Math.pow(this.altura,2));
	}
	
	@Override
	public double perimetro() {
		return this.perimetro;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return area;
	}

}