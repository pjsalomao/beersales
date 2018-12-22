package persistencia;

import java.util.ArrayList;

import cadastroProduto.catalogoProduto;
import cadastroProduto.preco;
import cadastroProduto.produto;

public class catalogoDao extends Dao{

public ArrayList<catalogoProduto> buscar()throws Exception{
		
		this.openDb();
		catalogoProduto cat = new catalogoProduto();
		ArrayList<catalogoProduto> catlist = new ArrayList<>();
		stmt = con.prepareStatement("SELECT * FROM `beersales`.`produto` p JOIN `beersales`.`preco` pr on p.idProduto = pr.idProduto");
			
		rs = stmt.executeQuery();
		
		while(rs.next()){ //o método next() retorna true caso haja mais linhas
			 cat.setCatalogo(rs.getString("descricao"), rs.getString("estilo"), rs.getString("valorAtual"));
		     catlist.add(cat);
		   }
		rs.close();
		stmt.close();
		this.closeDb();
		
		return catlist;
	}
	
}
