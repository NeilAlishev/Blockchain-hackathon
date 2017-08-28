/**
 * Created by aleksandrpliskin on 28.08.17.
 */
$(function () {
    var search_employee = $("js-search-employee");
    search_employee.change(function () {
        getPeople(search_employee.val());
    })
});

function getPeople(name) {
    console.log(name);
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