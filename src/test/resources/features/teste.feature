#language: pt
  Funcionalidade: Realizar login no site senai www.senai.com
    Cenário: Realizar login no site senai www.senai.com
      Dado que estou na tela de login
      E digito no campo usuário o nome "bruno"
      E digito no campo senha a senha "1234"
      Quando clico no botão login
      Então a mensagem sucesso é exibida

      Cenário: Teste de calculadora
        Dado que estou na tela de inicio
        E digito o numero 2
        E digito a funcao de somar
        E digito o numero 3
        Quando clico no botão de igual
        Então o resultado 5 é mostrado