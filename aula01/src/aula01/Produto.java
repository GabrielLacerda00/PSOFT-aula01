package aula01;

public class Produto {
	private int id;
	private String name;
	private String fabricante;
	
	
	
	public Produto(int id, String name, String fabricante) {
		super();
		this.id = id;
		this.name = name;
		this.fabricante = fabricante;
	}



	@Override
	public String toString() {
		return "Produto [id=" + id + ", name=" + name + ", fabricante=" + fabricante + "]";
	}
}

