package org.example.paymentrecommmender.handlers;

import org.example.paymentrecommmender.models.payment.Payment;
import org.example.paymentrecommmender.models.response.PaymentResponse;

public interface PaymentHandler {

    PaymentResponse processPayment(Payment payment);

    boolean validForPayment(Payment payment);

}
