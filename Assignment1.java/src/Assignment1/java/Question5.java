package Assignment1.java;
	import java.util.*;
	public class Question5 {
		private String firstname, lastname, designation;
		public String getfname() {
			return firstname;
		}
		public void setfname(String firstname) {
			this.firstname = firstname;
		}
		public String getlname() {
			return lastname;
		}
		public void setlname(String lastname) {
			this.lastname = lastname;
		}
		public String getdesignation() {
			return designation;
		}
		public void setdesignation(String designation) {
			this.designation = designation;
		}
		public Question5(String firstname, String lastname, String designation) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
			this.designation = designation;
		}
		public String toString() {
			return this.firstname + " " + this.lastname + " is " + this.designation;
		}
	}
	class test {
		public static void main(String args[]) {
			Question5 e = new Question5("Rupinder", "Kaur", "Quality Engineer");
			System.out.println("The employee details are:");
			System.out.println(e);
		}
	}





