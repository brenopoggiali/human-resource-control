package main;

public class Projeto{
		private int id;
		private String name;
		private int hours;

		
		public Projeto(int id, String name, int hours) {
			this.id = id;
			this.name = name;
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
