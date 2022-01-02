Feature: check various functionality of Amazon in Edge Browser

  #Scenario.01. Sign-up functionality check
  @Scenario01 @Test01_01 @Feature01
  Scenario: OPEN EDGE BROWSER,NAVIGATE TO AMAZON PAGE AND VERIFY ITS LOGO AND TITLE
    Given  Launch Edge browser
    Then   Maximize the window
    When   Navigate to amazon home page
    Then   Verify the amazon logo is displayed
    Then   verify the title contains Online Shopping site in India:
    And    Close browser

  @Scenario01 @Test01_02 @Feature01
  Scenario:IF PRESENT CLICK ON SIGN-IN BUTTON AND VERIFY SIGN IN PAGE IS POPULATED
    Given  Launch Edge browser
    Then   Maximize the window
    Then   Navigate to amazon home page
    Then   click on the sign-in button
    When   page opens verify the title as "Amazon Sign In"
    And    Close browser

  @Scenario01 @Test01_03 @Feature01
  Scenario: TO VERIFY CONTINUE AND CREATE ACCOUNT BUTTONS ARE DISPLAYED AND ENABLED
    Given  Launch Edge browser
    Then   Maximize the window
    Then   Navigate to amazon home page
    Then   click on the sign-in button
    When   sign in page comes verify continue button is enabled
    And    also check for create account button
    Then   Close browser

  @Scenario01 @Test01_04 @Feature01
  Scenario: PUT CORRECT MOBILE NO. OR EMAIL IN USERNAME EDIT BOX THEN AFTER CLICKING CONTINUE CHECK PASSWORD EDIT BOX IS POPULATED OR NOT
    Given  Launch Edge browser
    Then   Maximize the window
    Then   Navigate to amazon home page
    Then   click on the sign-in button
    When  sign page appears put correct mobile number
    And   click continue button
    Then  verify password filling page is populated or not
    And   Close browser

  @Scenario01 @Test01_05 @Feature01
  Scenario: PUT INCORRECT MOBILE NO. OR EMAIL IN USERNAME EDIT BOX AND AFTER CLICKING CONTINUE CAPTURE THE ERROR MESSAGE
    Given  Launch Edge browser
    Then   Maximize the window
    Then   Navigate to amazon home page
    Then   click on the sign-in button
    When   sign page appears put incorrect mobile number
    And    click continue button
    Then   capture the error message
    And    Close browser

  @Scenario01 @Test01_06 @Feature01
  Scenario: PUT CORRECT MOBILE NO. OR EMAIL AND PASSWORD THEN CHECK LOGIN IS SUCCESSFUL OR NOT
    Given  Launch Edge browser
    Then   Maximize the window
    Then   Navigate to amazon home page
    Then   click on the sign-in button
    When   sign page appears put correct mobile number
    And    click continue button
    Then   put correct password and click sign in button
    And    verify login is successful or not
    And    Close browser

  #Scenario.02.Search functionality check
  @Scenario02 @Test02_01 @Feature01
  Scenario: OPEN AMAZON HOME PAGE AND CHECK SEARCH EDIT BOX IS PRESENT AND IS EMPTY BY DEFAULT OR NOT
    Given  Launch Edge browser
    Then   Maximize the window
    Then   Navigate to amazon home page
    When   home page appears check search box is enabled or not
    And    check search box is empty by default or not
    Then   Close browser

  @Scenario02 @Test02_02 @Feature01
  Scenario: CHECK SEARCH BUTTON IS DISPLAYED AND ENABLED
    Given  Launch Edge browser
    Then   Maximize the window
    Then   Navigate to amazon home page
    When   home page appears check search button is enabled or not
    Then   Close browser

  @Scenario02 @Test02_03 @Feature01
  Scenario: PUT KEYWORD "WATCHES" THEN AFTER CLICKING SEARCH BUTTON VERIFY AND CHECK THE TITLE WITH CONTAINS "WATCHES"
    Given  Launch Edge browser
    Then   Maximize the window
    Then   Navigate to amazon home page
    And    locate search box and type "Watches"
    Then   check the title contains "Watches" or not
    And    Close browser

  @Scenario02 @Test02_04 @Feature01
  Scenario: CHECK SEARCHING IS ALLOWED WITH INCORRECT SPELLING OR NOT
    Given  Launch Edge browser
    Then   Maximize the window
    Then   Navigate to amazon home page
    And    locate search box and type "Watcs"
    Then   check the title contains "Watcs" or not
    Then   print "scenario 2 passed"
    And    Close browser

  #Scenario.03.Add to cart functionality check and also check if user is able to add 10 items in cart
  @Scenario03 @Test03_01 @Feature01
  Scenario:OPEN AMAZON HOME PAGE AND CHECK CART BUTTON IS ENABLED
    Given  Launch Edge browser
    Then   Maximize the window
    When   Navigate to amazon home page
    Then   check cart button is enabled
    And    Close browser

  @Scenario03 @Test03_02 @Feature01
  Scenario:OPEN AMAZON HOME PAGE AND CHECK DEFAULT CART VALUE IS 0
    Given  Launch Edge browser
    Then   Maximize the window
    When   Navigate to amazon home page
    Then   check default value is zero
    And    Close browser

  @Scenario03 @Test03_03 @Feature01
  Scenario:  OPEN AMAZON HOME PAGE SEARCH FOR ANY PRODUCT,CLICK THE FIRST PRODUCT AND CHECK ADD TO CART BUTTON IS ENABLED
    Given  Launch Edge browser
    Then   Maximize the window
    When   Navigate to amazon home page
    Then   Input "java" in search box
    And    Click on first product visible
    Then   Check Add to cart button is enabled
    And    Close browser

  @Scenario03 @Test03_04 @Feature01
  Scenario: SEARCH FOR "realme watch s pro" AND "java" ADD FIRST 5 PRODUCTS OF EACH AND VERIFY 10 PRODUCTS ADDED IN CART OR NOT
    Given  Launch Edge browser
    Then   Maximize the window
    When   Navigate to amazon home page
    #Then   Search for "realme watch s pro"
    #And    add to cart first five products
    #And    verify the total numbers of products added is 5 or not
    #Then   Search for "java"
    #And    add to cart first five product
    #Then   verify the total numbers of products added is 10 or not
    And    Close browser

  #Scenario.04.Check for all categories such as electronics/home
  @Scenario04 @Test04_01 @Feature01
  Scenario: VERIFY BEST SELLERS CATEGORY IS ENABLED ALSO CLICK IT AND VERIFY SAME CATEGORY PAGE OPENS
    Given  Launch Edge browser
    Then   Maximize the window
    When   Navigate to amazon home page
    Then   check best sellers category is enabled
    When   click on best sellers card category
    Then   verify the title of the page which would contain "Amazon.in Bestsellers"
    And    Close browser

  @Scenario04 @Test04_02 @Feature01
  Scenario: VERIFY MOBILES CATEGORY IS ENABLED ALSO CLICK IT AND VERIFY SAME CATEGORY PAGE OPENS
    Given  Launch Edge browser
    Then   Maximize the window
    When   Navigate to amazon home page
    Then   check mobiles category is enabled
    When   click on mobiles card category
    Then   verify the title of the page which would contain "Mobile Phones"
    And    Close browser

  @Scenario04 @Test04_03 @Feature01
  Scenario: VERIFY CUSTOMER SERVICE CATEGORY IS ENABLED ALSO CLICK IT AND VERIFY SAME CATEGORY PAGE OPENS
    Given  Launch Edge browser
    Then   Maximize the window
    When   Navigate to amazon home page
    Then   check customer service category is enabled
    When   click on customer service card category
    Then   verify the title of the page which would contain "Help - Amazon Customer Service"
    And    Close browser

  @Scenario04 @Test04_04 @Feature01
  Scenario: VERIFY ELECTRONICS  CATEGORY IS ENABLED ALSO CLICK IT AND VERIFY SAME CATEGORY PAGE OPENS
    Given  Launch Edge browser
    Then   Maximize the window
    When   Navigate to amazon home page
    Then   check electronics category is enabled
    When   click on electronics card category
    Then   verify the title of the page which would contain "Electronics Store"
    And    Close browser

  @Scenario04 @Test04_05 @Feature01
  Scenario: VERIFY FASHION CATEGORY IS ENABLED ALSO CLICK IT AND VERIFY SAME CATEGORY PAGE OPENS
    Given  Launch Edge browser
    Then   Maximize the window
    When   Navigate to amazon home page
    Then   check fashion category is enabled
    When   click on fashion card category
    Then   verify the title of the page which would contain "Amazon Fashion"
    And    Close browser

  @Scenario04 @Test04_06 @Feature01
  Scenario: VERIFY TODAY'S DEAL CATEGORY IS ENABLED ALSO CLICK IT AND VERIFY SAME CATEGORY PAGE OPENS
    Given  Launch Edge browser
    Then   Maximize the window
    When   Navigate to amazon home page
    Then   check today's deal category is enabled
    When   click on today's deal card category
    Then   verify the title of the page which would contain "Amazon.in - Today's Deals"
    And    Close browser


      #Scenario.05.Add to wishlist functionality check
  @Scenario05 @Test05_01 @Feature01
  Scenario:  OPEN AMAZON HOME PAGE SEARCH FOR ANY PRODUCT,CLICK THE FIRST PRODUCT AND CHECK WISHLIST IS ENABLED
    Given  Launch Edge browser
    Then   Maximize the window
    When   Navigate to amazon home page
    Then   Input "java" in search box
    And    Click on first product visible
    Then   Check wishlist is enabled
    And    Close browser

  @Scenario05 @Test05_02 @Feature01
  Scenario: CLICK ON FIRST PRODUCT VISIBLE, ADD THE PRODUCT TO WISHLIST AND VERIFY THE ERROR
    Given  Launch Edge browser
    Then   Maximize the window
    When   Navigate to amazon home page
    Then   Input "java" in search box
    And    Click on first product visible
    Then   Add the product to wishlist
    And    capture the reason for not adding it to wishlist
    And    Close browser

  #Scenario.06.Check for product rating,find highest rated product and add it to cart
  @Scenario06 @Test06_01 @Feature01
  Scenario: SEARCH FOR ANY PRODUCT IN AMAZON HOME PAGE AND CHECK SORT BY DROPDOWN IS ENABLED OR NOT
    Given  Launch Edge browser
    Then   Maximize the window
    When   Navigate to amazon home page
    Then   Input "Data Science Books" in search box
    Then   verify sort by dropdown is enabled or not
    And    Close browser

  @Scenario06 @Test06_02 @Feature01
  Scenario:SEARCH FOR ANY PRODUCT IN AMAZON HOME PAGE AND CHECK TOTAL NUMBER OF OPTIONS AVAILABLE IN SORT BY DROPDOWN
    Given  Launch Edge browser
    Then   Maximize the window
    When   Navigate to amazon home page
    Then   Input "Data Science Books" in search box
    And    verify the number of options available
    And    Close browser

  @Scenario06 @Test06_03 @Feature01
  Scenario: SEARCH FOR ANY PRODUCT IN AMAZON HOME PAGE AND CHECK "Avg. Customer Review" OPTION IS AVAILABLE IN SORT BY DROPDOWN
    Given   Launch Edge browser
    Then    Maximize the window
    When    Navigate to amazon home page
    Then    Input "Data Science Books" in search box
    Then    check "Avg. Customer Review" option is enabled or not
    And     Close browser

  @Scenario06 @Test06_04 @Feature01
  Scenario:SORT THE PRODUCT BY "Avg. Customer Review" AND ADD THE FIRST PRODUCT TO WISHLIST AND VERIFY THE NUMBER OF PRODUCTS ADDED
    Given  Launch Edge browser
    Then   Maximize the window
    When   Navigate to amazon home page
    Then   Input "Data Science Books" in search box
    Then   sort the product by "Avg. Customer Review"
    And    click on the first product
    Then   Add the product to wishlist
    Then   verify "1" item added in the wishlist
    And    Close browser

  @Scenario06 @Test06_05 @Feature01
  Scenario:VERIFY AND GET THE NAME OF THE PRODUCT ADDED IN WISHLIST
    Given  Launch Edge browser
    Then   Maximize the window
    When   Navigate to amazon home page
    Then   Input "Data Science Books" in search box
    Then   sort the product by "Avg. Customer Review"
    And    click on the first product
    Then   Add the product to wishlist
    And    print the name of the product added
    And    Close browser

