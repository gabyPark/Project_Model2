/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.60
 * Generated at: 2021-06-01 10:13:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.goodRes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.goodres.db.GoodResBoardBean;
import java.util.List;

public final class goodres_005fsearch_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("<!DOCTYPE>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>라따뚜이</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./cjkit/web/css/common.css?20200924090025\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./cjkit/web/css/goodResCSS/goodres_search.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../inc/header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
		
		List keywordList = (List) request.getAttribute("keywordList");
		System.out.println(keywordList);
		
		String keyword = (String) request.getAttribute("keyword");
		System.out.println(keyword);
		
		String[] latlng = {};
		
	
      out.write("\r\n");
      out.write("\t<div class=\"div_search_all\">\r\n");
      out.write("\t\t<div class=\"div_search\">\r\n");
      out.write("\t\t\t<form action=\"./GoodResSearchAction.gr\" method=\"post\">\r\n");
      out.write("\t\t\t\t<table class=\"div_search_table\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><input class=\"div_search_input01\" type=\"text\" name=\"gr_input_keyword_search\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input class=\"div_search_input02\" type=\"submit\" name=\"gr_btn_search\" value=\"찾기\"></td>\t\t\t\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<h1 class=\"h1_search_title\">");
      out.print(keyword );
      out.write(" 맛집 인기 검색순위</h1>\r\n");
      out.write("\t\t<section class=\"sec_result\">\t\t\t\r\n");
      out.write("\t\t\t<div class=\"div_result\">\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<table class=\"tab_search\" id=\"tab_search\">\r\n");
      out.write("\t\t\t\t");

					// 상품의 총 개수
					int size = keywordList.size();
					// 상품의 열의 개수 8개
					int col = 2;
					// 상품의 행의 개수
					int row = (size / col) + (size % col>0? 1:0);
					// 출력카운트
					int num = 0;
					
					for(int a=0; a<row; a++) {
				
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t<tr class=\"tr_search\" id=\"tr_search\">\r\n");
      out.write("\t\t\t\t");
 
						for(int b=0; b<col; b++) {
							GoodResBoardBean grbb = (GoodResBoardBean) keywordList.get(num);
				
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"td_search\" id=\"td_search\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr><td><a href=\"./GoodResContentAction.gr?num=");
      out.print(grbb.getF_gr_num() );
      out.write("\"><img src=\"");
      out.print( grbb.getF_gr_thumb() );
      out.write("\"></a></td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr><td><a href=\"./GoodResContentAction.gr?num='");
      out.print(grbb.getF_gr_num() );
      out.write('\'');
      out.write('"');
      out.write('>');
      out.print( grbb.getF_gr_name() );
      out.write("</a></td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr><td>");
      out.print( grbb.getF_gr_gu() );
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print( grbb.getF_gr_menu() );
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"lat\" name=\"lat\" value=\"");
      out.print(grbb.getF_gr_lati() );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"lng\" name=\"lng\" value=\"");
      out.print(grbb.getF_gr_long() );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"gr_name\" name=\"gr_name\" value=\"");
      out.print(grbb.getF_gr_name() );
      out.write("\">\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t");
										
							num++;
							if(size <= num) break;
						}
				
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
	
					}
				
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<section class=\"sec_rigth\">\r\n");
      out.write("\t\t\t<div id=\"map\"></div>\r\n");
      out.write("\t\t\t<script type=\"text/javascript\" src=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=29e9b6b552e8b0d78bef9a137a6809e2\"></script>\t\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\t\t\t\r\n");
      out.write("\t\t\t\tvar mapContainer = document.getElementById('map'), // 이미지 지도를 표시할 div\r\n");
      out.write("\t\t\t\t\tmapOption = { \r\n");
      out.write("\t\t\t\t\t\tcenter: new kakao.maps.LatLng(35.179744238649576, 129.0750680030133), // 이미지 지도의 중심좌표 \r\n");
      out.write("\t\t\t\t\t\tlevel: 9, // 이미지 지도의 확대 레벨\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t};\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar map = new kakao.maps.Map(mapContainer, mapOption);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar positions = [];\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("  \t\t\t\tfor(var i=0; i<td_search.length; i++) {\t\t\t\t \r\n");
      out.write("\t\t\t\t\tpositions.push({\r\n");
      out.write("\t\t\t\t\t\t\"title\": document.getElementsByName('gr_name')[i].value,\t\t\r\n");
      out.write("\t\t\t\t\t\t\"latlng\": new kakao.maps.LatLng(document.getElementsByName('lat')[i].value, document.getElementsByName('lng')[i].value)\r\n");
      out.write("\t\t\t\t\t});\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("  \t\t\t\t\r\n");
      out.write(" \t\t\t\tvar imageSrc = \"https://t1.daumcdn.net/localimg/localimages/07/mapapidoc/markerStar.png\"; \r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t\tfor (var i = 0; i < positions.length; i ++) {\t\t\t\t    \r\n");
      out.write("\t\t\t\t    // 마커 이미지의 이미지 크기 입니다\r\n");
      out.write("\t\t\t\t    var imageSize = new kakao.maps.Size(24, 35); \r\n");
      out.write("\t\t\t\t    \r\n");
      out.write("\t\t\t\t    // 마커 이미지를 생성합니다    \r\n");
      out.write("\t\t\t\t    var markerImage = new kakao.maps.MarkerImage(imageSrc, imageSize); \r\n");
      out.write("\t\t\t\t    \r\n");
      out.write("\t\t\t\t    // 마커를 생성합니다\r\n");
      out.write("\t\t\t\t    var marker = new kakao.maps.Marker({\r\n");
      out.write("\t\t\t\t        map: map, // 마커를 표시할 지도\r\n");
      out.write("\t\t\t\t        position: positions[i].latlng, // 마커를 표시할 위치\r\n");
      out.write("\t\t\t\t        title : positions[i].title,  // 마커의 타이틀, 마커에 마우스를 올리면 타이틀이 표시됩니다\r\n");
      out.write("\t\t\t\t        image : markerImage // 마커 이미지 \r\n");
      out.write("\t\t\t\t    });\r\n");
      out.write("\t\t\t\t}\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\tfunction setZoomable(zoomable) {\r\n");
      out.write("\t\t\t\t    // 마우스 휠로 지도 확대,축소 가능여부를 설정합니다\r\n");
      out.write("\t\t\t\t    map.setZoomable(zoomable);    \r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../inc/footer.jsp", out, false);
      out.write("<!-- clear: both; 추가 -->\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"fix_contsbtm\">\t\r\n");
      out.write("\t\t<!-- 스크립트요청사항 : 바닥컨텐츠가 .btm 클래스 추가해주세요 -->\r\n");
      out.write("\t\t<div class=\"fx_button chatbot ui_chatBot show\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"chatbot\"\r\n");
      out.write("\t\t\t\tonclick=\"javascript:cj.chatbot.open('http://cookit.oli-va.com/');\">\r\n");
      out.write("\t\t\t\t<span class=\"hide\">챗봇으로 문의하기</span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"fx_button top ui_gotoTop show\">\r\n");
      out.write("\t\t\t<a href=\"#wrap\" role=\"button\" onclick=\"window.scrollTo(0,0);\"> <span class=\"hide\">페이지 상단으로</span>\r\n");
      out.write("\t\t\t</a>\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
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
