package main;

import java.util.ArrayList;

public class Empresa {
	private String cnpj;
	private String socialReason;
	private ArrayList<Funcionario> employees;
	
	public Empresa(String cnpj, String socialReason) {
		super();
		this.cnpj = cnpj;
		this.socialReason = socialReason;
		this.employees = new ArrayList<Funcionario>();
	}
	
	public boolean consutEmployer(int n) {
		for(Funcionario f : employees)
		{
			if(f.getNumber() == n)
				return true;
		}
		return false;
	}
	public Empresa(String cnpj, String socialReason, ArrayList<Funcionario> employees) {
		super();
		this.cnpj = cnpj;
		this.socialReason = socialReason;
		this.employees = employees;
	}
	
	public void addFuncionario(Funcionario f) {
		try {
			if(employees.size() < 100 )
			employees.add(f);	
			else
				System.err.println("The company already has 100 employees and cant have more than it.");
		} catch (Exception e) {
			System.err.println("The company already has 100 employees and cant have more than it.");
		}
	}
	
	public void delFuncionario(int index) {
		try {
			employees.remove(index);
		} catch (Exception e) {
			System.err.println("Invalid employee");
		}
	} 
	
	public void imprimeFuncionarios() {
		try {
			for(Funcionario emp : employees) {
					System.out.println("Name = " + emp.getName());
					System.out.println("Number = " + emp.getNumber());
					System.out.println("Address = " + emp.getAddress());
					System.out.println("Dependent = " + emp.getDependent());
					System.out.print("\n");
			}
			if (employees.size() == 0) {
				System.err.println("Number of employees is null");
			}
		} catch (Exception e) {
			System.err.println("Error in imprimeFuncionarios");
		}
	}
	public Funcionario getEmployer(int n){
		try {

			for(Funcionario f : employees) {
				if(f.getNumber() == n)
					return f;
			}	
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public void setCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void setSocialReason(String r) {
		this.socialReason = r;
	}
	
	public String getCNPJ() {
		return cnpj;
	}
	
	public ArrayList<Funcionario> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Funcionario> employees) {
		this.employees = employees;
	}

	public String getRazao() {
		return socialReason;
	}
}
