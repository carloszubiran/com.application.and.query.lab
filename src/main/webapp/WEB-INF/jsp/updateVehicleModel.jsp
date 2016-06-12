<%@include file="header.jsp"%>
<%@include file="navbar.jsp"%>

<form:form modelAttribute="updateForm" cssClass="container col-lg-4" method="post"  action="index">

    <fieldset class="">
        ${model}
        <div class="input-group">
            <span class="input-group-addon">Make:</span>
            <%--<form:label path="make" />--%>
            <%--<form:input path="make" cssClass="form-control" placeholder="make"  id="make"/>--%>
        </div>
        <div class="input-group">
            <span class="input-group-addon">Model:</span>
            <%--<form:label path="model" />--%>
            <%--<form:input path="model" cssClass="form-control" placeholder="model"  id="model"/>--%>
        </div>

    </fieldset>

    <form:button id="insertVehicle" name="submit" value="insertVehicle" />


</form:form>







<%@include file="footer.jsp"%>