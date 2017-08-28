<#include "main_template.ftl"/>

<#macro content>
<h1>Трудовая книжка</h1>

<div class="panel-body">
    <div class="table-responsive">
        <table class="table table-hover">
            <thead>
            <tr>
                <th>#</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Username</th>
            </tr>
            </thead>
            <tbody>
            <tr data-toggle="modal" data-target="#myModal" data-id="1" class="show-record-info">
                <td>1</td>
                <td>Mark</td>
                <td>Otto</td>
                <td>@mdo</td>
            </tr>
            <tr data-toggle="modal" data-target="#myModal" data-id="2" class="show-record-info">
                <td>2</td>
                <td>Jacob</td>
                <td>Thornton</td>
                <td>@fat</td>
            </tr>
            <tr>
                <td>3</td>
                <td>Larry</td>
                <td>the Bird</td>
                <td>@twitter</td>
            </tr>
            </tbody>
        </table>
    </div>
    <!-- /.table-responsive -->
</div>

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">Трудовая запись</h4>
            </div>
            <div class="modal-body" id="modal-message-area">
            </div>
        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal-dialog -->
</div>
<!-- /.modal -->

<#if offer??>
    <a href="/employee/acceptOffer">Принять приглашение от ${offer.employer.name}</a>
</#if>
</#macro>

<@main title="Трудовая книжкаа" scripts=["/resources/landing/js/custom/retrieve_record_data.js"]/>