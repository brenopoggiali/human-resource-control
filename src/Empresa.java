
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
	public String getReason() {
		return socialReason;
	}
	public void addEmployee(Funcionario f) {
		
	}
	public void delEmployee() {
		
	}
	public void printEmployees() {
		
	}
}
