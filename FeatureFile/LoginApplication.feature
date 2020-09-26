Feature: 
Login to Guru99 Bank Application

Background: 
  Given User navigates to demo app login page


Scenario: User login with correct credentials
When User enters user name as mngr286835
And User enters the pass as qygYvYh
And User clicks login button
Then User successfully logins to application

Scenario Outline: User login with correct credentials
When User enters user name as <user name>
And User enters the pass as <password>
And User clicks login button
Then User successfully logins to application

Examples:
| user name | password |
| dgasjdshff |fshhgjghh |
| trty6tsdd | hfjyfgfcdg |
| treyrthgfdz | ertgertf |
| mngr286835 | qygYvYh |

