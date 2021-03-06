package domain.model.staff;

import java.util.ArrayList;

public class EmployeeList
{
   ArrayList<Employee> employees;

   public EmployeeList()
   {
      this.employees = new ArrayList<Employee>();
   }

   public void addEmployee(Employee employee)
   {
      employees.add(employee);

   }

   public void removeEmployee(Employee employee)
   {
      employees.remove(employee);

   }

   public Employee getEmployeeByName(String name)
   {
      for (int i = 0; i < employees.size(); i++)
      {
         if (employees.get(i).getFirstName().equalsIgnoreCase(name))
         {
            return employees.get(i);
         }
      }
      System.out.println(
            " we can not find the employee wiht the name : " + name + "!! ");
      return null;
   }

   public Employee getEmployeeById(String id)
   {
      for (int i = 0; i < employees.size(); i++)
      {
         if (employees.get(i).getId().equals(id))
         {
            return employees.get(i);
         }
      }
      System.out.println(
            " we can not find that employee id in the system  : " + id + "!! ");
      return null;
   }

   public Employee editEmployee(String oldName, String newName)
   {
      Employee employee = getEmployeeByName(oldName);

      employee.setFirstName(newName);

      return employee;

   }

   public Employee searchEmployeeByName(String name)
   {
      Employee employee = getEmployeeByName(name);

      return employee;

   }

   

      public int getNumerOfEmployees() {
         return employees.size();
      }
}
