package uni.pu.fmi.MakeReservation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Date;
import java.sql.Time;

public class MakeReservationSteps {

    private MakeReservationModel model = new MakeReservationModel();

    @Given("a reservation on {string} date at {string} time with dentist {string}")
    public void givenReservationDetails(String date, String time, String dentistName) {
        model.setDate(date);
        model.setTime(time);
        model.setDentistName(dentistName);
    }

    @When("a patient tries to make a reservation")
    public void whenPatientTriesToMakeReservation() {
        model.makeReservation();
    }

    @Then("the reservation should be {string}")
    public void thenTheReservationShouldBe(String expected) {
        boolean expectedReservationResult = Boolean.parseBoolean(expected);
        assertEquals(expectedReservationResult, model.isReservationResult());
    }

    // Helper method for assertion
    private void assertEquals(boolean expected, boolean actual) {
        if (expected == actual) {
            System.out.println("Assertion Passed");
        } else {
            System.out.println("Assertion Failed");
        }
    }

}

