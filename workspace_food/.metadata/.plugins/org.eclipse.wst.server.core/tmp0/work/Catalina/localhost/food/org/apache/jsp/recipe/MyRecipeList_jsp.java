/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.60
 * Generated at: 2021-05-31 11:31:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.recipe;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.member.db.MemberBean;
import com.recipe.board.db.RecipeBean;

public final class MyRecipeList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1622352018889L));
    _jspx_dependants.put("jar:file:/C:/Users/isys1/OneDrive/바탕%20화면/아이티윌/workspace_food/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/food/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c-1_0-rt.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.member.db.MemberBean");
    _jspx_imports_classes.add("com.recipe.board.db.RecipeBean");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>라따뚜이</title>\r\n");
      out.write("<!-- <script src=\"//code.jquery.com/jquery-1.11.0.min.js\"></script> -->\r\n");
      out.write("<script src=\"./js/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<link href=\"./cjkit/web/css/recipeCSS/recipeDetail.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- <link href=\"./cjkit/web/css/recipeCSS/recipeWrite.css\" rel=\"stylesheet\"> -->\r\n");
      out.write("<link href=\"./cjkit/web/css/recipeCSS/myRecipeList.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<!-- 공통필수 -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./cjkit/web/css/common.css?20200924090025\">\r\n");
      out.write("<!-- <link rel=\"stylesheet\" type=\"text/css\" href=\"./cjkit/web/css/main2.css\"> -->\r\n");
      out.write("\r\n");
      out.write("<!-- 이미지 -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.cjcookit.com/cjkit/web/css/pd.css?20200924090025\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.cjcookit.com/cjkit/web/css/op.css?20200924090025\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../cjkit/web/js/libs/jquery-1.11.2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!-- <h1>WebContent/recipe/MyRecipeList.jsp</h1>\r\n");
      out.write("\t<h2>마이 레시피 리스트 </h2> -->\r\n");
      out.write("\t\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../inc/header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");

		String f_mem_id = (String)session.getAttribute("f_mem_id");
		
		if(f_mem_id == null) {
			response.sendRedirect("./Main.me");
		}	
		MemberBean mb = (MemberBean) request.getAttribute("mb");
		
		List MyRecipeList = (List)request.getAttribute("MyRecipeList");
		
		//상품의 총 개수
		int size= MyRecipeList.size();
	    // 상품의 열의 개수 8개
	    int col = 3;
	    // 상품의 행의 개수
	    int row = (size / col) + (size % col>0? 1:0);
	    // 출력카운트
	    int num = 0;
		
	
      out.write("\r\n");
      out.write("\t<!-- content -->\r\n");
      out.write("\t<div id=\"content\" class=\"pd_wrap\">\r\n");
      out.write("\t\r\n");
      out.write("    <!-- <h1 class=\"h4_tit\" align=\"center\"><b> 나의 레시피 모아보기 </b></h1> -->\r\n");
      out.write("    <h1 align=\"center\"><b> 나의 레시피 모아보기 </b></h1> <!-- 정중앙에 보이게 하기 위해선 이게 낫지 않을까? -->\r\n");
      out.write("    <br><br><br>\r\n");
      out.write("    \r\n");
      out.write("\t<div class=\"olki_list_wrap\">\r\n");
      out.write("\t\t<div class=\"top_sec\">\r\n");
      out.write("\t\t<!-- 팀프로젝트 코드 들어가는 부분 본문 -->\r\n");
      out.write("\t\t<div class=\"cate_wrap\">\r\n");
      out.write("\t\t\t<div class=\"tab_wrap\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t");

		String item = request.getParameter("item"); 
		if(item == null){
			item = "all";
		}
		
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\tfunction sel(){\r\n");
      out.write("\t\t\t\t\tdocument.form.submit();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t</script>\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"olki_list prodListArea\">\r\n");
      out.write("\t\t\t<ul style=\"margin='left'\">\r\n");
      out.write("\t\t\t\t\t");

				      for(int a=0;a<row;a++){
				    	  
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- 이미지케이스 -->\r\n");
      out.write("\t\t\t\t    \t  ");
 for(int b=0;b<col;b++){
				    		 RecipeBean rb = (RecipeBean) MyRecipeList.get(num);

				    	  
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"item\">\r\n");
      out.write("\t\t\t\t\t<div class=\"pro_module\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"img_wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"./RecipeDetail.re?f_rcp_num=");
      out.print(rb.getF_rcp_num());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"./recipe_upload/");
      out.print(rb.getF_rcp_th_img());
      out.write("\">\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"txt_wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"\" class=\"conts\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"etc_info\">\r\n");
      out.write("                    \t\t\t<span class=\"txt\">#");
      out.print(rb.getF_rcp_hashtag() );
      out.write("</span>\r\n");
      out.write("            \t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"tit_info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"tit mt_elps\">");
      out.print(rb.getF_rcp_title() );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"nick_info\">");
      out.print(rb.getF_rcp_nick() );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"view_count\">조회수 ");
      out.print(rb.getF_rcp_count() );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t");

    		num++;
    		if(size<=num) break;
    	  	}
    	 	
      out.write("\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- //이미지케이스 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- /////////////////////////////////////////////////////////////////////////////////// -->\r\n");
      out.write("\t\t<!-- 팀프로젝트 코드 들어가는 부분 본문  끝-->\r\n");
      out.write("\t\t\r\n");
      out.write("      \r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- //content -->\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../inc/footer.jsp", out, false);
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