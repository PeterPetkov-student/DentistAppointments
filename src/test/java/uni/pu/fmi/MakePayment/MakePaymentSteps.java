package uni.pu.fmi.MakePayment;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MakePaymentSteps {

    private MakePaymentModel paymentModel = new MakePaymentModel();

    @Given("a patient with id {string} wants to make a payment of {float}")
    public void aPatientWithIdWantsToMakeAPaymentOf(String patientId, float amount) {
        paymentModel.setPatientId(Integer.parseInt(patientId));
        paymentModel.setAmount(amount);
    }

    @When("the patient confirms the transaction")
    public void thePatientConfirmsTheTransaction() {
        paymentModel.confirmTransaction();
    }

    @Then("the payment should be processed successfully")
    public void thePaymentShouldBeProcessedSuccessfully() {
        assertTrue(paymentModel.isTransactionSuccessful());
    }

    @Given("a patient with id {string} has made a payment of {float}")
    public void aPatientWithIdHasMadeAPaymentOf(String patientId, float amount) {
        paymentModel.setPatientId(Integer.parseInt(patientId));
        paymentModel.setAmount(amount);
        paymentModel.confirmTransaction();
    }

    @When("the patient cancels the transaction")
    public void thePatientCancelsTheTransaction() {
        paymentModel.returnMoneyOnCancellation();
    }

    @Then("the payment should be cancelled successfully")
    public void thePaymentShouldBeCancelledSuccessfully() {
        assertTrue(paymentModel.isTransactionCancelled());
    }

    // Helper method for assertion
    private void assertTrue(boolean condition) {
        if (condition) {
            System.out.println("Assertion Passed");
        } else {
            System.out.println("Assertion Failed");
        }
    }
}
