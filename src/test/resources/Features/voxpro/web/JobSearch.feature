
Feature:JobSearch

  @VoxProWeb @SmokeTestcase @JobSearch @VPS-1
  Scenario:To check user is able to job search
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Job search

  @VoxProWeb @SmokeTestcase @JobSearch @VPS-2
  Scenario:To check the job listed in
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Job search
    Then  [Main Page] To verify the jobs listed on the page is required one

  @VoxProWeb @SmokeTestcase @JobSearch @VPS-3
  Scenario:To check the functionality of distance filter for job search
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Job search
    Then  [Main page] To verify Distance filter is working

  @VoxProWeb @SmokeTestcase @JobSearch @VPS-4
  Scenario:To check the functionality of salary range filter for job search
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Job search
    Then  [Main Page] To verify Salary Range filter is working

  @VoxProWeb @SmokeTestcase @JobSearch @VPS-5
  Scenario:To check the functionality of Job type filter for job search
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Job search
    Then  [Main Page] To verify Job type filter is working

  @VoxProWeb @SmokeTestcase @JobSearch @VPS-6
  Scenario:To check the functionality of Date posted filter for job search
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Job search
    Then  [Main Page] To verify Date posted filter is working

  @VoxProWeb @SmokeTestcase @JobSearch @VPS-7
  Scenario:To check the functionality of Specialisms filter for job search
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Job search
    Then  [Main Page] To verify Specialisms filter is working

  @VoxProWeb @SmokeTestcase @JobSearch @VPS-8
  Scenario:To check the functionality of Related jobs filter for job search
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Job search
    Then  [Main Page] To verify Related jobs filter is working