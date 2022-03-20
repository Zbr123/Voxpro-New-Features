
Feature:Connections feature

  @VoxProWeb @Connections @VPS-1
  Scenario:To check Connections button is redirected to connection page
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Go to Connections

  @VoxProWeb @Connections @VPS-2
  Scenario:To check "View recent connection" in connection is working
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Go to Connections
    Then  [Main Page] Verify view icon in recent connection

  @VoxProWeb @Connections @VPS-3
  Scenario:User Send CV to his recent connection
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Go to Connections
    Then  [Main Page] Verify user is able to send cv to his recent connection

  @VoxProWeb @Connections @VPS-4
  Scenario:To check "Message" in view recent connection is working
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Go to Connections
    Then  [Main Page] Verify message button is redirected to chat in recent connections

  @VoxProWeb @Connections @VPS-5
  Scenario:To check "chat icon" in recent connections
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Go to Connections
    Then  [Main Page] Verify chat icon in recent connections

  @VoxProWeb @Connections @VPS-6
  Scenario:To check "pending connections" in connections page is working
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Verify pending connections is visible

  @VoxProWeb @Connections @VPS-7
  Scenario:To check "Sent connections" in connections page is working
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Verify sent connections is visible

  @VoxProWeb @Connections @VPS-8
  Scenario:To check view icon in sent connections  is working
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Verify view icon in sent connections is redirected to profile page

  @VoxProWeb @Connections @VPS-9
  Scenario:To check user is able to "Withdraw" pending connections
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    Then  [Main Page] Verify user is able to withdraw after sent connections request

  @VoxProWeb @Connections @VPS-10
  Scenario:To check view profile having same email address as show in recent connection
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Go to Connections
    Then  [Main Page] Verify profile contain same email address as shown in recent connection

  @VoxProWeb @Connections @VPS-11
  Scenario:To check user is redirected to the same profile that appear on recent connection
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Go to Connections
    Then  [Main Page] Verify same user is redirected to right profile in

  @VoxProWeb @Connections @VPS-12
  Scenario:To check "Telephone Number" field is visible in recent connection profile
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Go to Connections
    Then  [Main Page] Verify telephone number is present in recent connection profile

  @VoxProWeb @Connections @VPS-13
  Scenario:To check "Mobile Number" field is visible in recent connection profile
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Go to Connections
    Then  [Main Page] Verify Mobile number is present in recent connection profile

  @VoxProWeb @Connections @VPS-14
  Scenario:To check user is redirected to the same profile that appear on sent connection
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Go to Connections
    Then  [Main Page] Verify profile name in sent connection and view profile

  @VoxProWeb @Connections @VPS-15
  Scenario:To check view profile having same email address as show on profile in sent connection
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Go to Connections
    Then  [Main Page] Verify profile contain same email address as shown in sent connection

  @VoxProWeb @Connections @VPS-16
  Scenario:To check "Telephone Number" field is visible in sent connection profile
    Given [Main Page] Navigate to VoxPro Web app
    When  [Main Page] Go to the Login page
    And   [Main Page] Enter Username and Password and Click SigIn Button
    And   [Main Page] Go to Connections
    Then  [Main Page] Verify telephone number is present in sent connection profile