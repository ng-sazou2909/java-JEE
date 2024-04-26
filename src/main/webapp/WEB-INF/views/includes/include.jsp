<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@	taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page session="true" %>
<%@ page trimDirectiveWhitespaces="true" %>
<fmt:setLocale value="${locale }"/>
<link href="<%=request.getContextPath() %>/resources/css/styless.css" rel="stylesheet">
<fmt:bundle basename="com.stock.mvc.i18n.applicationresources" />