/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.60
 * Generated at: 2021-05-31 12:29:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.goodRes_005freview;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gr_005frvWrite_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>라따뚜이</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./cjkit/web/css/reWriteCSS/gr_reWriteCSS.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./cjkit/web/css/common.css?20200924090025\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../inc/header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"div_rv_main\">\r\n");
      out.write("\t\t<h1 class=\"h1_rv_title\">리뷰작성</h1>\t\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<div class=\"div_rv_tab\">\r\n");
      out.write("\t\t\t<form name=\"rvForm\" action=\"./ReviewAdd.rv\" enctype=\"multipart/form-data\" method=\"post\" onsubmit=\"return check()\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"rv_gr_num\" value=\"");
      out.print(request.getParameter("gr_num") );
      out.write("\">\r\n");
      out.write("\t\t\t\t<table border=\"1\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>아이디</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" value=\"");
      out.print(session.getAttribute("f_mem_id") );
      out.write("\" readonly=\"readonly\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>별점</td>\r\n");
      out.write("\t\t\t\t\t\t<td><span class=\"star-input\"> <span class=\"input\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"star-input\" value=\"0.5\" id=\"p1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"p1\">0.5</label> <input type=\"radio\" name=\"star-input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"1\" id=\"p2\"> <label for=\"p2\">1</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"radio\" name=\"star-input\" value=\"1.5\" id=\"p3\"> <label\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfor=\"p3\">1.5</label> <input type=\"radio\" name=\"star-input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"2\" id=\"p4\"> <label for=\"p4\">2</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"radio\" name=\"star-input\" value=\"2.5\" id=\"p5\"> <label\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfor=\"p5\">2.5</label> <input type=\"radio\" name=\"star-input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"3\" id=\"p6\"> <label for=\"p6\">3</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"radio\" name=\"star-input\" value=\"3.5\" id=\"p7\"> <label\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfor=\"p7\">3.5</label> <input type=\"radio\" name=\"star-input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"4\" id=\"p8\"> <label for=\"p8\">4</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"radio\" name=\"star-input\" value=\"4.5\" id=\"p9\"> <label\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfor=\"p9\">4.5</label> <input type=\"radio\" name=\"star-input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"5\" id=\"p10\"> <label for=\"p10\">5</label>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t</span> <input type=\"button\" onclick=\"ratingCheck()\" value=\"check\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"rv_rating\" id=\"rv_rating\"> <input type=\"hidden\" id=\"nullCheck\" value=\"checkOff\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>내용</td>\r\n");
      out.write("\t\t\t\t\t\t<td><textarea cols=\"30\" rows=\"5\" name=\"rv_content\"></textarea></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"button\" id=\"addFiles\" value=\"사진 추가\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td id=\"fileTd\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"fileDiv0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"file\" id=\"input_imgs0\" name=\"files0\"> <span id=\"imgs0\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"submit\" value=\"리뷰 등록\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br>\t\t\r\n");
      out.write("\t\t<input class=\"btn_cancel\" type=\"button\" name=\"btn_cancel\" value=\"취소하기\" onclick=\"location.href='./GoodResContentAction.gr?gr_num=");
      out.print(request.getParameter("rv_gr_num") );
      out.write("'\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../inc/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction check() {\r\n");
      out.write("\t\t  if(document.getElementById(\"nullCheck\").value==\"checkOff\"){\r\n");
      out.write("\t\t    alert(\"별점을 부여하고 체크 버튼을 확인해주세요\");\r\n");
      out.write("\t\t    return false;\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction ratingCheck() {\r\n");
      out.write("\t\t  var obj_length = document.getElementsByName(\"star-input\").length;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t  for (var i=0; i<obj_length; i++) {\r\n");
      out.write("\t\t    if (document.getElementsByName(\"star-input\")[i].checked == true) {\r\n");
      out.write("\t\t      alert(document.getElementsByName(\"star-input\")[i].value);\r\n");
      out.write("\t\t      document.getElementById('rv_rating').value\r\n");
      out.write("\t\t        = document.getElementsByName(\"star-input\")[i].value;\r\n");
      out.write("\t\t      document.getElementById(\"nullCheck\").value = \"CheckOn\";\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script src=\"./cjkit/web/js/jquery/jquery-3.5.1.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t  $(\"#input_imgs0\").on('change', handleImgsFilesSelect);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction handleImgsFilesSelect(e){\r\n");
      out.write("\t\t  var files = e.target.files;\r\n");
      out.write("\t\t  var filesArr = Array.prototype.slice.call(files);\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  filesArr.forEach(function(f){\r\n");
      out.write("\t\t    if(!f.type.match('image.*')){\r\n");
      out.write("\t\t      alert(\"확장자는 이미지 확장자만 가능합니다.\");\r\n");
      out.write("\t\t      return;\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    var sel_file = f;\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    var reader = new FileReader();\r\n");
      out.write("\t\t    reader.onload = function(e){\r\n");
      out.write("\t\t      var html = \r\n");
      out.write("\t\t        \"<img src=\\\"\"+e.target.result+\"\\\">\";\r\n");
      out.write("\t\t      $(\"#imgs0\").empty();\r\n");
      out.write("\t\t      $(\"#imgs0\").append(html);\r\n");
      out.write("\t\t      console.log(html);\r\n");
      out.write("\t\t    } \r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    reader.readAsDataURL(f);\r\n");
      out.write("\t\t  });\r\n");
      out.write("\t\t} // 기본 file tag 미리보기\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar index = 1;\r\n");
      out.write("\t\tvar input_imgs;\r\n");
      out.write("\t\tvar imgs;\r\n");
      out.write("\t\tvar delSwitch = true;\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t  $(\"#addFiles\").on(\"click\", function addFiles(){\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    input_imgs = \"#input_imgs\"+index;\r\n");
      out.write("\t\t    imgs = \"#imgs\"+index;\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t    if(delSwitch){\r\n");
      out.write("\t\t      var delButton =\r\n");
      out.write("\t\t        \"<input type=\\\"button\\\" id=\\\"dels0\\\" value=\\\"삭제하기\\\">\";\r\n");
      out.write("\t\t      $(\"#fileDiv0\").append(delButton);\r\n");
      out.write("\t\t      delSwitch = false; // file del button 추가\r\n");
      out.write("\t\t      \r\n");
      out.write("\t\t      $(\"#dels0\").on(\"click\", function(){\r\n");
      out.write("\t\t        $(\"#fileDiv0\").remove();\r\n");
      out.write("\t\t      }); // file del 기능\r\n");
      out.write("\t\t    } // 기본 file tag의 del\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    var divHtml = \r\n");
      out.write("\t\t      \"<div id=\\\"fileDiv\"+index+\"\\\">\"+\r\n");
      out.write("\t\t      \"<input type=\\\"file\\\" id=\\\"input_imgs\"+index+\"\\\" name=\\\"files\"+index+\"\\\">\"+\r\n");
      out.write("\t\t      \"<span id=\\\"imgs\"+index+\"\\\"></span>\"+\r\n");
      out.write("\t\t      \"<input type=\\\"button\\\" id=\\\"dels\"+index+\"\\\"\"+\r\n");
      out.write("\t\t      \" onclick=\\\"divDel(\"+index+\")\\\" value=\\\"삭제하기\\\">\"+\r\n");
      out.write("\t\t      \"</div>\";\r\n");
      out.write("\t\t    $(\"#fileTd\").append(divHtml); // file div 추가\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    var sel_file;\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    $(input_imgs).on('change', handleImgsFilesSelect);\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    function handleImgsFilesSelect(e){\r\n");
      out.write("\t\t      var files = e.target.files;\r\n");
      out.write("\t\t      var filesArr = Array.prototype.slice.call(files);\r\n");
      out.write("\t\t      \r\n");
      out.write("\t\t      filesArr.forEach(function(f){\r\n");
      out.write("\t\t        if(!f.type.match('image.*')){\r\n");
      out.write("\t\t          alert(\"확장자는 이미지 확장자만 가능합니다.\");\r\n");
      out.write("\t\t          return;\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t        var sel_file = f;\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t        var reader = new FileReader();\r\n");
      out.write("\t\t        reader.onload = function(e){\r\n");
      out.write("\t\t          var html = \r\n");
      out.write("\t\t            \"<img src=\\\"\"+e.target.result+\"\\\">\";\r\n");
      out.write("\t\t          $(imgs).empty();\r\n");
      out.write("\t\t          $(imgs).append(html);\r\n");
      out.write("\t\t        } \r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t        reader.readAsDataURL(f);\r\n");
      out.write("\t\t      });\r\n");
      out.write("\t\t    } // file tag 미리보기\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    index++;\r\n");
      out.write("\t\t  });\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction divDel(index){\r\n");
      out.write("\t\t  var divDel = \"fileDiv\"+index;\r\n");
      out.write("\t\t  var fileDiv = document.getElementById(divDel);\r\n");
      out.write("\t\t  fileDiv.remove();\r\n");
      out.write("\t\t}; // 추가된 file div를 삭제\t\r\n");
      out.write("\t</script>\r\n");
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
