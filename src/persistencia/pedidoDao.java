package persistencia;

import carrinho.pedido;

public class pedidoDao extends Dao{
	
	public void create(pedido p)throws Exception{
		
		this.openDb();
		
		stmt = con.prepareStatement("INSERT INTO `beersales`.`pedidoItem` " + 
				"(`idpeditoItem`, " +
			    "`idPedido`, " +
				"`idProduto`, " + 
				"`quantidade`, " + 
				"`vlrTotalItem`, " + 
				"`valorTotal`, " +
				"`obs`)"
				+ " VALUES(?,?,?,?,?,?,?)");
		
		//stmt.setInt(1, p.getIdProduto());
		stmt.setInt(1, p.getItem().getCodItem());
		stmt.setInt(2, p.getIdPedido());
		stmt.setInt(3, p.getItem().getIdProduto());
		stmt.setInt(4, p.getItem().getQuantidade());
		stmt.setDouble(5, p.getItem().getValorTotal());
		stmt.setDouble(6, p.getValorTotal());
		stmt.setString(7, p.getItem().getObs());
		
		stmt.execute();
		this.closeDb();
	}
}
