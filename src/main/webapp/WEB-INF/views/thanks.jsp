<!DOCTYPE html>
<html>
<head>
    <title>Booking Confirmed</title>
</head>
<body>
    <h2>Thank You, ${user}!</h2>
    <p>Your seats for ${movie} - ${screen} have been booked.</p>
    <p>Seats: 
        <c:forEach var="seat" items="${seats}">
            ${seat}
        </c:forEach>
    </p>
    <a href="/movies">Book Another</a>
</body>
</html>
