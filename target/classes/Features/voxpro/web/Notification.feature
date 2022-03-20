
Feature: Notification

  @VoxProWeb @SmokeTestcase @Notification @VPS-1
  Scenario:To verify activity Button is Clickable
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Verify activity button is clickable

  @VoxProWeb @SmokeTestcase @Notification @VPS-2
  Scenario:Verify notification Button Is clickable
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Verify notification button is clickable

  @VoxProWeb @SmokeTestcase @Notification @VPS-3
  Scenario:To verify task button Is clickable
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Verify task button is Clickable

  @VoxProWeb @SmokeTestcase @Notification @VX-4
  Scenario:To Check make your first connection button Is clickable
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] verify make your first connection is clickable

  @VoxProWeb @SmokeTestcase @Notification @VPS-5
  Scenario:User try to make new Connection
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Make your First Connection

  @VoxProWeb @SmokeTestcase @Notification @VPS-6
  Scenario:User don't enter name field
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] User miss name field

  @VoxProWeb @SmokeTestcase @Notification @VPS-7
  Scenario:User don't enter job title
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] User miss job title field

  @VoxProWeb @SmokeTestcase @Notification @VPS-8
  Scenario:User don't enter job location field
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] User miss job location field

  @VoxProWeb @SmokeTestcase @Notification @VPS-9
  Scenario:User don't enter no of jobs field
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] User miss no of job field

