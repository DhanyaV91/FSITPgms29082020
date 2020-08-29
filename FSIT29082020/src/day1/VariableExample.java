package day1;
/*
 * This program demonstrates usage of Java Variables
 * Local Variable
 * Instance Variable
 * Static Variable
 */
public class VariableExample {
	int empID = 100; //Instance Variable/ Class level variable
	static String empOrg = "Jigsaw";
	
	float displaySal() {
		float sal = 1000f; //Local Variable
		return sal;
	}

	public static void main(String[] args) {
		VariableExample v = new VariableExample();
		VariableExample v1 = new VariableExample();
		v.empID = 1000;
		v1.empID = 2000;
		System.out.println("Instance variable value is emp ID of v" + v.empID);
		System.out.println("Static variable value is empOrg" + empOrg);
		System.out.println("Local variable value is sal" + v.displaySal());
		System.out.println("Instance variable value is emp ID of v1" + v1.empID);
	}

}
