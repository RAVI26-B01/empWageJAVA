import java.lang.*;

public class empWage {
        public static void main(String[] args) {
                int is_full_time=1;
                int is_part_time=2;
                int emp_rate_per_hour=20;
                int emp_hours=0;
                int emp_check=(int)Math.floor(Math.random()*10)%3;

		switch(emp_check){
			case 1: emp_hours=8;
				break;
			case 2: emp_hours=4;
				break;
			case 0: emp_hours=0;
				break;
		}

                int salary=emp_rate_per_hour*emp_hours;
                System.out.println(salary);
        }
}

