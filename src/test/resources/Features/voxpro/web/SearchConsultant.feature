
Feature: Search Consultant

  @VoxProWeb @SmokeTestcase @SearchConsultant @VPS-1
  Scenario:Search Consultant
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Search Consultant

  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-2
  Scenario:To check user result if user don't enter name field in companies search
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Verify miss name field In Search Consultant

  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-3
  Scenario:To check user result if user don't enter job field in companies search
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Verify if user miss job title field

  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-4
  Scenario:To check user result if user don't enter location field in companies search
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Verify if user miss job location field

  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-5
  Scenario:To check user result if user don't enter no of jobs field in companies search
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Verify if user miss no of job field

  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-6
  Scenario:To check add keyword button in advanced search is available
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Consultant
    Then  [Main Page] Verify add keyword button availability in advanced search

  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-7
  Scenario:To check add keyword field in advanced search is available
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Consultant
    Then  [Main Page] Verify add keyword field in advanced available

  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-8
  Scenario:To check user is able to advanced search by using "keyword" in search consultant screen
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Consultant
    Then  [Main Page] Advanced search by using keyword"Automation"

  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-9
  Scenario:To check add Name button in advanced search is available
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Consultant
    Then  [Main Page] Verify add Name button availability in advanced search

  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-10
  Scenario:To check add Name field in advanced search is available
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Consultant
    Then  [Main Page] Verify add Name field in advanced available

  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-11
  Scenario:To check user is able to advanced search by using "Name" in search consultant screen
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Consultant
    Then  [Main Page] Advanced search by using Name"Zubair"

  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-12
  Scenario:To check add Recruits Industry button in advanced search is available
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Consultant
    Then  [Main Page] Verify add Recruit industry button availability in advanced search

  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-13
  Scenario:To check add Recruit industry field in advanced search is available
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Consultant
    Then  [Main Page] Verify add recruit Industry field in advanced available

  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-14
  Scenario:To check user is able to advanced search by using "Recruits Industry" in search consultant screen
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Consultant
    Then  [Main Page] Advanced search by using Recruits industries"Devops"

  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-15
  Scenario:To check add Recruits Location button in advanced search is available
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Consultant
    Then  [Main Page] Verify add Recruit location button availability in advanced search

  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-16
  Scenario:To check add Recruit industry location in advanced search is available
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Consultant
    Then  [Main Page] Verify add recruit location field in advanced available

  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-17
  Scenario:To check user is able to advanced search by using "Location" in search consultant screen
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Consultant
    Then  [Main Page] Advanced search by using Location"London"

  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-18
  Scenario:To check add Job title button in advanced search is available
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Consultant
    Then  [Main Page] Verify add job title button availability in advanced search

  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-19
  Scenario:To check add Job title in advanced search is available
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Consultant
    Then  [Main Page] Verify add job title field in advanced available

  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-20
  Scenario:To check user is able to advanced search by using "Job title" in search consultant screen
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Consultant
    Then  [Main Page] Advanced search by using Job title"Automation Engineer"

  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-21
  Scenario:To check add Job Type button in advanced search is available
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Consultant
    Then  [Main Page] Verify add job type button availability in advanced search

  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-22
  Scenario:To check add Job type in advanced search is available
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Consultant
    Then  [Main Page] Verify add job type field in advanced search is available


  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-23
  Scenario:To check user is able to advanced search by using "Job type" in search consultant screen
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Consultant
    Then  [Main Page] Advanced search by using Job type"Computer Programmer"

  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-24
  Scenario:To check add Specialities Button in advanced search is available
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Consultant
    Then  [Main Page] Verify add Specialities button availability in advanced search

  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-25
  Scenario:To check add Specialities in advanced search is available
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Consultant
    Then  [Main Page] Verify specialities type field in advanced search is available

  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-26
  Scenario:To check user is able to advanced search by using "Specialties" in search consultant screen
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Consultant
    Then  [Main Page] Advanced search by using Specialities"Application Automation"

  @VoxProWeb @SmokeTestcase @SearchConsultant  @VPS-27
  Scenario:To check user is able to advanced search by using "Has open jobs" in search consultant screen
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Search Consultant
    Then  [Main Page] Advanced search by using Has Open Jobs

