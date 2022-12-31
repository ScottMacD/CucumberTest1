#Author: Scott MacDonald BasementArtMedia@gmail.com
#Comment Sold Test 
@tag
Feature: Comment Sold Register Login/Logout Test
  

	@tag1
  Scenario: Completes Purchase Without Coupon
  Given User is on page "https://qatest.commentsoldrt.com/webstore-register?destination=/account"
  And Verifies they are on the create account page
  And enters first name as "Julien" and last name as "Hartley"
  And enters email address as "JulienHartley2@gmail.com" and password as "Dx12345!"
  And customer submits and verifies registration
  And enters phone number as "555 555 5555" and confirms registation
  And user chooses not to subscribe
  And user clicks add to cart on item "You Look Good Bath Mat" and clicks checkout
	And user clicks delivery enters the street address as "123 Smith Street" City as "Austin" State as "TX" Zip Code as "78748"
	And user enters credit card number as "4242 4242 4242 4242" expiration date as "03/25" and security code as "111" Zip Code as "78748"
	Then user pays with card and verifies successful purchase and logs out
	
	@tag2
  Scenario: Completes Purchase With Coupon
  Given User is on page "https://qatest.commentsoldrt.com/webstore-login?destination=/account"
  And logins with username "JulienHartley@gmail.com" and password "Dx12345!"
  And user shops adds item to cart "You Look Good Bath Mat" and clicks checkout
  And user applies coupon code "20%OFF"
	Then user pays with card and verifies successful purchase and logs out
	
	