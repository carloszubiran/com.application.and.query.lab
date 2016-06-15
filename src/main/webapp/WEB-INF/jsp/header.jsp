<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>

    <c:url value="/webjars/jquery/2.1.4/jquery.min.js" var="JQuery"/>
    <script src="${JQuery}"></script>
    <c:url value="../../static/js/changeModelList.js" var="changeModelList"/>
    <script src="${changeModelList}"></script>


    <c:url value="/webjars/bootstrap/3.3.4/js/bootstrap.min.js" var="bootstrapJS"/>
    <script src="${bootstrapJS}"></script>
    <c:url value="/webjars/bootstrap/3.3.4/css/bootstrap.min.css" var="bootstrapCSS"/>
    <link href="${bootstrapCSS}" rel="stylesheet" media="screen">
    <title>Vehicles</title>

</head>
<body>