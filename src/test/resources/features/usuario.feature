#Autor: @Jose Luis Garcia, Date 04 Agosto 2022
  @stories
  Feature: Inicio de sesion de usuario Messi
    @scenario1
    Scenario: Inicio de sesion en Utest con el usuario messi
      Given Espera que los datos esten bien
      When Ingresar los datos correctamente
        | strUsuario       | strClave |
        | messi1@gmail.com | PepitoPerez12345 |
      Then Iniciar sesion exitosamente en Utest