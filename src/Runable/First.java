package Runable;
import java.util.Scanner;

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
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build(); 
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
        Session session = factory.openSession();  
        Transaction t = session.beginTransaction(); 
        session.save(user);
        t.commit();
        System.out.println("Stored in MySQL");    
        factory.close();  
        session.close();         
    }
    public static void main(String args[]) {
    	First f1 = new First();
    	f1.saveData();
    }

}
