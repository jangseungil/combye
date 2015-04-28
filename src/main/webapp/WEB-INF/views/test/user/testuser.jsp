<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/views/common/common.jsp"/>
<!DOCTYPE html>
<html>
<head>
	<title>Test</title>
</head>
<body>

<jsp:include page="/WEB-INF/views/test/common/navbar.jsp">
	<jsp:param name="tab" value="test"/>
</jsp:include>

<div class="panel panel-default">
	<!-- Default panel contents -->
	<div class="panel-heading">사용자상세</div>
	<div class="panel-body">
		<p>사용자 관리 테스트 페이지 입니다.</p>
	</div>
	<a class="btn btn-default" href="/test/user" role="button">목록</a>
	<a class="btn btn-default" href="/test/user/${userTestVo.seq}/update" role="button">수정</a>
	
	<!-- Table -->
	<table class="table table-bordered">
		<tbody>
			<tr>
				<th>seq</th>
				<td>${userTestVo.seq}</td>
				<th>type</th>
				<td>${userTestVo.type}</td>
			</tr>
			<tr>
				<th>name</th>
				<td>${userTestVo.name}</td>
				<th>sex</th>
				<td>${userTestVo.sex}</td>
			</tr>
			<tr>
				<th>birth</th>
				<td>${userTestVo.birth}</td>
				<th>phone</th>
				<td>${userTestVo.phone}</td>
			</tr>
			<tr>
				<th>zipcode</th>
				<td>${userTestVo.zipcode}</td>
				<th>address</th>
				<td>${userTestVo.address}</td>
			</tr>
			<tr>
				<th>reg_date</th>
				<td>${userTestVo.regDate}</td>
				<th>cnf_yn</th>
				<td>${userTestVo.cnfYn}</td>
			</tr>
			<tr>
				<th colspan="1">leave_yn</th>
				<td colspan="1">${userTestVo.leaveYn}</td>
			</tr>
		</tbody>
	</table>
</div>

<script type="text/javascript">
</script>
</html>
