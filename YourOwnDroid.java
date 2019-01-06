//Your Own Droid Project. Simple droid that can be activated, charged and hover above ground.

class Droid{
  int batteryLevel;
  
  public Droid(){
    batteryLevel = 100;
  }
  
  public void activate(){
    System.out.println("Hello Human, I'm activated. How can I help you?");
    batteryLevel -= 5;
    System.out.println("Battery level is: " + batteryLevel + " percent.");
  }
  
  public void chargeBattery(int hours){
    System.out.println("Droid charging...");
    batteryLevel += hours;
    
    if(batteryLevel > 100){
      batteryLevel = 100;
      System.out.println("Battery level is: " + batteryLevel + " percent.");
    }
    else{
      System.out.println("Battery level is: " + batteryLevel + " percent.");
    }
  }
    
  public int checkBatteryLevel(){
    System.out.println("Battery level is: " + batteryLevel + " percent.");
    return batteryLevel;
  }
  
  public void hover(int feet){
    if(feet > 2){
      System.out.println("I shouldn't hover above 2 feet human!");
      return;
    }
    System.out.println("Hovering...");
    batteryLevel -= 20;
    System.out.println("Battery level is: " + batteryLevel + " percent");
  }
  
  public static void main(String[] args){
    Droid robot = new Droid();
    
    robot.activate();
    robot.chargeBattery(5);
    robot.hover(1);
    robot.hover(5);
    robot.chargeBattery(15);
  }
}


