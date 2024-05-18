<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Select Movie</title>
</head>
<body>
    <h2>Select Movie</h2>
    <form action="/screens" method="post">
        <label for="movie">Choose a movie:</label><br>
        <select name="movie" id="movie">
            <option value="movie1">Movie 1</option>
            <option value="movie2">Movie 2</option>
            <option value="movie3">Movie 3</option>
            <option value="movie4">Movie 4</option>
            <option value="movie5">Movie 5</option>
        </select><br>
        <input type="submit" value="Next">
    </form>
</body>
</html>
