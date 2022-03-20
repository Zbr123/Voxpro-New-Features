
Feature: Search Agency

  @VoxProWeb @SmokeTestcase @SearchAgency @VPS-1
  Scenario:Search Agency
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Agencies
    And   [Main Page] Search company name "Zubair Alam"
    When  [Main Page] Search Company Industries "Computer Software"
    And   [Main Page] Search Company Location "karachi"
    And   [Main Page] Number of Jobs "2"
    Then  [Main Page] Search for companies





