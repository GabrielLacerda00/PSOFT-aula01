package aula01;

public class Lote {
	
	private int id;
	private Produto TipoDeProduto;
	private int quantidade;
	
	
	public Lote(int id, Produto tipoDeProduto, int quantidade) {
		super();
		this.id = id;
		TipoDeProduto = tipoDeProduto;
		this.quantidade = quantidade;
	}


	@Override
	public String toString() {
		return "Lote [id=" + id + ", TipoDeProduto=" + TipoDeProduto + ", quantidade=" + quantidade + "]";
	}
	
	

}
