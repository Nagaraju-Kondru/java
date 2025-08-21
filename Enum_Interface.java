class Enum_Interface{
    public static void main(String args[]){
        for(Traffic light:Traffic.values()){
            light.DisplayAction();
        }
    }
}
interface A{
    public void DisplayAction();
}
enum Traffic implements A{
    RED("Stop"),GREEN("Go"),YELLOW("Get Ready");
    private String Action;
    Traffic(String Action){
        this.Action=Action;
    }
    public String getAction(){
        return Action;
    }
    public void DisplayAction(){
        System.out.println(Action);
    }
}
