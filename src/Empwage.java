public class Empwage {
    public static final int is_full_time=2;
    public static final int is_part_time=1;
    public static final int rph=20;
    public static final int no_of_working_days=2;
    public static void main(String[]args){
        int emphrs=0,empwage=0,totalempwage=0;
        for(int day=0;day<no_of_working_days;day++){
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
            empwage=emphrs*rph;
            totalempwage+=empwage;
            System.out.println("empwage:"+ empwage);
        }
        System.out.println("Total emp wage: "+ totalempwage);
    }
}
