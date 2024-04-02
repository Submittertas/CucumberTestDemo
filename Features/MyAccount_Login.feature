Feature: MyAccount_Login Feature

  Scenario Outline: Login with valid email and password
    Given that user opens the browser
    When user enters the url "https://simastage.trade.gov/ita-iilt-test-web/"
    And Enter valid email "<email>" and password "<password>"
    And Click the Login button
    Then the user successfully logs in to the application

    Examples: 
      | email                        | password |
      | test@gmail.com               | test123& |
      | test@gmail.com               | test123& |
      | testdeployment2019@gmail.com | Test123! |

      
   #Using Data Table Approach   
   #Scenario Outline: Login with valid email and password
   # Given that user opens the browser
   # When user enters the url "https://simastage.trade.gov/ita-iilt-test-web/"
   #And Enter valid email and password 
   #| testdeployment2019@gmail.com | Test123! |
   #And Click the Login button
   #Then the user successfully logs in to the application

   