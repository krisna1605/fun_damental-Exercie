package InnerClass;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Company Liar");

        Company.Employee employee = company.new Employee();
        employee.setName("Test");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
        System.out.println(company.getName());
    }
}
