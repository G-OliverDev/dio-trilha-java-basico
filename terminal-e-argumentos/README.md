# Terminal e argumentos

Com a JVM devidamente configurada, nós podemos criar um executável do nosso programa e disponibilizar o instalador para qualquer sistema operacional.

## Argumentos

Quando executamos uma classe que contenha o método main, o mesmo permite que passamos um array `[]` de argumentos do tipo String. Logo, podemos após a definição da classe a ser executada, informar estes parâmetros, exemplo:

```
java MinhaClasse argumentoUm argumentoDois
```