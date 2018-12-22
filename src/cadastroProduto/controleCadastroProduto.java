package cadastroProduto;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import interfaces.controle;
import persistencia.PrecoDao;
import persistencia.produtoDAO;

@WebServlet("/CadastroProdutos")
public class controleCadastroProduto extends controle {

	private static final long serialVersionUID = 1L;

	public controleCadastroProduto() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			
			String cmd = request.getParameter("cmd");
			produto p = new produto();
			produtoDAO pd = new produtoDAO();
			preco pre = new preco();
			PrecoDao pred = new PrecoDao();
			
			if(cmd.equalsIgnoreCase("cadastrar")){
				String nome = request.getParameter("nome");
				String registro = request.getParameter("registro");
				String lancamento = request.getParameter("lancamento");
				String estilo = request.getParameter("estilo");
				String teorAlcoolico = request.getParameter("teorAlcoolico");
				String fabricante = request.getParameter("fabricante");
				//p.setIdProduto(11);
				p.setDescricao(nome);
				p.setRegistroMapa(registro);
				p.setLançamento(lancamento);
				p.setEstilo(estilo);
				p.setTeorAlcoolico(teorAlcoolico);
				p.setCodFabricante(fabricante);
				pd.create(p);
				request.setAttribute("msg", "Gravado com sucesso!");
				request.getRequestDispatcher("cadastroProduto.jsp").forward(request, response);
			}
			
			if(cmd.equalsIgnoreCase("cadastrarPreco")) {
				//int idProduto = pd.select(p);
				pre.setIdProduto(new Integer(request.getParameter("idProduto")));
				pre.setValorAtual(request.getParameter("precoAtual"));
				pre.setValorAnterior(request.getParameter("precoAnterior"));
				pred.create(pre);
				request.getRequestDispatcher("cadastroProduto.jsp").forward(request, response);
			}
			
			}catch (Exception e) {
				request.setAttribute("msg", "Erro: " + e.getMessage());
				request.getRequestDispatcher("cadastroProduto.jsp").forward(request, response);
			}
	}

}
