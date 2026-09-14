//package com.example.library_management.controller;
//
//import com.example.library_management.service.RazorpayService;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//
//import java.util.Map;
//
//@RestController
//
//@RequestMapping("/payment")
//
//@CrossOrigin(
//        origins = "http://localhost:4200"
//)
//
//public class PaymentController {
//
//    @Autowired
//    private RazorpayService razorpayService;
//
//    // CREATE PAYMENT LINK
//
//    @PostMapping("/create-link")
//
//    public Map<String, String>
//    createPaymentLink(
//
//            @RequestBody
//            Map<String, String> request
//
//    ) throws Exception {
//
//        String studentName =
//                request.get("name");
//
//        String mobile =
//                request.get("mobile");
//
//        int amount =
//                Integer.parseInt(
//                        request.get("amount")
//                );
//
//        String paymentLink =
//
//                razorpayService
//                        .createPaymentLink(
//
//                                amount,
//
//                                studentName,
//
//                                mobile
//                        );
//
//        Map<String, String> response =
//                new HashMap<>();
//
//        response.put(
//                "paymentLink",
//                paymentLink
//        );
//
//        return response;
//    }
//}