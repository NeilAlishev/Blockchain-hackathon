<#include "../main_template.ftl"/>

<#macro content>
<div class="row">
  <div class="col-lg-12">
    <h1 class="page-header">Информация о компании</h1>
  </div>
</div>

<div class="row">
  <div class="col-lg-12">
    <#if employees?? && employees?has_content>
      <div class="panel panel-green">
        <div class="panel-heading">
          Сотрудники компании
        </div>
        <div class="panel-body">
          <#list employees as e>
            <#if e??>
              <p class="lead">${e.name}</p>
            </#if>
          </#list>
        </div>
      </div>
    </#if>
    <div class="panel panel-info">
      <div class="panel-heading">
        Найти специалиста:
      </div>
      <div class="panel-body">
        <input id="js-search-employee" onchange="getPeople(value)"/>
        <div id="js-found-employees"></div>
      </div>
    </div>
    <#if offers?? && offers?has_content>
      <div class="panel panel-info">
        <div class="panel-heading">
          Отправленные офферы:
        </div>
        <div class="panel-body">
          <#list offers as o>
            В ожидании ответа от ${o.employee.name}<br/>
          </#list>
        </div>
      </div>
    </#if>
  </div>
</div>
</#macro>

<@main title="profile" scripts=["resources/js/employer.js"]/>