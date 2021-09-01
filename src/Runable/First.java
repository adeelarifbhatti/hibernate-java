package Runable;
import java.util.Scanner;
import myHibernate.HibernateUtilities;

import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import Model.User;  

public class First {
    Scanner scan = new Scanner(System.in);
    int id = scan.nextInt();
    String userName = scan.next();
    String password = scan.next();
    int age = scan.nextInt();
    User user = new User(id,userName, password, age);
    
    public void saveData() { 
        Session session = HibernateUtilities.getSessionFactory().openSession();  
        Transaction t = session.beginTransaction(); 
        session.save(user);
        t.commit();
        System.out.println("Stored in MySQL");    
        session.close();         
    }
    public static void main(String args[]) {
    	First f1 = new First();
    	f1.saveData();
    }

}
