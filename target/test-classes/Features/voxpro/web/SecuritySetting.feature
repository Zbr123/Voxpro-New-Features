
Feature: Security Setting

  @VoxProWeb @SmokeTestcase @Security @VPS-1
  Scenario:To check security setting button is click-able
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Verify Security Setting is click-able

  @VoxProWeb @SmokeTestcase @Security @VPS-2
  Scenario:To check change email button is click-able
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Security Setting
    Then  [Main Page] Verify change email address is clickable

  @VoxProWeb @SmokeTestcase @Security @VPS-4
  Scenario:To check email field availability
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Security Setting
    When  [Main Page] Change Email
    Then  [Main Page] Verify new email address field availability

  @VoxProWeb @SmokeTestcase @Security @VPS-5
  Scenario:To verify invalid email pattern message
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Security Setting
    When  [Main Page] Change Email
    Then  [Main Page] Enter New Email "zubair@mailaniator"

  @VoxProWeb @SmokeTestcase @Security @VPS-6
  Scenario:To check submit new email address is clickable
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Security Setting
    When  [Main Page] Change Email
    And   [Main Page] Enter New Email "zubair@mailaniator"
    Then  [Main Page] Verify Submit new email address is click able

  @VoxProWeb @SmokeTestcase @Security @VPS-7
  Scenario:To verify that clicking on browser's "back" doesn't redirect to Security setting page
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Security Setting
    And   [Main Page] Change Email
    Then  [Main Page] Click on Back button

  @VoxProWeb @SmokeTestcase @Security @VPS-8
  Scenario:To check new email is functioning
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Security Setting
    And   [Main Page] Change Email
    Then  [Main Page] Enter New Email "zubair@mailaniator"

  @VoxProWeb @SmokeTestcase @Security @VPS-9
  Scenario:Verify change password button is clickable
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Security Setting
    When  [Main Page] To verify Change Password is clickable

  @VoxProWeb @SmokeTestcase @Security @VPS-10
  Scenario:To check new "Password field" and "Confirm new password field" is available
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Security Setting
    When  [Main Page] Change Password field
    Then  [Main Page] To verify new password field is available

  @VoxProWeb @SmokeTestcase @Security @VPS-11
  Scenario:To check set new password button is clickable
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Security Setting
    When  [Main Page] Change Password field
    Then  [Main Page] To verify set password button is click able

  @VoxProWeb @SmokeTestcase @Security @VPS-12
  Scenario:To verify new password is in encrypted form
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Security Setting
    When  [Main Page] Change Password field
    Then  [Main Page] To verify user is able to enter new password "Demo123"

  @VoxProWeb @SmokeTestcase @Security @VPS-13
  Scenario:To check invalid new password message
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Security Setting
    When  [Main Page] Change Password field
    Then  [Main Page] To verify user is able to enter new password "Demo123"

  @VoxProWeb @SmokeTestcase @Security @VPS-14
  Scenario:To verify that clicking on browser's "back" redirect to the Home screen
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Security Setting
    Then  [Main Page] Click on Back button

  @VoxProWeb @SmokeTestcase @Security @VPS-15
  Scenario:To verify that clicking on browser's "back" redirect to the account setting
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Security Setting
    And   [Main Page] Change Password field
    Then  [Main Page] Click on Back button

  @VoxProWeb @SmokeTestcase @Security @VPS-16
  Scenario:To verify user is able to view password
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Security Setting
    When  [Main Page] Change Password field
    And   [Main Page] To verify user is able to enter new password "Demo@1234"
    Then  [Main Page] To verify user is able to view password

  @VoxProWeb @SmokeTestcase @Security @VPS-17
  Scenario:To check invalid new password message
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Security Setting
    When  [Main Page] Change Password field
    And   [Main Page] To verify user is able to enter new password "Demo@1234"
    Then  [Main Page] To verify user is able to change password



