<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>

<body>
<h2>Student Information</h2>
<form method = "post" action = "/hello/save">
    <input type="text" name="name"/>name
    <br/>
    <input type="text" name="surname"/>surname
    <br/>
    <input type="text" name="age"/>age
    <br/>
    <button type="submit" value="save"/>
</form>
</body>

</html>