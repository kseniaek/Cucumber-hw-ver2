Feature: Otus login page

  @test_negative
Scenario: an attempt to log in with invalid data
And Click to button "Вход"
And Fill in the field with placeholder "Электронная почта"
And Fill in the field with placeholder "Введите пароль"
And Click to button "Войти"
Then Tooltip with text "Такая пара логин/пароль не существует"