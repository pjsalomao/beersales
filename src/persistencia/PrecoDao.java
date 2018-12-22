package persistencia;

import cadastroProduto.preco;

public class PrecoDao extends Dao{
	
public void create(preco p)throws Exception{
		
		this.openDb();
		
		stmt = con.prepareStatement("INSERT INTO `beersales`.`preco` " + 
				"(`idProduto`, " +
			    "`valorAtual`, " +
				"`valorAnterior`)"
				+ " VALUES(?,?,?)");
		
		//stmt.setInt(1, p.getIdProduto());
		stmt.setInt(1, p.getIdProduto());
		stmt.setString(2, p.getValorAtual());
		stmt.setString(3, p.getValorAnterior());
		stmt.execute();
		this.closeDb();
	}

}
