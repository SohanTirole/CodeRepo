import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.bean.Student;
import com.spring.config.AppCongig;

public class Main {
	public static void main(String[] args) {
		ApplicationContext contex = new AnnotationConfigApplicationContext(AppCongig.class);
		//Address add = contex.getBean(Address.class);
		Student std = contex.getBean(Student.class);
		std.display();
	}
}
