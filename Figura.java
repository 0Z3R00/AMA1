package Ex1;

public abstract class Figura {
	private String nome;
	public abstract double area();
	public abstract double perimetro();
	
	public Figura (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
		
}
