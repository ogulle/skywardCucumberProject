Feature: Skyward Student List
  Agile story: User should be able to see number of school students.

  Background: User should be on main page
    Given User is on main page

    Scenario: Student List Verification
      When User search Houston list
      Then User should see number of Houston students




