<#include "../main_template.ftl"/>

<#macro content>
Home page

Работники компании:
    <#if !employees.empty>
        <#list employees as e>
        ${e.name}
        </#list>
    </#if>
</#macro>

<@main title="profile"/>