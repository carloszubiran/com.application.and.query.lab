<%@include file="header.jsp"%>
<%@include file="navbar.jsp"%>

<div class="panel panel-default">

    <h2>Select Vehicle</h2>

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
            <th>Delete</th>

        </tr>
        <form:form modelAttribute="selectVehicle" method="get" action="updateVehicle">
            <c:forEach var="vehicle" items="${vehicleList}">
                <tr>
                    <td>
                        ${vehicle.vehicleId}
                    </td>
                    <td>
                        ${vehicle.version}
                    </td>
                    <td>
                        <c:forEach var="make" items="${vehicleMakeList}">
                            <c:if test="${vehicle.vehicleModel.vehicleMake.vehicleMakeId == make.vehicleMakeId}">
                                ${vehicle.vehicleModel.vehicleMake.vehicleMakeName}
                            </c:if>
                        </c:forEach>
                    </td>
                    <td>
                        ${vehicle.vehicleModel.vehicleModelName}
                    </td>
                    <td>
                        ${vehicle.year}
                    </td>
                    <td>
                        ${vehicle.licensePlate}
                    </td>
                    <td>
                        ${vehicle.vin}
                    </td>
                    <td>
                        ${vehicle.color}
                    </td>
                    <td>
                        ${vehicle.purchase}
                    </td>
                    <td>
                        ${vehicle.purchasePrice}
                    </td>
                    <td>
                        <fmt:formatDate type="date" pattern="MM-dd-yyyy" dateStyle="short" value="${vehicle.purchaseDate}"/>
                    </td>
                    <td>
                        <form:button name="edit" value="${vehicle.vehicleId}">Edit</form:button>
                    </td>
                    <td>
                        <form:button formmethod="post" formaction="deleteVehicle" name="delete" value="${vehicle.vehicleId}">Delete</form:button>
                    </td>
                </tr>
            </c:forEach>
        </form:form>

    </table>


</div>







<%@include file="footer.jsp"%>