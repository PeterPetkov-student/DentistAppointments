package uni.pu.fmi.MakePayment;

public class MakePaymentModel {

    private Integer patientId;
    private float amount;
    private boolean transactionSuccessful;
    private boolean transactionCancelled;

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void confirmTransaction() {
        transactionSuccessful = true;
    }

    public void returnMoneyOnCancellation() {
        // TODO: Implement the logic of returning money on cancellation
        // For now, just set transactionCancelled to true
        transactionCancelled = true;
    }

    public boolean isTransactionSuccessful() {
        return transactionSuccessful;
    }

    public boolean isTransactionCancelled() {
        return transactionCancelled;
    }
}


