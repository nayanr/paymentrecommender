package org.example.paymentrecommmender.models;

public class DeviceContext {


    private boolean isUPIEnabled;

    public boolean isUPIEnabled() {
        return isUPIEnabled;
    }

    public void setUPIEnabled(boolean UPIEnabled) {
        isUPIEnabled = UPIEnabled;
    }

    public DeviceContext(boolean isUPIEnabled) {
        this.isUPIEnabled = isUPIEnabled;
    }
}
