package ie.atu.testers;

import java.utils.ArrayList;
import ie.atu.hotel.*;

class ExceptionHandlerDemo {
  public static void main(String[] args) {
    ArrayList<Person> evacuationList = new ArrayList<Person>();
    evacuationList.add(new Guest(new Name("Mr","John","Jones"),
                       "087 7654321",
                       "johnjones@gmail.com",
                       new PaymentCard(1111222233334444L,new Date(31,12,2029),111)));
			
    evacuationList.add(new Guest(new Name("Mrs","Sara","Jones"),
                        "087 1234567",
                        "sara.jones@atu.ie",
                        new PaymentCard(2222333344445555L,new Date(31,12,2028),222)));

     evacuationList.add(new Employee(new Name("Mr","Henry","Smyth"),
                        "086 1234567",
                        new Date(20,10,1980), 
                        new Date(10,10,2012),
                        42000.00));

     evacuationList.add(new Employee(new Name("Ms","Lizzie","Swan"),
                  "087 1234567",
                  new Date(18,11,1999),
                  new Date(1,1,2020),
                  2500000.00));
  }

  for(

  Person p:evacuationList)
  {
    System.err.println(p);
  }
}
