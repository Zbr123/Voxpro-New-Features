
Feature:Job Application

  @VoxProWeb @SmokeTestcase @JobApplication @VPS-1
  Scenario:Job application
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Jobs Application
    When  [Main Page] Job title"Automation Engineer"
    And   [Main Page] Job location"London"
    Then  [Main page] search button

  @VoxProWeb @SmokeTestcase @JobApplication @VPS-1
  Scenario:To check job appear on the list of only the job title search by user
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Jobs Application
    When  [Main Page] Job title"accountant"
    And   [Main page] search button
    Then  [Main Page] Verify the list of jobs appear only contain selected job title

  @VoxProWeb @SmokeTestcase @JobApplication @VPS-1
  Scenario:To check job appear on the list of only the job location search by user
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Jobs Application
    And   [Main Page] Job location"London"
    And   [Main page] search button
    Then  [Main Page] Verify the list of jobs appear only contain selected job location

  @VoxProWeb @SmokeTestcase @JobApplication @VPS-2
  Scenario:To check jobs is clickable
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Verify jobs field button is clickable

  @VoxProWeb @SmokeTestcase @JobApplication @VPS-3
  Scenario:To check job applications field is clickable
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Verify job application button is clickable

  @VoxProWeb @SmokeTestcase @JobApplication @VPS-3
  Scenario: To check the edit-ability of "Job Title" and "Location" Field on Job Application screen
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Jobs Application
    And   [Main Page] Job title"Automation Engineer"
    And   [Main Page] Job location"London"
    And   [Main Page] Job title"Software Engineer"
    And   [Main Page] Job location"London"
    Then  [Main Page] Verify job title and location field is editable

  @VoxProWeb @SmokeTestcase @JobApplication @VPS-4
  Scenario:To Check the click-ability of "Applied" button on job application.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Jobs Application
    Then  [Main Page] Applied button is clickable

  @VoxProWeb @SmokeTestcase @JobApplication @VPS-5
  Scenario:To check functionality of jobs applied field
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Jobs Application
    Then  [Main Page] Verify job applied button is functioning

  @VoxProWeb @SmokeTestcase @JobApplication @VPS-5
  Scenario:To check "follow up" action in applied job
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Jobs Application
    Then  [Main Page] Verify the Follow up action in applied job

  @VoxProWeb @SmokeTestcase @JobApplication @VPS-6
  Scenario:To Check the click-ability of "Unsuccessful" button on job application.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Jobs Application
    Then  [Main Page] To verify unsuccessful button is clickable

  @VoxProWeb @SmokeTestcase @JobApplication @VPS-7
  Scenario:To check functionality of jobs unsuccessful field
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Jobs Application
    Then  [Main Page] Verify job Unsuccessful button is functioning

  @VoxProWeb @SmokeTestcase @JobApplication @VPS-8
  Scenario:To Check the click-ability of "Shortlisted" button on job application.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Jobs Application
    Then  [Main Page] To verify Shortlisted button is clickable

  @VoxProWeb @SmokeTestcase @JobApplication @VPS-9
  Scenario:To check functionality of jobs shortlisted field
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Jobs Application
    Then  [Main Page] Verify job shortlisted button is functioning

  @VoxProWeb @SmokeTestcase @JobApplication @VPS-10
  Scenario:To Check the click-ability of "Interview" button on job application.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Jobs Application
    Then  [Main Page] To verify Interview button is clickable

  @VoxProWeb @SmokeTestcase @JobApplication @VPS-11
  Scenario:To check functionality of jobs interview field
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Jobs Application
    Then  [Main Page] Verify job interview button is functioning

  @VoxProWeb @SmokeTestcase @JobApplication @VPS-12
  Scenario:To Check the click-ability of "Offer" button on job application.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Jobs Application
    Then  [Main Page] To verify Offer button is clickable

  @VoxProWeb @SmokeTestcase @JobApplication @VPS-13
  Scenario:To check functionality of jobs offer field
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Jobs Application
    Then  [Main Page] To Verify job offer button is functioning

  @VoxProWeb @SmokeTestcase @JobApplication @VPS-14
  Scenario:To Check the click-ability of "placement" button on job application.
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Jobs Application
    Then  [Main Page] Job placement button is clickable

  @VoxProWeb @SmokeTestcase @JobApplication @VPS-15
  Scenario:To check functionality of jobs placement field
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Jobs Application
    Then  [Main Page] Verify job placement button is functioning

  @VoxProWeb @SmokeTestcase @JobApplication @VPS-15
  Scenario:To check the follow up of job application
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Jobs Application
    Then  [Main Page] Verify Follow up in job application is redirected to chat

  @VoxProWeb @SmokeTestcase @JobApplication @VPS-15
  Scenario:To check the with draw application is removing the job application from the list
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Jobs Application
    Then  [Main Page] Verify withdraw application remove job application from the list

  @VoxProWeb @SmokeTestcase @JobApplication @VPS-15
  Scenario:To verify the list of job occur is same as the count shown in applied job
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Jobs Application
    Then  [Main Page] Verify the the list of job and count in applied job

  @VoxProWeb @SmokeTestcase @JobApplication @VPS-15
  Scenario:To verify the list of job occur is same as the count shown in Withdrawn job
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Jobs Application
    Then  [Main Page] Verify the the list of job and count in withdrawn job

  @VoxProWeb @SmokeTestcase @JobApplication @VPS-15
  Scenario:To verify the list of job occur is same as the count shown in interviews
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Jobs Application
    Then  [Main Page] Verify the the list of job and count in interviews





