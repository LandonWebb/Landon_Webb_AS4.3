public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Freddy Fazbear");

        FullTimeJob fullTimeJob = new FullTimeJob("Tech Corp", "Software Engineer", "2018-01-01", "2021-01-01", 85000);
        PartTimeJob partTimeJob = new PartTimeJob("Pizzeria", "Sales Associate", "2015-06-01", "2017-12-31", 15, 20);
        ContractJob contractJob = new ContractJob("Consulting Firm", "Freelancer", "2021-02-01", null, 50, 160);

        employee.addJob(fullTimeJob);
        employee.addJob(partTimeJob);
        employee.addJob(contractJob);

        employee.displayJobHistory();
    }
}
