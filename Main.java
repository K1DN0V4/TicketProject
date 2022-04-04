/*
Mr. Sell
Main.java
4-10-21
used to instantiate instances of each Ticket, Advance, and StudentAdvance
*/


class Main {
  public static void main(String[] args) {

    //create a Ticket - purchased on the day of the event
    Ticket regDayOf = new Ticket();
    System.out.println("Ticket purchased on day of:");
    System.out.println( regDayOf );
    System.out.println();

    //create a Ticket - purchased 19 days in advance of the event
    Advance advTicket19Days = new Advance(19);
    System.out.println("Ticket purchased 19 days in advance:");
    System.out.println( advTicket19Days );
    System.out.println();

    //create a Ticket - purchased 7 days in advance of the event
    Advance advTicket7Days = new Advance(7);
    System.out.println("Ticket purchased 7 days in advance:");
    System.out.println( advTicket7Days );
    System.out.println();

    //create a Student Ticket - purchased 12 days in advance of the event
    StudentAdvance studTicket12Days = new StudentAdvance(12);
    System.out.println("Student Ticket purchased 12 days in advance:");
    System.out.println( studTicket12Days );
    System.out.println();

    //create a Student Ticket - purchased 5 days in advance of the event
    StudentAdvance studTicket5Days = new StudentAdvance(5);
    System.out.println("Student Ticket purchased 5 days in advance:");
    System.out.println( studTicket5Days );
    System.out.println();
  }
}
