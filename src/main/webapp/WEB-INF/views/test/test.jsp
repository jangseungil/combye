<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/views/common/common.jsp"/>
<html>
<head>
	<title>Test</title>
</head>
<body>

<c:forEach items="${testVoList}" var="testVo" varStatus="status">
	<P>${testVo.code}</P>
</c:forEach>

<script type="text/javascript">
</script>
</html>
