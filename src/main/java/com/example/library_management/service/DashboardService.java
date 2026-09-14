package com.example.library_management.service;

import com.example.library_management.dto.DashboardResponse;
import com.example.library_management.repository.SeatRepository;
import com.example.library_management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DashboardService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SeatRepository seatRepository;

    public DashboardResponse getDashboardData() {

        DashboardResponse response = new DashboardResponse();

        response.setTotalStudents(
                studentRepository.count()
        );

        response.setAvailableSeats(
                seatRepository.countByAvailable(true)
        );

        response.setBookedSeats(
                seatRepository.countByAvailable(false)
        );

        response.setExpiredStudents(
                (long) studentRepository
                        .findByExpiryDateBefore(LocalDate.now())
                        .size()
        );

        return response;
    }
}