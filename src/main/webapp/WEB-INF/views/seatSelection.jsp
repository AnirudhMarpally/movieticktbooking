<!DOCTYPE html>
<html>
<head>
    <title>Select Seats</title>
</head>
<body>
    <h2>Select Seats for ${movie} - ${screen}</h2>
    <form action="/book" method="post">
        <input type="hidden" name="movie" value="${movie}" />
        <input type="hidden" name="screen" value="${screen}" />
        <div>
            <label>Seats:</label>
            <div>
                <c:forEach var="seat" items="${seats}">
                    <input type="checkbox" name="seats" value="${seat.key}" ${seat.booked ? 'disabled' : ''} /> ${seat.key}
                </c:forEach>
            </div>
        </div>
        <div>
            <input type="submit" value="Book" />
        </div>
    </form>
</body>
</html>
