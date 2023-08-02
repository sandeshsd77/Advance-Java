<!DOCTYPE html>
<html>
<head>
    <title>Delete User</title>
</head>
<body>
<h1>Delete User</h1>

<form action="delete_user" method="POST">
    <label for="user_id">User ID:</label>
    <input type="number" id="user_id" name="id" required>

    <input type="submit" value="Delete">
</form>
</body>
</html>