/**
 * Created by carlzubi1 on 6/14/2016.
 */


function changeModelList () {

    $.getJSON("http://localhost:8080/vehicleModelListJSONController" + "?vehicleMakeId=" + $("#vehicleMakeId option:selected").val(), function( data ) {
        console.log(data)
        // console.log($("#vehicleMakeId option:selected").val())
        var items = [];
        $.each( data, function( key, val ) {
            items.push( "<option value='" + val.vehicleModelId + "' id='" + val.vehicleModelId + "'>" + val.vehicleModelName + "</option>" );
        });

        $("#vehicleModelList").empty();

        $("#vehicleModelList").append(items.join());

    });


    // console.log(jsonVehicleModels);

}

