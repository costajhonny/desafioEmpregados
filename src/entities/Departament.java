package entities;

import java.util.ArrayList;
import java.util.List;

public class Departament {
	private String name;
	private Integer payDay;

	private Address address;
	private List<Employee> employees = new ArrayList<>();

	public Departament() {
	}

	public Departament(String name, Integer payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPayDay() {
		return payDay;
	}

	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
		payroll();
	}

	public void removeEmployee(Employee employee) {
		employees.remove(employee);
		payroll();
	}

	double totalSalary;
	public double payroll() {
		totalSalary = 0.0;
		for (int i = 0; i < employees.size(); i++) {
			totalSalary += employees.get(i).getSalary();
		}
		return totalSalary;
	}

	@Override
	public String toString() {

		return "FOLHA DE PAGAMENTO " 
				+ "\n" 
				+ "Departamento Vendas = "
				+ totalSalary 
				+ "\n"
				+ "Pagamento realizado no dia "
				+ payDay
				+ "\n"
				+ "Funcionários: "
				+ employees 
				+ "\n"
				+ "Para dúvidas favor entrar em contato: "
				+ address.getEmail();
	}

}
