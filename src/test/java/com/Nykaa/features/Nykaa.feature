 @Nykaa
 Feature: To Automate nykaa ecommerce website.
     I want to go to a particular tab select a product click on it change quantity change the number of items in a cart proceed to checkout generate invalid error scrrenshot it edit and remove it from the nykaa ecommerce website.
    
    
    
    @Searchproduct
    Scenario: To Search for a product
    Given Launch the browser
    And User see the momandbaby tab
    When User use the mouseoveraction to move to mom and baby tab.
    And User click on the baby powder
    Then User in the baby powder window.
    
    @selectproduct
    Scenario: To select the baby powder
    Given User in the baby powder tab
    When User want to switch to another window
    And User want to scroll the page with JavaScriptExecutor
    And User want to click the babypowder product
    And User want to switch to another tab
    And User click on the dropdown and change its quantity
    Then User the quantity value must be changed
    
    @order
    Scenario: To add the item in the cart
    Given Now User need to click on the add to cart button
    When User click the cart button
    And User want to switch to another frame
    And User want to click on the quantity
    And User want to change the quantity
    And User want to click on the proceed button
    Then User want to reach the login page after clicking proceed button
    
    @login
    Scenario: To login to the nykaa account
    Given now User need to click on the login button
    When User click on the login button
    And Google is clicked
    And In email User enter the gmail mailid
    And User click next
    And User enter password in password tab
    And User click next
    Then the account is logged in
    
    @payment
    Scenario: To enter the payment credentials and take screenshot
    Given now User want to click the deliver here button
    When User click on the deliver here button
    And User next click on the upi option
    And User click on other upi option
    And User enter upi credentials
    And User click the pay amount button
    And User take the screenshot of the failed payment
    And User want to click the close button of the payment failed popup
    Then the payment failed tab is closed
    
    @RemovefromBag
    Scenario: To remove the items from the bag
    Given To edit and delete the items from the cart
    When To click on the Bag button on the right side in payments tab.
    And To click on the edit button
    And to click on the Delete garbage icon
    And to click on the remove button
    Then The browser will be closed
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
     
 
 
 
 
 
 
     
      
      
      