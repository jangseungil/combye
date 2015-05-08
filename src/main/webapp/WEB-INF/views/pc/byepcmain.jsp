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

	<div class="row">
		<div class="col-md-12">
			<div class="btn-group" data-toggle="buttons">
				<h4>h4. Bootstrap heading</h4>
				<label class="btn btn-primary">
					<input type="radio" name="os" id="option1" autocomplete="off">windows 7
				</label>
				<label class="btn btn-primary">
					<input type="radio" name="os" id="option2" autocomplete="off">windows 8
				</label>
				<label class="btn btn-primary">
					<input type="radio" name="os" id="option2" autocomplete="off">windows vista
				</label>
				<label class="btn btn-primary">
					<input type="radio" name="os" id="option2" autocomplete="off">windows xp
				</label>
			</div>
		</div>
	</div>

	<div class="row">
		<div class="col-md-12">
			<div class="btn-group" data-toggle="buttons">
				<h4>h4. Bootstrap heading</h4>
				<label class="btn btn-primary">
					<input type="radio" name="company" id="option1" autocomplete="off">HP
				</label>
				<label class="btn btn-primary">
					<input type="radio" name="company" id="option2" autocomplete="off">DELL
				</label>
			</div>
		</div>
	</div>

	<div class="row">
		<div class="col-md-12"></div>
		<div class="col-md-12 text-left">
			<button type="button" class="btn btn-default ">
			  <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>Priv
			</button>
			
			<button type="button" class="btn btn-default ">
			   Next<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			</button>
		</div>
	</div>
	
</div>
<script type="text/javascript">
	
	console.log($("input[name=options]").length);
	
	
</script>
</html>
