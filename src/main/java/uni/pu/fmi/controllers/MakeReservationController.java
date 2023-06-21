package uni.pu.fmi.controllers;


import uni.pu.fmi.DB;
import uni.pu.fmi.models.Reservation;

public class MakeReservationController {
    public boolean makeReservation(String date, String time, String dentistName) {
        // Check if the reservation already exists
        for (Reservation reservation : DB.reservations) {
            if (reservation.getDate().equals(date) && reservation.getTime().equals(time)
                    && reservation.getDentistName().equals(dentistName)) {
                return false; // Reservation already exists
            }
        }

        // If the reservation doesn't exist, create a new one
        Reservation newReservation = new Reservation();
        DB.reservations.add(newReservation);

        return true; // Reservation successfully made
    }
}
