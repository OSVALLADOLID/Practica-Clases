package practicaClases;

public class AppFiguras {

	public static void main(String[] args) {
		Figuras figura1;
		figura1 = new Triangulos(10, 10);
		
		Figuras figura2 = new Circulos(20);
		
		Figuras figura3 = new Cuadrados();
		
		Figuras figura4 = new Triangulos(17, 17, "Rojo");
		
		Triangulos triangulo1 = new Triangulos();
		
		triangulo1.setBase(40);
		triangulo1.setAltura(40);
		triangulo1.setColor("Verde");
		
		figura1.setColor("Azul");
		figura2.setAltura(20);
		figura3.setBase(30);
		figura3.setAltura(30);
		
		triangulo1.setTipo("Equilatero");
		
		System.out.println("Valores Figura 1:");
		System.out.println(figura1.getBase());
		System.out.println(figura1.getAltura());
		System.out.println(figura1.getColor());
		System.out.println("Valores Figura 2:");
		System.out.println(figura2.getBase());
		System.out.println(figura2.getAltura());
		System.out.println("Valores Figura 3:");
		System.out.println(figura3.getBase());
		System.out.println(figura3.getAltura());
		System.out.println("Valores Figura 4:");
		System.out.println(figura4.getBase());
		System.out.println(figura4.getAltura());
		System.out.println(figura4.getColor());
		System.out.println("Valores Figura 5:");
		System.out.println(triangulo1.getBase());
		System.out.println(triangulo1.getAltura());
		System.out.println(triangulo1.getColor());
		System.out.println(triangulo1.getTipo());
	}

}
