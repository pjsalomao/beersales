package carrinho;

import java.util.ArrayList;

public class pedido {
	
	
	

	private int idPedido;
	private item Item  = new item();
	private ArrayList<item> ped = new ArrayList<>();
	private double valorTotal;
	
	public pedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public item getItem() {
		return Item;
	}

	public void setItem(item item) {
		this.Item = item;
	}

	public ArrayList<item> getPedido() {
		return this.ped;
	}

	public void setPedido(item item) {
		this.ped.add(this.Item);
	}
	
	
	public void setValorTotal() {
		ArrayList<item> aux = this.getPedido();
		valorTotal = 0;
		for (item it : aux) {
			valorTotal = valorTotal + it.getValorTotal();
		}
	}
	
	public double getValorTotal() {
		return this.valorTotal;
	}
	
	

}
