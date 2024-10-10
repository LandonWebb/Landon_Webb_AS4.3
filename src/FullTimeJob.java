public class FullTimeJob extends Job {
    private double annualSalary;

    public FullTimeJob(String companyName, String position, String startDate, String endDate, double annualSalary) {
        super(companyName, position, startDate, endDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public void displayJobDetails() {
        String endDateStr = (endDate != null) ? endDate.toString() : "Present";
        System.out.println("Full-Time Job at " + companyName + " as " + position + " from " + startDate + " to " + endDateStr);
    }

    @Override
    public String assessJobSatisfaction() {
        return "Job Satisfaction: High. Benefits and growth opportunities are significant in full-time positions.";
    }

    public double calculateAnnualSalary() {
        return annualSalary;
    }
}
