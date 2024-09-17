
# Desafio - DIO - UML IPhone

Funcionalidades a Modelar

   1.Reprodutor Musical

    Métodos: tocar(), pausar(), selecionarMusica(String musica)

  2.Aparelho Telefônico

    Métodos: ligar(String numero), atender(), iniciarCorreioVoz()

  3.Navegador na Internet

    Métodos: exibirPagina(String url), adicionarNovaAba(), atualizarPagina()

# Objetivo

  1.Criar um diagrama UML que represente as funcionalidades descritas acima.

  2.Implementar as classes e interfaces correspondentes em Java (Opcional).


# 1. Diagrama

 ```mermaid
  classDiagram; 
    ReprodutorMusical <|-- Iphone
    AparelhoTelefonico <|-- Iphone
    Navegador <|-- Iphone

    class Iphone{
      +ligar(String numero)
      +atender()
      +iniciarCorreioVoz()
      +tocar()
      +pausar()
      +selecionarMusica(String musica)
      +exibirPagina(String url)
      +adicionarNovaAba()
      +atualizarPagina()
    }

    class ReprodutorMusical{
      +tocar()
      +pausar()
      +selecionarMusica(String musica)
    }
    class AparelhoTelefonico{
      +ligar(String numero)
      +atender()
      +iniciarCorreioVoz()
    }
    class Navegador{
      +exibirPagina(String url)
      +adicionarNovaAba()
      +atualizarPagina()
    }
```
    