public class Financial extends Calculator {

    private double sumOfDeposit;
    private String depositCurrency;
    private byte collectMonthes;
    private byte depositInterestRate;
    private double profitAmount;

    private double sumOfCredit;
    private byte paymentQuantity;
    private byte creditInterestRate;
    private double sumOfPayments;
    private double wholePaymentAmount;

    public void setSumOfDeposit(double sumOfDeposit) {
        this.sumOfDeposit = sumOfDeposit;
    }

    public double getSumOfDeposit() {
        return this.sumOfDeposit;
    }

    public void setCurrency(String currency) {
        if (currency == "uah" || currency == "usd") {
            this.depositCurrency = currency;
        } else {
            this.depositCurrency = "uah";
            System.out.println("The currency is unknown so set as UAH.");
        }
    }

    public String getCurrency() {
        return depositCurrency;
    }

    public void setCollectMonthes(byte collectMonthes) {
        this.collectMonthes = collectMonthes;
    }

    public byte getCollectMonthes() {
        return this.collectMonthes;
    }

    public void setDepositInterestRate(byte depositInterestRate) {
        if (this.depositCurrency == "uah") {
            this.depositInterestRate = depositInterestRate < 30 ? depositInterestRate : 10;
        } else if (this.depositCurrency == "usd") {
            this.depositInterestRate = depositInterestRate < 10 ? depositInterestRate : 2;
        } else {
            this.depositInterestRate = 0;
        }
    }

    public byte getDepositInterestRate() {
        return this.depositInterestRate;
    }

    public double depositPaymentAmount() {
        double profit = (this.sumOfDeposit * depositInterestRate * 30 * this.collectMonthes / 365) / 100;
        this.profitAmount = profit;
        return this.sumOfDeposit + profit;
    }

    public double sumOfDepositByProfit(double profitAmount) {
        double sumOfDeposit = (profitAmount * 365 * 100) / (this.depositInterestRate * 30 * this.collectMonthes);
        this.sumOfDeposit = sumOfDeposit;
        return this.sumOfDeposit;
    }

    public void setSumOfCredit(double sumOfCredit) {
        this.sumOfCredit = sumOfCredit;
    }

    public double getSumOfCredit() {
        return sumOfCredit;
    }

    public void setPaymentQuantity(byte paymentQuantity) {
        this.paymentQuantity = paymentQuantity;
    }

    public byte getPaymentQuantity() {
        return this.paymentQuantity;
    }

    public void setCreditInterestRate(byte creditInterestRate) {
        this.creditInterestRate = creditInterestRate;
    }

    public byte getCreditInterestRate() {
        return this.creditInterestRate;
    }

    public void setSumOfPayments(double sumOfPayments) {
        this.sumOfPayments = sumOfPayments;
    }

    public double getSumOfPayments() {
        return sumOfPayments;
    }

    public void setWholePaymentAmount(double wholePaymentAmount) {
        this.wholePaymentAmount = wholePaymentAmount;
    }

    public double getWholePaymentAmount() {
        return this.wholePaymentAmount;
    }

    public double WholePaymentAmount() {
        this.wholePaymentAmount = this.sumOfCredit * this.creditInterestRate;
        return this.wholePaymentAmount;
    }

    public double SumOfEachPayment () {
        this.sumOfPayments = this.wholePaymentAmount / this.paymentQuantity;
        return this.sumOfPayments;
    }

    public double OverPayment() {
        return this.wholePaymentAmount - this.sumOfCredit;
    }
}
