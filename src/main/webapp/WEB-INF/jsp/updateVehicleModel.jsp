<%@include file="header.jsp"%>
<%@include file="navbar.jsp"%>

<form:form modelAttribute="updateVehicleModelForm" cssClass="container col-lg-4" method="post" action="updateVehicleModel">
<h2>Update Vehicle Make and Model</h2>
    <fieldset class="">
        <div class="input-group">
            <span class="input-group-addon">Make:</span>
            <form:select path="vehicleMake" cssClass="form-control">
                <c:forEach var="make" items="${makeList}">
                    <c:choose>
                        <c:when test="${make.vehicleMakeId == updateVehicleModelForm.vehicleMake.vehicleMakeId}">
                            <option selected="selected" value="${make.vehicleMakeId}">${make.vehicleMakeName}</option>
                        </c:when>
                        <c:otherwise>
                            <form:option value="${make.vehicleMakeId}">${make.vehicleMakeName}</form:option>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
            </form:select>
        </div>
        <div class="input-group">
            <span class="input-group-addon">Model:</span>
            <form:input path="vehicleModelId" value="${vehicleModel.vehicleModelId}" hidden="hidden"/>
            <form:input path="version" value="${vehicleModel.version}" hidden="hidden"/>
            <form:label path="vehicleModelName"/>
            <form:input path="vehicleModelName" cssClass="form-control" placeholder="vehicleModel" id="vehicleModel"
                        value="${vehicleModel.vehicleModelName}"/>
        </div>

    </fieldset>

    <form:button id="updateVehicleModel" name="submit" value="updateVehicleModel">
        update
    </form:button>
</form:form>

<%@include file="footer.jsp"%>