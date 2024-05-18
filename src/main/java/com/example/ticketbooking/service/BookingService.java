package com.example.ticketbooking.service;

import com.example.ticketbooking.model.Booking;
import java.util.List;

public interface BookingService {
    Booking bookSeats(String username, String movie, String screen, List<String> seats);
    Booking getBooking(String username);
    List<String> getAvailableSeats(String movie, String screen);
}
