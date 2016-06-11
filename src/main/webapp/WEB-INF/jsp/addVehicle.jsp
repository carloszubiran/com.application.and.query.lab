<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="header.jsp"%>
<%@ include file="navbar.jsp"%>

<h2>Add a vehicle</h2>

<form:form modelAttribute="vehicleForm" cssClass="container col-lg-4" method="post"  action="index">

    <fieldset class="">

        <div class="input-group">
            <span class="input-group-addon">Year:</span>
            <form:label path="Year" />
            <form:input path="Year" cssClass="form-control" placeholder="Year"  id="Year"/>
        </div>
        <div class="input-group">
            <span class="input-group-addon">License Plate:</span>
            <form:label path="LicensePlate" />
            <form:input path="LicensePlate" cssClass="form-control" placeholder="LicensePlate"  id="LicensePlate"/>
        </div>
        <div class="input-group">
            <span class="input-group-addon">VIN:</span>
            <form:label path="VIN" />
            <form:input path="VIN" cssClass="form-control" placeholder="VIN"  id="VIN"/>
        </div>
        <div class="input-group">
            <span class="input-group-addon">Color:</span>
            <form:label path="Color" />
            <form:input path="Color" cssClass="form-control" placeholder="Color"  id="Color"/>
        </div>
        <div class="input-group">
            <span class="input-group-addon">Is Purchased?:</span>
            <form:label path="Purchase" />
            <form:input path="Purchase" cssClass="form-control" placeholder="Purchase"  id="Purchase"/>
        </div>
        <div class="input-group">
            <span class="input-group-addon">Purchase Price:</span>
            <form:label path="PurchasePrice" />
            <form:input path="PurchasePrice" cssClass="form-control" placeholder="PurchasePrice"  id="PurchasePrice"/>
        </div>
        <div class="input-group">
            <span class="input-group-addon">Purchase Date:</span>
            <form:label path="PurchaseDate" cssClass="" />
            <form:input path="PurchaseDate" cssClass="form-control" placeholder="PurchaseDate"  id="PurchaseDate"/>
        </div>

    </fieldset>

    <form:button id="insertVehicle" name="submit" value="insertVehicle" />


</form:form>


<%@include file="footer.jsp"%>




