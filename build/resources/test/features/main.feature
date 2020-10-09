@task
Feature: User should be able to a monkey test on UI

  Scenario: Go several locations and confirm that everything is up and running

    Given Enter the valid credentials to login into DVNGL
    And   Click on Marketplace on the Dashboard
    When  Select the CyberSecurity checkbox print the number of results
    And   Select the Network Storm and click on see prices and buy
    And   From the Single user section see the price and click on buy now then click I accept
    Then  Verify that the price has seen on the screen and email address has a warning message