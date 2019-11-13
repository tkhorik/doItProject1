<#-- @ftlvariable name="users" type="com.doit.model.User[]"-->
<html>
<head>
    <title>Sign up</title>
</head>
<body>
<ul>
    <form action = "/users/new" method="post">
        <input name ="name" type = "text" placeholder="name">
        <input name ="surName" type = "text" placeholder="surname">
        <input name ="email" type = "email" placeholder="email">
        <input type = "submit">
    </form>
</ul>
</body>
</html>