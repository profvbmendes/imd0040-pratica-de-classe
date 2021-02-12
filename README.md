# Prática de criação de classes

Universidade Federal do Rio Grande do Norte
Instituto Metrópole Digital
IMD0040 - Linguagem de Programação 2 - 2020.2 35N34
Professor: Vinicius Mendes

O objetivo é evoluir as classes vistas em sala de aula para criar um sistema que gerencie contas de um Banco. Para isso, execute os seguintes passos:

1. Modele uma conta. A ideia aqui é apenas modelar, isto é, só identifique que informações são importantes. Desenhe no papel tudo o que uma Conta tem e tudo o que ela faz. Ela deve ter o contato do titular (Contato), o número da conta (String), o número da agência (String), o saldo (double) e uma data de abertura (String). Além disso, ela deve fazer as seguintes ações: sacar(), depositar() e calculaRendimento(double taxa) para devolver o rendimento mensal dessa conta com base na taxa.

2. Transforme o modelo acima em uma classe Java e teste o seu funcionamento.

3. Implemente um método que exiba na tela todos os dados da conta corrente.

4. Crie dois objetos do tipo ContaCorrente com as mesmas informações. Como deve ser verificado se eles são iguais? Considere o número da conta e o número da agência  como atributos que identificam a conta.

5. Crie a classe banco que contenha uma coleção de contas diferentes entre si.

6. Substitua o tipo do campo data de abertura pelo um tipo java.util.LocalDate. Verifique na documentação do Java o funcionamento deste tipo: https://docs.oracle.com/en/java/javase/index.html.
