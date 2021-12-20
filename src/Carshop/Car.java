package Carshop;


class Cars{
	private int speed;
	private String owner;
	private String type;	
	static int noOfObjects = 0;
	
	  {
	        noOfObjects += 1;
	    }


	


	public int getSpeed() {
		  return speed;
	  }
	  public String getOwner() {
		  return owner;
	  }
	  public String getType() {
		  return type;
	  }
	  public void setSpeed(int s) {
		  speed = s;
	  }
		
	  public void setOwner(String o) {
		  owner = o;
	  }
	  
	  public void setType(String t) {
		  type = t;
	  }
	 
	
		
	 
}








public class Car {

	public static void main(String[] args) {
		
		

	
		
		
		
			
		Cars c = new Cars();
		c.setSpeed(200);
		c.setOwner("Ram");
		c.setType("Mannual");
		
		System.out.println(c.getSpeed());
		System.out.println(c.getOwner());
		System.out.println(c.getType());
	
		System.out.println("===================================");
		Cars c1 = new Cars();
		c1.setSpeed(300);
		c1.setOwner("Shyam");
		c1.setType("Automatic");
		
		System.out.println(c1.getSpeed());
		System.out.println(c1.getOwner());
		System.out.println(c1.getType());
		System.out.println("========================");
		
		System.out.println(" number of cars sold = "+Cars.noOfObjects);
		

		
			
	}

}
