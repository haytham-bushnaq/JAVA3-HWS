/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java3hws1;

import javax.swing.JOptionPane;


public class Java3HWS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Employee[] employee = new Employee[10];
        for (int i = Employee.count; i < employee.length; i++) {
            Employee e = new Employee();
            e.setName(JOptionPane.showInputDialog(null, "Name", "Employee", JOptionPane.INFORMATION_MESSAGE));
            e.setDepartment(JOptionPane.showInputDialog(null, "Department", "Employee", JOptionPane.INFORMATION_MESSAGE));
            e.setSalary(Double.parseDouble(JOptionPane.showInputDialog(null, "Salary", "Employee", JOptionPane.INFORMATION_MESSAGE)));
            employee[i] = e;
            
        }
        sortByName(employee);
        showData(employee);
      

    }

    public static void sortBySalary(Employee[] e) {

        for (int i = 0; i < e.length; i++) {
            for (int j = i + 1; j < e.length; j++) {
                if (e[j].getSalary() > e[i].getSalary()) {
                    Employee temp = e[i];
                    e[i] = e[j];
                    e[j] = temp;
                }
            }
        }

    }

    public static void sortByName(Employee[] e) {

        for (int i = 0; i < e.length - 1; i++) {
            for (int j = i + 1; j < e.length; j++) {
                if (e[i].getName().compareTo(e[j].getName()) > 0) {
                    Employee temp = e[i];
                    e[i] = e[j];
                    e[j] = temp;
                }
            }
        }

    }

    private static void showData(Employee[] employees) {
        System.out.println("==================");
        System.out.printf("%-10s%-12s%-13s\n", "Name", "Department", "Salary");
        for (Employee employee : employees) {
            System.out.printf("%-10s%-12s%-13.2f\n",
                    employee.getName(),
                    employee.getDepartment(), employee.getSalary());
        }
    }

}
