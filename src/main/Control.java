package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Control {
	private Empresa emp;
    Scanner scanner = new Scanner(System.in);
    
    public Control(Empresa emp) {
    	this.emp = emp;
    }
    
    public void addEmployer() {
		ArrayList<Projeto> aux = new ArrayList<Projeto>();
		int number;
		//Incluir um novo funcionario, parametros:
			try {
			while(true) {
				System.out.print("Digite o numero desse funcionario: ");
				number = scanner.nextInt();
				scanner.nextLine();
				if (emp.consutEmployer(number) == false) {
					break;
				}else {
					System.err.println("Numero de funcionario existente, insira outro");
				}			
			}			
				
			System.out.print("Digite o nome do funcionario: ");
				String name = scanner.nextLine();
			System.out.print("Digite o endereco do funcionario: ");
				String addr = scanner.nextLine();
			System.out.print("Digite o numero de dependentes desse funcionario: ");
				int dependents = scanner.nextInt();
				scanner.nextLine();
			//Incluir projetos:
			System.out.println("--- Criando os projetos agora ---");
			int numberProjects;
			while(true) {
				System.out.print("Digite o numero de projetos que deseja criar para esse funcionario: ");
					numberProjects = scanner.nextInt();
					scanner.nextLine();
				if(numberProjects > 5){
					System.out.print("Nenhum funcionario pode ter mais de 5 projetos");
				}else {
					break;
				}
			}
			
			for (int i=0; i < numberProjects; i++) {
				System.out.print("Digite o id desse projeto: ");
					int id = scanner.nextInt();
					scanner.nextLine();
				System.out.print("Digite o nome desse projeto: ");
					String nameProject = scanner.nextLine();
				System.out.print("Digite a quantidade de horas nesse projeto: ");
					int hours = scanner.nextInt();
					scanner.nextLine();
				aux.add(new Projeto(id, nameProject, hours));
					
			}
			//entrar com esses dados e criar funcionario
			Funcionario f = new Funcionario(number, name, addr, dependents, aux);
			emp.addFuncionario(f);
		}catch (Exception e) {
			
			System.err.println(e.getMessage());
		}
}
    
    
    public void addProject() {
    	int number;
    	//Incluir novos projetos para um funcionario:
		System.out.print("Digite o numero desse funcionario: ");
			number = scanner.nextInt();
			scanner.nextLine();
			//if number nao exist, mensagem de erro
		if(emp.consutEmployer(number) == false){
			System.err.println("Esse funcionario n�o existe");
		}else {
			Funcionario f = emp.getEmployer(number);
			//Imprimir os dados do funcionario e a relacao de projetos que ele trabalha
			f.description();
			if(f.getProjects().size() <= 5){
				System.out.print("Digite o numero de projetos que deseja criar para esse funcionario: ");
					int numberProjects = scanner.nextInt();
					scanner.nextLine();
				for (int i=0; i < numberProjects; i++) {
					System.out.print("Digite o id desse projeto: ");
						int id = scanner.nextInt();
						scanner.nextLine();
					System.out.print("Digite o nome desse projeto: ");
						String nameProject = scanner.nextLine();
					System.out.print("Digite a quantidade de horas nesse projeto: ");
						int hours = scanner.nextInt();
						scanner.nextLine();
					f.addProjeto(new Projeto(id, nameProject, hours));
				}
			}
			//se projetos < 5, imprimir adicionar novo projeto:
			else{
				System.err.print("O funcionario ja possui 5 projetos");
			}
		}
    }
    
    public void removeProject() {
    	//Excluir projetos de um funcionario:
		System.out.print("Digite o numero desse funcionario: ");
			int number = scanner.nextInt();
			scanner.nextLine();
		//if number nao exist, mensagem de erro
		if(emp.consutEmployer(number) == false){
			System.err.println("Esse funcionario nao existe");
		}else {
			Funcionario f = emp.getEmployer(number);
			//Imprimir os dados do funcionário e a relação de projetos que ele trabalha
			f.description();
			//if existem projetos, selecionar projeto
			if(f.getProjects().size() > 0){
			System.out.print("Digite o numero do projeto a ser excluido: ");
				int projectToExclude = scanner.nextInt();
				scanner.nextLine();
				f.delProjeto(projectToExclude);
			}
			//else esse funcionario nao possui projetos, exit
			else{
				System.err.print("O funcionario nao possui projetos");
			}
		}    
   }
    
    
   public void removeEmployerZero() {
	   ArrayList<Funcionario> employees = emp.getEmployees();
	   Funcionario f;
	   for(int i = 0 ; i < employees.size();i++)
	   {
		   f = employees.get(i);
		   if (f.getProjects().size() == 0)
				   employees.remove(f);
	   }
   }
   
   public void consultEmployer() {
	   
	   	//Exibir um funcionario:
 		System.out.print("Digite o numero desse funcionario: ");
 			int number = scanner.nextInt();
 			scanner.nextLine();
 		//if number nao exist, mensagem de erro
 		if(emp.consutEmployer(number) == false){
 			System.err.println("Esse funcionario nao existe");
 		}else {
 			Funcionario f = emp.getEmployer(number);
 			//Imprimir os dados do funcionario e a relacao de projetos que ele trabalha
 			f.description();
 		}
   }    
   
   public void contraCheque() {
	   ArrayList<Funcionario> employees = emp.getEmployees();
	   for(Funcionario f : employees) {
		   int totalHours = 0;
		   
		   for(int i = 0 ; i < f.getProjects().size(); i++)
			   totalHours+= f.getProjects().get(i).getHours();
		   double salary = totalHours*25.00 + f.getDependent()*25;
		   double INSS = salary*0.085;
		   double impostoRenda = salary*0.15;
		   double liquidSalary = (salary - (INSS+impostoRenda));
		   
		   f.description();
		   System.out.println("\n\t Total de Horas: " + totalHours + "\n\t Salario Bruto: R$" + salary + "\n\t Desconto INSS: R$" + INSS + "\n\t Impoosto de Renda: R$" + impostoRenda + "\n\t Salario Liquido: R$" + liquidSalary);
	   }
   }
}
