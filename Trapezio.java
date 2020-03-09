package Ex1;

public class Trapezio extends Poligono {
	private double area;
	private double perimetro;
	
	public Trapezio (String nome, double base, double altura, double basemenor) {
		super(nome,base,altura);
		this.area = ((base + basemenor) * altura) / 2;
		this.perimetro = base + basemenor + (2 * altura);
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
