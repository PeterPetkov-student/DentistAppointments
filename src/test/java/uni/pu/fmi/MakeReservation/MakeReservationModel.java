package uni.pu.fmi.MakeReservation;

import uni.pu.fmi.controllers.MakeReservationController;

public class MakeReservationModel {

    private String date;
    private String time;
    private String dentistName;
    private boolean reservationResult;

    // Constructor
    public MakeReservationModel() {
        // Initialize reservationResult to false
        this.reservationResult = false;
    }

    // Setters
    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDentistName(String dentistName) {
        this.dentistName = dentistName;
    }

    // Getters
    public boolean isReservationResult() {
        return reservationResult;
    }

    // Method for making a reservation
    public void makeReservation() {
        MakeReservationController reservationController = new MakeReservationController();
        this.reservationResult = reservationController.makeReservation(date, time, dentistName);
    }

}

