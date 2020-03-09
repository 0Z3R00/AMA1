package Ex1;

public class Esfera extends Circulo implements Volume {

	public Esfera (String nome, double raio) {
		super(nome,raio);
	}
	
	@Override
	public double volume() {
		return Math.PI * (Math.pow(this.raio, 3) * 0.75);
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
