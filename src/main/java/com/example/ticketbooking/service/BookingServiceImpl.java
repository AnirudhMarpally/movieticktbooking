package com.example.ticketbooking.service;

import com.example.ticketbooking.model.Booking;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookingServiceImpl implements BookingService {
    private Map<String, Booking> bookings = new HashMap<>();

    @Override
    public Booking bookSeats(String username, String movie, String screen, List<String> seats) {
        Booking booking = new Booking(movie, screen, seats);
        bookings.put(username, booking);
        return booking;
    }

    @Override
    public Booking getBooking(String username) {
        return bookings.get(username);
    }

    @Override
    public List<String> getAvailableSeats(String movie, String screen) {
        // Hardcoded seats for demonstration
        return Arrays.asList("s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "s10");
    }
}
