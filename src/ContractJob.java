public class ContractJob extends Job {
    private double hourlyRate;
    private int totalHoursWorked;

    public ContractJob(String companyName, String position, String startDate, String endDate, double hourlyRate, int totalHoursWorked) {
        super(companyName, position, startDate, endDate);
        this.hourlyRate = hourlyRate;
        this.totalHoursWorked = totalHoursWorked;
    }

    @Override
    public void displayJobDetails() {
        String endDateStr = (endDate != null) ? endDate.toString() : "Present";
        System.out.println("Contract Job at " + companyName + " as " + position + " from " + startDate + " to " + endDateStr);
    }

    @Override
    public String assessJobSatisfaction() {
        return "Job Satisfaction: Variable. Contract jobs can offer high pay but lack stability.";
    }

    public double calculateTotalPayment() {
        return hourlyRate * totalHoursWorked;
    }

    public String evaluateJobSecurity() {
        return "Job Security: Low. Contract jobs typically have limited long-term security.";
    }
}
