package carrinho;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cadastroProduto.catalogoProduto;
import cadastroProduto.preco;
import cadastroProduto.produto;
import interfaces.controle;
import persistencia.Dao;
import persistencia.PrecoDao;
import persistencia.catalogoDao;
import persistencia.pedidoDao;
import persistencia.produtoDAO;

@WebServlet("/CarrinhoCompras")
public class controleCarrinho extends controle{

	private static final long serialVersionUID = 1L;

	public controleCarrinho() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		try {
			catalogoProduto cat = new catalogoProduto();
			catalogoDao cdao = new catalogoDao();
			ArrayList<catalogoProduto> cats = cdao.buscar();
			
			for(catalogoProduto c : cats){
				System.out.println(c);
			}
		               // passa a lista para a jsp
			request.setAttribute("catalogo", cats);
			RequestDispatcher rq = request.getRequestDispatcher("/insereCarrinho.jsp");
			try {
				rq.forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (Exception e) {
			request.setAttribute("msg", "Erro: " + e.getMessage());
			request.getRequestDispatcher("insereCarrinho.jsp").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
