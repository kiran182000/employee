public  class Empwage {
    public static final int is_full_time=2;
    public static final int is_part_time=1;
    private final String company;
    private final int rph;
    private final int no_of_working_days;
    private final int max_hrs_in_month;
    private int totalempwage;
    public Empwage(String company,int rph,int no_of_working_days,int max_hrs_in_month){
        this.company=company;
        this.rph=rph;
        this.no_of_working_days=no_of_working_days;
        this.max_hrs_in_month=max_hrs_in_month;
    }

    public void computeempwage(){
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
        totalempwage=totalemphrs*rph;
    }
    public String toString(){
        return "Total emp wage for company: " +company+ " is: " + totalempwage;
    }
    public static void main(String[] args){
        Empwage abc =  new Empwage("ABC",10,2,10);
        Empwage xyz = new Empwage("XYZ",8,3,7);
        abc.computeempwage();
        System.out.println(abc);
        xyz.computeempwage();
        System.out.println(xyz);
    }
}



