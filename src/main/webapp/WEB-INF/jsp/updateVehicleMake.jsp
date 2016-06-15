<%@include file="header.jsp"%>
<%@include file="navbar.jsp"%>

<form:form modelAttribute="updateVehicleMakeForm" cssClass="container col-lg-4" method="post" action="updateVehicleMake">
    <h2>Update Vehicle Make</h2>
    <fieldset class="">
        <div class="input-group">
            <span class="input-group-addon">Make:</span>
            <form:input path="vehicleMakeName" value="${make.vehicleMakeName}"/>
            <form:hidden path="vehicleMakeId" value="${make.vehicleMakeId}"/>
            <form:hidden path="version" value="${make.version}"/>
        </div>

    </fieldset>

    <form:button id="updateVehicleModel" name="submit" value="updateVehicleModel">
        update
    </form:button>
</form:form>

<%@include file="footer.jsp"%>