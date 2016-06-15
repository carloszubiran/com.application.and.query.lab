<%@include file="header.jsp"%>
<%@include file="navbar.jsp"%>

<div>

    <h2>Update Vehicle</h2>

    <table class="table">
        <tr>
            <th>Vehicle Id</th>
            <th>Vehicle Version</th>
            <th>Vehicle Make</th>
            <th>Vehicle Model</th>
            <th>Year</th>
            <th>License Plate</th>
            <th>VIN</th>
            <th>Color</th>
            <th>Purchased</th>
            <th>Purchase Price</th>
            <th>Purchase Date</th>
            <th>Edit</th>
        </tr>
        <form:form modelAttribute="updateVehicle" method="post" action="updateVehicle">
                <tr>
                    <td>
                        ${updateVehicle.vehicleId}
                        <form:hidden path="vehicleId" value="${updateVehicle.vehicleId}"/>
                    </td>
                    <td>
                        ${updateVehicle.version}
                        <form:hidden path="version" value="${updateVehicle.version}"/>
                    </td>
                    <td>
                        <form:select id="vehicleMakeId" path="vehicleModel.vehicleMake.vehicleMakeId" onchange="changeModelList()">
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
                    </td>
                    <td>
                        <form:select id="vehicleModelList" path="vehicleModel.vehicleModelId">
                            <c:forEach var="model" items="${vehicleModelList}">
                                <c:choose>
                                    <c:when test="${model.vehicleModelId == updateVehicle.vehicleModel.vehicleModelId}">
                                        <option id="selected" selected="selected" value="${updateVehicle.vehicleModel.vehicleModelId}">${updateVehicle.vehicleModel.vehicleModelName}</option>
                                    </c:when>
                                    <c:otherwise>
                                        <form:option value="${model.vehicleModelId}">${model.vehicleModelName}</form:option>
                                    </c:otherwise>
                                </c:choose>

                            </c:forEach>
                        </form:select>
                    </td>
                    <td>
                        <form:input path="year" value="${updateVehicle.year}"/>
                    </td>
                    <td>
                        <form:input path="licensePlate" value="${updateVehicle.licensePlate}"/>
                    </td>
                    <td>
                        <form:input path="vin" value="${updateVehicle.vin}"/>
                    </td>
                    <td>
                        <form:input path="color" value="${updateVehicle.color}"/>
                    </td>
                    <td>
                        <form:select path="purchase">
                        <c:choose>
                            <c:when test="${updateVehicle.purchase == true}">
                                <form:option value="true">
                                    Yes
                                </form:option>
                            </c:when>
                            <c:otherwise>
                                <form:option value="true">
                                    No
                                </form:option>
                            </c:otherwise>
                        </c:choose>
                        </form:select>
                    </td>
                    <td>
                        <form:input path="purchasePrice" value="${updateVehicle.purchasePrice}"/>
                    </td>
                    <td>
                        <fmt:formatDate var="parsedDate" type="date" pattern="yyyy-MM-dd" dateStyle="short" value="${updateVehicle.purchaseDate}"/>
                        <form:input path="purchaseDate" type="date" value="${parsedDate}"/>
                    </td>
                    <td>
                        <form:button name="edit" value="${vehicle.vehicleId}">Edit</form:button>
                    </td>
                </tr>
        </form:form>

    </table>


</div>





<%@include file="footer.jsp"%>