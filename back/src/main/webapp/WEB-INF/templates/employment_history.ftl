<#include "main_template.ftl"/>

<#macro content>
<h1>Трудовая книжка</h1>

<div class="panel-body">
    <div class="table-responsive">
        <table class="table table-hover">
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
    <!-- /.table-responsive -->
</div>

<#if offer??>
    <a href="/employee/acceptOffer">Принять приглашение от ${offer.employer.name}</a>
</#if>
</#macro>

<@main title="Трудовая книжка"/>