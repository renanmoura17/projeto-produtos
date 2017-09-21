package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>Página inicial</title>\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<!--Import Google Icon Font-->\r\n");
      out.write("\t\t<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<!--Import materialize.css-->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css\">\r\n");
      out.write("\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../../css/estilo.css\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!--Let browser know website is optimized for mobile-->\r\n");
      out.write("\t\t<meta charset=\"utf-8\" name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\r\n");
      out.write("\t\t<header>\r\n");
      out.write("\t\t\t<!-- Barra de navegacao do Materialize (Desktop e mobile) -->\r\n");
      out.write("\t\t\t<nav class=\"red darken-4\">\r\n");
      out.write("\t\t\t\t<div class=\"nav-wrapper container red darken-4\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<!-- Menu do topo -->\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" data-activates=\"mobile\" class=\"button-collapse\"><i class=\"material-icons\">menu</i></a>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<ul class=\"left hide-on-med-and-down\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/\">Login</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- Menu lateral expansivel -->\r\n");
      out.write("\t\t\t\t\t<ul class=\"right hide-on-med-and-down\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"large material-icons\">email</i>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<ul class=\"side-nav\" id=\"mobile\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/\">Login</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"container box-default\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Imagem superior -->\r\n");
      out.write("\t\t\t<div class=\"alinhamento-central\">\r\n");
      out.write("\t\t\t\t<img src=\"../../img/lojas-americanas.jpg\" class=\"responsive-img img-padrao\">\r\n");
      out.write("\t\t\t\t<img src=\"../../img/lojas-americanas2.jpg\" class=\"responsive-img img-padrao\">\r\n");
      out.write("\t\t\t\t<img src=\"../../img/lojas-americanas3.jpg\" class=\"responsive-img img-padrao\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- A box principal foi dividida em duas partes: uma contendo o texto e a outra contendo o form -->\r\n");
      out.write("\t\t\t<div id=\"box-principal\" class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col s6\">\r\n");
      out.write("\t\t\t\t\t<h4 class=\"red-text\">Bem-vindo</h4>\r\n");
      out.write("\t\t\t\t\t<p>Bem-vindo ao website do Plano de Ações das Lojas Americanas. Aqui você poderá acessar todas as informações relevantes ao seu plano. Por favor entre no site usando o usuário e senha que você definiu no seu processo de ativação de conta.</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col s6\">\r\n");
      out.write("\t\t\t\t\t<form method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-field\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"titulo\" class=\"red-text\" required/>\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"red-text\">Nome de usuário</label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-field\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" name=\"titulo\" class=\"red-text\" required/>\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"red-text\">Senha</label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t<button class=\"btn red\" type=\"submit\">Entrar</button>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"\">Esqueci a senha</a>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Carregamento do jQuery e do materialize.js-->\r\n");
      out.write("\t    <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("\t    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js\"></script>\r\n");
      out.write("\t    <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\t    \t$(document).ready(function() {\r\n");
      out.write("\t    \t\tMaterialize.updateTextFields();\r\n");
      out.write("\r\n");
      out.write("\t    \t\t$(\".button-collapse\").sideNav();\r\n");
      out.write("\t    \t});\r\n");
      out.write("\r\n");
      out.write("\t    </script>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
