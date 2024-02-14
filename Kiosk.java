import java.util.ArrayList;
import java.util.List;

class Kiosk {
  private String title;
  private String address;
  public List<Hour> hours = new ArrayList<Hour>();

  Kiosk(String title, String address) {
    this.title = title;
    this.address = address;
  }

  public String getTitle() {
    return title;
  }

  public String getAddress() {
    return address;
  }

  public int printGeneralAmount() {
    int generalAmount = 0;

    for(Hour hour: hours) {
      generalAmount += hour.getAmount();
    }

    return generalAmount;
  }

  public void printHourWithSmallestBuyers() {
    Hour smallestHour = null;
    for (Hour hour : hours) {
      if (smallestHour == null || hour.getAmount() < smallestHour.getAmount()) {
          smallestHour = hour;
      }
    }

    System.out.println("Hour with smallest buyers: " + smallestHour.getAmount() + " buyers, Comment: " + smallestHour.getComment());
  }

  public void findCommentByText(String text) {
    for(Hour hour: hours) {
      if (hour.getComment().contains(text)) {
        System.out.println("Comment containing '" + text + "': " + hour.getComment());
      }
    }
  }

  public void displayInfo() {
    System.out.println("Title of kiosk: " + title);
    System.out.println("Address of kiosk: " + address);
  }
}

class Hour {
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

  public void displayInfo() {
    System.out.println("Amount of clients: " + amount);
    System.out.println("Comment " + comment);
  }
}