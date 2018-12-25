package main;

import java.io.*;
import java.util.*;

import javax.swing.plaf.SliderUI;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		Empresa Emp;
		String cnpj,socialReason;
		System.out.println("Insert the cnpj");
		cnpj = scanner.nextLine();
		System.out.println("Insert the socialReason");
		socialReason = scanner.nextLine();
		Emp = new Empresa(cnpj, socialReason);
		
		System.out.println("Welcome to our intranet. Press enter to continue...\n");
		scanner.nextLine();
		menu(Emp);
		System.out.println("Programa encerrado.");
	}

	public static void menu(Empresa Emp) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		Control c = new Control(Emp);
		int opcao = 0;
		while(opcao != 7) {
			Thread.sleep(100);
			System.out.print(
			"\n\t -----Main Menu-----" +
			"\n\t 1. Incluir um novo funcionário" +
			"\n\t 2. Incluir novos projetos para um funcionário" +
			"\n\t 3. Excluir projetos de um funcionário" +
			"\n\t 4. Excluir funcionários que não trabalham em nenhum projeto" +
			"\n\t 5. Consultar um funcionário" +
			"\n\t 6. Imprimir contra-cheque" +
			"\n\t 7. Exit \n\n\t"
			);
			System.out.print("Opcao -> ");
			opcao = scanner.nextInt();
			System.out.print("\n");
	
			switch(opcao){
				case 1:
					c.addEmployer();
					break;
				case 2:
				   c.addProject();
				   break;
				case 3:
					c.removeProject();
					break;
				case 4:
					c.removeEmployerZero();
					System.out.print("Os funcionarios sem projetos foram apagados com sucesso!!");
					break;
				case 5:
					c.consultEmployer();
					break;
				case 6:
					c.contraCheque();
					break;
					
				case 7:
				   System.out.println("Obrigado por usar o nosso programa!");
				   break;
				default:
					System.out.println("Opção Invalida!");
					break;
		   }

			System.out.println("\n\t \n\n\t");
		}
	}
}

