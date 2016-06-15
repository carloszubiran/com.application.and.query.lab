<%@ include file="header.jsp"%>
<%@ include file="navbar.jsp"%>

<h2>Add a vehicle</h2>

<form:form modelAttribute="vehicleForm" cssClass="container col-lg-4" method="post"  action="addVehicle">

    <fieldset class="">
        <div class="input-group">
            <span class="input-group-addon">Vehicle Make:</span>
                <form:select id="vehicleMakeId" path="vehicleModel.vehicleMake" onchange="changeModelList()">
                    <c:forEach var="make" items="${vehicleMakeList}">
                        <c:choose>
                            <c:when test="${make.vehicleMakeId == updateVehicleModelForm.vehicleMake.vehicleMakeId}">
                                <option id="selected" selected="selected" value="${make.vehicleMakeId}">${make.vehicleMakeName}</option>
                            </c:when>
                            <c:otherwise>
                                <form:option value="${make.vehicleMakeId}">${make.vehicleMakeName}</form:option>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                </form:select>
        </div>
        <div class="input-group">
            <span class="input-group-addon">Vehicle Model:</span>
                <form:select id="vehicleModelList" path="vehicleModel.vehicleModelId">
                    <c:forEach var="model" items="${vehicleModelList}">
                        <form:option value="${model.vehicleModelId}">${model.vehicleModelName}</form:option>
                    </c:forEach>
                </form:select>
        </div>
        <div class="input-group">
            <span class="input-group-addon">Year:</span>
            <form:label path="year" />
            <form:input path="year" cssClass="form-control" placeholder="year"  id="year"/>
        </div>
        <div class="input-group">
            <span class="input-group-addon">License Plate:</span>
            <form:label path="licensePlate" />
            <form:input path="licensePlate" cssClass="form-control" placeholder="licensePlate"  id="licensePlate"/>
        </div>
        <div class="input-group">
            <span class="input-group-addon">vin:</span>
            <form:label path="vin" />
            <form:input path="vin" cssClass="form-control" placeholder="vin"  id="vin"/>
        </div>
        <div class="input-group">
            <span class="input-group-addon">Color:</span>
            <form:label path="color" />
            <form:input path="color" cssClass="form-control" placeholder="color"  id="color"/>
        </div>
        <div class="input-group">
            <span class="input-group-addon">Is Purchased?:</span>
            <form:label path="purchase" />
            <form:select path="purchase">
                <form:option value="true">Yes</form:option>
                <form:option value="false">No</form:option>
            </form:select>
        </div>
        <div class="input-group">
            <span class="input-group-addon">Purchase Price:</span>
            <form:label path="purchasePrice" />
            <form:input path="purchasePrice" cssClass="form-control" placeholder="purchasePrice"  id="purchasePrice"/>
        </div>
        <div class="input-group">
            <span class="input-group-addon">Purchase Date:</span>
            <fmt:formatDate var="parsedDate" type="date" pattern="yyyy-MM-dd" dateStyle="short" value="${vehicleForm.purchaseDate}"/>
            <form:input path="purchaseDate" type="date" value="${parsedDate}"/>

        </div>

    </fieldset>

    <form:button id="addVehicle" name="submit" value="addVehicle">Add Vehicle</form:button>


</form:form>


<%@include file="footer.jsp"%>




