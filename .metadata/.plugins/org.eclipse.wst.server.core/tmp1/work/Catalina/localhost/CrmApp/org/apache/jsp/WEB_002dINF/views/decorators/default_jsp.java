/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.37
 * Generated at: 2020-09-11 20:28:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.decorators;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class default_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/Users/hoang/Java8/SERVLET/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/CrmApp/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("jar:file:/C:/Users/hoang/Java8/SERVLET/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/CrmApp/WEB-INF/lib/sitemesh-2.4.2.jar!/META-INF/sitemesh-decorator.tld", Long.valueOf(1123653092000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1599829652101L));
    _jspx_dependants.put("/WEB-INF/lib/sitemesh-2.4.2.jar", Long.valueOf(1599829652122L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdec_005ftitle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdec_005fbody_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fdec_005ftitle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdec_005fbody_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fdec_005ftitle_005fnobody.release();
    _005fjspx_005ftagPool_005fdec_005fbody_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("This is a starter template page. Use this page to start your new project from\r\n");
      out.write("scratch. This page gets rid of all links and provides the needed markup only.\r\n");
      out.write("-->\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("<!-- Favicon icon -->\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" sizes=\"16x16\"\r\n");
      out.write("\thref=\"/CrmApp/static/plugins/images/favicon.png\">\r\n");
      out.write("\r\n");
      out.write("<title>");
      if (_jspx_meth_dec_005ftitle_005f0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap Core CSS -->\r\n");
      out.write("<link href=\"/CrmApp/static/bootstrap/dist/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Menu CSS -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"/CrmApp/static/plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Animation CSS -->\r\n");
      out.write("<link href=\"/CrmApp/static/css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom CSS -->\r\n");
      out.write("<link href=\"/CrmApp/static/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- color CSS -->\r\n");
      out.write("<link href=\"/CrmApp/static/css/colors/blue.css\" id=\"theme\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/CrmApp/static/css/custom.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- color CSS you can use different color css from css/colors folder -->\r\n");
      out.write("<!-- We have chosen the skin-blue (blue.css) for this starter\r\n");
      out.write("          page. However, you can choose any other skin from folder css / colors .\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- Preloader -->\r\n");
      out.write("\t<div class=\"preloader\">\r\n");
      out.write("\t\t<div class=\"cssload-speeding-wheel\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Navigation -->\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/layout/navbar.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Left navbar-header -->\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/layout/leftSidebar.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Page Content -->\r\n");
      out.write("\t\t<div id=\"page-wrapper\">\r\n");
      out.write("\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_dec_005fbody_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /.container-fluid -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- FOOTER -->\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/layout/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /#page-wrapper -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- /#wrapper -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- jQuery -->\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"/CrmApp/static/plugins/bower_components/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Bootstrap Core JavaScript -->\r\n");
      out.write("\t<script src=\"/CrmApp/static/bootstrap/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Menu Plugin JavaScript -->\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"/CrmApp/static/plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!--slimscroll JavaScript -->\r\n");
      out.write("\t<script src=\"/CrmApp/static/js/jquery.slimscroll.js\"></script>\r\n");
      out.write("\t<script src=\"https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!--Wave Effects -->\r\n");
      out.write("\t<script src=\"/CrmApp/static/js/waves.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!--Counter js -->\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"/CrmApp/static/plugins/bower_components/waypoints/lib/jquery.waypoints.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"/CrmApp/static/plugins/bower_components/counterup/jquery.counterup.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"/CrmApp/static/plugins/bower_components/raphael/raphael-min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"/CrmApp/static/plugins/bower_components/morrisjs/morris.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"/CrmApp/static/js/dashboard1.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"/CrmApp/static/plugins/bower_components/toast-master/js/jquery.toast.js\"></script>\r\n");
      out.write("\t<script src=\"/CrmApp/static/js/custom.min.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t$('#example').DataTable({\r\n");
      out.write("\t\t\t\t\"pagingType\" : \"full_numbers\"\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_dec_005ftitle_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  dec:title
    com.opensymphony.module.sitemesh.taglib.decorator.TitleTag _jspx_th_dec_005ftitle_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.TitleTag) _005fjspx_005ftagPool_005fdec_005ftitle_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.TitleTag.class);
    boolean _jspx_th_dec_005ftitle_005f0_reused = false;
    try {
      _jspx_th_dec_005ftitle_005f0.setPageContext(_jspx_page_context);
      _jspx_th_dec_005ftitle_005f0.setParent(null);
      int _jspx_eval_dec_005ftitle_005f0 = _jspx_th_dec_005ftitle_005f0.doStartTag();
      if (_jspx_th_dec_005ftitle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fdec_005ftitle_005fnobody.reuse(_jspx_th_dec_005ftitle_005f0);
      _jspx_th_dec_005ftitle_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_dec_005ftitle_005f0, _jsp_getInstanceManager(), _jspx_th_dec_005ftitle_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_dec_005fbody_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  dec:body
    com.opensymphony.module.sitemesh.taglib.decorator.BodyTag _jspx_th_dec_005fbody_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.BodyTag) _005fjspx_005ftagPool_005fdec_005fbody_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.BodyTag.class);
    boolean _jspx_th_dec_005fbody_005f0_reused = false;
    try {
      _jspx_th_dec_005fbody_005f0.setPageContext(_jspx_page_context);
      _jspx_th_dec_005fbody_005f0.setParent(null);
      int _jspx_eval_dec_005fbody_005f0 = _jspx_th_dec_005fbody_005f0.doStartTag();
      if (_jspx_th_dec_005fbody_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fdec_005fbody_005fnobody.reuse(_jspx_th_dec_005fbody_005f0);
      _jspx_th_dec_005fbody_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_dec_005fbody_005f0, _jsp_getInstanceManager(), _jspx_th_dec_005fbody_005f0_reused);
    }
    return false;
  }
}