package com.example.library_management.dto;

public class DashboardResponse {

    private Long totalStudents;

    private Long availableSeats;

    private Long bookedSeats;

    private Long expiredStudents;

    // GETTERS SETTERS

    public Long getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(Long totalStudents) {
        this.totalStudents = totalStudents;
    }

    public Long getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Long availableSeats) {
        this.availableSeats = availableSeats;
    }

    public Long getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(Long bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public Long getExpiredStudents() {
        return expiredStudents;
    }

    public void setExpiredStudents(Long expiredStudents) {
        this.expiredStudents = expiredStudents;
    }
}