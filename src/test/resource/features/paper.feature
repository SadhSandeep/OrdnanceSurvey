Feature: Paper
  @sanity
  Scenario: User should be able to open a browser
  When I enter a url
  Then I should be in home page


   @wip
   Scenario:User should be add  two maps in shopping cart

     Given I am in all papermap  page
     When I add two products in shopping cart
     Then I should be view these two produts in shopping cart page
