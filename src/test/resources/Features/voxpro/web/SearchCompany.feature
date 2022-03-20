
Feature: Search Company

  @VoxProWeb @SmokeTestcase @SearchCompany @VPS-1
  Scenario:Search Company
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Companies
    And   [Main Page] Search company name "Zubair"
    When  [Main Page] Search Company Industries "Software Developer"
    And   [Main Page] Search Company Location "karachi"
    And   [Main Page] Number of Jobs "2"
    Then  [Main Page] Search for companies

  @VoxProWeb @SmokeTestcase @SearchCompany @VPS-2
  Scenario:User don't enter name field
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Companies
    When  [Main Page] Search Company Industries "software developer"
    And   [Main Page] Search Company Location "karachi"
    And   [Main Page] Number of Jobs "2"
    Then  [Main Page] Search for companies

  @VoxProWeb @SmokeTestcase @SearchCompany @VPS-3
  Scenario:User don't enter job title
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Companies
    And   [Main Page] Search company name "Zubair"
    And   [Main Page] Search Company Location "karachi"
    And   [Main Page] Number of Jobs "2"
    Then  [Main Page] Search for companies

  @VoxProWeb @SmokeTestcase @SearchCompany @VPS-4
  Scenario:User don't enter job location field
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Companies
    And   [Main Page] Search company name "Zubair"
    When  [Main Page] Search Company Industries "Software Developer"
    And   [Main Page] Number of Jobs "2"
    Then  [Main Page] Search for companies

  @VoxProWeb @SmokeTestcase @SearchCompany @VPS-5
  Scenario:User don't enter no of jobs field
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Companies
    And   [Main Page] Search company name "Zubair"
    When  [Main Page] Search Company Industries "Software Developer"
    And   [Main Page] Search Company Location "karachi"
    Then  [Main Page] Search for companies

  @VoxProWeb @SmokeTestcase @SearchCompany @VPS-6
  Scenario:To check availability of add keyword button in advanced search of company
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Companies
    And   [Main Page] Search company name "Zubair"
    When  [Main Page] Search Company Industries "Software Developer"
    And   [Main Page] Search Company Location "karachi"
    And   [Main Page] Number of Jobs "2"
    And   [Main Page] Search for companies
    Then  [Main Page] Verify add keyword button availability in advanced search

  @VoxProWeb @SmokeTestcase @SearchCompany @VPS-7
  Scenario:To check availability of keyword field in advanced search of company
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Companies
    And   [Main Page] Search company name "Zubair"
    When  [Main Page] Search Company Industries "Software Developer"
    And   [Main Page] Search Company Location "karachi"
    And   [Main Page] Number of Jobs "2"
    And   [Main Page] Search for companies
    Then  [Main Page] Verify add keyword field in advanced available

  @VoxProWeb @SmokeTestcase @SearchCompany @VPS-8
  Scenario:To check availability of add name button in advanced search of company
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Companies
    And   [Main Page] Search company name "Zubair"
    When  [Main Page] Search Company Industries "Software Developer"
    And   [Main Page] Search Company Location "karachi"
    And   [Main Page] Number of Jobs "2"
    And   [Main Page] Search for companies
    Then  [Main Page] Advanced search by using Name"Zubair"

  @VoxProWeb @SmokeTestcase @SearchCompany @VPS-9
  Scenario:To check add Name button in advanced companies search
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Companies
    And   [Main Page] Search company name "Zubair"
    When  [Main Page] Search Company Industries "Software Developer"
    And   [Main Page] Search Company Location "karachi"
    And   [Main Page] Number of Jobs "2"
    And   [Main Page] Search for companies
    Then  [Main Page] Verify add Name button availability in advanced search

  @VoxProWeb @SmokeTestcase @SearchCompany @VPS-10
  Scenario:To check availability of name field in advanced search of companies
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Companies
    And   [Main Page] Search company name "Zubair"
    When  [Main Page] Search Company Industries "Software Developer"
    And   [Main Page] Search Company Location "karachi"
    And   [Main Page] Number of Jobs "2"
    And   [Main Page] Search for companies
    Then  [Main Page] Verify add Name field in advanced available

  @VoxProWeb @SmokeTestcase @SearchCompany @VPS-11
  Scenario:To check add Recruits Industry button in advanced companies search
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Companies
    And   [Main Page] Search company name "Zubair"
    When  [Main Page] Search Company Industries "Software Developer"
    And   [Main Page] Search Company Location "karachi"
    And   [Main Page] Number of Jobs "2"
    And   [Main Page] Search for companies
    Then  [Main Page] Verify add Recruit industry button availability in advanced search

  @VoxProWeb @SmokeTestcase @SearchCompany @VPS-12
  Scenario:To check add Recruit industry field in advanced companies search is available
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Companies
    And   [Main Page] Search company name "Zubair"
    When  [Main Page] Search Company Industries "Software Developer"
    And   [Main Page] Search Company Location "karachi"
    And   [Main Page] Number of Jobs "2"
    And   [Main Page] Search for companies
    Then  [Main Page] Verify add recruit Industry field in advanced available

  @VoxProWeb @SmokeTestcase @SearchCompany @VPS-13
  Scenario:To check user is able to advanced company search by using "Recruits Industry"
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Companies
    And   [Main Page] Search company name "Zubair"
    When  [Main Page] Search Company Industries "Software Developer"
    And   [Main Page] Search Company Location "karachi"
    And   [Main Page] Number of Jobs "2"
    And   [Main Page] Search for companies
    Then  [Main Page] Advanced search by using Recruits industries"Devops"

  @VoxProWeb @SmokeTestcase @SearchCompany @VPS-14
  Scenario:To check add Recruits Location button is available in companies search
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Companies
    And   [Main Page] Search company name "Zubair"
    When  [Main Page] Search Company Industries "Software Developer"
    And   [Main Page] Search Company Location "karachi"
    And   [Main Page] Number of Jobs "2"
    And   [Main Page] Search for companies
    Then  [Main Page] Verify add Recruit location button availability in advanced search

  @VoxProWeb @SmokeTestcase @SearchCompany @VPS-15
  Scenario:To check add Recruit industry location in advanced search is available
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Companies
    And   [Main Page] Search company name "Zubair"
    When  [Main Page] Search Company Industries "Software Developer"
    And   [Main Page] Search Company Location "karachi"
    And   [Main Page] Number of Jobs "2"
    And   [Main Page] Search for companies
    Then  [Main Page] Verify add recruit location field in advanced available

  @VoxProWeb @SmokeTestcase @SearchCompany @VPS-16
  Scenario:To check user is able to advanced search by using "Location" in search companies
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Companies
    And   [Main Page] Search company name "Zubair"
    When  [Main Page] Search Company Industries "Software Developer"
    And   [Main Page] Search Company Location "karachi"
    And   [Main Page] Number of Jobs "2"
    And   [Main Page] Search for companies
    Then  [Main Page] Advanced search by using Location"London"

  @VoxProWeb @SmokeTestcase @SearchCompany @VPS-17
  Scenario:To check add Job title button in advanced search is available
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Companies
    And   [Main Page] Search company name "Zubair"
    When  [Main Page] Search Company Industries "Software Developer"
    And   [Main Page] Search Company Location "karachi"
    And   [Main Page] Number of Jobs "2"
    And   [Main Page] Search for companies
    Then  [Main Page] Verify add job title button availability in advanced search
