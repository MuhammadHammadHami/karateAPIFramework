Feature: Test Get Users API
  Background:
    * configure ssl = true
    * url 'https://reqres.in/api'


    Scenario: Get All Users
      * path '/users?page=2'
      * method GET
      * status 200
      * print '=============================================='
      * print 'Get All Users'
      * print '=============================================='
      * print response