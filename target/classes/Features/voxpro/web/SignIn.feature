
Feature: SignIn

  @VoxProWeb @SmokeTestcase @SignIn @VPS-1 @voxpro
  Scenario: To check the availability of "Email" and "Password" Field on Login Screen
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    Then  [Main Page] Verify Email and Password Field availability

  @VoxProWeb @SmokeTestcase @SignIn @VPS-2 @voxpro
  Scenario: To Check the availability of "Login" button on Login Screen.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    Then  [Main Page] Verify the Login Button availability

   @VoxProWeb @SmokeTestcase @SignIn @VPS-3 @voxpro
  Scenario: To check the edit-ability of "Email" and "Password" Field on Login Screen.
   Given [Main Page] Navigate to VoxPro Web app
    When [Main Page] Go to the Login page
    And   [Main Page] Enter Email "zubair@mailinator.com"
    And   [Main Page] Enter Password "Demo@1234"
     And   [Main Page] Enter Email "zubair@mailinator.com"
     And   [Main Page] Enter Password "Demo@1234"
    Then  [Main Page] Verify the Email and Password edit-ability

  @VoxProWeb @SmokeTestcase @SignIn @VPS-4 @voxpro
  Scenario: To Check the click-ability of "Login" button on Login Screen.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    Then  [Main Page] Verify the Login Button is click-ability

  @VoxProWeb @SmokeTestcase @SignIn @VPS-5 @voxpro
  Scenario: To check the availability of 'View' icon on Password Field.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    Then  [Main Page] Verify the availability of view icon


  @VoxProWeb @SmokeTestcase @SignIn @VPS-06 @voxpro
  Scenario:To check the display of valid Placeholder message for Email field on Login Screen.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    Then  [Main Page] Check the place holder message for email on login screen

  @VoxProWeb @SmokeTestcase @SignIn @VPS-7 @voxpro
  Scenario: To check the functionality of 'View' icon on 'Password' Field.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    Then  [Main Page] Verify the view icon is click-ability

  @VoxProWeb @SmokeTestcase @SignIn @VPS-8 @voxpro
  Scenario:To verify the error message for Email field with invalid Email Address.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Email "zubai@mailinator.com"
    Then  [Main Page] Verify the Invalid Email Address error message

  @VoxProWeb @SmokeTestcase @SignIn @VPS-9 @voxpro
  Scenario:To verify the error message for Password field with invalid Password.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Email "zubair@mailinator.com"
    And   [Main Page] Enter Password "Demo@123"
    Then  [Main Page] Verify the Invalid Password error message

  @VoxProWeb @SmokeTestcase @SignIn @VPS-10 @voxpro
  Scenario:Verify the error message with null value on Email and Password field.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Email ""
    And   [Main Page] Enter Password ""
    Then  [Main Page] Null value on Email and Password Field

  @VoxProWeb @SmokeTestcase @SignIn @VPS-11 @voxpro
  Scenario:To verify the error message with whitespaces for Email field.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Email "zubair@mailinator.com     "
    And   [Main Page] Enter Password "Demo@1234   "
    Then  [Main Page] verify the error message with whitespaces for Email field

  @VoxProWeb @SmokeTestcase @SignIn @VPS-12 @voxpro
  Scenario:To verify the Password is in encrypted form on the "Password field".
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Password "Demo@123"
    Then  [Main Page] Verify the Password is in encrypted form

  @VoxProWeb @SmokeTestcase @SignIn @VPS-13 @voxpro
  Scenario:To verify the error message with invalid Email address and with valid Password.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Email "zubai@mailinator.com"
    And   [Main Page] Enter Password "Demo@1234"
    Then  [Main Page] Verify error message with invalid email address

  @VoxProWeb @SmokeTestcase @SignIn @VPS-14 @voxpro
  Scenario:To verify the error message with valid Email address and with invalid Password.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Email "zubair@mailinator.com"
    And   [Main Page] Enter Password "Demo@12345"
    Then  [Main Page] Verify error message with invalid password

#  @VoxProWeb @SmokeTestcase @SignIn @VPS-15
#  Scenario:To verify that the user is not able to login with inactive credentials.
#    Given [Main Page] Navigate to VoxPro Web app
#    When  [Main Page] Go to the Login page
#    And   [Main Page] Enter Email "zuabir@mailinator.com"
#    And   [Main Page] Enter Password "Demo@1234"
#   # Then  [Main Page] Verify user not login with inactive credentials

  @VoxProWeb @SmokeTestcase @SignIn @VPS-16 @voxpro
  Scenario:To verify the 'keep me signed in' is clickable
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Email "zubair@mailinator.com"
    And   [Main Page] Enter Password "Demo@1234"
    Then  [Main Page] Verify keep me sign is clickable

  @VoxProWeb @SmokeTestcase @SignIn @VPS-17 @voxpro
  Scenario:To verify the 'keep me signed in' is functioning
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Email "zubair@mailinator.com"
    And   [Main Page] Enter Password "Demo@1234"
    And   [Main Page] Verify keep me sign is clickable
    Then  [Main Page] The user should be kept signed in for X mins

  @VoxProWeb @SmokeTestcase @SignIn @VPS-18 @voxpro
  Scenario:To verify the 'keep me signed in' is functioning
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Email "zubair@mailinator.com"
    And   [Main Page] Enter Password "Demo@1234"
    Then  [Main Page] Verify that the user should be signed out after x minutes of inactivity

  @VoxProWeb @SmokeTestcase @SignIn @VPS-19 @voxpro
  Scenario:To Verify that the user is redirected to appropriate page after successful login by entering valid Email address and valid Password in Email address and Password field respectively.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Email "zubair@mailinator.com"
    And   [Main Page] Enter Password "Demo@1234"
    Then  [Main Page] Verify user is redirected to OTP page

  @VoxProWeb @SmokeTestcase @SignIn @VPS-20 @voxpro
  Scenario: To verify that clicking on browser's "back" button takes user to the login screen.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Email "zubair@mailinator.com"
    And   [Main Page] Enter Password "Demo@1234"
    And   [Main Page] Verify user is redirected to OTP page
    And   [Main Page] Click on Back button
    Then  [Main Page] User should be redirected to the login screen

  @VoxProWeb @SmokeTestcase @SignIn @VPS-21 @voxpro
  Scenario:To verify that clicking on browser's "back" doesn't redirect to the login screen once user Login successfully
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Email "zubair@mailinator.com"
    And   [Main Page] Enter Password "Demo@1234"
    And   [Main Page] Verify user is redirected to OTP page
    Then  [Main Page] Click on Back button

  @VoxProWeb @SmokeTestcase @SignIn @VPS-22 @voxpro
  Scenario: To verify that there is a limit on the total number of unsuccessful login attempts.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Email "zuabir_alam@mailinator.com"
    And   [Main Page] Enter Password "Demo@1234"
    And   [Main Page] User try with Invalid Login attempts "10"
    Then  [Main Page] verify user asked to enter captcha and try again or user should be blocked for a time period

  @VoxProWeb @SmokeTestcase @SignIn @VPS-24 @voxpro
  Scenario: To check the functionality of the "Forgot Password?" link.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Email "zuabir@mailinator.com"
    And   [Main Page] Enter Password "Demo@123"
    Then  [Main Page] verify user should redirected to forget Password

#@VoxProWeb @SmokeTestcase @SignIn @VPS-25 @voxpro
#  Scenario:To check the functionality of the "Register" link.
#    Given [Main Page] Navigate to VoxPro Web app
#    When  [Main Page] Go to the Login page
#    And   [Main Page] user clicks on Register Button
#    Then  [Main Page] Verify that the user should be redirected to the "Register" page

#  @VoxProWeb @SmokeTestcase @ChangePassword @VPS-26
#  Scenario: To Verify that User should be able to login with the new password after changing the password.
#    Given [Main Page] Navigate to VoxPro Web app
#    When  [Main Page] Go to the Login page
#    And   [Main Page] Password Forgot
#    Then  [Main Page] Incognito mode

    #// NEED TO AUTOMATE//
#  @VoxProWeb @SmokeTestcase @ChangePassword @VPS-27
#  Scenario: To Verify that User should not be able to login with the old password after changing the password
#    Given [Main Page] Navigate to VoxPro Web app
#    When  [Main Page] Go to the Login page
#    And   [Main Page] Enter Username and Password and Click SigIn Button
#    Then  [Main Page] Change Password
#     # // Updated It Accordingly//

#  @VoxProWeb @SmokeTestcase @SignIn @VPS-28
#  Scenario: To verify the security message when logged in with another device.
#    Given [Main Page] Navigate to VoxPro Web app
#    When  [Main Page] Go to the Login page
#    And   [Main Page] Enter Email "zuabir@mailinato.com"
#    Then  [Main Page] Enter Password "Demo@123"
#    And   [Main Page] Enter OTP and Click on Verify button
#    When  [Main Page] Open Google chrome browser on incognito mode
#    Given [Main Page] Navigate to VoxPro Web app
#    When  [Main Page] Go to the Login page
#    And   [Main Page] Enter Email "zuabir@mailinato.com"
#    And   [Main Page] Enter Password "Demo@123"
#    And   [Main Page] Enter OTP and Click on Verify button
#    Then  [Main Page] Appropriate security message should be displayed to the user

  @VoxProWeb @SmokeTestcase @SignIn @VPS-30 @voxpro
  Scenario: To verify that clicking on browser back arrow after successful logout and again clicking on forward arrow should not take User to log in mode.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Email "zubair@mailinator.com"
    And   [Main Page] Enter Password "Demo@1234"
    And   [Main Page] Dash Board Login
    When  [Main Page] User click on Logout Button
    And   [Main Page] Click on Back button
    And   [Main Page] User click on Forward button
    Then  [Main Page] Verify the Login Button availability


  @VoxProWeb @SmokeTestcase @SignIn @VPS-31 @voxpro
  Scenario: To verify after successful logout if user copy the URL of any page of the application like "home" page and open a in new browser should take the user to logout mode.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Dashboard Page
    Then  [Main Page] Verify Login page should display as user isn't signin the application

  @VoxProWeb @SmokeTestcase @SignIn @VPS-32 @voxpro
  Scenario: To verify the response against the multiple clicks on the "Login" button.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Email "zubair@mailinator.com"
    And   [Main Page] Enter Password "Demo@1234"
    And   [Main Page] click on signIn button multiple times
    Then  [Main Page] Verify user is redirected to OTP page

  @VoxProWeb @SmokeTestcase @SignIn @VPS-33 @voxpro
  Scenario: To verify the response against the multiple clicks on the "Login" button.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Email "zubair@mailinator.com"
    And   [Main Page] Enter Password "Demo@1234"
    Then  [Main Page] Press Enter Button from keyboard

# need to work on it
#  @VoxProWeb @SmokeTestcase @SignIn @VPS-34
#  Scenario: To verify the response against the multiple clicks on the "Login" button.
#    Given [Main Page] Navigate to VoxPro Web app
#    When  [Main Page] Go to the Login page
#    Then  [Main Page] Press the Tab button multiple times



  @VoxProWeb @SmokeTestcase @SignIn @VPS-34 @voxpro
  Scenario: User should be able to login
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    Then  [Main Page] Enter Username and Password and Click SigIn Button

  @VoxProWeb @SmokeTestcase @SignIn @VPS-35 @voxpro
  Scenario: To verify the 'keep me signed in' is clickable
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    Then  [Main Page] Keep me signIn Button is clickable

  @VoxProWeb @SmokeTestcase @SignIn @VPS-36 @voxpro
  Scenario: User enter Invalid OTP
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    Then  [Main Page] Invalid OTP
  @VoxProWeb @SmokeTestcase @SignIn @VPS-37 @voxpro
  Scenario: User entre invalid email
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    Then  [Main Page] Invalid Email
  @VoxProWeb @SmokeTestcase @SignIn @VPS-38 @voxpro
  Scenario: User enter invalid password
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    Then  [Main Page] Invalid Password

  @VoxProWeb @SmokeTestcase @SignIn @VPS-39 @voxpro
  Scenario:A "View" icon displayed to enable to the user to see the entered characters.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    Then  [Main Page] Enable view icon

  @VoxProWeb @SmokeTestcase @SignIn @VPS-40 @voxpro
  Scenario:Verify the error message with null value on Email and Password field.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    Then  [Main Page] Null value on Email and Password Field

  @VoxProWeb @SmokeTestcase @SignIn @VPS-41 @voxpro
  Scenario:Verify the error message with whitespaces for Email & Password field
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    Then  [Main Page] Whitespaces in email and password field

  @VoxProWeb @SmokeTestcase @SignIn @VPS-41
  Scenario:Error message for invalid email
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    Then  [Main Page] Validation invalid email address

  @VoxProWeb @SmokeTestcase @SignIn @VPS-42
  Scenario:To verify Left and right trimming for the "Email" field.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    Then  [Main Page] Valid email address with white space
