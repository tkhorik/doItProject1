<#-- @ftlvariable name="users" type="com.doit.model.User[]" -->
<html>
<head>
    <title>Users</title>
</head>
<body>
    <#if users?has_content></#if>
    <ul>
        <#list users as user>
            <li>${user.name} ${user.surName}${user.email}</li>
        </#list>
    </ul>
    <#else>
    <p> No users yet</p>
    </#if>
</body>
</html>