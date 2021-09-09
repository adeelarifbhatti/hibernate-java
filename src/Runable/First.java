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
import java.util.ArrayList;
import java.util.List;

import Model.User;  

public class First {
    String userName, password;
    int id,age;
	public void start() {
	    Scanner scan = new Scanner(System.in);
	    String line = scan.next();
	    String[] values = line.split(",");  
	    scan.close();
	    if(values[0].equals("put")) {
		    id = Integer.parseInt(values[1]);
		    userName = values[2];
		    password = values[3];
		    age = Integer.parseInt(values[4]);
	    }
	    else if(values[0].equals("get")) {	    	
	    	id = Integer.parseInt(values[1]);
 	    }
	 }
    public void saveData() { 
    	if(userName!=null) {
        Session session = HibernateUtilities.getSessionFactory().openSession();  
        Transaction t = session.beginTransaction(); 
        User user = new User(id,userName, password, age);
        session.save(user);
        t.commit();
        System.out.println("Stored in MySQL"); 
        session.close();  
    	}
    	else{
	    	Session session = HibernateUtilities.getSessionFactory().openSession();
	    	Transaction t = session.beginTransaction();
	    	User user= (User) session.get(User.class, id);
	    	System.out.println("Geting the user out");
	    	System.out.println("Userid is "+user.getId()+" UserName is "+user.getUserName() +" password is "+user.getPassword()+" age is "
	    	+user.getAge());
	        System.out.println("printing from MySQL");    
	        session.close();  
	    	}
    	}
    
    
    public void showData(int id) {
    	
    }
    public static void main(String args[]) {

    	First f1 = new First();
    	f1.start();
    	f1.saveData();
    }

}
