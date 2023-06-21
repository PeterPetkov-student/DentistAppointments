Feature: Make Payment

  Scenario Outline: Successful payment processing
    Given a patient with id "<patientId>" wants to make a payment of <amount>
    When the patient confirms the transaction
    Then the payment should be processed successfully
    And the payment message should be "<paymentMessage>"

    Examples:
      | patientId | amount | paymentMessage |
      |           | 100.00 | false          |
      | 002       | 200.00 | true           |
      | 003       |        | false          |
      | 004       | 400.00 | true           |
      | 005       | 500.00 | true           |

  Scenario Outline: Successful payment cancellation
    Given a patient with id "<patientId>" has made a payment of <amount>
    When the patient cancels the transaction
    Then the payment should be cancelled successfully
    And the cancellation message should be "<cancelMessage>"

    Examples:
      | patientId | amount | cancelMessage |
      |           | 100.00 | false         |
      | 002       | 200.00 | true          |
      | 003       |        | false         |
      | 004       | 400.00 | true          |
      | 005       | 500.00 | true          |
