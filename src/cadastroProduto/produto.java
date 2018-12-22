package cadastroProduto;

public class produto {

	 private int idProduto;
	 private String descricao = new String();
	 private String registroMapa = new String();
	 private String lançamento = new String();
	 private String estilo = new String();
	 private String teorAlcoolico;
	 private String codFabricante;
	
	 public produto(String descricao, String registroMapa, String lançamento, String estilo,
			String teorAlcoolico, String codFabricante) {
		super();
		this.idProduto = idProduto;
		this.descricao = descricao;
		this.registroMapa = registroMapa;
		this.lançamento = lançamento;
		this.estilo = estilo;
		this.teorAlcoolico = teorAlcoolico;
		this.codFabricante = codFabricante;
	}

	public produto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getRegistroMapa() {
		return registroMapa;
	}

	public void setRegistroMapa(String registroMapa) {
		this.registroMapa = registroMapa;
	}

	public String getLançamento() {
		return lançamento;
	}

	public void setLançamento(String lançamento) {
		this.lançamento = lançamento;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getTeorAlcoolico() {
		return teorAlcoolico;
	}

	public void setTeorAlcoolico(String teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}

	public String getCodFabricante() {
		return codFabricante;
	}

	public void setCodFabricante(String codFabricante) {
		this.codFabricante = codFabricante;
	}

	@Override
	public String toString() {
		return "produto [idProduto=" + idProduto + ", descricao=" + descricao + ", registroMapa=" + registroMapa
				+ ", lançamento=" + lançamento + ", estilo=" + estilo + ", teorAlcoolico=" + teorAlcoolico
				+ ", codFabricante=" + codFabricante + "]";
	}
	 
	 
	
}
