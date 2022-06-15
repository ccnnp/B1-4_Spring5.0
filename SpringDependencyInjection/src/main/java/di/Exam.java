package di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam 
{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		
		Student s2=a.getBean("s2",Student.class);
		s2.display();	
	}

}
