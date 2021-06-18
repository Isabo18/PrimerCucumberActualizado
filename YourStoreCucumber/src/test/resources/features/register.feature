Feature: Sign in
  I as a web user
  I want to register in the store
  To be able to buy a product

  Scenario Outline: RegisterUser
    Given enter the page to register
    When I lead the way
     | userName   |  lastName  |  email  |  telephone  |  password  |
     | <userName> | <lastName> | <email> | <telephone> | <password> |
    Then you should see the message on the screen
    Examples:
     | userName  |  lastName  |      email      |   telephone   |  password   |
     | Camilo     | Lopez  | camilo@gmil.com  |  1111111  |   camilo123  |
     | Javier     | Suarez  | javier@gmil.com  |  1111111  |   javier123  |