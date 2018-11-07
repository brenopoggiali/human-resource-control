
public class Projeto extends Funcionario {
		protected int id;
		protected String name;
		protected int hours;

		
		public Projeto(String cnpj, String socialReason, Funcionario[] employees, int number, String name,
				String address, int dependent, Projeto[] projects, int id, String name2, int hours) {
			super(cnpj, socialReason, employees, number, name, address, dependent, projects);
			this.id = id;
			name = name2;
			this.hours = hours;
		}
		public void setId(int c) {
			this.id = c;
		}
		public void setName(String n) {
			this.name = n;
		}
		public void setHours(int h) {
			this.hours = h;
		}
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public int getHours() {
			return hours;
		}
}
