/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintester;

import hibernateMappingEntity.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Srikanth
 */
public class Tester {
public static void main (String[] args){
     Session session=new AnnotationConfiguration()  
         .configure().buildSessionFactory().openSession();  
      
    Transaction t=session.beginTransaction(); 
    Employee e1=new Employee();  
    e1.setSerialNo("s101");
    e1.setEmployeeNme("karthik");
    Employee e2=new Employee();  
    e2.setSerialNo("s102");
    e2.setEmployeeNme("srikanth");
      
    session.persist(e1);  
    session.persist(e2);  
      
    t.commit();  
}
}
