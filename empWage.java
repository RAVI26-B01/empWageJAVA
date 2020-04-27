import java.lang.*;

public class empWage {
        public static void main(String[] args) {
                int is_full_time=1;
                double emp_check=Math.floor(Math.random()*10)%2;
                if(emp_check==is_full_time){
                        System.out.println("present");
                }
                else {
                        System.out.println("absent");
                }
        }
}
