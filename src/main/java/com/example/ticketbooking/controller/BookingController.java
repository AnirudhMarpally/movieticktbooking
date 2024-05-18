package com.example.ticketbooking.controller;

import com.example.ticketbooking.model.Booking;
import com.example.ticketbooking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;

import java.util.Arrays;
import java.util.List;

@Controller
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/movies")
    public String selectMovie(Model model) {
        List<String> movies = Arrays.asList("movie1", "movie2", "movie3", "movie4", "movie5");
        model.addAttribute("movies", movies);
        return "movie";
    }

    @PostMapping("/screens")
    public String selectScreen(@RequestParam String movie, Model model) {
        List<String> screens = Arrays.asList("screen1", "screen2", "screen3");
        model.addAttribute("movie", movie);
        model.addAttribute("screens", screens);
        return "screen";
    }

    @PostMapping("/seats")
    public String selectSeats(@RequestParam String movie, @RequestParam String screen, Model model) {
        List<String> seats = bookingService.getAvailableSeats(movie, screen);
        model.addAttribute("movie", movie);
        model.addAttribute("screen", screen);
        model.addAttribute("seats", seats);
        return "booking";
    }

    @PostMapping("/confirm")
    public String confirmBooking(@RequestParam String movie, @RequestParam String screen, @RequestParam List<String> seats,
                                 HttpSession session, Model model) {
        String username = (String) session.getAttribute("username");
        Booking booking = bookingService.bookSeats(username, movie, screen, seats);
        model.addAttribute("booking", booking);
        return "thanks";
    }

    @GetMapping("/mybooking")
    public String showBooking(HttpSession session, Model model) {
        String username = (String) session.getAttribute("username");
        Booking booking = bookingService.getBooking(username);
        model.addAttribute("booking", booking);
        return "thanks";
    }
}

