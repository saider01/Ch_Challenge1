#Autor: Saider Lagares
@stories
Feature: Challenge1
  As a user, I want to create a new user at Utest page
  @scenario1
  Scenario: Create a new user
    Given that Antonio wants to create a new user at Utest
    When he fill the form to create a new user
    | strName | strLastName | strEmail                 | strPassword         |
    | Camilo  | Ferreira    |camilofferreira4293@dfdf.com| MyUltraSafeKey039134|
    Then he finish and send the form
    | strSearch|
    | First, please check your email inbox|
