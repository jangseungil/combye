<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/views/common/common.jsp"/>
<html ng-app="helloApp">
<head>
	<title>Test</title>
<script>
var helloApp = angular.module("helloApp", []);
	  
helloApp.controller('CompanyCtrl', ['$scope',  '$http', function ($scope, $http) {
	
	  // 사용자 객체를 생성
	  $scope.user = {};

	  // 빈 문자열로 초기화
	  $scope.user.name = 'blank';
	  
	  $http({
	    method: 'GET',
	    url: '/test/user/json'
	  })
	  .success(function (data, status, headers, config) {
	    // 성공! 데이터를 가져왔어
	  })
	  .error(function (data, status, headers, config) {
	    // 이런. 뭔가 잘못되었음! :(
	  });
	}]);
</script>
</head>

<body ng-controller="CompanyCtrl">

<div>
  <p>{{ user.name }}</p>
</div>


<jsp:include page="/WEB-INF/views/test/common/navbar.jsp">
	<jsp:param name="tab" value="test"/>
</jsp:include>


<div class="panel panel-default">
	<!-- Default panel contents -->
	<div class="panel-heading">사용자목록</div>
	<div class="panel-body">
		<p>사용자 관리 테스트 페이지 입니다.</p>
	</div>
	
	<form class="navbar-form navbar-right" role="search" action="/test/user">
		<div class="form-group">
			<input type="text" name="name" class="form-control" placeholder="Search by name.." value="${param.name}">
		</div>
		<button type="submit" class="btn btn-default">Submit</button>
	</form>
	
	<!-- Table -->
	<table class="table">
		<colgroup>
			<col width="10%"/>
			<col width="5%"/>
			<col width="9%"/>
			<col width="9%"/>
			<col width="9%"/>
			<col width="9%"/>
			<col width="9%"/>
			<col width=""/>
			<col width="7%"/>
			<col width="7%"/>
			<col width="7%"/>
		</colgroup>
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
			<c:choose>
				<c:when test="${not empty userTestVoList}">
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
				</c:when>
				<c:otherwise>
					<tr>
						<td colspan="11" class="text-center">검색 결과가 없습니다.</td>
					</tr>
				</c:otherwise>
			</c:choose>
		</tbody>
	</table>
</div>

<script type="text/javascript">
</script>
</html>
