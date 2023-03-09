/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;


/**
 *
 * @author sivagamasrinivasan
 */
public class Weekdays 
{
  
    public enum days {ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN};
    public void nameOfDay(days code)
     {
      switch(code.toUpperCase)
      {
      case "ONE":
        System.out.println("Monday");
        break;
      case "TWO":
        System.out.println("Tuesday");
        break;
      case "THREE":
        System.out.println("Wednesday");
        break;
      case "FOUR":
        System.out.println("Thursday");
        break;
      case "FIVE":
        System.out.println("Friday");
        break;
      case "SIX":
        System.out.println("Saturday");
        break;
      case "SEVEN":
        System.out.println("Sunday");
        break;
    }
  
}
}


