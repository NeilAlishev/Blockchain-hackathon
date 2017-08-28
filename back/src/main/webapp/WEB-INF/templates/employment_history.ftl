<#include "main_template.ftl"/>

<#macro content>
<div class="row">
  <div class="col-lg-12">
    <h1 class="page-header">Трудовая книжка</h1>
  </div>
</div>

<div class="row">
  <div class="col-lg-12">
    <div class="panel panel-info">
      <div class="panel-body">
        <div class="dataTable_wrapper">
          <table class="table table-striped table-bordered table-hover" id="dataTables-example">
            <thead>
            <tr>
              <th>Название</th>
              <th>Город</th>
              <th>Категория</th>
              <th>Позиция</th>
              <th>Период работы</th>
              <th>Статус</th>
            </tr>
            </thead>
            <tbody>
                <#list records as record>
                <tr>
                  <td>${record.user.name}</td>
                  <td>${record.user.city}</td>
                  <td>${record.user.category}</td>
                  <td>${record.user.position}</td>
                    <#if record.dateTo??>
                      <td>${record.dateFrom?date} - ${record.dateTo?date}</td>
                    <#else>
                      <td>${record.dateFrom?date} - настоящее время</td>
                    </#if>
                  <td>${record.status}</td>
                </tr>
                </#list>
            </tbody>
          </table>
        </div>
          <#if offer??>
            <a href="/employee/acceptOffer" style="border:4px solid red; padding: 5px;">
              Принять приглашение от ${offer.employer.name}
            </a>
          </#if>
      </div>
    </div>
  </div>
</div>
</#macro>

<@main title="Трудовая книжка"/>