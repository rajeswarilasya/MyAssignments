package week1.day1;

public class Mobile {
   public void sendsms () {
	   System.out.println("Hi! how are you?");
   }
public void takeSnapshot () {
	System.out.println("show this image");

}
 public static void main(String[] args) {
	
	 Mobile ele = new Mobile();
	 ele.sendsms();
	 ele.takeSnapshot();
}
}
