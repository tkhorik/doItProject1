<html>
<head>
    <title>Users List</title>
</head>
<#list users>
<#items as user>

<ul>
    <li>${user.name} ${user.surName}${user.email}</li>
</ul>
    </#items>
<body>
<#else>
    <p> No users yet</p>
</#list>

</body>

</html>