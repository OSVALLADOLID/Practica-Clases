package practicaClases;

public abstract class Figuras implements IFiguras, IFiguras2 {
	private int base;
	private int altura;
	private String color;
	private double area;
	private double perimetro;
	
	Figuras(int b, int a) {
		base = b;
		altura = a;
	}
	
	Figuras() {
	}
	
	Figuras(int b) {
		base = b;
	}
	
	Figuras(int b, int a, String c) {
		base = b;
		altura = a;
		color = c;
	}
	
	public void setAltura(int _altura) {
		altura = _altura;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public int getBase() {
		return base;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area * 2;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
}
