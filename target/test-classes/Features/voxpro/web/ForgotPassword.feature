
Feature: Forget Password

  @VoxProWeb @SmokeTestcase @ForgetPassword @VX-01
  Scenario: User forgot password
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    Then  [Main Page] Password Forgot

  @VoxProWeb @SmokeTestcase @ForgetPassword @VX-02
  Scenario: To Check un register email
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    Then  [Main Page] Unregister email

  @VoxProWeb @SmokeTestcase @ForgetPassword @VX-03
  Scenario: User Return to home Page
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    Then  [Main Page] return to home page button is clickable