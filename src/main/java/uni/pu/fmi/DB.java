package uni.pu.fmi;

import uni.pu.fmi.models.*;

import java.util.ArrayList;
import java.util.List;

public class DB {
    public static List<Dentist> dentists;
    public static List<Patient> patients;
    public static List<Reservation> reservations;
    public static List<MakePayment> payments;
    public static List<CancelReservation> canceledReservations;

    static {
        dentists = new ArrayList<>();
        Dentist dentist = new Dentist();
        dentist.setId(1);
        dentist.setFullName("John Doe");
        dentist.setGsm("1234567890");
        dentist.setRoomNumber(1);
        dentists.add(dentist);

        patients = new ArrayList<>();
        Patient patient = new Patient();
        patient.setId(1);
        patient.setFullName("Jane Smith");
        patient.setGsm("9876543210");
        patient.setEmail("jane@example.com");
        patients.add(patient);

        reservations = new ArrayList<>();
        Reservation reservation = new Reservation();
        reservation.setTime("09:00");
        reservation.setDentistName("John Doe");
        reservation.setDate("2023-06-30");
        reservation.setAppointmentNumber(1);
        reservation.setProcedureType("Cleaning");
        reservations.add(reservation);

        payments = new ArrayList<>();
        MakePayment payment = new MakePayment();
        payment.setAmount(100.0f);
        payment.transactionId = 1;
        payment.patientId = 1;
        payments.add(payment);

        canceledReservations = new ArrayList<>();
        CancelReservation cancelReservation = new CancelReservation();
        cancelReservation.appointmentNumber = 1;
        canceledReservations.add(cancelReservation);
    }
}
