import java.util.List;

class Main {
  public static void main(String[] args) {
    Hour hour1 = new Hour(10, "Good kiosk");
    Hour hour2 = new Hour(5, "Good kiosk2");

    List<Hour> hours = List.of(hour1, hour2);

    Kiosk kiosk = new Kiosk("Kiosk", "11/21", hours);
    
    kiosk.printHourWithSmallestBuyers();
    kiosk.findCommentByText("kiosk2");
  }
}