package cadastroProduto;

public class preco {

	private int idProduto;
	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	private String valorAtual;
	private String valorAnterior;
	
	public preco() {
		// TODO Auto-generated constructor stub
	}

	public preco(String valorAtual, String valorAnterior) {
		super();
		this.valorAtual = valorAtual;
		this.valorAnterior = valorAnterior;
	}

	public String getValorAtual() {
		return valorAtual;
	}

	public void setValorAtual(String valorAtual) {
		this.valorAtual = valorAtual;
	}

	public String getValorAnterior() {
		return valorAnterior;
	}

	public void setValorAnterior(String valorAnterior) {
		this.valorAnterior = valorAnterior;
	}

	@Override
	public String toString() {
		return "preco [valorAtual=" + valorAtual + ", valorAnterior=" + valorAnterior + "]";
	}

	
	

}
