Feature: Book search
  To allow a customer to find his favourite books quickly, the library must offer multiple ways to search for a book.
  @typeA
  Scenario: TC01 - Search author of books
    Given check before preforming with value '1'
    Given a book with the title 'One good book', written by 'Anonymous'
    When the customer searches for books titled 'One good book'
    Then book should have been found with author 'Anonymous'

  @typeA @typeB
  Scenario: TC02 - Search author of books
    Given check before preforming with value '1'
    Given a book with the title 'One bad book', written by 'No Name'
    When the customer searches for books titled 'One bad book'
    Then book should have been found with author 'No Name'
    Then assertion

  @typeA @typeB
  Scenario: TC04 - Search author of books
    Given check before preforming with value '1'
    Given a book with the title 'One bad book', written by 'No Name'
    When the customer searches for books titled 'One bad book'
    Then book should have been found with author 'No Name'

  @typeA @typeB
  Scenario: TC03 - Search author of books
    Given check before preforming with value '1'
    Given a book with the title 'One normal book', written by 'John'
    When the customer searches for books titled 'One normal book'
    Then book should have been found with author 'John'

#  Scenario Outline: TC04 - Search author of book by using variable
#    Given check before preforming with value '3'
#    Given these books with the title "<title>", written by "<author>"
#    When the customer searches for books titled '<title>'
#    Then book should have been found with author '<author>'
#
#  Examples:
#    | title                     | author       |
#    | How to get a magic        | Clack Porry  |
#    | Magic with kindness       | Harry Taylor |
#
#  Scenario: TC05 - Search author of book by using variable
#    Given check before preforming with value '3'
#    Given these books
#      | title                     | author       |
#      | How to get a magic        | Clack Porry  |
#      | Magic with kindness       | Harry Taylor |


