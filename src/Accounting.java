public class Accounting extends Calculator {

    private double totalWorkingDays;
    private double workingDayCost;
    private double totalSickDays;
    private double sickDayCost;

    public void setTotalWorkingDays(double totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }

    public double getTotalWorkingDays() {
        return this.totalWorkingDays;
    }

    public void setWorkingDayCost(double workingDayCost) {
        this.workingDayCost = workingDayCost;
    }

    public double getWorkingDayCost() {
        return workingDayCost;
    }

    public double getSalary() {
        return this.workingDayCost * this.totalWorkingDays + this.totalSickDays * this.sickDayCost;
    }

    public void setSickDayCost(double sickDayCost) {
        this.sickDayCost = sickDayCost;
    }

    public double getSickDayCost() {
        return sickDayCost;
    }

    public void AddWorkingDays(double days) {
        this.totalWorkingDays += days;
    }

    public double VacationAvailable () {
        return totalWorkingDays / 30;
    }

}
