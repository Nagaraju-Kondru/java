class Enum_Switch{
    public static void main(String args[]){
        Day today=Day.EAST;
        switch(today){
            case SOUTH:
                System.out.println("its south");
                break;
            case NORTH:
                System.out.println("its north");
                break;
            case EAST:
                System.out.println("its east");
                break;
            case WEST:
                System.out.println("its west");
                break;
            default:
            System.out.println("error");
            break;
        }
    }
}
enum Day{
    SOUTH,NORTH,EAST,WEST;
}
