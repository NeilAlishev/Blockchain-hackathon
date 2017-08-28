<#include "../main_template.ftl"/>

<#macro content>
Работники компании:
    <#if employees??>
        <#list employees as e>
        ${e.name}
        </#list>
    </#if>
</#macro>

<@main title="profile"/>