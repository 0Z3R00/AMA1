package Ex1;

public abstract class Poligono extends Figura {
	protected double base;
	protected double altura;
	
	
	public Poligono (String nome, double base,double altura) {
		super(nome);
		this.altura = altura;
		this.base = base;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
