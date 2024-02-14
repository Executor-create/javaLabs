class Main {
  public static void main(String[] args) {
    Kiosk kiosk = new Kiosk("Kiosk", "11/21");

    Hour hour1 = new Hour(10, "Good kiosk");
    Hour hour2 = new Hour(5, "Good kiosk2");

    kiosk.hours.add(hour1);
    kiosk.hours.add(hour2);
    
    kiosk.printHourWithSmallestBuyers();
    kiosk.findCommentByText("kiosk2");
  }
}