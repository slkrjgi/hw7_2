public class Engineering extends Calculator {

    private double subject;

    public void setSubject(double subject) {
        this.subject = subject;
    }

    public double getSubject() {
        return this.subject;
    }

    public double getSin() {
        return Math.sin(this.subject);
    }

    public double getCos() {
        return Math.cos(this.subject);
    }

    public double getTan() {
        return Math.tan(this.subject);
    }

    public double getPow_3() {
        return Math.pow(this.subject, 3);
    }

    public double getSqrt() {
        return Math.sqrt(this.subject);
    }
}
