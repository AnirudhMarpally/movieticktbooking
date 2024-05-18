<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Select Screen</title>
</head>
<body>
    <h2>Select Screen</h2>
    <form action="/seats" method="post">
        <input type="hidden" name="movie" value="${movie}">
        <label for="screen">Choose a screen:</label><br>
        <select name="screen" id="screen">
            <option value="screen1">Screen 1</option>
            <option value="screen2">Screen 2</option>
            <option value="screen3">Screen 3</option>
        </select><br>
        <input type="submit" value="Next">
    </form>
</body>
</html>
