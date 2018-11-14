
public class Empresa {
	private String cnpj;
	private String socialReason;
	private Funcionario employees[];
	
	
	public Empresa(String cnpj, String socialReason, Funcionario[] employees) {
		super();
		this.cnpj = cnpj;
		this.socialReason = socialReason;
		this.employees = employees;
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
	public String getRazao() {
		return socialReason;
	}
	public void addFuncionario(Funcionario f) {
		for(int i = 0; i < 100; i++) {
			if(employees[i] == null) {
				employees[i] = f;
				break;
			}
			if(i == 99) {
				System.out.println("The company already has 100 employees and cant have more than it.");
			}
		}
	}
	public void delFuncionario() {
		for(int i = 0; i < 100; i++) {
			if(employees[i].projects == null) {
				employees[i] = null;
			}
		}
	} 
	public void imprimeFuncionarios() {
		for(int i = 0; i < 100 ; i++) {
			if(employees[i] != null) {
				System.out.println("Name = " + employees[i].name);
				System.out.println("Number = " + employees[i].number);
				System.out.println("Address = " + employees[i].address);
				System.out.println("Dependent = " + employees[i].dependent);
				System.out.print("\n");
			}
		}
	}
	
	public void main(String[] args){

		System.out.println("Hello World");
		
	}
}
