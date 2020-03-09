package Ex1;

public class Circulo extends Figura {
	private double area;
	private double perimetro;
	protected double raio;
	
	public Circulo (String nome, double raio) {
		super(nome);
		this.raio = raio;
		this.area = (Math.PI) * (Math.pow(this.raio, 2));
		this.perimetro = Math.PI * 2 * this.raio;
		
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