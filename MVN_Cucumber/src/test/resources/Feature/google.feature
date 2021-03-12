Feature: feature to test google search

Scenario: validate google search

Given browser open
And user is in google search
When user enter text in edit box
And hits the enter
Then user is navigate search result
