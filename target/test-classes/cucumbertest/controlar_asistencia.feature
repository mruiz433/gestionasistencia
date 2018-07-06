Feature: Controlar asistencia
  Scenario: Alumno logado
    Given Profesor logado en el sistema
    And Alumno logado
    When Profe mira lista alumnos
    Then Mostrar alumno presente