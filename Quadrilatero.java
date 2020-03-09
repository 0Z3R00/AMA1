package Ex1;

public class Quadrilatero extends Poligono {
	protected double area;
	protected double perimetro;
	
	public Quadrilatero (String nome, double base , double altura) {
		super(nome,base,altura);
		this.area = base * altura;
		this.perimetro = (2 * base) + (2 * altura);
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

}
