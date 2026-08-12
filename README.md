# Desafio Componentes e injeção de dependência - Java Spring Professional

Projeto desenvolvido como parte do primeiro desafio da formação Java Spring Professional, da plataforma Devsuperior

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

<img width="143" height="102" alt="Image" src="https://github.com/user-attachments/assets/2c4d4d3d-86bf-4d35-8e0a-1f97fef3c617" />

## Classes de serviço

O projeto possui duas classes de serviço, cada uma com sua responsabilidade, conforme especificado abaixo:

<img width="574" height="71" alt="Image" src="https://github.com/user-attachments/assets/233298c6-3f03-4d5d-9901-f0933b38cd82" />

`OrderService` é responsável por operações referentes a pedidos.

`ShippingService` é responsável por operações referentes a frete.

## Entrada de dados

A saída será mostrada no log do terminal da aplicação, que pedirá como entrada de dados:

- Código
- Valor básico
- Porcentagem de desconto

## Critérios de avaliação

- Valor correto da saída do programa
- Projeto de componentes implementado corretamente

## Competências avaliadas

- Criação de projeto Spring Boot
- Configuração de componentes Spring e injeção de dependência
- Implementação de projeto de componentes