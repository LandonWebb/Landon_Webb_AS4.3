import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Employee Class
class Employee {
    private String name;
    private List<Job> jobHistory;

    public Employee(String name) {
        this.name = name;
        this.jobHistory = new ArrayList<>();
    }

    public void addJob(Job job) {
        jobHistory.add(job);
    }

    public void displayJobHistory() {
        System.out.println("Job history for " + name + ":");
        for (Job job : jobHistory) {
            job.displayJobDetails();
            System.out.println(job.assessJobSatisfaction());

            if (job instanceof FullTimeJob) {
                FullTimeJob fullTimeJob = (FullTimeJob) job;
                System.out.printf("Annual Salary: $%.2f%n", fullTimeJob.calculateAnnualSalary());
            } else if (job instanceof PartTimeJob) {
                PartTimeJob partTimeJob = (PartTimeJob) job;
                int weeksWorked = calculateWeeksWorked(job.getStartDate(), job.getEndDate());
                System.out.printf("Total Payment: $%.2f%n", partTimeJob.calculateTotalPayment(weeksWorked));
            } else if (job instanceof ContractJob) {
                ContractJob contractJob = (ContractJob) job;
                System.out.printf("Total Payment: $%.2f%n", contractJob.calculateTotalPayment());
                System.out.println(contractJob.evaluateJobSecurity());
            }
            System.out.println("------");
        }
    }

    private int calculateWeeksWorked(String startDate, String endDate) {
        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = (endDate != null) ? LocalDate.parse(endDate) : LocalDate.now();
        return (int) (java.time.temporal.ChronoUnit.WEEKS.between(start, end));
    }
}
