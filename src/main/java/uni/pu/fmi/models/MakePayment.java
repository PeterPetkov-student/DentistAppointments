package uni.pu.fmi.models;

import java.util.*;

/**
 * 
 */
public class MakePayment {

    public MakePayment() {
    }

    private Float amount;

    public Integer transactionId;

    public Integer patientId;

    public Set<CancelReservation> getCancelledReservations() {
        // TODO implement here
        return null;
    }

    public void setCancelledReservations(Set<CancelReservation> cancelledReservations) {
        // TODO implement here
    }

    public Set<Reservation> getMadeReservations() {
        // TODO implement here
        return null;
    }

    public void setMadeReservations(Set<Reservation> madeReservations) {
        // TODO implement here
    }

    public Float getAmount() {
        // TODO implement here
        return null;
    }

    public void setAmount(Float amount) {
        // TODO implement here
    }





    public void ConfirmTransaction() {
        System.out.println("Transaction " + transactionId + " confirmed.");
    }

    public void ReturnMoneyOnCancelation() {
        System.out.println("Money has been returned.");
    }
}