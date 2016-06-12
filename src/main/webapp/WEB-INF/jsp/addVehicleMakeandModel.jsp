<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="header.jsp"%>
<%@ include file="navbar.jsp"%>



<div class="container col-lg-4">

    <h2>Add a Make</h2>
    <form:form modelAttribute="addVehicleMake" cssClass="" method="post"  action="addVehicleMakeAndModel">

        <fieldset class="">
            <div class="input-group">
                <span class="input-group-addon">Make:</span>
                <form:label path="VehicleMakeName" />
                <form:input path="VehicleMakeName" cssClass="form-control" placeholder="Make"  id="Make"/>
            </div>
        </fieldset>

    <form:button id="insertMake" name="submit" value="insertMake">Submit Make</form:button>

    </form:form>

    <h2>Add a Model</h2>
    <form:form modelAttribute="addVehicleModel" cssClass="" method="post"  action="addVehicleMakeAndModel">

        <fieldset class="">
            <div class="input-group">
                <span class="input-group-addon">Make:</span>
                <form:select path="VehicleMake" cssClass="form-control">
                    <c:forEach var="make" items="${listOfVehicleMakes}">
                        <form:option value="${make.vehicleMakeId}" cssClass="form-control">${make.vehicleMakeName}</form:option>
                    </c:forEach>
                </form:select>

            </div>
            <div class="input-group">
                <span class="input-group-addon">Model:</span>
                <form:label path="VehicleModelName" />
                <form:input path="VehicleModelName" cssClass="form-control" placeholder="Model" id="Model"/>
            </div>
        </fieldset>

        <form:button id="insertModel" name="submit" value="insertModel">Submit Model</form:button>


    </form:form>

</div>


<%@include file="footer.jsp"%>




