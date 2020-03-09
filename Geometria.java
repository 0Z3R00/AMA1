package Ex1;

import java.util.ArrayList;

public class Geometria {
	public static void main(String[] args) {
		ArrayList<Figura> figura = new ArrayList<>();
		figura.add(new Circulo("Circulo 1", 4));
		figura.add(new Triangulo("Triangulo 1", 4 , 4));
		figura.add(new Losango("Losango 1", 2 , 3));
		figura.add(new Retangulo("Retangulo 1", 2 , 3));
		figura.add(new Quadrado("Quadrado 1", 3 , 3));
		figura.add(new Trapezio("Trapezio 1", 3 , 4 , 2));
		figura.add(new Cilindro("Cilindro 1", 3 , 4));
		figura.add(new Cubo("Cubo 1", 3 , 3, 3));
		figura.add(new Esfera("Esfera 1", 3));
		figura.add(new Piramide("Piramide 1", 3, 3, 3));
		
		for(Figura fig:figura){
			System.out.println("Nome:" + fig.getNome());
			if (fig.area() > 0)  System.out.println("Area:" + fig.area());
			if (fig.perimetro() > 0) System.out.println("Perimetro:" + fig.perimetro());
			if(fig instanceof Diagonal){
				if (((Diagonal)fig).diagonal() > 0) System.out.println("Diagonal:" + ((Diagonal)fig).diagonal());
			}
			if(fig instanceof Volume){
				System.out.println("Volume:" + ((Volume)fig).volume());
			}
			System.out.println("------------------------------");
		}
	}

}
