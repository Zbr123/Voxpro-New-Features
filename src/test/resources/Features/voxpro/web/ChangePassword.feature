
Feature: ChangePassword

  @VoxProWeb @SmokeTestcase @ChangePassword @VPS-1
  Scenario:To check the candidate profile button click-ability
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Verify candidate profile button is click-able

  @VoxProWeb @SmokeTestcase @ChangePassword @VPS-2
  Scenario:To check the reset password button click-ability
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Verify reset password button is clickable

  @VoxProWeb @SmokeTestcase @ChangePassword @VPS-3
  Scenario:To check the availability of "New Password" and "Confirm new password" is available
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Verify new password and confirm new password field availability

  @VoxProWeb @SmokeTestcase @ChangePassword @VPS-4
  Scenario:Check invalid new password message
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Change Password "Demo1234"

  @VoxProWeb @SmokeTestcase @ChangePassword @VPS-5
  Scenario:Check user able to change new password
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Change Password "Demo@1234"
    When  [Main Page] User click on Logout Button
    And   [Main Page] Enter Email "zubair@mailinator.com"
    And   [Main Page] Enter Password "Demo@1234"
    Then  [Main Page] Verify user is able to logIn successfully after Change password


  @VoxProWeb @SmokeTestcase @ChangePassword @VPS-6
  Scenario: User enter Password with out special Character
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Password must contain a Special Character

  @VoxProWeb @SmokeTestcase @ChangePassword @VPS-7
  Scenario:User enter different password in both field
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Miss match new password

  @VoxProWeb @SmokeTestcase @ChangePassword @VPS-8
  Scenario:User left new password filed empty
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] New password field is empty

  @VoxProWeb @SmokeTestcase @ChangePassword @VPS-9
  Scenario:User left confirm password field empty
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Confirm new password field is empty

  @VoxProWeb @SmokeTestcase @ChangePassword @VPS-10
  Scenario:user enter password without uppercase letter
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Password must contain a upper case letter