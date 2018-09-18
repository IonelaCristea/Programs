
/**
 * File:  OverloadingEx_Employee.java
 * ----------------------------------
 * This class is a simple demonstration of the set and get method, and overloaded constructors. 
 * How to  change the salary, supervisor name but using set method (and get method to double the salary).
 * 
 */

/**
 * Date: 03.08.2018
 * @author Ionela Cristea
 * Version 1.0
 */

public class OverloadingEx_Employee {
	
	private String emplyeeName;
	private String supervisorName;
	private Double emplyeeAnualSalary;
	
	/**
	 * Constructor to set the employee name, supervisor name and employee salary
	 * @param name1 of the employee
	 * @param supervisor of the employee
	 * @param anulalSalary of the employee
	 */
	public OverloadingEx_Employee(String name1, String supervisor, double anulalSalary) {
		setName(name1);
		setSuperviorName (supervisor);
		setSalary(anulalSalary);
		System.out.println("Constructor with 3 parameters: ");
	}
	
	/**
	 * Two parameters constructor calls tree parameter constructor to keep consistency 
	 * @param name1 of the employee
	 * @param salary of the employee
	 */
	public OverloadingEx_Employee(String name1, double salary) {
		this(name1, null, salary);
		System.out.println("Constructor with two parameters: ");
	}
	
	/**
	 * One parameters constructor calls tree parameter constructor to keep consistency 
	 * @param name1 of the employee
	 */
	public OverloadingEx_Employee(String name1) {
		this(name1, null, 0);
		System.out.println("Constructor with one parameter: ");
	}
	/**
	 * Set employee name
	 * @param name Of employee
	 */
	public void setName(String name) {
		this.emplyeeName = name;

	}
	/**
	 * Get employee name
	 * @return employee name
	 */
	public String getName() {
		return emplyeeName;

	}
	/**
	 * Set supervisor name 
	 * @param supervisor name
	 */
	private void setSuperviorName(String supervisor) {
		this.supervisorName = supervisor;

	}
	
	/**
	 * Get supervisor name 
	 * @return supervisor name 
	 */
	public String getSupervisorName() {
		return supervisorName;
	}
	
	/**
	 * Set employee salary
	 * @param salary of an employee
	 */
	public void setSalary(double salary) {
		this.emplyeeAnualSalary = salary;

	}
	/**
	 * Get the employee salary
	 * @return employee salary
	 */
	public double getSalary() {
		return emplyeeAnualSalary;

	}
	
	/**
	 * Generate a string of an employee name, supervisor name, and salary
	 * @return The string representation of of an employee name, supervisor name, and salary
	 */
	@Override
	public String toString() {
		return getName() + ", Supervisor: " + getSupervisorName() + ", Salaray: " + getSalary();
	}
	
	public static void main(String[] args) {
		/** Employee 1. 
		 * This calls the constructor that has tree parameters. 
		 */
		OverloadingEx_Employee employee1 = new OverloadingEx_Employee("Alice Cratchit", "Ebenezer Scrooge", 25.00);
		/* The string representation of employee 1 */
		System.out.println("Employee 1 " + employee1);
    
		/** Double the employee 1 salary */
		employee1.setSalary(employee1.getSalary() * 2);
		System.out.println("Employee 1 after the salary was changed: " +employee1);

		System.out.println("-------------------------------------------------------------------------");
		/** Employee 2. 
		 *  This calls the constructor that has one parameter. 
		 */
		OverloadingEx_Employee employee2 = new OverloadingEx_Employee("Maela Cristea");
		System.out.println(employee2);
		
		System.out.println("-------------------------------------------------------------------------");
		
		/**
		 * Employee 3
		 * This calls the constructor that has two parameters. 
		 */
		OverloadingEx_Employee employee3 = new OverloadingEx_Employee("Maela", 15000);
		System.out.println(employee3);
   
		/** Change employee 3 name */
		employee3.setName("Mihaela");
    
		/** Change employee 3 salary */
		employee3.setSalary(employee3.getSalary() + 1000);
		System.out.println(employee3);
		
		
	}

}
