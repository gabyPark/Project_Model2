/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.60
 * Generated at: 2021-05-30 06:24:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.goodRes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.goodres.db.GoodResBoardBean;

public final class goodres_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.goodres.db.GoodResBoardBean");
    _jspx_imports_classes.add("java.util.List");
  }

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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>라따뚜이</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./cjkit/web/css/common.css?20200924090025\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.cjcookit.com/cjkit/web/css/main.css?20200924090025\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./cjkit/web/css/goodResCSS/goodress_main.css\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("body, html {\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1 {\r\n");
      out.write("\tmargin-top: 20px;\r\n");
      out.write("\tmargin-bottom: 3px;\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table{\r\n");
      out.write("\tvertical-align: middle;\r\n");
      out.write("\tmargin: auto;\r\n");
      out.write("\twidth: 1000px;\r\n");
      out.write(" \tborder-collapse: separate;\r\n");
      out.write(" \tborder-spacing: 0 20px;  \r\n");
      out.write(" \t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table tr{\r\n");
      out.write("\tmargin-bottom: 200px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table img{\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#test{\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#list_img{\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#list{\r\n");
      out.write("\tclear: both;\r\n");
      out.write("\tfont-size: 1.5em;\r\n");
      out.write("\tline-height: 1.5em;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#resList{\r\n");
      out.write("\tborder-bottom: 1px solid black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../inc/header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");

	//	List<GoodResBoardBean> GoodResList = grdao.getGoodResList();
		
	//	request.setAttribute("GoodResList", GoodResList);
	
		List<GoodResBoardBean> guList = (List<GoodResBoardBean>)request.getAttribute("guList");
		List<GoodResBoardBean> typeList = (List<GoodResBoardBean>)request.getAttribute("typeList");
		
		String gu = (String) request.getParameter("gu");
		String foodType = (String) request.getParameter("foodtype");
		
	
      out.write("\r\n");
      out.write("\t<div id=\"test\">\r\n");
      out.write("\t\t");

			if (gu != null) {
		
      out.write("\r\n");
      out.write("\t\t<h1>\r\n");
      out.write("\t\t\t<b>");
      out.print(gu);
      out.write(" 맛집 리스트 </b>\r\n");
      out.write("\t\t</h1>\r\n");
      out.write("\t\t");

			}
		
      out.write("\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t");

						for (int i = 0; i < guList.size(); i++) {
							// 배열 -> MemberBean -> 출력
							GoodResBoardBean grb = (GoodResBoardBean) guList.get(i);
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<td><a\r\n");
      out.write("\t\t\t\t\t\thref=\"./GoodResContentAction.gr?num=");
      out.print(grb.getF_gr_num());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.print(grb.getF_gr_thumb());
      out.write("\" id=\"list_img\">\r\n");
      out.write("\t\t\t\t\t</a><br></td>\r\n");
      out.write("\t\t\t\t\t<td id=\"resList\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"list\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(i + 1);
      out.write(".\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(grb.getF_gr_name());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<br> 주소 :\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(grb.getF_gr_addr());
      out.write("<br> 별점 평균 :\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(String.format("%.1f", grb.getF_gr_staravg()));
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t\t\t리뷰수: ");
      out.print(grb.getF_gr_rv_cnt() );
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t\t\t조회수: ");
      out.print(grb.getF_gr_cnt() );
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"test\">\r\n");
      out.write("\t\t");

			if (foodType != null) {
		
      out.write("\r\n");
      out.write("\t\t<h1>\r\n");
      out.write("\t\t\t<b>");
      out.print(foodType);
      out.write(" 맛집 리스트 </b>\r\n");
      out.write("\t\t</h1>\r\n");
      out.write("\t\t");

			}
		
      out.write("\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t");

						for (int i = 0; i < typeList.size(); i++) {
							// 배열 -> MemberBean -> 출력
							GoodResBoardBean grb = (GoodResBoardBean) typeList.get(i);
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<td><a\r\n");
      out.write("\t\t\t\t\t\thref=\"./GoodResContentAction.gr?num=");
      out.print(grb.getF_gr_num());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.print(grb.getF_gr_thumb());
      out.write("\" id=\"list_img\">\r\n");
      out.write("\t\t\t\t\t</a><br></td>\r\n");
      out.write("\t\t\t\t\t<td id=\"resList\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"list\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(i + 1);
      out.write(".\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(grb.getF_gr_name());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<br> 주소 :\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(grb.getF_gr_addr());
      out.write("<br> 별점 평균 :\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(String.format("%.1f", grb.getF_gr_staravg()));
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t\t\t리뷰수: ");
      out.print(grb.getF_gr_rv_cnt() );
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t\t\t조회수: ");
      out.print(grb.getF_gr_cnt() );
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../inc/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
}
