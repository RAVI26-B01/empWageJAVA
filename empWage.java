import java.lang.*;

public class empWage {
        public static void main(String[] args) {
                int is_full_time=1;
                int is_part_time=2;
                int emp_rate_per_hour=20;
                int emp_hours;
               double emp_check=Math.floor(Math.random()*10)%3;

                if(emp_check==is_full_time){
                        emp_hours=8;
                }

                else if(emp_check==is_part_time){
                        emp_hours=4;
                }

                else {
                        emp_hours=0;
                }
                int salary=emp_rate_per_hour*emp_hours;
                System.out.println(salary);
        }
}

