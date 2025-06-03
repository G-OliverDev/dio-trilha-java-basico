# Métodos

Todas as ações das aplicações são consideradas métodos.

## Critério de nomeação dos métodos

Esses critérios não são obrigatórios, mas é recomendável que sejam seguidos, pois essas convenções facilitam a vida dos programadores ao trabalharem em códigos de forma colaborativa.

- Deve ser nomeado como verbo
- Seguir o padrão camelCase (Todas as letras minúsculas com exceção da primeira letra da segunda palavra)

## Critério de definição dos métodos

1. **Qual a proposta principal do método?** Você deve se perguntar constantemente até compreender a real finalidade do mesmo.
2. **Qual o tipo de retorno esperado após executar o método?** Você deve analisar se o método será responsável por retornar algum valor ou não.
3. **Quais os parâmetros serão necessários para execução do método?** Os métodos as vezes precisão de argumentos como critérios para execução.
4. **O método possui o risco de apresentar alguma exceção?** Exceções são comuns na execução de métodos, as vezes é necessário prever e tratar a possível existência de uma exceção.
5. **Qual a visibilidade do método?** Será necessário que o método seja visível a toda aplicação, somente em pacotes, através de herança ou somente a nível da própria classe?

