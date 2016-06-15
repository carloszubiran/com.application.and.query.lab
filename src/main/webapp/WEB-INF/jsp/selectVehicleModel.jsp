<%@include file="header.jsp"%>
<%@include file="navbar.jsp"%>


<div class="panel panel-default">

    <h2>Select Vehicle Model</h2>

    <table class="table">
        <tr>
            <th>Vehicle Make</th>
            <th>Vehicle Model</th>
            <th>Edit</th>
        </tr>
        <form:form modelAttribute="selectVehicleModel" method="get" action="updateVehicleModel">
        <c:forEach var="model" items="${modelList}">
            <tr>
                <td>
                    <c:out value="${makeList[model.vehicleMake.vehicleMakeId - 1].vehicleMakeName}" />
                </td>
                <td>
                    ${model.vehicleModelName}
                </td>
                <td>
                    <button type="submit" name="edit" value="${model.vehicleModelId}">
                        Edit
                    </button>

                </td>
            </tr>
        </c:forEach>
        </form:form>

    </table>


</div>







<%@include file="footer.jsp"%>