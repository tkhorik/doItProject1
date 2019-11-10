<#-- @ftlvariable name="users" type="com.doit.model.User[]"-->
<html>
<head>
    <title>Sign up</title>
</head>
<body>
<ul>
    <form action = "/users/new">
        <input name ="name" type = "text" placeholder="name">
        <input name ="surname" type = "text" placeholder="surname">
        <input name ="email" type = "email" placeholder="email">
        <input type = "submit">
    </form>
</ul>
</body>
</html>