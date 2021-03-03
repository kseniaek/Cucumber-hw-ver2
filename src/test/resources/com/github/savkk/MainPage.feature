Feature: Otus main page

  @test_positive
  Scenario Template: Go to the page with the list of courses
    When Click to point of menu "<menuPointName>"
    And Click to point of dropdown "<courseName>"
    Then Page with header "<courseName>" opened
    Examples:
      |menuPointName|courseName        |
      |Курсы        |Тестирование      |
      |Курсы        |Программирование  |
      |Курсы        |Управление        |
      |Курсы        |Инфраструктура    |

  @test_positive
  Scenario Template: Go to the page with calendar
    When Click to point of menu "<menuPointName>"
    And Click to point of dropdown "<dropdownPointName>"
    Then Page with title "<pageTitle>" opened
    Examples:
      |menuPointName |dropdownPointName        |pageTitle             |
      |События       |Календарь мероприятий    |Календарь мероприятий |

  @test_positive
  Scenario: Go to the page with information for teachers
    When Click to point of menu "Преподавателям"
    And Click to point of dropdown "Наши преподаватели"
    #Then Page with header "Преподаватели" opened

  @test_positive
  Scenario: Go to the page with information for companies
    When Click to point of menu "Компаниям"
    And Click to point of dropdown "Услуги компаниям"
    Then Page with title "OTUS готовит" opened

  @test_positive
  Scenario Template: Go to the course page from blocks
    When Click to "<courseName>" of menu "<coursesBlocks>"
    Then Page with header "<courseName>" opened
    Examples:
      |coursesBlocks   |courseName       |
      |Популярные курсы|Scala-разработчик|

  @test_positive
  Scenario Template: Go to the course page from blocks
    When Click to "<courseName>" of menu "<coursesBlocks>"
    Then Page with header "<courseName>" opened
    Examples:
      |coursesBlocks   |courseName                    |
      |Специализации   |Специализация Java-разработчик|

