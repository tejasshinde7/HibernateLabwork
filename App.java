package com.example.OnetomanyLab;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        
        try 
        {
        Project project=new Project();
        project.setpName("Ambulance hiring app");
        project.setPmembers(2);
        
        Project project1=new Project();
        project1.setpName("Student management system");
        project1.setPmembers(3);
        Employe employee1=new Employe();
        employee1.seteName("TejaS");
        employee1.seteAge(23);
        employee1.setProject(project);
      
        
        Employe employee2=new Employe();
        employee2.seteName("Abhi");
        employee2.seteAge(23);
        employee2.setProject(project);
       
        
        Employe employee3=new Employe();
        employee3.seteName("Raj");
        employee3.seteAge(25);
        employee3.setProject(project1);
     
        Employe employe4=new Employe();
        employe4.seteName("om");
        employe4.seteAge(24);
        employe4.setProject(project1);
    
        
        project.getEmployeess().add(employee1);
        project.getEmployeess().add(employee2);
        project1.getEmployeess().add(employee3);
        project1.getEmployeess().add(employe4);
        session.beginTransaction();
        session.save(project);
        session.save(project1);
        
        session.getTransaction().commit();
        }
        finally 
        {
        	session.close();
        	sessionFactory.close();
        }
        
        
        
    }
}
