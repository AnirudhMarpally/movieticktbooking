<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Thanks</title>
</head>
<body>
    <h2>Thank You</h2>
    <p>Your booking has been confirmed:</p>
    <p>
        Movie: ${booking.movie}<br>
        Screen: ${booking.screen}<br>
        Seats:
        <c:forEach var="seat" items="${booking.seats}">
            ${seat} 
        </c:forEach>
    </p>
</body>
</html>
