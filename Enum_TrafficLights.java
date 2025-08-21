class Enum_TrafficLights{
    public static void main(String args[]){
        System.out.println(Signal.RED.getSignal());
        System.out.println(Signal.GREEN.getSignal());
        System.out.println(Signal.YELLOW.getSignal());
        
    }
}
enum Signal{
  RED("Stop"),GREEN("Go"),YELLOW("Get Ready");
  private String light;
  Signal(String light){
      this.light=light;
  }
  public String getSignal(){
      return light;
  }
}
