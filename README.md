# Desafio 1 Java Spring Professional - DevSuperior

Esse projeto consiste no primeiro desafio da formação Java Spring Professional da plataforma Devsuperior.

## Tecnologias

- Java 21
- Spring Boot 4.1.0
- Maven

## Objetivo

O objetivo da aplicação é calcular o valor total de um pedido, considerando uma porcentagem de desconto e o frete.
O cálculo do valor total do pedido consiste em aplicar o desconto ao valor básico do pedido, e adicionar o valor do frete.

| Valor básico do pedido               | Frete |
|--------------------------------------|---:|
| Abaixo de R$ 100.00                  | R$ 20.00 |
| De R$ 100.00 até R$ 200.00 exclusive | R$ 12.00 |
| R$ 200.00 ou mais                    | Grátis |

## Pedido

Um pedido é representado pelo objeto especificado abaixo:

- `code`: Integer
- `basic`: Double
- `discount`: Double

## Classes de serviço

O projeto possui duas classes de serviço, cada uma com sua responsabilidade, conforme especificado abaixo:

| OrderService | ShippingService |
|---|---|
| `+ total(order : Order) : double` | `+ shipment(order : Order) : double` |

`OrderService` é responsável por operações referentes a pedidos.

`ShippingService` é responsável por operações referentes a frete.

## Entrada de dados

A saída será mostrada no log do terminal da aplicação, que pedirá como entrada de dados:

- código
- valor básico
- porcentagem de desconto

## Competências avaliadas

- Criação de projeto Spring Boot
- Configuração de componentes Spring e injeção de dependência
- Implementação de projeto de componentes