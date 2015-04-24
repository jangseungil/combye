<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Test</title>
<script src="/js/jquery-1.11.2.min.js"></script>
</head>
<body>

<c:forEach items="${testVoList}" var="testVo" varStatus="status">
	<P>${testVo.code}</P>
</c:forEach>
<script type="text/javascript">
</script>
</html>
