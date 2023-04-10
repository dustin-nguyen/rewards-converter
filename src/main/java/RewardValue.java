public class RewardValue {
    double cashValue;
    int milesValue;
    double rate= 0.0035;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / rate);
    }
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * rate;
    }
    public int getMilesValue() {
        return milesValue;
    }
    public double getCashValue() {
        return cashValue;
    }
}
