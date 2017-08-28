$(document).ready(function () {
        $(".show-record-info").on('click', function () {
            $("#modal-message-area").html("<h1>Loading...</h1>");
            $("#modal-message-area").html($(this).data("id"));
        });
    }
);