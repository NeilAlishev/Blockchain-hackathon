<#include "../main_template.ftl"/>


<#macro content>
<div style="float: left">
    Работники компании:
    <#if employees??>
        <#list employees as e>
            <#if e??>
            ${e.name} <a href="employer/fire?id=${e.id}">уволить</a>
            </#if>
        </#list>
    </#if>
</div>

<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

<div style="float: none">
    Найти работника:
    <input id="js-search-employee" onchange="getPeople(value)"/>
    <div id="js-found-employees"></div>
</div>

<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

<div>
    <#if offers??>
        <#list offers as o>
            В ожидании ответа от ${o.employee.name}<br/>
        </#list>
    </#if>
</div>
</#macro>

<@main title="profile" scripts=["resources/js/employer.js"]/>