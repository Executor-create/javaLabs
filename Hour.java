public class Hour {
  private int amount;
  private String comment;

  Hour(int amount, String comment) {
    this.amount = amount;
    this.comment = comment;
  }

  public int getAmount() {
    return amount;
  }

  public String getComment() {
    return comment;
  }
}