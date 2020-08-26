import java.util.TreeSet;

import java.util.Set;
class Employee implements Comparable<Employee>
{
   String name;
   int age;
   double income;
   Employee(String n,int a,double d)
   {
      name=n;
      age=a;
      income=d;
   }
   public int compareTo(Employee ob)
   {
      return this.name.compareTo(ob.name);
   }
   public String toString()
   {
      return "Employee name:"+name+" age:"+age+" income:"+income;
   }
}
class EmployeeDemo
{
   public static void main(String args[])
   {
      System.out.println("Employee Demo");
      TreeSet<Employee> A=new TreeSet<>();
      A.add(new Employee("xyz",65,5000));
      A.add(new Employee("abc",36,7000));
      A.add(new Employee("mnl",70,11000));
      A.add(new Employee("def",45,5000));
      TreeSet<Employee> B=new TreeSet<Employee>();
      for(Employee x:A)
      {
         if(x.age>60)
         {
            B.add(x);
         }
      }
      printEmployee(B);
      TreeSet<Employee> C=new TreeSet<Employee>();      
      for(Employee y:A)
      {
         if(y.income<10000)
         {
            C.add(y);
         }
      }
      printEmployee(C);
      TreeSet<Employee> D=new TreeSet<Employee>(B); 
      D.retainAll(C);
      printEmployee(D);
   }
   static void printEmployee(TreeSet<Employee> x)
   {
      for(Employee k:x)
      {
         System.out.println(k);
      }
   }
}