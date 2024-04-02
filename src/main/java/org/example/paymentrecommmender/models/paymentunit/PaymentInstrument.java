package org.example.paymentrecommmender.models.paymentunit;

import org.example.paymentrecommmender.handlers.PaymentHandler;
import org.example.paymentrecommmender.models.payment.Payment;
import org.example.paymentrecommmender.models.response.PaymentResponse;

public abstract class PaymentInstrument {

    private String paymentInstrumentId;

    public String getPaymentInstrumentId() {
        return paymentInstrumentId;
    }

    public void setPaymentInstrumentId(String paymentInstrumentId) {
        this.paymentInstrumentId = paymentInstrumentId;
    }

    public PaymentHandler getPaymentHandler() {
        return paymentHandler;
    }

    public void setPaymentHandler(PaymentHandler paymentHandler) {
        this.paymentHandler = paymentHandler;
    }

    private PaymentHandler paymentHandler;

    public PaymentInstrument(String paymentInstrumentId, PaymentHandler paymentHandler) {
        this.paymentInstrumentId = paymentInstrumentId;
        this.paymentHandler = paymentHandler;
    }

    public abstract PaymentResponse handlePayment(Payment payment);


}
