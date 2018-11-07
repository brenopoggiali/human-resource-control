
public class Funcionario extends Empresa {
	protected int number;
	protected String name;
	protected String address;
	protected int dependent;
	protected Projeto projects[];
	
	
	public Funcionario(String cnpj, String socialReason, Funcionario[] employees, int number, String name,
			String address, int dependent, Projeto[] projects) {
		super(cnpj, socialReason, employees);
		this.number = number;
		this.name = name;
		this.address = address;
		this.dependent = dependent;
		this.projects = projects;
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
	public void addProjeto(Projeto p) {
		
	}
	public void delProjeto(int c) {
		
	}
	public void printProjetos() {
		
	}
	
}
