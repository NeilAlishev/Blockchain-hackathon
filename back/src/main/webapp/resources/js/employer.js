/**
 * Created by aleksandrpliskin on 28.08.17.
 */
function getPeople(name) {
    $.ajax({
        url: "employer/getEmployees",
        type: "GET",
        data: {
            name: name
        },
        dataType: "html",
        success: function (data) {
            $("#js-found-employees").html(data);
        }
    })
}