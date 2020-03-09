package Ex1;

public class Triangulo extends Poligono {
	private double area;
	private double perimetro;
	
	public Triangulo (String nome, double base, double altura) {
		super(nome,base,altura);
		this.area = (base * altura) / 2;
		this.perimetro = 3 * base;
	}
	
	@Override
	public double perimetro() {
		return perimetro;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return area;
	}

}
