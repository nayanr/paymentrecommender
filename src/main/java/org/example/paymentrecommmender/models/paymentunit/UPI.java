package org.example.paymentrecommmender.models.paymentunit;

import org.example.paymentrecommmender.handlers.PaymentHandler;
import org.example.paymentrecommmender.models.payment.Payment;
import org.example.paymentrecommmender.models.response.PaymentResponse;

public class UPI extends PaymentInstrument{
    public UPI(String paymentInstrumentId, PaymentHandler paymentHandler) {
        super(paymentInstrumentId, paymentHandler);
    }

    @Override
    public PaymentResponse handlePayment(Payment payment) {
        return null;
    }
}
