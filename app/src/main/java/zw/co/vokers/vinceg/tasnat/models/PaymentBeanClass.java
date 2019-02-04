package zw.co.vokers.vinceg.tasnat.models;

/**
 * Created by Vince G on 12/1/2019
 */

public class PaymentBeanClass {

    private String paymentText;


    public PaymentBeanClass(String paycounttext) {

        this.paymentText = paycounttext;

    }

    public String getPaymentText() {
        return paymentText;
    }

    public void setPaymentText(String paymentText) {
        this.paymentText = paymentText;
    }
}
