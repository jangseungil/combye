<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/views/common/common.jsp"/>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Test</title>
</head>
<body>

<jsp:include page="/WEB-INF/views/test/common/navbar.jsp">
	<jsp:param name="tab" value="angulartest"/>
</jsp:include>

<div class="container">

	<div class="row text-center">
		<div class="col-md-12"></div>
		<div class="col-md-12" id="tabGrp">
			<button type="button" class="btn btn-default active" id="tabOS">
				운영체제(OS) <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>
			</button>
			
			<button type="button" class="btn btn-default" id="tabManu">
			   제조사 <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>
			</button>
			
			<button type="button" class="btn btn-default" id="tabModel">
			   모델명 <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>
			</button>
		</div>
	</div>
	
	<h5>&nbsp;</h5>

	<div class="row text-center" id="os">
		<div class="col-md-12">
			<h4>d123</h4>
			<button type="button" class="btn btn-default">windows 7</button>
			<button type="button" class="btn btn-default">windows 8</button>
			<button type="button" class="btn btn-default">windows vista</button>
			<button type="button" class="btn btn-default">windows xp</button>
			<button type="button" class="btn btn-default">없음</button>
		</div>
	</div>

	<div class="row text-center" id="menufactor">
		<div class="col-md-12">
			<div class="btn-group" data-toggle="buttons">
				<h4>4332</h4>
				<button type="button" class="btn btn-default">DELL</button>
				<button type="button" class="btn btn-default">HP</button>
				<button type="button" class="btn btn-default">SONY</button>
				<button type="button" class="btn btn-default">SHARP</button>
				<button type="button" class="btn btn-default">없음</button>
			</div>
		</div>
	</div>
	
	<h5>&nbsp;</h5>
	
	<div class="row text-center">
		<div class="col-md-12">
			<button type="button" class="btn btn-default" id="priv">
			  <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>Priv
			</button>
			
			<button type="button" class="btn btn-default" id="next">
			   Next<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			</button>
		</div>
	</div>
	
</div>
<script type="text/javascript">
	$(document).ready(function() {
		$.each($("#os button"), function(idx, obj){
			$(obj).click(function() {
				selectOS(obj);
			});
		});
		
		$.each($("#menufactor button"), function(idx, obj){
			$(obj).click(function() {
				selectManu(obj);
			});
		});
		
		$.each($("#tabGrp button"), function(idx, obj){
			$(obj).click(function() {
				selectTab(obj);
			});
		});
		
		var tabArr = [];
		$.each($("#tabGrp button"), function(idx, obj){
			tabArr.push($(obj).prop("id"));
		});
		
		console.log(tabArr);
		
		
		$("#priv").click(function() {
			var isActive = false;
			$.each($("#tabGrp button"), function(idx, obj){
				console.log($(this)[0]);
				
				if($(obj).prop("class").indexOf("active") > 0) {
					if(idx == 1) {
						return;
					}
				}
				
				if(isActive) {
					console.log($(obj).prop("id"));
					isActive = false;
					selectTab(obj);
					return;
				}
				
				if($(obj).prop("class").indexOf("active") > 0) {
					isActive = true;
				}
			});
		});
		
		$("#next").click(function() {
			var isActive = false;
			$.each($("#tabGrp button"), function(idx, obj){
				if(isActive) {
					isActive = false;
					selectTab(obj);
					return;
				}
				
				if($(obj).prop("class").indexOf("active") > 0) {
					isActive = true;
				}
			});
		});
		
		$("#menufactor").hide();
	});
	
	function selectTab(obj) {
		$.each($("#tabGrp button"), function(idx, obj2){
			$(obj2).prop("class", "btn btn-default");
		});
		
		$(obj).prop("class", "btn btn-default active");
		
		if($(obj).prop("id") == "tabManu") {
			$("#os").hide();
			$("#menufactor").show();
		}
		
		if($(obj).prop("id") == "tabOS") {
			$("#os").show();
			$("#menufactor").hide();
		}
			
	}
	
	function selectOS(obj) {
		$.each($("#os button"), function(idx, obj2){
			$(obj2).prop("class", "btn btn-default");
		});
		
		$(obj).prop("class", "btn btn-primary");
		
		$("#next").prop("class", "btn btn-success");
		
		$("#tabOS span").prop("class", "glyphicon glyphicon-ok");
		
	}
	
	function selectManu(obj) {
		$.each($("#menufactor button"), function(idx, obj2){
			$(obj2).prop("class", "btn btn-default");
		});
		
		$(obj).prop("class", "btn btn-primary");
		
		$("#next").prop("class", "btn btn-success");
		
		$("#tabManu span").prop("class", "glyphicon glyphicon-ok");
		
	}
	
</script>
</html>
