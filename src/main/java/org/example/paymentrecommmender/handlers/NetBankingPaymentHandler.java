package org.example.paymentrecommmender.handlers;

import org.example.paymentrecommmender.models.payment.Payment;
import org.example.paymentrecommmender.models.response.PaymentResponse;

public class NetBankingPaymentHandler implements PaymentHandler{
    @Override
    public PaymentResponse processPayment(Payment payment) {
        return null;
    }

    @Override
    public boolean validForPayment(Payment payment) {
        return false;
    }
}
