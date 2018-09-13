import java.io.*;
public class EmployeeTest{
 
   public static void main(String []args){
    /* 使用构造器创建两个对象 */
    Employee empOne = new Employee("RUNOOB1");
    Employee empTwo = new Employee("RUNOOB2");

    // 
    empOne.empAge(26);
    empOne.empDesignation("senior");
    empOne.empSalary(1000);
    empOne.printEmployee();

    empTwo.empAge(21);
    empTwo.empDesignation("junior");
    empTwo.empSalary(500);
    empTwo.printEmployee();

    StringBuffer sBuffer = new StringBuffer("website:");
    sBuffer.append("www");
    sBuffer.append(".runoob");
    sBuffer.append(".com");
    System.out.println(sBuffer);  
    System.out.println("adverse:"+sBuffer.reverse()+", len:"+ sBuffer.capacity());  
   }
}