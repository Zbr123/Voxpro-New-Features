
Feature: SignUp

  @VoxProWeb @SmokeTestcase @SignUp @VPS-1
  Scenario: user account Candidate registration
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Click on Register Button
    Then  [Main Page] Registration Flow For Candidate

  @VoxProWeb @SmokeTestcase @SignUp @VPS-2
  Scenario: Candidate register account through facebook
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Click on Register Button
    Then  [Main Page] Account registration using facebook

  @VoxProWeb @SmokeTestcase @SignUp @VPS-3
  Scenario: Candidate register account through google account
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Click on Register Button
    Then  [Main Page] Account registration using google account

  @VoxProWeb @SmokeTestcase @SignUp @VPS-4
  Scenario: user account agency registration
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Click on Register Button
    Then  [Main Page] Registration Flow For Agency

  @VoxProWeb @SmokeTestcase @SignUp @VPS-5
  Scenario: user account Company registration
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Click on Register Button
    Then  [Main Page] Registration Flow For Company



