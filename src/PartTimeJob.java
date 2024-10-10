public class PartTimeJob extends Job {
    private double hourlyRate;
    private int hoursWorkedPerWeek;

    public PartTimeJob(String companyName, String position, String startDate, String endDate, double hourlyRate, int hoursWorkedPerWeek) {
        super(companyName, position, startDate, endDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }

    @Override
    public void displayJobDetails() {
        String endDateStr = (endDate != null) ? endDate.toString() : "Present";
        System.out.println("Part-Time Job at " + companyName + " as " + position + " from " + startDate + " to " + endDateStr);
    }

    @Override
    public String assessJobSatisfaction() {
        return "Job Satisfaction: Good. Part-time jobs provide flexibility but limited benefits.";
    }

    public double calculateTotalPayment(int weeksWorked) {
        return hourlyRate * hoursWorkedPerWeek * weeksWorked;
    }
}
