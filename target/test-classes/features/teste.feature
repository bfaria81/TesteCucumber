#language: pt
  Funcionalidade: Realizar login no site senai www.senai.com
    Cenário: Realizar login no site senai www.senai.com
      Dado que estou na tela de login
      E digito no campo usuário o nome "bruno"
      E digito no campo senha a senha "1234"
      Quando clico no botão login
      Então a mensagem sucesso é exibida