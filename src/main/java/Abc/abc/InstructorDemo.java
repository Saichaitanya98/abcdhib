  
package Abc.abc;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.Session;


import Abc.abc.Student;

public class InstructorDemo {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(Student.class).buildSessionFactory();
		Session abc=factory.getCurrentSession();
		try {
			System.out.println("creating.....");
			//Student a=new Student("sai","chaitu","sai@gmail.com");
			//Instructor i=new Instructor("sghagjshgujddx", "hhvcivc");
			//a.setInstructor(i);
			abc.beginTransaction();
			//int sid=1;

			//Student ab=abc.get(Student.class, sid);

			abc.createQuery("delete from instructor where id=2").executeUpdate();
			//abc.delete(ab);
			//abc.save(a);
			abc.getTransaction().commit();
			System.out.println("Done :)");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}