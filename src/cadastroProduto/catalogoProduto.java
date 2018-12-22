package cadastroProduto;

import java.util.ArrayList;

import cadastroProduto.preco;
import carrinho.pedido;
import persistencia.Dao;

public class catalogoProduto extends Dao{
	
	private String descricao;
	private String estilo;
	private String preco;
	private ArrayList<catalogoProduto> catalogo = new ArrayList<>();
	
	public catalogoProduto() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public ArrayList<catalogoProduto> buscar()throws Exception{
//		
//		this.openDb();
//		
//		stmt = con.prepareStatement("SELECT * FROM beersales.preco a join beersales.produto b on a.idProduto = b.idProduto");
//		stmt.execute();
//		 
//	    rs =  stmt.getResultSet();
//	    stmt.getMoreResults(Statement.KEEP_CURRENT_RESULT);
//	    
//	    for(catalogoProduto cp : catalogo) {
//	    	cp.descricao = rs.getString("descricao");
//	    	cp.estilo = rs.getString("estilo");
//	    	cp.preco = rs.getString("valorAtual");
//	    	catalogo.add(cp);
//	    	rs.next();
//	    		 
//	    }
//		this.closeDb();
//		return catalogo;
//	}

	public catalogoProduto(String descricao, String estilo, String preco) {
		super();
		this.descricao = descricao;
		this.estilo = estilo;
		this.preco = preco;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getEstilo() {
		return estilo;
	}


	public void setFabricante(String estilo) {
		this.estilo = estilo;
	}


	public String getPreco() {
		return preco;
	}


	public void setPreco(String preco) {
		this.preco = preco;
	}


	public ArrayList<catalogoProduto> buscarCatalogo() {
		return catalogo;
	}


	public void setCatalogo(String descricao, String estilo, String preco) {
		catalogoProduto cat  = new catalogoProduto(descricao,estilo,preco);
		this.catalogo.add(cat);
	}
	
	
}
