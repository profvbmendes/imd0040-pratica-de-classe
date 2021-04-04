# Avaliação da terceira unidade - Projeto final

Universidade Federal do Rio Grande do Norte  
Instituto Metrópole Digital
IMD0040 - Linguagem de Programação 2 - 2020.2 35N34  
Professor: Vinicius Mendes

O prazo para entrega é 15/04/2021 às 23:59.

## Objetivo

Avaliar a aplicação dos conceitos da linguagem de programação Java e do paradigma de programação orientada a objetos.

## Escopo

Implementar um sistema de cadastro de compradores e vendedores onde é possível registrar um catálogo de produtos bem como compras realizadas. As compras podem ser realizadas por diferentes formas de pagamento. 

## Conceitos do sistema

Forma de Pagamento
- PIX
  Instantaneamente debita o valor da conta do comprador e deposita na conta do vendedor.
- Boleto
  Verifica se a data de vencimento do boleto não foi excedida.
  Instantaneamente debita o valor da conta do comprador e adiciona nos valores a receber do vendedor, descontado do valor para emissão do boleto.
- Débito
  Instantaneamente debita o valor da conta do comprador e deposita na conta do vendedor, descontado da taxa percentual de cobrança da operadora do cartão.
- Credito
  Coloca o valor na lista de valores a pagar do comprador e adiciona nos valores a receber do vendedor, descontado da taxa percentual de cobrança da operadora do cartão.

Compra/Venda
- CPF Comprador
- CNPJ do Vendedor
- Forma de Pagamento
- Itens

Comprador
- nome
- cpf
- saldo da conta
- valores a pagar
- compras realizadas

Vendedor
- nome
- cnpj
- saldo da conta
- valores a receber
- vendas realizadas
- catalogo de produtos

Produto
- codigo
- nome
- precoUnitario

## Requisitos:

As funcionalidades de cadastro de vendedores, compradores e produtos poderão ser realizadas através da criação das instâncias através de construtores e respectiva inclusão nas coleções. Não é necessário implementar interface gráfica para esse cadastro. A interface gráfica será utilizada apenas para cadastro das comprar e exibição de dados dos compradores e vendedores. 

1) O sistema deve possuir uma interface gráfica para cadastrar compras
2) A interface gráfica deve implementar uma estrutura de carrinho de compras que vai sendo preenchido à medida que o usuário inclui os itens
3) A interface gráfica deve permitir imprimir os dados de um comprador com base no seu CPF
4) A interface gráfica deve permitir imprimir os dados de um vendedor com base no seu CNPJ
5) Se a data de validade do boleto já tiver expirado, o sistema deve lançar uma exceção
6) As exceções devem ser tratadas com mensagens amigáveis aos usuários

## Forma de avaliação

Este projeto contará como 10 pontos da terceira unidade. A forma de avaliação será:

1) Cada requisito satisfeito valerá 1 ponto
2) Cada um dos conceitos abaixo aplicado corretamente valerá 1 ponto:
- Utilize uma classe abstrata FormaPagamento com um método abstrato para tratar o pagamento.
- Crie uma classe concreta para cada forma de pagamento que herde de FormaPagamento e implemente o método abstrato.
- Utilize corretamente generics no uso das coleções da Java Collection.
- Utilize corretamente o pacote java.time
- Utilize corretamente o tipo especial Enum
- Utilize pelo menos uma annotation de marcação
