public class Empwage {
    public static void main(String[]args){
        int full_time=1;
        int rph=20;
        int emphrs=0;
        int empwage=0;
        double empcheck=Math.floor(Math.random()*10)%2;
        if(empcheck==full_time)
            emphrs=8;
        else
            emphrs=0;
        empwage=emphrs*rph;
        System.out.println("empwage:" +empwage);




    }
}
