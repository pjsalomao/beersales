package persistencia;

import cadastroProduto.produto;

public class produtoDAO extends Dao{
	
	public void create(produto p)throws Exception{
		
		this.openDb();
		
		stmt = con.prepareStatement("INSERT INTO `beersales`.`produto` " + 
				"(`codFabricante`, " +
			    "`descricao`, " +
				"`registroMapa`, " + 
				"`lancamento`, " + 
				"`estilo`, " + 
				"`teorAlcoolico`)"
				+ " VALUES(?,?,?,?,?,?)");
		
		//stmt.setInt(1, p.getIdProduto());
		stmt.setString(1, p.getCodFabricante());
		stmt.setString(2, p.getDescricao());
		stmt.setString(3, p.getRegistroMapa());
		stmt.setString(4, p.getLançamento());
		stmt.setString(5, p.getEstilo());
		stmt.setString(6, p.getTeorAlcoolico());
		
		stmt.execute();
		this.closeDb();
	}
	
}
