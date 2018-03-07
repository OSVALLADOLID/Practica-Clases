package practicaClases;

public class Cuadrados extends Figuras {
	private int base;
	private int altura;
	private String tipo;
	private String color;
	
	Cuadrados() {
	}
	
	Cuadrados(int b, int a) {
		base = b;
		altura = a;
	}
	
	Cuadrados(int b) {
		base = b;
	}
	
	Cuadrados(int b, int a, String c) {
		base = b;
		altura = a;
		color = c;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
	
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		return 200;
	}
	
	@Override
	public double calcularPerimetro() {
		return 200;
	}
}
