<%@page contentType = "text/html;charset = UTF-8" language = "java" %>

<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>

<html>
<head>
    <title>Spring MVC Form</title>
</head>
<body>
<h2> Submitted Student Information</h2>
<table>
    <tr>
        <td>name</td>
        <td>${student.name}</td>
    </tr>

    <tr>
        <td>surname</td>
        <td>${student.surname}</td>
    </tr>

    <tr>
        <td>age</td>
        <td>${student.age}</td>
    </tr>

</table>
</body>
</html>
<%@page isELIgnored = "false" %>