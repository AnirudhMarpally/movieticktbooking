<!DOCTYPE html>
<html>
<head>
    <title>Select Screen</title>
</head>
<body>
    <h2>Select Screen for ${movie}</h2>
    <form action="/seats" method="post">
        <input type="hidden" name="movie" value="${movie}" />
        <div>
            <label>Screen:</label>
            <select name="screen">
                <option value="screen1">Screen 1</option>
                <option value="screen2">Screen 2</option>
                <option value="screen3">Screen 3</option>
            </select>
        </div>
        <div>
            <input type="submit" value="Next" />
        </div>
    </form>
</body>
</html>
