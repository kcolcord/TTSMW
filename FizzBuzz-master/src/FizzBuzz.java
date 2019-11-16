
public class FizzBuzz {

  public static void main(String a[]) {
    Fizz fizz = new Fizz();
    Buzz buzz = new Buzz();
    
    for(int i=0;i<99;i++) {
      if(fizz.matches(i) && buzz.matches(i)) {
        System.out.println(fizz.centigrade(i) + buzz.centigrade(i));
      } else if(fizz.matches(i)) {
        System.out.println(fizz.centigrade(i));
      } else if(buzz.matches(i)) {
        System.out.println(buzz.centigrade(i));
      } else {
        System.out.println(i);
      }
    }
  }
  
}
