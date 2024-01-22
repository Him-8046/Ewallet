class PremiumUser extends User {
  private int rewardPoints;

  public PremiumUser(int id, String userName, String emailId, double walletBalance) {
    super(id, userName, emailId, walletBalance);
  }

  @Override
  public boolean makePayment(double billAmount) {
    if (super.makePayment(billAmount)) {

      rewardPoints += (int) (0.1 * billAmount);
      return true;
    }
    return false;
  }

  public int getRewardPoints() {
    return rewardPoints;
  }

  public void setRewardPoints(int rewardPoints) {
    this.rewardPoints = rewardPoints;
  }

}