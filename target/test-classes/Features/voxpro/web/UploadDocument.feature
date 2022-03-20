
Feature:Upload Document

  @VoxProWeb @SmokeTestcase @UploadDocument @VPS-1
  Scenario:On boarding document
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Click on OnBoarding documents
    Then  [Main Page] Click on Upload documents

  @VoxProWeb @SmokeTestcase @UploadDocument @VPS-1
  Scenario:Browse from PC to upload documents
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Click on OnBoarding documents
    And   [Main Page] Click on Upload documents
    Then  [Main Page] Browse file to upload documents

  @VoxProWeb @SmokeTestcase @UploadDocument @VPS-1
  Scenario:Select category
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Click on OnBoarding documents
    And   [Main Page] Click on Upload documents
    Then  [Main Page] Enter category name

  @VoxProWeb @SmokeTestcase @UploadDocument @VPS-1
  Scenario:To check validation error message is displayed if user not enter category of document
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Click on OnBoarding documents
    When  [Main Page] Click on Upload documents
    Then  [Main Page] Verify the validation error message of select category

  @VoxProWeb @SmokeTestcase @UploadDocument @VPS-1
  Scenario:Select the type of document to upload
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Click on OnBoarding documents
    When  [Main Page] Click on Upload documents
    And   [Main Page] Enter category name
    Then  [Main Page] Enter type of document to add

  @VoxProWeb @SmokeTestcase @UploadDocument @VPS-1
  Scenario:To check validation error message is displayed if user not enter type of document
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Click on OnBoarding documents
    When  [Main Page] Click on Upload documents
    And   [Main Page] Enter category name
    Then  [Main Page] Verify the validation error message of type of documentation category

  @VoxProWeb @SmokeTestcase @UploadDocument @VPS-1
  Scenario:Select type of expiration of uploaded document
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Click on OnBoarding documents
    And   [Main Page] Click on Upload documents
    Then  [Main Page] Enter Expiration

  @VoxProWeb @SmokeTestcase @UploadDocument @VPS-1
  Scenario:To check validation error message is displayed if user not enter expiration of document
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Click on OnBoarding documents
    When  [Main Page] Click on Upload documents
    Then  [Main Page] Verify the validation error message of expiration of document

  @VoxProWeb @SmokeTestcase @UploadDocument @VPS-1
  Scenario:Select notification by email of selected document
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Click on OnBoarding documents
    And   [Main Page] Click on Upload documents
    Then  [Main Page] Select notify my email

  @VoxProWeb @SmokeTestcase @UploadDocument @VPS-1
  Scenario:To check validation error message is displayed if user not enter category of document
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Click on OnBoarding documents
    When  [Main Page] Click on Upload documents
    Then  [Main Page] Verify the validation error message of select category

  @VoxProWeb @SmokeTestcase @UploadDocument @VPS-1
  Scenario:Select type of privacy type of uploaded document
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Click on OnBoarding documents
    And   [Main Page] Click on Upload documents
    Then  [Main Page] Enter privacy type

  @VoxProWeb @SmokeTestcase @UploadDocument @VPS-1
  Scenario:To check validation error message is displayed if user not enter type of document
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Click on OnBoarding documents
    When  [Main Page] Click on Upload documents
    Then  [Main Page] Verify the validation error message of type of privacy
