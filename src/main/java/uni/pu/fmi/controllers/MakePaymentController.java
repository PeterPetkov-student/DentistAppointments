package uni.pu.fmi.controllers;

import uni.pu.fmi.models.MakePayment;

public class MakePaymentController {
    public MakePaymentController() {
    }

    public void processPayment(MakePayment paymentModel) {
        paymentModel.ConfirmTransaction();
    }

    public void cancelPayment(MakePayment paymentModel) {
        paymentModel.ReturnMoneyOnCancelation();
    }
}
