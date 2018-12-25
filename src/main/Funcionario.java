package main;

import java.util.ArrayList;

public class Funcionario{
	private int number;
	private String name;
	private String address;
	private int dependent;
	private ArrayList<Projeto> projects;
		
	public ArrayList<Projeto> getProjects() {
		return projects;
	}

	public void setProjects(ArrayList<Projeto> projects) {
		this.projects = projects;
	}

	public Funcionario(int number, String name, String address, int dependent) {
		this.number = number;
		this.name = name;
		this.address = address;
		this.dependent = dependent;
		this.projects = new ArrayList<Projeto>(5);
	}
	
	public Funcionario(int number, String name, String address, int dependent, ArrayList<Projeto> projects) {
		this.number = number;
		this.name = name;
		this.address = address;
		this.dependent = dependent;
		this.projects = projects;
	}

	public void addProjeto(Projeto p) {
		try {
			if (projects.size() <= 1) {
				projects.add(p);
			}else {
				System.err.println("The employee already has 5 projects and can't have more than it.");
			}
		} catch (Exception e) {
			System.err.println("The employee already has 5 projects and can't have more than it.");
		}		
	}
	
	public void delProjeto(int n) {
		projects.remove(n);
	} 
	
	public void printProjetos() {
		System.out.println("\t\tExibindo os "+ projects.size()+ " Projetos");
		for(Projeto p : projects) {
			System.out.println("\n\t ID: " + p.getId()+ "\n\t Nome do Projeto: " + p.getName()+ "\n\t Horas Semanais: " + p.getHours());			
		}
	}
	
	public void description() {
		System.out.println("\n\t Nome: " + name  + "\n\t Numero: " + number + "\n\t Endereco: " + address +"\n\t Dependentes: " +  dependent);
		printProjetos();
	}

	public void setNumber(int n) {
		this.number = n;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public void setAddress(String e) {
		this.address = e;
	}
	
	public void setDependent(int d) {
		this.dependent = d;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getDependent() {
		return dependent;
	}

}