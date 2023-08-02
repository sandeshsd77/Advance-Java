<!DOCTYPE html>
<html>
<head>
    <title>User Registration Form</title>
</head>
<body>
<h2>User Registration</h2>
<form action="user" method="post">
    <table>
        <tr>
            <td>ID:</td>
            <td><input type="number" id="id" name="id"></td>
        </tr>
        <tr>
            <td>Name:</td>
            <td><input type="text" id="name" name="name"></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><input type="email" id="email" name="email"></td>
        </tr>
        <tr>
            <td>Phone:</td>
            <td><input type="tel" id="phone" name="phone"></td>
        </tr>
        <tr>
            <td>Username:</td>
            <td><input type="text" id="username" name="username"></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" id="password" name="password"></td>
        </tr>
    </table>
    <br>
    <input type="submit" value="Submit">
    <a href="update.jsp" >Update Details</a>
    <a href="delete.jsp">Delete User</a>
    <br>
    <a href="getAll">GetAll User </a>

</form>
</body>
</html>
