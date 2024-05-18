<!DOCTYPE html>
<html>
<head>
    <title>Select Movie</title>
</head>
<body>
    <h2>Select Movie</h2>
    <form action="/screens" method="post">
        <div>
            <label>Movie:</label>
            <select name="movie">
                <option value="movie1">Movie 1</option>
                <option value="movie2">Movie 2</option>
                <option value="movie3">Movie 3</option>
                <option value="movie4">Movie 4</option>
                <option value="movie5">Movie 5</option>
            </select>
        </div>
        <div>
            <input type="submit" value="Next" />
        </div>
    </form>
</body>
</html>
