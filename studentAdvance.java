/*
Your Name
Date
FileName.java
description
*/


/*
Write the complete class declaration for the class StudentAdvance. Include all necessary
instance variables and implementations of its constructor and method(s). The constructor should
take a parameter that indicates the number of days in advance that this ticket is being purchased.
The toString method should include a notation that a student ID is required for this ticket. A
StudentAdvance ticket is 25% less than what an Advance ticket would normally cost. If the
pricing scheme for Advance tickets changes, the StudentAdvance price should continue to be
computed correctly with no code modifications to the StudentAdvance class
*/

public class StudentAdvance extends Advance {

  private double studentPrice;

  public StudentAdvance(int day) {
    super(day);
  }

  public double getPrice() {
    studentPrice = super.getPrice() * 0.75;
    return studentPrice;
  }

  public String toString() {
    String info = super.toString();

    return "Requires student ID \n" + info;
  }
}
