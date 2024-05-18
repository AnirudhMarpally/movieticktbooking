<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Select Seats</title>
</head>
<body>
    <h2>Select Seats</h2>
    <form action="/confirm" method="post">
        <input type="hidden" name="movie" value="${movie}">
        <input type="hidden" name="screen" value="${screen}">
        <label for="seats">Select Seats:</label><br>
        <select multiple name="seats" id="seats">
            <c:forEach var="seat" items="${seats}">
                <option value="${seat}">${seat}</option>
            </c:forEach>
        </select><br>
        <input type="submit" value="Confirm Booking">
    </form>
</body>
</html>
