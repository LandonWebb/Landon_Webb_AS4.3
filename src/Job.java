public abstract class Job {
    protected String companyName;
    protected String position;
    protected String startDate; // Use String for simplicity
    protected String endDate; // Use String for simplicity

    public Job(String companyName, String position, String startDate, String endDate) {
        this.companyName = companyName;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public abstract void displayJobDetails();
    public abstract String assessJobSatisfaction();

    // Getter methods
    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
}
