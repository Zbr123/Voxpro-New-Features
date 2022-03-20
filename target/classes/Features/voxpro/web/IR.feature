
Feature:IR35

  @VoxProWeb @SmokeTestcase @IR35 @VPS-1
  Scenario:To check "New" IR35 is working
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    When  [Main Page] Go to IR35
    Then  [Main Page] Go to the IR35 New

  @VoxProWeb @SmokeTestcase @IR35 @VPS-1
  Scenario:To check New IR is redirected to pending IR35 page
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    When  [Main Page] Go to IR35
    And   [Main Page] Go to the IR35 New
    Then  [Main Page] Verify New IR is redirected to new IR page

  @VoxProWeb @SmokeTestcase @IR35 @VPS-2
  Scenario:To check IR35 "History" is working
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    When  [Main Page] Go to IR35
    And   [Main Page] Go to the IR35 History

  @VoxProWeb @SmokeTestcase @IR35 @VPS-2
  Scenario:To check Number of Submitted,Determination & due today field is available on history page
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    When  [Main Page] Go to IR35
    And   [Main Page] Go to the IR35 History
    Then  [Main Page] Verify Submitted Determination & Due today present on IR history page

  @VoxProWeb @SmokeTestcase @IR35 @VPS-2
  Scenario:To check all header is present on IR History page
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    When  [Main Page] Go to IR35
    And   [Main Page] Go to the IR35 History
    Then  [Main Page] Verify all titles is present on IR History Page

  @VoxProWeb @SmokeTestcase @IR35 @VPS-3
  Scenario:To check IR35 "Queries" is working
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    When  [Main Page] Go to IR35
    Then  [Main Page] Go to the IR35 Queries

  @VoxProWeb @SmokeTestcase @IR35 @VPS-3
  Scenario:To check Submitted,Queries resolved,Response due filed is visible on IR queries page
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    When  [Main Page] Go to IR35
    And   [Main Page] Go to the IR35 Queries
    Then  [Main Page] Verify Submitted Determination & Due today present on IR Queries page

  @VoxProWeb @SmokeTestcase @IR35 @VPS-3
  Scenario:To check all header is present on IR Queries page
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    When  [Main Page] Go to IR35
    And   [Main Page] Go to the IR35 Queries
    Then  [Main Page] Verify all titles is present on IR Queries Page
