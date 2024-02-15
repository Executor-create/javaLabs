import java.util.List;

public class Kiosk {
  private String title;
  private String address;
  private List<Hour> hours;

  Kiosk(String title, String address, List<Hour> hours) {
    this.title = title;
    this.address = address;
    this.hours = hours;
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
}