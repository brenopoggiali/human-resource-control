
public class Funcionario{
	protected int number;
	protected String name;
	protected String address;
	protected int dependent;
	protected Projeto projects[];
	
	
	public Funcionario(int number, String name, String address, int dependent, Projeto[] projects) {
		super();
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
		for(int i = 0; i < 5; i++) {
			if(projects[i] == null) {
				projects[i] = p;
				break;
			}
			if(i == 4) {
				System.out.println("The employee already has 5 projects and can't have more than it.");
			}
		}
	}
	public void delProjeto(int c) {
		projects[c] = null;
	}
	public void printProjetos() {
		System.out.print("id\tname\thours");
		String format = "%s%s-40%n";
		for(int i = 0; i < 100 ; i++) {
			if(projects[i] != null) {
				System.out.printf(format, projects[i].id, projects[i].name, projects[i].hours);			
			}
		}
	}
	
}
