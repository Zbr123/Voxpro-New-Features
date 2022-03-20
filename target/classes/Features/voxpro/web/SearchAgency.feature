
Feature: Search Agency

  @VoxProWeb @SmokeTestcase @SearchAgency @VPS-1
  Scenario:Search Agency
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Agencies
    And   [Main Page] Search company name "Zubair"
    When  [Main Page] Search Company Industries "Software Developer"
    And   [Main Page] Search Company Location "karachi"
    And   [Main Page] Number of Jobs "2"
    Then  [Main Page] Search for Agencies

  @VoxProWeb @SmokeTestcase @SearchAgency  @VPS-2
  Scenario:To check user result if user don't enter name field in agency search
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Agencies
    When  [Main Page] Search Company Industries "software developer"
    And   [Main Page] Search Company Location "karachi"
    And   [Main Page] Number of Jobs "2"
    Then  [Main Page] Search for Agencies

  @VoxProWeb @SmokeTestcase @SearchAgency  @VPS-3
  Scenario:To check user result if user don't enter no of jobs title in agency search
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Agencies
    And   [Main Page] Search company name "Zubair"
    And   [Main Page] Search Company Location "karachi"
    And   [Main Page] Number of Jobs "2"
    Then  [Main Page] Search for Agencies

  @VoxProWeb @SmokeTestcase @SearchAgency  @VPS-4
  Scenario:To check user result if user don't enter location field in agency search
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Agencies
    And   [Main Page] Search company name "Zubair"
    When  [Main Page] Search Company Industries "Software Developer"
    And   [Main Page] Number of Jobs "2"
    Then  [Main Page] Search for Agencies

  @VoxProWeb @SmokeTestcase @SearchAgency  @VPS-5
  Scenario:To check user result if user don't enter no of jobs field in agency search
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Agencies
    And   [Main Page] Search company name "Zubair"
    When  [Main Page] Search Company Industries "Software Developer"
    And   [Main Page] Search Company Location "karachi"
    Then  [Main Page] Search for Agencies
