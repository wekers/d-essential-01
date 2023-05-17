package com.devsuperior.desafioessential01.app;

import com.devsuperior.desafioessential01.entities.Order;
import com.devsuperior.desafioessential01.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class DesafioEssential01Application implements CommandLineRunner {
	/* anotação de injeção de dependência */
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioEssential01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.print("\nSistema de Pedido inicializado..\n\n");
		OrderInput(); // chama método de entrada

	}

	/* método para inserir dados do pedido*/
	public void OrderInput(){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com os Dados do Pedido\n");
		System.out.print("Código: ");
		Integer code = sc.nextInt();
		System.out.print("Valor base: ");
		double basic = sc.nextDouble();
		System.out.print("Desconto %: ");
		double discount = sc.nextDouble();
		sc.close();

		/* chama o método com os argumentos da ordem */
		OrderOutput(new Order(code, basic, discount));

	}

	/* imprime os dados e calculados */
	public void OrderOutput(Order order){
		System.out.println("\nSAÍDA: \n");
		System.out.printf("Pedido código %d%n", order.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order));
		System.exit(0);
	}
}
