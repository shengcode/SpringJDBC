/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springexamples;

import com.study.springJDBC.Employee;
import com.study.springJDBC.HelloWorld;
import com.study.springJDBC.MyCollection;
import com.study.springJDBC.Project;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext ctx=new ClassPathXmlApplicationContext("myMetadata.xml");
        HelloWorld world=(HelloWorld)ctx.getBean("world1");
        System.out.println(world.getGreetings());
        
        Project project1= (Project)ctx.getBean("project2");        
        
         Project project2= (Project)ctx.getBean("project2");
         project2.setProjectName("......");
         
         System.out.println(project1);
         System.out.println(project2);
         
         Project project3= (Project)ctx.getBean("project3");
        System.out.println(project3);
       /* Employee emp1=(Employee)ctx.getBean("emp1");
        
        
        Employee emp2=(Employee)ctx.getBean("emp1");
        emp2.setEmployeeId("000");
        emp2.setEmployeeName("ABC");
        
        System.out.println(emp1);
        System.out.println(emp2);
        
      */ /*  MyCollection myCollection=(MyCollection)ctx.getBean("myCollection");
        //access list
        System.out.println("---access list---");        
        List<String> list=myCollection.getMyList();
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        //access set
        System.out.println("---access set---");
        Set<String> set=myCollection.getMySet();
        Iterator<String> itr= set.iterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }
        //access map
        System.out.println("---access map---");
        Map<Integer,String> map=myCollection.getMyMap();
        System.out.println(map.get(0));
        System.out.println(map.get(1));
        //access properties
        System.out.println("---access properties---");
        Properties prop=myCollection.getMyProp();
        System.out.println(prop.getProperty("propKeyA"));
        System.out.println(prop.getProperty("propKeyB"));        
        //Access Book List
        System.out.println("---Access Book List---");
        System.out.println(myCollection.getBookList().get(0).getBookName());
        System.out.println(myCollection.getBookList().get(1).getBookName());
       */
    } 
    
}
