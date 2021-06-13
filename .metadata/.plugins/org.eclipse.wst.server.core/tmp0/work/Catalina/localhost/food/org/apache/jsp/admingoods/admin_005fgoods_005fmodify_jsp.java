/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.60
 * Generated at: 2021-05-31 13:39:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admingoods;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.admin.goods.db.GoodsBean;

public final class admin_005fgoods_005fmodify_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("com.admin.goods.db.GoodsBean");
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
      out.write("<!DOCTYPE html PUBLIC>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>라따뚜이</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   \r\n");
      out.write("   <h1 align=\"center\"> 관리자 상품 수정  </h1>\r\n");
      out.write("  \r\n");
      out.write("   ");

// (★★시작)추가 : 관리자 id로 로그인 X -> 로그인 페이지로 이동하도록 제어 
	   String f_mem_id = (String)session.getAttribute("f_mem_id"); // MemberLoginAction.java에서 session영역에 저장된 id의 key에 해당되는 이름 : f_mem_id
		if(f_mem_id != null && !(f_mem_id.equals("admin"))){
			response.sendRedirect("./MemberLogin.me");//로그인 페이지로 이동
		}
// (★★끝)추가 : 관리자 id로 로그인 X -> 로그인 페이지로 이동하도록 제어 
   
     GoodsBean gb = (GoodsBean) request.getAttribute("goodsbean");
   
   
      out.write("   \r\n");
      out.write("<!-- (★★★) 수정완료 : form태그 속성으로 name=\"fr\" onsubmit=\"return chForm(); \" 추가 -->\r\n");
      out.write("   <form action=\"./AdminGoodsModifyProAction.ag\" method=\"post\" name=\"fr\" onsubmit=\"return ckForm();\">\r\n");
      out.write("      <input type=\"hidden\" id=\"f_gs_num\" name=\"f_gs_num\" value=\"");
      out.print(gb.getF_gs_num());
      out.write("\">    \r\n");
      out.write("   \r\n");
      out.write("     <table border=\"1\" style=\"margin-left: auto; margin-right: auto;\">\r\n");
      out.write("        <tr>\r\n");
      out.write("\t        <td>카테고리</td>\r\n");
      out.write("\t        <td>\r\n");
      out.write("\t          <select name=\"f_gs_cate\">\r\n");
      out.write("\t           <option value=\"meal\" \r\n");
      out.write("\t           ");
if(gb.getF_gs_cate().equals("meal")){ 
      out.write("\r\n");
      out.write("\t           selected\r\n");
      out.write("\t           ");
} 
      out.write("\r\n");
      out.write("\t           >밀키트</option>\r\n");
      out.write("\t           <option value=\"veg\"\r\n");
      out.write("\t             ");
if(gb.getF_gs_cate().equals("veg")){ 
      out.write("\r\n");
      out.write("\t           selected\r\n");
      out.write("\t           ");
} 
      out.write("\r\n");
      out.write("\t           >식재료</option>\r\n");
      out.write("\t           <option value=\"tool\"\r\n");
      out.write("\t             ");
if(gb.getF_gs_cate().equals("tool")){ 
      out.write("\r\n");
      out.write("\t           selected\r\n");
      out.write("\t           ");
} 
      out.write("\r\n");
      out.write("\t           >주방용품</option>\r\n");
      out.write("\t           \r\n");
      out.write("\t          </select>\r\n");
      out.write("\t        </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("\t        <td>상품명</td>\r\n");
      out.write("\t        <td>\r\n");
      out.write("\t          <input type=\"text\" name=\"f_gs_name\" value=\"");
      out.print(gb.getF_gs_name());
      out.write("\">\r\n");
      out.write("\t        </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("\t        <td>판매가</td>\r\n");
      out.write("\t        <td>\r\n");
      out.write("<!-- (★★★) 수정완료 : type=\"text\"->\"number\"로 변경, min=\"0\" 추가(마이너스 값 입력 불가하도록 제어)  -->\r\n");
      out.write("\t          <input type=\"number\" name=\"f_gs_price\" min=\"0\" value=\"");
      out.print(gb.getF_gs_price());
      out.write("\">\r\n");
      out.write("\t        </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        \r\n");
      out.write("        <tr>\r\n");
      out.write("\t        <td>수량</td>\r\n");
      out.write("\t        <td>\r\n");
      out.write("<!-- (★★★) 수정완료 : type=\"text\"->\"number\"로 변경, min=\"0\" 추가(마이너스 값 입력 불가하도록 제어)  -->\r\n");
      out.write("\t          <input type=\"number\" name=\"f_gs_amount\" min=\"0\" value=\"");
      out.print(gb.getF_gs_amount());
      out.write("\">\r\n");
      out.write("\t        </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("\t        <td>제품정보</td>\r\n");
      out.write("\t        <td>\r\n");
      out.write("<!-- (★★★) 수정완료 : <input type=\"text\"> -> <textarea>로 변경  -->\r\n");
      out.write("\t          <textarea rows=\"20\" cols=\"30\" name=\"f_gs_msg\">");
      out.print(gb.getF_gs_msg());
      out.write("</textarea>\r\n");
      out.write("\t        </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        \r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <tr>\r\n");
      out.write("\t        <td colspan=\"2\">\r\n");
      out.write("\t          <input type=\"submit\" style=\"width: 70px; height: 35px;\" value=\"정보 수정\">\r\n");
      out.write("\t          <input type=\"reset\" style=\"width: 70px; height: 35px;\" value=\"초기화\">\r\n");
      out.write("\t          <input type=\"button\" style=\"width: 70px; height: 35px;\" value=\" 창닫기\" onClick='self.close()'>\r\n");
      out.write("\t        </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("     </table>  \r\n");
      out.write("   </form>\r\n");
      out.write("   \r\n");
      out.write("  <script src=\"./js/shoppingJS/admin_goods.js\" ></script> \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
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
