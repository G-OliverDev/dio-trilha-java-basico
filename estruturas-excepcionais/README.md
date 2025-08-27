# Estruturas excepcionais

## Exceções

Ao executar o código Java, diferentes erros podem acontecer: erros de codificação feitos pelo programador, erros devido a entrada errada ou outros imprevistos.

Quando ocorre um erro, o Java normalmente para e gera uma mensagem de erro. O termo técnico para isso é: Java lançará uma **exceção**

De forma interpretativa em Java, um erro é algo irreparável, a aplicação trava ou é encerrada drasticamente. Já exceções é um fluxo inesperado da nossa aplicação.

## Tratamento de exceções

A instrução `try` permite que você defina um bloco de código para ser testado quanto a erros enquanto está sendo executado.

A instrução `catch` permite definir um bloco de código a ser executado, caso ocorra um erro no bloco `try`.

A instrução `finally` permite definir um bloco de código a ser executado independente de ocorrer um erro ou não.

## Hierarquia das exceções

A linguagem Java dispõe de uma variedade de classes que representam exceções, e estas classes estão organizadas em uma hierarquia denominadas **Checked and Unchecked Exceptions**.