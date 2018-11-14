import.java.io.*;
import java.util.Vector<E>;

public class Main{
	
	public static void main(String[] args){
		int choiceentry = -1;
		System.out.println("Welcome to our intranet. Press enter to continue...\n");
		System.in.close();
		System.out.println("\n");
		Runtime.getRuntime().exec("clear");
		Scanner scanner = new Scanner(System.in);
		
		public void MainMenu() {
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

			while(choiceentry < 1 || choiceentry > 3){

					System.out.println("Enter \"1\", \"2\", \"3\", \"4\", \"5\", \"6\" or \"7\"");
					if(scanchoice.hasNextInt())
					choiceentry = scanchoice.nextInt();

			}

			 switch(choiceentry){
				case 1:
					//Incluir um novo funcionario, parametros:
					int number;
						System.out.print("Digite o numero desse funcionario: ");
					String name;
						System.out.print("Digite o nome do funcionario: ");
					String addr;
						System.out.print("Digite o endereco do funcionario: ");
					int dependents;
						System.out.print("Digite o numero de dependentes desse funcionario: ");
					//Incluir projetos:
					System.out.println("--- Criando o projeto agora ---");
					int numberProjects;
						System.out.print("Digite o numero de projetos que deseja criar para esse funcionario: ");
					if(numberProjects > 5){
						System.out.print("Nenhum funcionário pode ter mais de 5 projetos");
						break;
					}
					projects[numberProjects];
					for (i=0; i<numberProjects; i++) {
					int id;
						System.out.print("Digite o id desse projeto: ");
					String nameProject;
						System.out.print("Digite o nome desse projeto: ");
					int hours;
						System.out.print("Digite a quantidade de horas nesse projeto: ");
					projects[i].addElement(Projeto(id, nameProject, hours));
					}
					//entrar com esses dados e criar funcionário
					Funcionario(number, name, addr, dependents, projects[]);
					
				case 2:
				   //Incluir novos projetos para um funcionário:
					int number;
						System.out.print("Digite o numero desse funcionario: ");
					//if number nao exist, mensagem de erro
					if(Funcionario.number == NULL){
						System.out.println("Esse funcionario nao existe");
						break;
					}
					//Imprimir os dados do funcionário e a relação de projetos que ele trabalha
					System.out.print(
					"\n\t Nome: " + Funcionario.getName() +
					"\n\t Numero: " + Funcionario.getNumber() +
 					"\n\t Endereco: " + Funcionario.getAddress() +
					"\n\t Dependentes" + getDependent() + 
						//aqui devem ser impressos os projetos 
					"\n\t \n\n\t"
					);
					if(projects.length < 5){
						int numberProjects;
							System.out.print("Digite o numero de projetos que deseja criar para esse funcionario: ");
						projects[numberProjects];
						for (i=0; i<numberProjects; i++) {
						int id;
							System.out.print("Digite o id desse projeto: ");
						String nameProject;
							System.out.print("Digite o nome desse projeto: ");
						int hours;
							System.out.print("Digite a quantidade de horas nesse projeto: ");
						projects[i].addElement(Projeto(id, nameProject, hours));
						}
					}
					//se projetos < 5, imprimir adicionar novo projeto:
					else{
					System.out.print("O funcionário ja possui 5 projetos");
					}

				case 3:
					//Excluir projetos de um funcionário:
					int number;
						System.out.print("Digite o numero desse funcionario: ");
					//if number nao exist, mensagem de erro
					if(Funcionario.number == null){
						System.out.println("Esse funcionario nao existe");
						break;
					}
					//Imprimir os dados do funcionário e a relação de projetos que ele trabalha
					System.out.print(
					"\n\t Nome: " + Funcionario.getName() +
					"\n\t Numero: " + Funcionario.getNumber() +
 					"\n\t Endereco: " + Funcionario.getAddress() +
					"\n\t Dependentes" + getDependent() + 
						//aqui devem ser impressos os projetos 
					"\n\t \n\n\t"
					);					
					//if existem projetos, selecionar projeto
					if(projects.length != 0){
					int projectToExclude;
						System.out.print("Digite o numero do projeto a ser excluido: ");

					Funcionario.delProjeto(projectToExclude);
					}
					//else esse funcionario nao possui projetos, exit
					else{
						System.out.print("O funcionário nao possui projetos");
					}
				case 4:
					//Excluir todos os funcionários que não trabalham em nenhum projeto:
						Empresa.delFuncionario();
						System.out.print("Os funcionarios sem projetos foram apagados com sucesso!!");
				case 5:
					//Consultar um funcionário:
					int number;
						System.out.print("Digite o numero desse funcionario: ");
					//if number nao exist, mensagem de erro
					if(Funcionario.number == NULL){
						System.out.println("Esse funcionario nao existe");
						break;
					}
					//Imprimir os dados do funcionário e a relação de projetos que ele trabalha
					System.out.print(
					"\n\t Nome: " + Funcionario.getName() +
					"\n\t Numero: " + Funcionario.getNumber() +
 					"\n\t Endereco: " + Funcionario.getAddress() +
					"\n\t Dependentes" + getDependent() + 
						//aqui devem ser impressos os projetos 
					"\n\t \n\n\t"
					);
				case 6:
					//Imprimir contra-cheque de todos os funcionários
					//numero, nome, total de horas semanais, salario bruto(obs1), desconto do INSS(obs2), IR(obs3) e salario liquido
					
				case 7:
				   System.out.println("Obrigado por usar o nosso programa!");
				   break;
		   }			
		}
	}
}