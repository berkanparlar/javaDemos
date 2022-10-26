public class Main {
    public static void main(String[] args) {
       //intertance miras iki nesne arasında ki miras biri digerine miras bırakır
        Customer customer = new Customer();
        Employee employee = new Employee();
        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();
        customerManager.Add();
    }
}