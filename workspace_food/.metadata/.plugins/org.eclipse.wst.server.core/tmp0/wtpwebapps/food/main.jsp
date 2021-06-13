<%@page import="com.recipe.board.db.RecipeBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.goodres.db.GoodResBoardBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<!-- Mirrored from www.cjcookit.com/pc/main by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 23 Mar 2021 09:53:44 GMT -->
<!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=UTF-8" /><!-- /Added by HTTrack -->
<head>
	<meta charset="utf-8">
	<meta name="description" content="셰프의 레시피와 신선 재료가 새벽배송으로 문 앞까지! 오늘부터 나도 셰프! CJ쿡킷">
	
	<meta name="keywords" content="">

	
	<title>라따뚜이</title>
	<link rel="shortcut icon" href="https://www.cjcookit.com/cjkit/web/images/favicon.ico">

    <link rel="stylesheet" type="text/css" href="./cjkit/web/css/common.css?20200924090025">
<!--     <link rel="stylesheet" type="text/css" href="https://www.cjcookit.com/cjkit/web/css/chatbot.css?20200924090025">
 -->
 
 <!-- !!!!!!!!!!!!!!!!!!!!! 메인 슬라이더 태그 !!!!!!!!!!!!!!!!!!!!!!!!!! -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>

<script>

  $(document).ready(function(){

    $('.bxslider').bxSlider({
    	auto: true,
    	speed: 500,
    	pause: 5000,
    	mode: 'horizontal',
    	pager: false,
    	captions: true
    });

  });

</script>

	<!-- uri array -->
	

	<!-- 업무 단위로 c:when 문 추가하여 사용하세요. -->
	
		
			<link rel="stylesheet" type="text/css" href="https://www.cjcookit.com/cjkit/web/css/main.css?20200924090025">
   
   		<link rel="stylesheet" type="text/css" href="./cjkit/web/css/goodResCSS/goodress_main.css">
   		
    	<link rel="stylesheet" type="text/css" href="../cjkit/mobile/css/swiper.css">
    	<!-- <script type="text/javascript" src="https://www.cjcookit.com/cjkit/mobile/js/library/swiper.min.js"></script> -->
    

    <script type="text/javascript" src="../cjkit/web/js/libs/jquery-1.11.2.min.js"></script>

	<script>
		var cjConf = {
			serverImg : "//www.cjcookit.com/cjkit/web/images",
			loginYn : "N"
		}
	</script>

	<script type="text/javascript" src="js/jquery/jquery.form.js"></script>
	<script type="text/javascript" src="js/crew/crew17e0.js?20200924090026"></script>
	<script type="text/javascript" src="js/crew/form/form17e0.js?20200924090026"></script>
	<script type="text/javascript" src="js/cj17e0.js?20200924090026"></script>
	<script type="text/javascript" src="js/oauth/kakao.min.js"></script>
	<script type="text/javascript" src="js/oauth/naveridlogin_js_sdk_2.0.0.js"></script>
<!-- 	<script type="text/javascript" src="https://www.cjcookit.com/pc/js/netfunnel.js?20200924090026" charset="utf-8"></script>
	<script type="text/javascript" src="https://www.cjcookit.com/pc/js/om_pc_skin.js?20200924090026" charset="utf-8"></script> -->
	<script type="text/javascript" src="js/webtoolkit.base64.js"></script>

	
	
		<script type="text/javascript" src="https://nsso.cjone.com/findCookieSecured.jsp?cjssoq=sxFMCkAClfsIXKzOW%2BD6P812UfEpwkjmL7CLmvdfoq%2BkmPDF6xf2tiFnEQ3fwVv66X5vme2b7DBHIQtpiE3bj2o2MHp5bDRKRnk5RWRJN0txRlFVYjVqSEVLQVl1UWMzRzdkNFBkTm1pR3B4Rm5VdlhSQlhLc1JkdnZ1Z1hsQWdqcHZOdW1iazhzMD0%3D"></script>
		<script>
		//$(document).ready(function(evt){
			if((typeof _cjssoEncData) != "undefined" && _cjssoEncData !=""){
				var redirectUrl = location.pathname + location.search;
				var data = {};
				data.redirectUrl		= redirectUrl;
				data.mode			= "SSO_AUTH";
				data.cjssoq			= _cjssoEncData;

				// 전송
				$.ajax({
					async		: true,
					url			: '/pc/auth/login.json',
					dataType	: 'json',
					type		: 'POST',
					data		: data,
					success		: function(data, textStatus, jqXHR){
						// 로그인 처리 결과 체크
						cj.loginResultCheck(data);
					},
					error	   : function(jqXHR, textStatus, errorThrown){
					  //console.log(jqXHR.status);
					}
				});
			}
		//});
		</script>
	
	<meta name="google-site-verification" content="0GuzYD2oaBVARveIoOEQEEx10478h5Vnn5i5YNAS6zI" />
	
	
</head>
<body class="ma_body" >

		<div id="skipnavi">
			<ul>
				<li><a href="#container_title">본문바로가기</a></li>
			</ul>
		</div>

	<div id="wrap">
		<div class="preloader" style="display:none;">
			<div class="loader">
				<span class="loading"></span>
			</div>
		</div>
	
	
   <!-- header -->
 <jsp:include page="./inc/header.jsp"/>
   <!-- header 끝-->

	
		
		<section id="container" >
			<div id="container_title" class="hide" tabindex="-1">본문 시작</div>

			<!-- content -->
			







<!-- HTML_GEN_APPLY_PAGE -->

		<!-- content -->
		<div id="content">
            <div class="main_wrap">

				








<!-- mainBillboard Start -->
				
               <!-- billboard -->
                <div class="ma_billboard">
                    <div class="list_slide ui_carousel">
                        <!-- indigator -->
                        <div class="indigator_pos" style="display:none;">
                            <div class="indigator silde_arrow_wrap"> <!-- 스크립트요청사항 : 검정색 버전 .black 클래스 추가, 하얀색 버젼 .white 클래스 추가 -->
                                <button class="prev ui_carousel_prev ui_carousel_arrow" style="display: inline-block;"><span class="hide">상품 이전보기</span></button>
                                <span class="count_wrap">
                                    <span class="num" ><em>1</em>/5</span>
                                    <span class="hide">총 페이지 3 페이지 중 현재 1번째 페이지</span>
                                </span>
                                <button class="next ui_carousel_next ui_carousel_arrow" style="display: inline-block;"><span class="hide">상품 다음보기</span></button>
                            </div>
                        </div>
                        
						<!-- list -->
                        <div class="prod_list ui_carousel_list">
                            <ul class="ui_carousel_track">
                            	
 						
		                                <li class="slide_conts white"> <!-- 개발요청사항 : 검정색 버전 .black 클래스 추가, 하얀색 버젼 .white 클래스 추가 -->
		                           			<!-- content -->
			<div id="content" class="intro_content">
                <h1 class="hide">COOKIT 소개</h1>
                <!-- top -->
                <div class="top">
                    <div class="intro_img_wrap"> <!-- style="width:2560px; height:640px;" -->
                       <ul class="bxslider">
                        <li><img src="./cjkit/web/images/cook_img/main2.png"> </li>                      
                        <li><img src="./cjkit/web/images/cook_img/main1.png"> </li>                      
                        <li><img src="./cjkit/web/images/cook_img/main3.png"> </li>                      
                        <li><img src="./cjkit/web/images/cook_img/main4.png"> </li>                      
                        <li><img src="./cjkit/web/images/cook_img/main5.png"> </li>                      
                       </ul>
                    </div>
                </div>

   <!-- 기획전 케이스 -->
  <div class="pro_module">
  	<!-- <a nohref target="_self" class="vr_link"> -->
  	<a href="https://www.cjcookit.com/pc/event/planView?plnId=101743&amp;wid1=bnr_bn1" class="vr_link">
 	        <span class="hide">WEEKDAY SALE | 03. 22 ~ 03. 25COOKIT <br> 푸릇푸릇한 테이블</span>
   </a>
      <div class="img_wrap">
          <!-- <a nohref target="_self" class="conts"> -->
          <a href="https://www.cjcookit.com/pc/event/planView?plnId=101743&amp;wid1=bnr_bn1" class="conts">
              <img src="../../img.cjcookit.com/images/file/display/903/2021032209162639668b0.jpg?RS=1920x640" alt="." onerror="cj.com.noImg(this)">
          </a>
      </div>
      <div class="txt_position">
          <div class="txt_wrap">		                                                
              <a href="https://www.cjcookit.com/pc/event/planView?plnId=101743&amp;wid1=bnr_bn1" class="conts">
                  
                   	<div class="prd_flag_wrap">
	
		<span class="flag">주중 이벤트</span>
	
</div>										


                <div class="tit_info">
                    <span class="sub_tit st_elps">COOKIT <br> 푸릇푸릇한 테이블</span>
                    <span class="sub_discription_evt st_elps">WEEKDAY SALE | 03. 22 ~ 03. 25</span>		                                                        
                </div>
            </a>
        </div>
    </div>
</div>
<!-- //기획전 케이스 -->
</li>

  <li class="slide_conts white"> <!-- 개발요청사항 : 검정색 버전 .black 클래스 추가, 하얀색 버젼 .white 클래스 추가 -->
      <!-- 기획전 케이스 -->
      <div class="pro_module">
      	<!-- <a nohref target="_self" class="vr_link"> -->
		   <a href="https://www.cjcookit.com/pc/event/planView?plnId=101722&amp;wid1=bnr_bn3" class="vr_link">
	        <span class="hide">3월 한 달간(3/2~3/31)<br>
				무료배송 혜택!3만원 이상 구매하면<br>
				무료배송</span>
          </a>
             <div class="img_wrap">
     <!-- <a nohref target="_self" class="conts"> -->
    <a href="https://www.cjcookit.com/pc/event/planView?plnId=101722&amp;wid1=bnr_bn3" class="conts">
        <img src="../../img.cjcookit.com/images/file/display/563/2021022615410231468b0.jpg?RS=1920x640" alt="." onerror="cj.com.noImg(this)">
    </a>
</div>
<div class="txt_position">
    <div class="txt_wrap">		                                                
        <a href="https://www.cjcookit.com/pc/event/planView?plnId=101722&amp;wid1=bnr_bn3" class="conts">
                                      
                                       	<div class="prd_flag_wrap">
	
		<span class="flag">무료배송</span>
	
</div>										
															
															
     <div class="tit_info">
      <span class="sub_tit st_elps">3만원 이상 구매하면<br> 무료배송</span>
       <span class="sub_discription_evt st_elps">3월 한 달간(3/2~3/31)<br>
				무료배송 혜택!</span>		                                                        
                                  </div>
                              </a>
                          </div>
                      </div>
                  </div>
		                                    <!-- //기획전 케이스 -->
                  </li>
            </ul>
        </div>
    </div>
</div>			                        
 <!-- mainBillboard End -->               
			                        
									
                

<!-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! -->
<!--  <h1>내용 시작</h1> -->


<%
	// http://localhost:8080/cook_design/Main.me
	GoodResBoardBean grbb = new GoodResBoardBean();
	List<GoodResBoardBean> starAvgList = new ArrayList<GoodResBoardBean>();
	starAvgList = (List) request.getAttribute("starAvgList");
	
	RecipeBean rcpb = new RecipeBean();
	List<RecipeBean> rcpViewList = new ArrayList<RecipeBean>();
	rcpViewList = (List) request.getAttribute("rcpViewList");

%> 
	
	  		<div style="margin: 100px; background-color: white;">
 		<div class="mainListImage">
			<span class="main_list_span2"><h3><b>실시간 인기 레시피</b></h3><hr></span>
			<table class="div_gr_list_table2">
				<tr>
				<%
					if(rcpViewList.size() > 2){
	 					for(int i=0;i<3;i++) {
								rcpb = rcpViewList.get(i);								
				%>
					<th>
					<!-- 이미지 출력 -->
					<a href="./RecipeDetail.re?f_rcp_num=<%=rcpb.getF_rcp_num() %>">
					<img src="./recipe_upload/<%=rcpb.getF_rcp_th_img() %>"
						style="border-radius: 10%;" width="290">
					</a>
					</th>				
 				<%
	 				}
				%>
				</tr>
				<tr>
				<%
					for(int i=0; i<3; i++) {
						rcpb = rcpViewList.get(i);
						
				     %>
               <th class="gr_gu_name"><%=rcpb.getF_rcp_title() %></th>
            <%
                  }
            
                  %>
                  <%
               } else {
            %>
                     <th>현재 인기 게시글이 없습니다</th>
            
            <%
               }
            %>
            </tr>
			</table>
			<hr>
		</div>
	</div>  

  	<div style="margin: 100px; background-color: white;">
 		<div class="mainListImage">
			<span class="main_list_span2"><h3><b>평점이 높은 인기 식당</b></h3><hr></span>
			<table class="div_gr_list_table2">
				<tr>
				<%
 					for(int i=0;i<4;i++) {
							grbb = starAvgList.get(i);						
				%>
					<th>
					<!-- 이미지 출력 -->
					<a href="./GoodResContentAction.gr?num=<%=grbb.getF_gr_num() %>">
					<img src="<%=grbb.getF_gr_img() %>" style="border-radius: 10%;">
					</a>
					</th>				
 				<%
 					}
				%>
				</tr>
				<tr>
				<%
					for(int i=0; i<4; i++) {
						grbb = starAvgList.get(i);
				%>
					<th class="gr_gu_name"><%=grbb.getF_gr_name() %></th>
				<%
					}
				%>
				</tr>
			</table>
			<hr>
		</div>
	</div>  
 
 <div class="main_img">
  	<img src="intro_cookit_4.jpg"> 
 	<p>
 		혼자 알기 아까운 나만의 요리비법, <br>
 		라따뚜이에서 공유해보세요! <br><br>
 		<a href="./GoodsList.go"> &gt &gt 쇼핑몰 바로가기 </a>  
 	</p>
 	
 </div>
 
 
 
 
 
 
 
 
 



<!-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! -->








<script>
	$(document).ready(function(evt){
		// 개인화 영역 구성
		createPersonOrder();
		createPersonCpn();

		// 쿠키 저장된 배너 노출여부가 close이면 배너 노출 안하도록 설정
		if (getCookie('mainTopBrn') != "close") {
			createMainTopBrn();
		}else {
			// 이벤트 팝업
			if (getCookie('mainEventPop') != "close") {
				showEventPop();
			}
		}

		$.each($("img[name^=imgResizingCookitReview]"), function(index, item){
			var imgObject = {};
			imgObject.url = $(this).attr("url");
			imgObject.w = 0;
			imgObject.h = 0;
			imgObject.obj = this;
			image.init(imgObject);
		});
		
		
		cj.com.lazyLoad();
		
		// 빌보드영역 동영상 재생 시 텍스트 컬러 변경
		$('.ma_billboard .slide_conts video').on('playing',function(e){			
            var $slideConts = $(this).closest('.slide_conts');
            var color = $slideConts.attr('video_color');
            if(cj.isEmpty(color)) color = $slideConts.attr('image_color');
            $slideConts.removeClass('black').removeClass('white').addClass(color);
            
            var currentColor = $('.ma_billboard .ui_carousel_current').hasClass('black')?'black':'white';
           	$('.ma_billboard .indigator').removeClass('black').removeClass('white').addClass(currentColor);
     	}).on('ended',function(e){
			var $slideConts = $(this).closest('.slide_conts');
            var color = $slideConts.attr('image_color');
            $slideConts.removeClass('black').removeClass('white').addClass(color);
            
            var currentColor = $('.ma_billboard .ui_carousel_current').hasClass('black')?'black':'white';
           	$('.ma_billboard .indigator').removeClass('black').removeClass('white').addClass(currentColor);
     	});
		
	});
	


	// $('#wrap').vcMain(); 실행 후 처리되어야 할 작업
	function initMain(){
		// 맛취향 개인화 설정
		setFlvrTst();

		$(".main_wrap").off('click', 'button.btn_resel');	//재판매알림 토글 수동처리
        $(".main_wrap").off('click', 'button.btn_ar_new');	//신메뉴알림 토글 수동처리
	}

	//쿠키에 저장된 값 가져오기
	function getCookie(name) {
		var value = document.cookie.match('(^|;) ?' + name + '=([^;]*)(;|$)');
		return value? value[2] : null;
	}

	function createMainTopBrn(){
		// 요청처리
		$.ajax({
			url			: "/pc/main/getMainTopBrnList.json",
			dataType	: "JSON",
			async		: true,
			type		: "POST",
			data		: {},
			success		: function(data, textStatus, jqXHR){
				if(!crew.ajaxValidate(data)){ return; }

				$('#head').before(data.html);
			},
			error: function(data, textStatus, jqXHR){
				console.log("---------------------------------> error!!");
				console.log(textStatus);
				console.log(jqXHR);
			},
			complete: function(){
				if (getCookie('mainEventPop') != "close") {
					showEventPop();
				}
			}
		});
	}
	function mainTopBrnClose(obj) {
		$(obj).closest('.ma_top_brn').addClass('close');
		if(location.protocol == 'main.html'){
			document.cookie = "mainTopBrn=close; path=/;";
		}else{
			document.cookie = "mainTopBrn=close; path=/;SameSite=None; Secure;";
			//document.cookie = 'cross-site-cookie=bar; SameSite=None; Secure';
		}		
	}

	function createPersonCpn(){
		// 요청처리
		$.ajax({
			url			: "/pc/main/personCpn.json",
			dataType	: "JSON",
			async		: true,
			type		: "POST",
			data		: {},
			success		: function(data, textStatus, jqXHR){
				if(!crew.ajaxValidate(data)){ return; }

				// 데이터 채우기
				if(data.personCpnYn == "Y"){
					$(".mbrCpnNoDataArea").hide();
					$(".mbrCpnListArea").find(".dataListArea").html(data.html);
					$(".mbrCpnListArea").find(".count_wrap").html('<span class="num"><em>1</em>/'+data.listSize+'</span><span class="hide">총 페이지 '+data.listSize+' 페이지 중 현재 1번째 페이지</span>').show();
					$(".mbrCpnListArea").show();

					vcui.require( ['ui/carousel'], function() {
						// default: infinite loop sliding 루핑 슬라이드
						$('.mbrCpnListArea .ui_carousel').vcCarousel();
					});

					setTimeout(function () {
						var $wrap = $('.mbrCpnListArea');
						var $carousel = $wrap.find('.ui_carousel');
						$carousel.on( 'carouselafterchange', function( evt, carousel ) {
							var index = carousel.currentSlide, $player;
	                        var templateCount = '<strong>'+(index+1)+'</strong>/'+carousel.$slides.length;
	                        $(carousel.el).find('.count_wrap>span.num').html( templateCount );

	                        if( ($player = carousel.$slides.eq(carousel.previousSlide).find('iframe')).length  ) {
	                            var $wrap = $player.parent();
	                            $player.remove();
	                            $wrap.children().show();
	                        }
						});
					}, 100);
				}else{
					var firstDlvDt = data.firstDlvDt;
					$(".mbrCpnNoDataArea").find("strong").html(firstDlvDt.dlUnstScheMonth + "월 " + firstDlvDt.dlUnstScheDay + "일(" + firstDlvDt.dlUnstScheWeekNm + ")에 받을 수 있어요");

					var firstDlvTime = data.firstDlvTime;
					var setOdrEndTimer = function (){
						// 시, 분, 초 계산
						var hour	= Math.floor(firstDlvTime / 1000 / 60 / 60);
						var min		= Math.floor((firstDlvTime - (hour * 1000 * 60 * 60)) / 1000 / 60);
						var sec		= Math.floor((firstDlvTime - (hour * 1000 * 60 * 60) - (min * 1000 * 60)) / 1000);

						$(".mbrCpnNoDataArea").find(".link_time>span").html((hour < 10 ? "0" + hour : hour) + ":" + (min < 10 ? "0" + min : min) + ":" + (sec < 10 ? "0" + sec : sec));

						// 1초 차감
						firstDlvTime = firstDlvTime - 1000;
						setTimeout(setOdrEndTimer, 1000);
					}
					setOdrEndTimer();
				}
			},
			error: function(data, textStatus, jqXHR){
				console.log("---------------------------------> error!!");
				console.log(textStatus);
				console.log(jqXHR);
			}
		});
	}


	// 개인화 영역(주문) 구성 처리
	function createPersonOrder(){
		// 요청처리
		$.ajax({
			url			: "/pc/main/personOrder.json",
			dataType	: "JSON",
			async		: true,
			type		: "POST",
			data		: {},
			success		: function(data, textStatus, jqXHR){
				if(!crew.ajaxValidate(data)){ return; }

// 				console.log(data);

				// 데이터 채우기
				if(data.personOrderYn == "Y"){
					$(".mbrOrderNoDataArea").hide();
					$(".mbrOrderListArea>div.login_delivery").html(data.html);
					$(".mbrOrderListArea").show();
				}
				
				if(!cj.isEmpty('')) {
					// 파라미터가 있으면 해당 클래스의 위치로 스크롤 이동
					setTimeout(function(){
						scrollToClass();
					}, 100);
				}
			},
			error: function(data, textStatus, jqXHR){
				console.log("---------------------------------> error!!");
				console.log(textStatus);
				console.log(jqXHR);
			}
		});
	}

	// 신메뉴 알림 클릭시
	function goNewNoticeManage(toggle){
		if(cjConf.loginYn != "Y"){
			if(!confirm("로그인이 필요한 서비스입니다.\n로그인하시겠습니까?")) return;
			cj.login();
			return false;
		}
		if(toggle == 'on'){
			if(!confirm("신메뉴 알림을 취소하시겠습니까?")) return false;
		}else{
			if(!confirm("신메뉴 알림을 설정하시겠습니까?")) return false;
		}
		location.href="https://www.cjcookit.com/pc/myOrder/newNoticeManage";
	}

	// 이벤트 팝업 보기
	function showEventPop() {
		$.ajax({
			async: true,
			url: '/pc/main/getEventPopList.json',
			dataType: 'json',
			type: 'POST',
			success: function(data, textStatus, jqXHR) {
				// 로그인 실패 메세지 처리
				if (!crew.ajaxValidate(data)) {
					return;
				}
				
				$("#mainEventPop").remove();

				$(".modal-container").append(data.html);
				/* vcui.require( ['ui/modal'], function() {
					$("#mainEventPop").vcModal();
	        	});
 */
 				if($("#mainEventPop")){
 					$("#mainEventPop").show();	
 					$('article.main_ev').css('top',parseInt($(".pro_module").eq(0).offset().top));
 				}
 
				vcui.require( ['ui/carousel'], function() {
					// default: infinite loop sliding 루핑 슬라이드
					$('#mainEventPop .ui_carousel').vcCarousel();
				});

			},
			error: function(jqXHR, textStatus, errorThrown){
				//console.log(jqXHR.status);
			}
		});
	}

	// 이벤트 팝업 오늘 하루 보지 않기
	function closeEventPopToday() {
		var todayDate = new Date();
		todayDate = new Date(parseInt(todayDate.getTime() / 86400000) * 86400000 + 54000000);
		var expiredays = 1;
		if ( todayDate > new Date() ) {
			expiredays = expiredays - 1;
		}
		todayDate.setDate(todayDate.getDate() + expiredays);
		if(location.protocol == 'main.html'){
			document.cookie = "mainEventPop=close; path=/; expires=" + todayDate.toGMTString() + ";";
		}else{
			document.cookie = "mainEventPop=close; path=/;SameSite=None; Secure; expires=" + todayDate.toGMTString() + ";";
			//document.cookie = 'cross-site-cookie=bar; SameSite=None; Secure';	
		}		
		$('.ui_modal_wrap').remove();
		$("#closeEventPopBtn").trigger("click");
	}
	
	function closeEventPopup(){
		$('.ui_modal_wrap').remove();
	}

	//재판매알림신청시 버튼 활성화처리
	function resaleReqAfterCallback(obj) {
		var txt = obj.find('span.hide');
		obj.addClass("on");
		txt.text("재판매 알림 신청 완료");
	}

	//재판매알림신청취소시 버튼 비활성화처리
	function resaleCancelAfterCallback(obj) {
		var txt = obj.find('span.hide');
		obj.removeClass("on");
		txt.text("재판매 알림 신청");
	}

	// 맛취향 개인화 설정
	function setFlvrTst(){
		$.ajax({
			url			: "/pc/main/getMemberFlvrTstCd.json",
			dataType	: "JSON",
			async		: true,
			type		: "POST",
			data		: {},
			success		: function(data, textStatus, jqXHR){
				if(!crew.ajaxValidate(data)){ return; }
								
				$(".ma_individ .sl_taste a[flvrTstCd='"+data.flvrTstCd+"']").trigger("click");
				changeRecom();
				$(".ma_individ .desc .name").text(data.mbrNm+"님");
				$(".personProdCase"+data.personProdCase).show();
			},
			error: function(data, textStatus, jqXHR){
				console.log("---------------------------------> error!!");
				console.log(textStatus);
				console.log(jqXHR);
			}
		});
	}
	
	// 스크롤 해당 클래스 엘리먼트 위치로 이동
	function scrollToClass() {
		var offsetClass = '.';
		if($(offsetClass).length == 0) { return; }
		$(window).scrollTop($(offsetClass).offset().top);
	}
	
	function changeRecom(){
		setTimeout(function () {
			$("#personProdArea .list_recom:visible").find("img[data-image_src]").each(function(){
				var imageSrc = $(this).data("image_src");
				if(!cj.isEmpty(imageSrc)){
					$(this).prop("src", imageSrc).data("image_src", "");
				}				
			});
		}, 0);
	}
</script>

			<!-- //content -->
		</section>
	
	    






<!-- 챗봇 레이어 팝업 -->
<article class="lay_chatbot_wrap_ok">
    <!-- <div class="lay_chatbot_frame">
        <section class="chatbot_conts">
          <iframe src="about:blank" id="iframeChatbot" allow="geolocation"></iframe>
        </section>
        <div class="close">
            <button type="button" class="btn_chatbot_close"><span class="hide">닫기</span></button>
        </div>
    </div> -->
    <!-- 레이어 팝업 -->
    <article class="lay_wrap_chatbot modal_chatbot" style="display:none;">
        <h1 class="hide"><span class="hide">앱업데이트안내(필수)</span></h1>
        <section class="lay_conts">
            <!-- 190419_구조 수정 -->
            <div class="laypop_cont">
                <p>챗봇 창을 닫으시면, <br>기존 채팅 내용이 초기화됩니다.<br>챗봇 창을 닫으시겠습니까?</p>
            </div>
            <!-- //190419_구조 수정 -->
            <div class="btn_wrap laypop">
                <button type="button" class="btn_lay_chatbot ui_closeCancel">취소</button>
                <button type="button" class="btn_lay_chatbot green ui_closeConfirm">확인</button>
            </div>
        </section>
    </article>
    <div class="dimmed" style="display:none;"></div>
</article>
<script type="text/javascript">
    /*!
        Chatbot Layer, open/close 
    */
   $(document).ready(function(){
        var $floatingWrap = $('.fix_contsbtm');
        var $chatbotWrap = $('.lay_chatbot_wrap_ok');
        var $chatbotFrame = $chatbotWrap.find('.lay_chatbot_frame');
        
        $floatingWrap.on( 'click', 'button.chatbot', function() {
        	console.log("1");
            openChatbot( true ); 
        }); 

        $chatbotWrap.on( 'click', 'button.btn_chatbot_close', function() {
            openModalAlert( true ); 
        }); 

        $chatbotWrap.on( 'click', 'button.ui_closeCancel', function() {
            openModalAlert( false ); 
        }); 

        $chatbotWrap.on( 'click', 'button.ui_closeConfirm', function() {
            openModalAlert( false ); 
            openChatbot( false ); 
        }); 

        function openModalAlert( open ) { 
            var state = open ? 'show' : 'hide'; 
            $chatbotWrap.find('.dimmed')[state](); 
            $chatbotWrap.find('.modal_chatbot')[state](); 
        } 

        function openChatbot( open ) { 
            if( open ) {
                $chatbotWrap.show(); 
                $chatbotFrame.animate( {top:0}, 460, 'easeOutCubic' ); 

            } else {
                $chatbotFrame.animate( {top:640}, 400, 'easeInCubic', function() {
                    $chatbotWrap.hide(); 
                });
            }
        }
    });
</script>
		







<!-- Footer -->
<div class="footer_loca">
<jsp:include page="./inc/footer.jsp"/>
</div>
<!-- //Footer -->



<div class="fix_contsbtm"> <!-- 스크립트요청사항 : 바닥컨텐츠가 .btm 클래스 추가해주세요 -->
    <div class="fx_button chatbot ui_chatBot show">
<!--         <button type="button" class="chatbot" onclick="javascript:cj.chatbot.open('http://cookit.oli-va.com/');">
            <span class="hide">챗봇으로 문의하기</span>
        </button> -->
    </div>
    <div class="fx_button top ui_gotoTop show">
        <a href="#wrap" role="button">
            <span class="hide">페이지 상단으로</span>
        </a>
    </div>
</div>

<script>
function toggleUiFamilyArea(obj) {
	var _this = $(obj);
	_this.closest('.ui_familySite').toggleClass('on');
	_this.closest('.ui_familySite').find('.ly_manage').toggleClass('show');
}
</script>
	
	</div>
		
	<div class="modal-container"></div>


<script>
$(document).ready(function(evt){
	//카카오 JavaScript 키 설정
	Kakao.init('44db3bbd3ed2c23cfd950c7ac71aee25');
});
</script>
<script type="text/javascript" src="../cjkit/web/js/vcui17e0.js?20200924090026"></script>
<script type="text/javascript" src="../cjkit/web/js/olivekitchen.site17e0.js?20200924090026"></script>

<script type="text/javascript">
	//vcui.require.config( {baseUrl:'http://publish.cjcookit.com/cjkit/mobile/js'} );
	vcui.require.config( {baseUrl:'//www.cjcookit.com/cjkit/web/js'} );
	//olivekitchen._.addon.carousel = false;
</script>

<script type="text/javascript" src="js/jquery/jquery.lazy.min.js"></script>



<script type="text/javascript">
function setIframe(target , link , description)
{
   var demo_Iframe = document.createElement("iframe");
   demo_Iframe.src = "/pc/footer/cookitInsta?mid1="+target;
   demo_Iframe.id="demo_Iframe";
   demo_Iframe.width="0";
   demo_Iframe.height="0";
   document.getElementsByTagName('body')[0].appendChild(demo_Iframe);
   if(!cj.isEmpty(link)) cj.go.outLinkOpen(link, 'Y');  
   
}
</script>



	<script type="text/javascript">
		olivekitchen._.addon.carousel = false;
		$(function() {
			vcui.require(['cookit/main'], function() {
		        $('#wrap').vcMain();
		        initMain();

		        /* 190710_웹접근성 */
		        $.each( $('.ma_billboard').find('li.slide_conts'), function( i, item ) {
		            $(item).find('.img_wrap > a').attr('tabindex',0);

		            if( $(item).hasClass('ui_carousel_cloned') ) {
		                $(item).find('a, input, button, select').attr('tabindex',-1);
		            }
		        });
		        /* //190710_웹접근성 */
		    });

		});
	</script>



<script type="text/javascript">
	var params = {};//파라미터 없음
	$.ajax({
		url: '/pc/myFpn/fpnViewMenu',
		dataType: 'json',
		type: 'POST',
		data: params,
		success: function(data, textStatus, jqXHR) {
			if(data.fpnData != null) {
				$('#fpnMenuView').show();
			} else {
				$('#fpnMenuView').hide();
			}
		},
		error : function(jqXHR, textStatus, errorThrown) {
			console.log(jqXHR.status);
		}
	});
</script>


<script type="text/javascript" src="js/makePCookie.js"></script>





	
	<div class="jehu-container"></div>
	<script type="text/javascript">
	setTimeout(function () {
		$.ajax({
			async		: true,
			url			: '/pc/comm/jehuScript.json',
			dataType	: 'json',
			type		: 'POST',
			data		: { requestUri : '/pc/main' },
			success		: function(data, textStatus, jqXHR){
				if(!crew.ajaxValidate(data)){ return; }
	
				$(".jehu-container").append(data.html);
			},
			error	   : function(jqXHR, textStatus, errorThrown){
			  //console.log(jqXHR.status);
			}
		});
	}, 1000);
	</script>


</body>

<!-- Mirrored from www.cjcookit.com/pc/main by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 23 Mar 2021 09:53:46 GMT -->
</html>