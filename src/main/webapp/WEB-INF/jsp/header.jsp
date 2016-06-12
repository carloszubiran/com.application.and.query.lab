<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <c:url value="/webjars/bootstrap/3.3.4/js/bootstrap.min.js" var="bootstrapJS"/>
    <script src="${bootstrapJS}"></script>
    <c:url value="/webjars/bootstrap/3.3.4/css/bootstrap.min.css" var="bootstrapCSS"/>
    <link href="${bootstrapCSS}" rel="stylesheet" media="screen">
    <title>Vehicles</title>

</head>
<body>