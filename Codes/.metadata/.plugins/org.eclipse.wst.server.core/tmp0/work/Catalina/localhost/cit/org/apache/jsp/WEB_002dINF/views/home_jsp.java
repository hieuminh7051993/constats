/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2015-01-21 02:25:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/resources/themes/constats/modules/footer.jsp", Long.valueOf(1421738556410L));
    _jspx_dependants.put("jar:file:/D:/Github/lv-nhan/contats/Codes/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/constats/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/WEB-INF/views/include/sidebar.jsp", Long.valueOf(1421725594276L));
    _jspx_dependants.put("/resources/themes/constats/modules/header.jsp", Long.valueOf(1421738451656L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1421222476495L));
    _jspx_dependants.put("/WEB-INF/views/include/maincontent.jsp", Long.valueOf(1421807079361L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Home</title>\n");
      out.write("<meta name=description content=\"Home\">\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("\r\n");
      out.write("<meta\r\n");
      out.write("\tcontent='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no'\r\n");
      out.write("\tname='viewport'>\r\n");
      out.write("<meta name=viewport content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("<!-- bootstrap css framwork -->\r\n");
      out.write("<link\r\n");
      out.write("\thref='");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("'\r\n");
      out.write("\trel=\"stylesheet\" media=\"screen\" type=\"text/css\">\r\n");
      out.write("<!-- font Awesome -->\r\n");
      out.write("<link\r\n");
      out.write("\thref='");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("'\r\n");
      out.write("\trel=\"stylesheet\" media=\"screen\" type=\"text/css\">\r\n");
      out.write("<!-- Morris chart -->\r\n");
      out.write("\r\n");
      out.write("<!-- ContextMenu -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("<!-- Constats Theme Style Sheet file -->\r\n");
      out.write("<link href='");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("'\r\n");
      out.write("\trel=\"stylesheet\" media=\"screen\" type=\"text/css\">\r\n");
      out.write("\t\r\n");
      out.write("<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js\"></script>\r\n");
      out.write("<![endif]-->");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"container\">\n");
      out.write("\t<header class=\"header\">\n");
      out.write("\t\t<a href=\"#\" class=\"logo\">ConStats</a>\n");
      out.write("\t\t<!-- Header Navbar -->\n");
      out.write("\t\t<nav class=\"navbar navbar-static-top\" role=\"navigation\">\n");
      out.write("\t\t\t<!-- toggle button -->\n");
      out.write("\t\t\t<a href=\"#\" class=\"navbar-btn sidebar-toggle\" data-toggle=\"offcanvas\"\n");
      out.write("\t\t\t\trole=\"button\"> <span class=\"sr-only\">Sidebar</span> <span\n");
      out.write("\t\t\t\tclass=\"icon-bar\"></span>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<div class=\"navbar-right\">\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t<!-- li message -->\n");
      out.write("\t\t\t\t\t<li class=\"dropdown messages-menu\">\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-envelope\"></i> \n");
      out.write("\t\t\t\t\t\t<span class=\"label label-success\">4</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<!-- ul message -->\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<!-- end ul message -->\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<!-- end li message -->\n");
      out.write("\t\t\t\t\t<!-- li notification -->\n");
      out.write("\t\t\t\t\t<li class=\"dropdown notifications-menu\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                <i class=\"fa fa-warning\"></i>\n");
      out.write("                                <span class=\"label label-warning\">10</span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                            </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <!-- end li notification -->\n");
      out.write("                    <!-- li user menu -->\n");
      out.write("                    <li class=\"dropdown user user-menu\">\n");
      out.write("                           <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                <i class=\"glyphicon glyphicon-user\"></i>\n");
      out.write("                                <span>Thanh Nhan<i class=\"caret\"></i></span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                            \t<!-- User image -->\n");
      out.write("                                <li class=\"user-header bg-light-blue\">\n");
      out.write("                                    <img src=\"");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("\" class=\"img-circle\" alt=\"User Image\" />\n");
      out.write("                                    <p>\n");
      out.write("                                        Thanh Nhan - Web Developer\n");
      out.write("                                        <small>Member</small>\n");
      out.write("                                    </p>\n");
      out.write("                                </li>\n");
      out.write("                                \n");
      out.write("                                <!-- Menu Footer-->\n");
      out.write("                                <li class=\"user-footer\">\n");
      out.write("                                    <div class=\"pull-left\">\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-default btn-flat\">Profile</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"pull-right\">\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-default btn-flat\">Sign out</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<!-- end li user menu -->\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<!-- end ul nav menu -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</header>\n");
      out.write("\t<!-- start wrapper -->\n");
      out.write("\t\n");
      out.write("\t<div class=\"wrapper row-offcanvas row-offcanvas-left\">\n");
      out.write("\t\t<!-- Left side column -->\n");
      out.write("\t\t<aside class=\"left-side sidebar-offcanvas\">\n");
      out.write("\t\t<!-- sidebar -->\n");
      out.write("\t\t\t<section class=\"sidebar\">\n");
      out.write("            \t<!-- Sidebar user panel\n");
      out.write("            \t<div class=\"user-panel\">\n");
      out.write("            \t//image\n");
      out.write("            \t</div>\n");
      out.write("            \t -->\n");
      out.write("            \t<!-- sidebar menu -->\n");
      out.write("            \t \t");
      out.write("<ul class=\"sidebar-menu\">\r\n");
      out.write("\t<li class=\"active\">\r\n");
      out.write("\t\t<a href=\"home.jsp\"><i class=\"fa fa-dashboard\"></i><span>Dashboard</span></a>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<li class=\"active\">\r\n");
      out.write("\t\t<a href=\"home.jsp\"> <i class=\"fa fa-dashboard\"></i> <span>Apps</span></a>\r\n");
      out.write("\t</li>\r\n");
      out.write("</ul>");
      out.write("\n");
      out.write("                <!-- end sidebar menu -->\n");
      out.write("            </section>\n");
      out.write("            <!-- end sidebar -->\n");
      out.write("         </aside>\n");
      out.write("         <!-- Right side column -->\n");
      out.write("         <aside class=\"right-side\">\n");
      out.write("         \t<!-- Content Header (Page header) -->\n");
      out.write("            <section class=\"content-header\">\n");
      out.write("               <h1>Dashboard\n");
      out.write("                   <small>Control panel</small>\n");
      out.write("               </h1>\n");
      out.write("               <div class=\"btn-group btn-add\">\n");
      out.write("               \t<button class=\"btn btn-success\"><i class=\"glyphicon glyphicon-plus\"></i> Add Server</button>\n");
      out.write("               </div>\n");
      out.write("            </section>\n");
      out.write("            <!--  End Content Header -->\n");
      out.write("            <!--  Main Content -->\n");
      out.write("            <section class=\"content\">\n");
      out.write("            <div class=\"main-content\">\n");
      out.write("            \t");
      out.write("<ul class=\"list-server\">\r\n");
      out.write("\t");
 for(int i=0;i<3;i++){ 
      out.write("\r\n");
      out.write("\t<li class=\"server-item col-md-2\">\r\n");
      out.write("\t\t<a href=\"#\" title=\"#\">\r\n");
      out.write("\t\t\t<i class=\"fa fa-desktop server-icon\"></i>\r\n");
      out.write("\t\t\t<ul class=\"server-info\">\r\n");
      out.write("\t\t\t\t<li>Name: \t<span>Server DNS</span></li>\r\n");
      out.write("\t\t\t\t<li>IP: \t<span>192.168.2.10</span></li>\r\n");
      out.write("\t\t\t\t<li>CPU: \t<span>10%</span></li>\r\n");
      out.write("\t\t\t\t<li>RAM: \t<span>50%</span></li>\r\n");
      out.write("\t\t\t\t<li>DISK: \t<span>20%</span></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t<div class=\"control-action\">\r\n");
      out.write("\t\t\t<div class=\"btn-group\" role=\"group\" aria-label=\"...\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-danger\" onclick=\"location.href='Shutdown'\" title=\"Shutdown\"><i class=\"glyphicon glyphicon-off\"></i></button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-warning\" onclick=\"location.href='Restart'\" title=\"Restart\"><i class=\"glyphicon glyphicon-repeat\"></i></button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-default\" onclick=\"controlMenu()\"><i class=\"glyphicon glyphicon-cog\"></i></button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t");
} 
      out.write('\r');
      out.write('\n');
      out.write('	');
 for(int i=0;i<2;i++){ 
      out.write("\r\n");
      out.write("\t<li class=\"server-item col-md-2\">\r\n");
      out.write("\t\t<a href=\"#\" title=\"#\">\r\n");
      out.write("\t\t\t<i class=\"fa fa-desktop server-icon server-off\"></i>\r\n");
      out.write("\t\t\t<ul class=\"server-info\">\r\n");
      out.write("\t\t\t\t<li>Name: \t<span>Server DNS</span></li>\r\n");
      out.write("\t\t\t\t<li>IP: \t<span>192.168.2.10</span></li>\r\n");
      out.write("\t\t\t\t<li>CPU: \t<span>10%</span></li>\r\n");
      out.write("\t\t\t\t<li>RAM: \t<span>50%</span></li>\r\n");
      out.write("\t\t\t\t<li>DISK: \t<span>20%</span></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t<div class=\"control-action\">\r\n");
      out.write("\t\t\t<div class=\"btn-group\" role=\"group\" aria-label=\"...\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-danger disabled\" onclick=\"location.href='Shutdown'\" title=\"Shutdown\"><i class=\"glyphicon glyphicon-off\"></i></button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-warning disabled\" onclick=\"location.href='Restart'\" title=\"Restart\"><i class=\"glyphicon glyphicon-repeat\"></i></button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-default disabled\" onclick=\"controlMenu()\"><i class=\"glyphicon glyphicon-cog\"></i></button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("</ul>");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            </section>\n");
      out.write("            <!--  End Main Content -->\n");
      out.write("         </aside>\n");
      out.write("         <!-- end right column -->\n");
      out.write("     </div>\n");
      out.write("     <!-- end wrapper -->\n");
      out.write("     <footer class=\"footer\">\n");
      out.write("     ");
      out.write("<p>Copyright ... 2015</p>\r\n");
      out.write("<!-- Script Jquery -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f5(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<!-- Script Jquery-UI -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f6(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f7(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<!-- App Script -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f8(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<!-- ContextMenu -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f9(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f10(_jspx_page_context))
        return;
      out.write("\"></script>");
      out.write("\n");
      out.write("     </footer>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /resources/themes/constats/modules/header.jsp(11,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/resources/themes/constats/plugins/bootstrap/css/bootstrap.min.css");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /resources/themes/constats/modules/header.jsp(15,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/resources/themes/constats/plugins/font-awesome-4.2.0/css/font-awesome.min.css");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    // /resources/themes/constats/modules/header.jsp(20,45) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/resources/themes/constats/plugins/contextmenu/context.standalone.css");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent(null);
    // /resources/themes/constats/modules/header.jsp(23,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/resources/themes/constats/css/style.css");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f4.setParent(null);
    // /WEB-INF/views/home.jsp(56,46) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f4.setValue("/resources/themes/constats/images/avatar.png");
    int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
    if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f5.setParent(null);
    // /resources/themes/constats/modules/footer.jsp(3,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f5.setValue("/resources/themes/constats/js/jquery-2.1.1.min.js");
    int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
    if (_jspx_th_c_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f6(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f6.setParent(null);
    // /resources/themes/constats/modules/footer.jsp(5,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f6.setValue("/resources/themes/constats/js/jquery-ui.min.js");
    int _jspx_eval_c_005furl_005f6 = _jspx_th_c_005furl_005f6.doStartTag();
    if (_jspx_th_c_005furl_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f7(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f7.setParent(null);
    // /resources/themes/constats/modules/footer.jsp(7,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f7.setValue("/resources/themes/constats/plugins/bootstrap/js/bootstrap.min.js");
    int _jspx_eval_c_005furl_005f7 = _jspx_th_c_005furl_005f7.doStartTag();
    if (_jspx_th_c_005furl_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f8(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f8.setParent(null);
    // /resources/themes/constats/modules/footer.jsp(9,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f8.setValue("/resources/themes/constats/js/script.js");
    int _jspx_eval_c_005furl_005f8 = _jspx_th_c_005furl_005f8.doStartTag();
    if (_jspx_th_c_005furl_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f8);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f9(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f9.setParent(null);
    // /resources/themes/constats/modules/footer.jsp(11,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f9.setValue("/resources/themes/constats/plugins/contextmenu/context.js");
    int _jspx_eval_c_005furl_005f9 = _jspx_th_c_005furl_005f9.doStartTag();
    if (_jspx_th_c_005furl_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f9);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f10(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f10 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f10.setParent(null);
    // /resources/themes/constats/modules/footer.jsp(12,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f10.setValue("/resources/themes/constats/js/context-server.js");
    int _jspx_eval_c_005furl_005f10 = _jspx_th_c_005furl_005f10.doStartTag();
    if (_jspx_th_c_005furl_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f10);
    return false;
  }
}
