package carrinho;

public class item {
	
	private int codItem;
	private int idProduto;
	private int quantidade;
	private double valorItem;
	private double valorTotal;
	private String obs;
	
	
	
	public item() {
		super();
		// TODO Auto-generated constructor stub
	}



	public item(int codItem, int idProduto, int quantidade, double valorItem, String obs) {
		super();
		this.codItem = codItem;
		this.idProduto = idProduto;
		this.quantidade = quantidade;
		this.valorItem = valorItem;
		this.obs = obs;
	}
	
	
	public item getItem() {
		item Item  = new item(this.codItem, this.idProduto, this.quantidade, this.valorItem, this.obs);
		return Item;
	}
	

	public int getCodItem() {
		return codItem;
	}



	public void setCodItem(int codItem) {
		this.codItem = codItem;
	}



	public int getIdProduto() {
		return idProduto;
	}



	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}



	public int getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}



	public double getValorItem() {
		return valorItem;
	}



	public void setValorItem(double valorItem) {
		this.valorItem = valorItem;
	}



	public String getObs() {
		return obs;
	}



	public void setObs(String obs) {
		this.obs = obs;
	}



	public double getValorTotal() {
		return this.valorTotal;
	}



	public void setValorTotal() {
		this.valorTotal = this.quantidade * this.valorItem;
	}
	
	
	

}
