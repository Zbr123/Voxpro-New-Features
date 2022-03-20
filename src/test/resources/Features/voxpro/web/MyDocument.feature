
Feature: My Document

  @VoxProWeb @SmokeTestcase @EditProfile @VPS-1
    Scenario:To check the personal document count
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Click on OnBoarding documents
    And   [Main Page] Click On My Documents
    Then  [Main Page] Verify the list of upload document is same and seen on personal document

  @VoxProWeb @SmokeTestcase @EditProfile @VPS-2
    Scenario:To check the company document count
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Click on OnBoarding documents
    And   [Main Page] Click On My Documents
    Then  [Main Page] Verify company document is count correct

  @VoxProWeb @SmokeTestcase @EditProfile @VPS-3
    Scenario:To check general document count
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Click on OnBoarding documents
    And   [Main Page] Click On My Documents
    Then  [Main Page] Verify general document count is correct

  @VoxProWeb @SmokeTestcase @EditProfile @VPS-4
    Scenario:To check On-boarding document count
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Click on OnBoarding documents
    And   [Main Page] Click On My Documents
    Then  [Main Page] Verify onboard document count is correct

  @VoxProWeb @SmokeTestcase @EditProfile @VPS-5
    Scenario:To check view of shared with document in personal document
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Click on OnBoarding documents
    And   [Main Page] Click On My Documents
    Then  [Main Page] Verify document shared view in personal document

  @VoxProWeb @SmokeTestcase @EditProfile @VPS-6
  Scenario:To check view of shared with document in company document
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Click on OnBoarding documents
    And   [Main Page] Click On My Documents
    Then  [Main Page] Verify document shared view in company document

  @VoxProWeb @SmokeTestcase @EditProfile @VPS-7
  Scenario:To check view of shared with document in general document
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Click on OnBoarding documents
    And   [Main Page] Click On My Documents
    Then  [Main Page] Verify document shared view in general document

  @VoxProWeb @SmokeTestcase @EditProfile @VPS-8
  Scenario:To check view of shared with document in on boarding document
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Click on OnBoarding documents
    And   [Main Page] Click On My Documents
    Then  [Main Page] Verify document shared view in On Boarding document

  @VoxProWeb @SmokeTestcase @EditProfile @VPS-9
  Scenario:To check view upload document in personal document
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Click on OnBoarding documents
    And   [Main Page] Click On My Documents
    Then  [Main Page] Verify view uploaded document in personal document

  @VoxProWeb @SmokeTestcase @EditProfile @VPS-10
  Scenario:To check view upload document in company document
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Click on OnBoarding documents
    And   [Main Page] Click On My Documents
    Then  [Main Page] Verify view uploaded document in company document

  @VoxProWeb @SmokeTestcase @EditProfile @VPS-11
  Scenario:To check view upload document in general document
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Click on OnBoarding documents
    And   [Main Page] Click On My Documents
    Then  [Main Page] Verify view uploaded document in General document

  @VoxProWeb @SmokeTestcase @EditProfile @VPS-12
  Scenario:To check view upload document in On Boarding document
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Click on OnBoarding documents
    And   [Main Page] Click On My Documents
    Then  [Main Page] Verify view uploaded document in On Boarding document

  @VoxProWeb @SmokeTestcase @EditProfile @VPS-13
  Scenario:To check edit and replace document in personal document
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Click on OnBoarding documents
    When  [Main Page] Click On My Documents
    And   [Main Page] Click on Edit and replace document in personal document
    Then  [Main Page] Upload a new document

