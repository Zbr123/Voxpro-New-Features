
Feature:Request for information

  @VoxProWeb @SmokeTestcase @RequestForInformation @VPS-1
  Scenario:To Check the functionality of new request in request for information
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    When  [Main Page] Go to the Request for information
    Then  [Main Page] Go to New Request

  @VoxProWeb @SmokeTestcase @RequestForInformation @VPS-2
  Scenario:To Check the functionality of History in request for information
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    When  [Main Page] Go to the Request for information
    Then  [Main Page] Go to the Request History

