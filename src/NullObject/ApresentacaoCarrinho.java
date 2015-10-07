package NullObject;

import javax.servlet.http.HttpServletRequest;

/**
 * PADRAO NULL OBJECT 
 * @author Fernando
 *
 */
public class ApresentacaoCarrinho{

	public void colocarInformacoesCarriho(HttpServletRequest request) {
		Carrinho c = CookieFactory.criarCarrinho(request);
		
		if (c != null){
			request.setAttribute("valor",c.getValor());
			request.setAttribute("qtd",c.getTamanho());
		}else {
			request.setAttribute("valor",0.0);
			request.setAttribute("qtd",0);
		}
		if (request.getAttribute("nome")==null){
			if (c != null){
				request.setAttribute("userCarrinho",c.getNomeUsuario());
				
			} else {
				request.setAttribute("userCarrinho","<a href=login.jsp>Login</a>");
			} 
			
		}else {
			
			request.setAttribute("userCarrinho",
			request.getAttribute("username"));
			
		}
	}
}
