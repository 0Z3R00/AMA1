package Ex1;

public class Cilindro extends Circulo implements Volume {
	private double altura;

	public Cilindro (String nome, double raio, double altura) {
		super(nome,raio);
		this.altura = altura;
	}
	
	@Override
	public double volume() {
		return Math.PI * (Math.pow(this.raio, 3) * this.altura);
	}
	
	@Override
	public double perimetro() {
		return 0;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
}
