//package com.example.library_management.service;
//
//import com.razorpay.*;
//
//import org.json.JSONObject;
//
//import org.springframework.beans.factory.annotation.Value;
//
//import org.springframework.stereotype.Service;
//
//@Service
//public class RazorpayService {
//
//    @Value("${razorpay.key}")
//    private String key;
//
//    @Value("${razorpay.secret}")
//    private String secret;
//
//
//
//    public String createPaymentLink(
//
//            int amount,
//
//            String studentName,
//
//            String mobile
//
//    ) throws Exception {
//
//        RazorpayClient razorpay =
//
//                new RazorpayClient(
//                        key,
//                        secret
//                );
//
//        JSONObject paymentLinkRequest =
//                new JSONObject();
//
//        // AMOUNT
//
//        paymentLinkRequest.put(
//                "amount",
//                amount * 100
//        );
//
//        paymentLinkRequest.put(
//                "currency",
//                "INR"
//        );
//
//        paymentLinkRequest.put(
//                "accept_partial",
//                false
//        );
//
//        // MINIMUM 15 MIN REQUIRED
//
//        long expireBy =
//
//                System.currentTimeMillis()
//                        / 1000
//
//                        + (30 * 60);
//
//        paymentLinkRequest.put(
//                "expire_by",
//                expireBy
//        );
//
//        // DESCRIPTION
//
//        paymentLinkRequest.put(
//                "description",
//                "Library Seat Booking"
//        );
//
//        // CUSTOMER
//
//        JSONObject customer =
//                new JSONObject();
//
//        customer.put(
//                "name",
//                studentName
//        );
//
//        customer.put(
//                "contact",
//                mobile
//        );
//
//        paymentLinkRequest.put(
//                "customer",
//                customer
//        );
//
//        // NOTIFICATION
//
//        JSONObject notify =
//                new JSONObject();
//
//        notify.put(
//                "sms",
//                true
//        );
//
//        notify.put(
//                "email",
//                false
//        );
//
//        paymentLinkRequest.put(
//                "notify",
//                notify
//        );
//
//        // CALLBACK URL
//
//        paymentLinkRequest.put(
//                "callback_url",
//                "http://localhost:4200/payment-success"
//        );
//
//        paymentLinkRequest.put(
//                "callback_method",
//                "get"
//        );
//
//        // CREATE LINK
//
//        PaymentLink payment =
//                razorpay.paymentLink
//                        .create(
//                                paymentLinkRequest
//                        );
//
//        return payment.get(
//                "short_url"
//        ).toString();
//    }
//}