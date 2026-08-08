package com.devsuperior.Desafio1;

import com.devsuperior.Desafio1.entities.Order;
import com.devsuperior.Desafio1.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DesafioComponentesEInjecaoDeDependenciaApplication implements CommandLineRunner {

	@Autowired
	private OrderService service;

	public static void main(String[] args) {
		SpringApplication.run(DesafioComponentesEInjecaoDeDependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Código: ");
		int code = scan.nextInt();

		System.out.print("Valor básico: ");
		double basic = scan.nextDouble();

		System.out.print("Porcentagem de desconto: ");
		double discount = scan.nextDouble();

		Order order = new Order(code, basic, discount);

		System.out.println("Pedido código " + order.getCode());
		System.out.printf("Valor total: R$ %.2f\n", service.total(order));

	}
}
