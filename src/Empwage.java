public  class Empwage {
    public static final int is_full_time=2;
    public static final int is_part_time=1;
    public static int computeempwage(String company,int rph,int no_of_working_days,int max_hrs_in_month){
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
        int totalempwage=totalemphrs*rph;
        System.out.println("Total emp wage for company: " + company+ " is: " + totalempwage);
        return totalempwage;
    }
    public static void main(String[] args){
        computeempwage("ABC",20,2,10);
        computeempwage("XYZ",8,5,15);
    }
}

