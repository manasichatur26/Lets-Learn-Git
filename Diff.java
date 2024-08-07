Feature: Gmail Login

  Scenario: Successful login with valid credentials
    Given the user is on the Gmail login page
    When the user enters a valid email
    And the user enters a valid password
    And the user clicks the "Next" button
    Then the user should see the inbox page 

  Feature: Sending an Email

  Scenario: Sending an email to a single recipient
    Given the user is logged into Gmail
    And the user clicks on the "Compose" button
    When the user enters a valid recipient email
    And the user enters a subject
    And the user enters the email body 
    And the user clicks the "Send" button
    Then the email should appear in the "Sent" folder

Feature: Receiving an Email

  Scenario: Receiving a new email
    Given the user is logged into Gmail
    When a new email is sent to the user's email address
    Then the user should see a notification for a new email
    And the new email should appear in the inbox

  Feature: Deleting an Email

  Scenario: Deleting an email from the inbox
    Given the user is logged into Gmail
    And the user selects an email in the inbox
    When the user clicks the "Delete" button
    Then the email should move to the "Trash" folder

   

  

