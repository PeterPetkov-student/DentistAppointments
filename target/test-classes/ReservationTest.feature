Feature: Make Reservation

  Scenario Outline: Making a reservation
    Given a patient with ID "<patientId>" wants to make a reservation for "<procedureType>" with "<dentistName>" on "<date>" date at "<time>" time
    When the patient tries to make the reservation
    Then the reservation should be "<expected>"

    Examples:
      | patientId | procedureType  | dentistName | date       | time  | expected |
      | 123       | Procedure 1    | Dentist 1   | 2023-06-01 | 10:00 | true     |
      | 456       | Procedure 2    | Dentist 2   | 2023-06-02 | 11:00 | true     |
      | 789       |                | Dentist 3   | 2023-06-03 | 12:00 | false    |
      | 321       | Procedure 1    | Dentist 2   |            | 10:00 | false    |
      | 654       | Procedure 2    | Dentist 3   | 2023-06-02 | 11:00 | true     |
      | 987       | Procedure 3    |             | 2023-06-03 | 12:00 | false    |
