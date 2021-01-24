package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nomeEmpresa = request.getParameter("nome");
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);

		Banco banco = new Banco();
		banco.adiciona(empresa);

		System.out.println("Cadastrando nova empresa");
		
		RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
		// pendurar um objeto na requisição
		request.setAttribute("empresa", empresa.getNome());
		/// para frente a requisição
        rd.forward(request, response);

	}

}
