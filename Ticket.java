/*
Mr. Sell
Ticket.java
4-9-21
defines a Ticket 
*/


public class Ticket {
  private static int serialCounter = 100;
  private int serialNumber; // unique ticket id number

  public Ticket() {
    serialNumber = getNextSerialNumber();
  }

  // returns the price for this ticket public double getPrice()
  public double getPrice() {
    return 50.0;
  }

  // returns a string with information about the ticket public String toString()
  public String toString() {
    return "Number: " + serialNumber + "\nPrice: $" + getPrice();
  }

  // returns a new unique serial number
  private static int getNextSerialNumber() {
    serialCounter++;
    return serialCounter;
 }
}
