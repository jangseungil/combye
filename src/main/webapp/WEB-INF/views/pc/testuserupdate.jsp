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

<form action="/test/user/${userTestVo.seq}/update" method="post" >
	<div class="panel panel-default">
		<!-- Default panel contents -->
		<div class="panel-heading">사용자상세</div>
		<div class="panel-body">
			<p>사용자 관리 테스트 페이지 입니다.</p>
		</div>
		<a class="btn btn-default" href="/test/user/${userTestVo.seq}" role="button">취소</a>
		
		<!-- Table -->
		<table class="table table-bordered">
			<tbody>
				<tr>
					<th>seq</th>
					<td>${userTestVo.seq}</td>
					<th>type</th>
					<td><input type="text" class="form-control" id="type" name="type" placeholder="input type.." value="${userTestVo.type}"/></td>
				</tr>
				<tr>
					<th>name</th>
					<td><input type="text" class="form-control" id="name" name="name" placeholder="input name.." value="${userTestVo.name}"/></td>
					<th>sex</th>
					<td><input type="text" class="form-control" id="sex" name="sex" placeholder="input sex.." value="${userTestVo.sex}"/></td>
				</tr>
				<tr>
					<th>birth</th>
					<td><input type="text" class="form-control" id="birth" name="birth" placeholder="input birth.." value="${userTestVo.birth}"/></td>
					<th>phone</th>
					<td><input type="text" class="form-control" id="phone" name="phone" placeholder="input phone.." value="${userTestVo.phone}"/></td>
				</tr>
				<tr>
					<th>zipcode</th>
					<td><input type="text" class="form-control" id="zipcode" name="zipcode" placeholder="input zipcode.." value="${userTestVo.zipcode}"/></td>
					<th>address</th>
					<td><input type="text" class="form-control" id="address" name="address" placeholder="input address.." value="${userTestVo.address}"/></td>
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
	<button type="submit" class="btn btn-default">저장</button>
</form>

<script type="text/javascript">
</script>
</html>
