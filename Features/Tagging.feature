Feature: Tags in Cucumber

@SanityTest
  Scenario: Verify Login
    Given This is a valid login test

@SanityTest @EndToEnd
  Scenario: Verify Logout
    Given This is a logout test
    
    
@RegressionTest
  Scenario: Verify search
    Given This is a search test


@RegressionTest @EndToEnd
  Scenario: Verify Advanced Search
    Given This is an Advanced search
    
    
@EndToEnd
  Scenario: Verify prepaid Recharge
    Given This is a prepaid recharge


    
@EndToEnd @Regression
  Scenario: Verify post paid recharge
    Given This is post paid recharge
