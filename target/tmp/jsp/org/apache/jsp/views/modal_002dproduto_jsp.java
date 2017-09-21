package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modal_002dproduto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"modal-produto\" class=\"modal\">\r\n");
      out.write("\t<div class=\"modal-content\">\r\n");
      out.write("\t\t<form method=\"post\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<h5 class=\"center\">Informações do produto</h5>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"box-modal\" >\r\n");
      out.write("\t\t\t\t<div class=\"input-field\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"nome\" name=\"nome\" class=\"red-text\"  /> \r\n");
      out.write("\t\t\t\t\t<label class=\"red-text\">Nome*</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"input-field\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"preco\" name=\"preco\" class=\"red-text\"  /> \r\n");
      out.write("\t\t\t\t\t<label class=\"red-text\">Preço*</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"file-field input-field\">\r\n");
      out.write("\t\t\t\t\t<div class=\"btn red\">\r\n");
      out.write("\t\t\t\t\t\t<span>Foto</span> <input type=\"file\" id=\"foto\" name=\"foto\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"file-path-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"file-path validate\" type=\"text\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"container modal-footer\">\r\n");
      out.write("\t\t\t\t<a href=\"#!\" class=\"modal-action modal-close waves-effect waves-green btn-flat\">\r\n");
      out.write("\t\t\t\t\tCancelar \r\n");
      out.write("\t\t\t\t</a> \r\n");
      out.write("\t\t\t\t<button type=\"submit\" class=\"btn red\">\r\n");
      out.write("\t\t\t\t\tSalvar informações\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</div>");
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
