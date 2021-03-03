Feature: Otus main page

  @test
  Scenario Template: Go to the page with the list of courses
    And Click to point of menu "<menuPointName>"
    And Click to point of dropdown "<courseName>"
    Then Page with header "<courseName>" opened
    Examples:
      |menuPointName|courseName        |
      |Курсы        |Тестирование      |
      |Курсы        |Программирование  |
      |Курсы        |Управление        |
      |Курсы        |Инфраструктура    |

  @test
  Scenario Template: Go to the page with calendar
    And Click to point of menu "<menuPointName>"
    And Click to point of dropdown "<dropdownPointName>"
    Then Page with title "<pageTitle>" opened
    Examples:
      |menuPointName |dropdownPointName        |pageTitle             |
      |События       |Календарь мероприятий    |Календарь мероприятий |

  @test
  Scenario: Go to the page with information for teachers
    And Click to point of menu "Преподавателям"
    And Click to point of dropdown "Наши преподаватели"
    Then Page with header "Преподаватели" opened

  @test
  Scenario: Go to the page with information for companies
    And Click to point of menu "Компаниям"
    And Click to point of dropdown "Услуги компаниям"
    Then Page with title "OTUS готовит" opened

  @test
  Scenario Template: Go to the course page from blocks
    And Click to "<courseName>" of menu "<coursesBlocks>"
    Then Page with title "<courseName>" opened
    Examples:
      |coursesBlocks   |courseName         |
      |Популярные курсы|Administrator Linux|

  @test
  Scenario Template: Go to the course page from blocks
    And Click to "<courseName>" of menu "<coursesBlocks>"
    Then Page with header "<courseName>" opened
    Examples:
      |coursesBlocks   |courseName                     |
      |Специализации   |Специализация Machine Learning |

