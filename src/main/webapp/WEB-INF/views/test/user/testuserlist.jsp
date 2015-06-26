<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/views/common/common.jsp"/>
<html ng-app="helloApp">
<head>
	<title>Test</title>
</head>

<body ng-controller="CompanyCtrl">

<jsp:include page="/WEB-INF/views/test/common/navbar.jsp">
	<jsp:param name="tab" value="test"/>
</jsp:include>


<div class="panel panel-default">
	<!-- Default panel contents -->
	<div class="panel-heading">사용자목록</div>
	<div class="panel-body">
		<p>사용자 관리 테스트 페이지 입니다.</p>
	</div>
	
	<div class="navbar-form navbar-right">
		<div class="form-group">
			<input type="text" name="name" class="form-control" placeholder="Search by name.." ng-model="name" ng-enter="search()"> 
		</div>
		<button type="button" class="btn btn-default" ng-click="search()">Submit</button>
	</div>
	
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
				<th>ID</th>
				<th>TYPE</th>
				<th>NAME</th>
				<th>SEX</th>
				<th>BIRTH</th>
					<th>PHONE</th>
				<th>ZIPCODE</th>
				<th>ADDRESS</th>
				<th>REG_DATE</th>
				<th>CNF_YN</th>
				<th>LEAVE_YN</th>
			</tr>
		</thead>
		<tbody>
			<tr ng-repeat="userTestVo in users">
				<td><a href="/test/user/{{userTestVo.id}}">{{userTestVo.id}}</a></td>
				<td>{{userTestVo.type}}</td>
				<td>{{userTestVo.name}}</td>
				<td>{{userTestVo.sex}}</td>
				<td>{{userTestVo.birth}}</td>
				<td>{{userTestVo.phone}}</td>
				<td>{{userTestVo.zipcode}}</td>
				<td>{{userTestVo.address}}</td>
				<td>{{userTestVo.regDate}}</td>
				<td>{{userTestVo.cnfYn}}</td>
				<td>{{userTestVo.leaveYn}}</td> 
			</tr>
			<tr ng-show="!users.length">
				<td colspan="11" class="text-center">검색 결과가 없습니다.</td>
			</tr>
		</tbody>
	</table>
</div>

<script type="text/javascript">
$(function () {
    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
    $(document).ajaxSend(function(e, xhr, options) {
        xhr.setRequestHeader(header, token);
    });
});

//app 선언 app명 helloApp
var helloApp = angular.module("helloApp", []);

//controller 선언 controller명 CompanyCtrl
helloApp.controller('CompanyCtrl', ['$scope',  '$http', function ($scope, $http) {
	
	 // 사용자 객체를 생성
	$scope.users = {};
	
	// ''으로 초기화
	$scope.name = '';
	
	//seach function 선언 
	//input text와 intput button에 ng-change, ng-click 디렉티브를 설정하여 호출하도록 함  
	$scope.search = function(){		
		$http({
			method: 'POST',
			url: '/test/user/json',
			headers: {'${_csrf.headerName}': '${_csrf.token}'},
			data: {name: $scope.name}
		})
		.success(function (data, status, headers, config) {
			//sever로부터 넘어온 json data를 users 객체에 binding
			console.log(data);
			$scope.users = data;
		})
		.error(function (data, status, headers, config) {
			console.log(data);
			console.log(status);
		});
	};
	
	//페이지최초 로딩시 search 실행
	$scope.search();
	  
}]);

helloApp.directive('ngEnter', function () {
    return function (scope, element, attrs) {
        element.bind("keydown keypress", function (event) {
            if(event.which === 13) {
                scope.$apply(function (){
                    scope.$eval(attrs.ngEnter);
                });
 
                event.preventDefault();
            }
        });
    };
});
	
</script>
</html>
