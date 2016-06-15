<%@include file="header.jsp"%>
<%@include file="navbar.jsp"%>

<div class="panel panel-default">

    <h2>Select Vehicle Make</h2>

    <table class="table">
        <tr>
            <th>Vehicle Make</th>
            <th>Edit</th>
        </tr>
        <form:form modelAttribute="selectVehicleMake" method="get" action="updateVehicleMake">
            <c:forEach var="make" items="${makeList}">
                <tr>
                    <td>
                        <c:out value="${makeList[make.vehicleMakeId - 1].vehicleMakeName}" />
                    </td>
                    <td>
                        <form:button name="edit" value="${make.vehicleMakeId}">Edit</form:button>
                    </td>
                </tr>
            </c:forEach>
        </form:form>
    </table>

</div>

<%@include file="footer.jsp"%>