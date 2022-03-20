
Feature: Edit Profile

  @VoxProWeb @SmokeTestcas @EditProfile @VPS-1
  Scenario:Edit Personal Profile
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Complete your profile your profile
    And   [Main Page] Edit Personal information
    When  [Main Page] Verify user is able to edit personal information field
    Then  [Main Page] Drop Downs

