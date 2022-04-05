/*
Your Name
Date
FileName.java
description
*/


/*
Write the complete class declaration for the class Advance. Include all necessary instance
variables and implementations of its constructor and method(s). The constructor should take a
parameter that indicates the number of days in advance that this ticket is being purchased. Use this 
price breakdown based on the number of days in advance a ticket is purchased:

* If ticket is purchased less than 6 days in advance- the cost is $44.00 (student advance receives a 25% discount of this cost)
* However, if ticket is purchased 6 to 10 days (inclusive) in advance - the cost is $40.00 (student advance receives a 25% discount of this cost)
* But.... if ticket is purchased 11 to 15 days in advance (inclusive) - the cost is $36.00 (student advance receives a 25% discount of this cost)
* Otherwise, any ticket purchased 16 (inclusive) or more days in advance - the cost is $30.00 (student advance receives a 25% discount of this cost)
*/

public class Advance extends Ticket {

  private double price;

  public Advance(int d) {
    
    if(d < 6) {
      price = 44.0;
    }
    else if((d >= 6) && (d <= 10)) {
      price = 40.0;
    }
    else if((d >= 11) && (d <= 15)) {
      price = 36.0;
    }
    else {
      price = 30.0;
    }
  } //end constructor

  public double getPrice() {
    return price;
  }//end getPrice()

}
