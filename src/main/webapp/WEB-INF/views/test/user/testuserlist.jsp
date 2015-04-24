<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/views/common/common.jsp"/>
<html>
<head>
	<title>Test</title>
</head>
<body>



<div class="panel panel-default">
	<!-- Default panel contents -->
	<div class="panel-heading">사용자목록</div>
	<div class="panel-body">
		<p>사용자 관리 테스트 페이지 입니다.</p>
	</div>
	
	<!-- Table -->
	<table class="table">
		<thead>
			<tr>
				<th>seq</th>
				<th>type</th>
				<th>name</th>
				<th>sex</th>
				<th>birth</th>
				<th>phone</th>
				<th>zipcode</th>
				<th>address</th>
				<th>reg_date</th>
				<th>cnf_yn</th>
				<th>leave_yn</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${userTestVoList}" var="userTestVo" varStatus="status">
				<tr>
					<td><a href="/test/user/${userTestVo.seq}">${userTestVo.seq}</a></td>
					<td>${userTestVo.type}</td>
					<td>${userTestVo.name}</td>
					<td>${userTestVo.sex}</td>
					<td>${userTestVo.birth}</td>
					<td>${userTestVo.phone}</td>
					<td>${userTestVo.zipcode}</td>
					<td>${userTestVo.address}</td>
					<td>${userTestVo.regDate}</td>
					<td>${userTestVo.cnfYn}</td>
					<td>${userTestVo.leaveYn}</td>
			
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<script type="text/javascript">
</script>
</html>
