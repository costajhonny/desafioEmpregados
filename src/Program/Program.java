package Program;

import java.util.Locale;
import java.util.Scanner;
import entities.Address;
import entities.Departament;
import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome do departamento:");
		String nameDepartament = sc.nextLine();
		System.out.print("Dia do pagamento:");
		int payDay = sc.nextInt();
		System.out.print("Email: ");
		sc.nextLine();
		String email = sc.nextLine();
		System.out.print("Telefone: ");		
		String telephone = sc.nextLine();

		Address address = new Address(email, telephone);
		Departament departament = new Departament(nameDepartament, payDay, address);

		System.out.print("Quantos funcionários tem o departamento?");
		int n = sc.nextInt();
		sc.nextLine();		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados do funcionário" + (i + 1) + ": ");
			System.out.print("Nome :");
			String nome = sc.nextLine();
//			employee.setName(nome);
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			Employee employee = new Employee(nome, salary);
			sc.nextLine();
//			employee.setSalary(salary);
			departament.addEmployee(employee);
			
		}

		showReport(departament);

		sc.close();
	}

	private static void showReport(Departament departament) {
		System.out.println(departament);

	}

}
