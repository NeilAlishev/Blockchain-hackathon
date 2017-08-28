<#include "../main_template.ftl"/>


<#macro content>
<div style="float: left">
    Работники компании:
    <#if employees??>
        <#list employees as e>
        ${e.name}
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
</#macro>

<@main title="profile" scripts=["resources/js/employer.js"]/>