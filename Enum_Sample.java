class Enum_Sample{
    public static void main(String args[]){
        // Day today=Day.TUESDAY;
        // System.out.println(today);  //output:TUESDAY
        for(Day today:Day.values()){
            System.out.println(today+"  "+today.ordinal());
        }
    }
}
enum Day{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
