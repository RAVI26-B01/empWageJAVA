import java.lang.*;

public class empWage {
        public static void main(String[] args) {
                int is_full_time=1;
                double emp_check=Math.floor(Math.random()*10)%2;
                if(emp_check==is_full_time){
			int emp_rate_per_hour=20;
			int emp_hours=8;
                        int Salary=(emp_rate_per_hour*emp_hours);
			System.out.println(Salary);
                }
                else {
                        System.out.println(0);
                }
        }
}
