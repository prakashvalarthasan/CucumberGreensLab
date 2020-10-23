Feature: verifying the adactin hotel application details

  Scenario Outline: verifying adactin login deatails with valid username and invalid password
    Given User is on adactin page
    When User must login using "<username>" and "<password>"
    And User should select the hotel "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>","<childrenPerRoom>"
    When user must select the hotel and click continue
    And user should select the "<firstName>","<lastName>","<billingAddress>"
     
      | CREDITCARDNO     | CARDTYPE         | EXPIRYMONTH | EXPIRYYEAR | CVV |
      | 1234566775464554 | American Express | January    |       2020 | 001 |
      | 1234566775464554 | VISA             | February   |       2021 | 002 |
      | 1234566775464554 | Master Card      | March      |       2022 | 112 |
      | 1234566775464554 | Other            | April      |       2019 | 258 |
      
    Then user must recieve the order no

    Examples: 
      | username        | password    | location | hotels         | roomType     | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom | firstName | lastName | billingAddress |
      | grittierprakash | grittier*91 | Sydney   | Hotel Creek    | Deluxe       | 2 - Two       | 15/10/2020  | 16/10/2020   | 2 - Two       | 0 - None        | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Creek    | Standard     | 2 - Two       | 15/10/2020  | 16/10/2020   | 2 - Two       | 0 - None        | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Creek    | Double       | 2 - Two       | 15/10/2020  | 16/10/2020   | 2 - Two       | 0 - None        | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Creek    | Super Deluxe | 2 - Two       | 15/10/2020  | 16/10/2020   | 2 - Two       | 0 - None        | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Creek    | Deluxe       | 2 - Two       | 15/10/2020  | 16/10/2020   | 2 - Two       | 0 - None        | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Sunshine | Deluxe       | 2 - Two       | 15/10/2020  | 16/10/2020   | 2 - Two       | 0 - None        | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Hervey   | Deluxe       | 2 - Two       | 15/10/2020  | 16/10/2020   | 2 - Two       | 0 - None        | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Cornice  | Deluxe       | 2 - Two       | 15/10/2020  | 16/10/2020   | 2 - Two       | 0 - None        | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Cornice  | Deluxe       | 1 - One       | 15/10/2020  | 16/10/2020   | 2 - Two       | 0 - None        | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Cornice  | Deluxe       | 2 - Two       | 15/10/2020  | 16/10/2020   | 2 - Two       | 0 - None        | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Cornice  | Deluxe       | 3 - Three     | 15/10/2020  | 16/10/2020   | 2 - Two       | 0 - None        | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Cornice  | Deluxe       | 4 - Four      | 15/10/2020  | 16/10/2020   | 2 - Two       | 0 - None        | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Cornice  | Deluxe       | 5 - Five      | 15/10/2020  | 16/10/2020   | 2 - Two       | 0 - None        | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Cornice  | Deluxe       | 6 - Six       | 15/10/2020  | 16/10/2020   | 2 - Two       | 0 - None        | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Cornice  | Deluxe       | 7 - Seven     | 15/10/2020  | 16/10/2020   | 2 - Two       | 0 - None        | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Cornice  | Deluxe       | 8 - Eight     | 15/10/2020  | 16/10/2020   | 2 - Two       | 0 - None        | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Cornice  | Deluxe       | 9 - Nine      | 15/10/2020  | 16/10/2020   | 2 - Two       | 0 - None        | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Cornice  | Deluxe       | 10 - Ten      | 15/10/2020  | 16/10/2020   | 2 - Two       | 0 - None        | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Cornice  | Deluxe       | 4 - Four      | 15/10/2020  | 16/10/2020   | 1 - One       | 0 - None        | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Cornice  | Deluxe       | 4 - Four      | 15/10/2020  | 16/10/2020   | 2 - Two       | 0 - None        | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Cornice  | Deluxe       | 4 - Four      | 15/10/2020  | 16/10/2020   | 3 - Three     | 0 - None        | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Cornice  | Deluxe       | 4 - Four      | 15/10/2020  | 16/10/2020   | 4 - Four      | 0 - None        | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Cornice  | Deluxe       | 4 - Four      | 15/10/2020  | 16/10/2020   | 2 - Two       | 0 - None        | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Creek    | Deluxe       | 2 - Two       | 15/10/2020  | 16/10/2020   | 2 - Two       | 1 - One         | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Creek    | Deluxe       | 2 - Two       | 15/10/2020  | 16/10/2020   | 2 - Two       | 2 - Two         | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Creek    | Deluxe       | 2 - Two       | 15/10/2020  | 16/10/2020   | 2 - Two       | 3 - Three       | Prakash   | grittier | chennai        |
      | grittierprakash | grittier*91 | Sydney   | Hotel Creek    | Deluxe       | 2 - Two       | 15/10/2020  | 16/10/2020   | 2 - Two       | 4 - Four        | Prakash   | grittier | chennai        |
      