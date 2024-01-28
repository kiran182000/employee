public class Empwage {
    public static final int is_full_time=2;
    public static final int is_part_time=1;
    public static final int rph=20;
    public static final int no_of_working_days=2;
    public static final int max_hrs_in_month=10;

    public static void main(String[]args){
        int emphrs=0,totalemphrs=0,totalworkingdays=0;
        while(totalemphrs<=max_hrs_in_month&&totalworkingdays<no_of_working_days){
            totalworkingdays++;
            int empcheck=(int)Math.floor(Math.random()*10)%3;
            switch (empcheck){
                case is_part_time:
                    emphrs=4;
                    break;
                case is_full_time:
                    emphrs=8;
                    break;
                default:
                    emphrs=0;
            }
            totalemphrs+=emphrs;
            System.out.println("Day: "+totalworkingdays+ "emp hr:" +emphrs);
        }
        int totalwage=totalemphrs*rph;
        System.out.println("Total emp wage:" +totalwage);
    }
}
