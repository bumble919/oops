import java.util.Scanner;

class Employee
{
    int eNo, eSalary;
    String eName;

    public Employee(){}

    public Employee(int no, int sal, String name)
    {
        eNo = no;
        eSalary = sal;
        eName = name;
    }

    public void showData()
    {
        System.out.println("EmpId = " + eNo + " Name = " + eName + " Salary = " + eSalary);
        System.out.println();
    }
}

class EmpArrObjects
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of employees:");
        int n = sc.nextInt();

        Employee employees[] = new Employee[n];

        int eid, esal;
        String enam;

        System.out.println("Enter employee details one by one:");

        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter employee " + (i+1) + " details:");

            System.out.print("Enter employee id: ");
            eid = sc.nextInt();

            System.out.print("Enter employee name: ");
            enam = sc.next();

            System.out.print("Enter employee salary: ");
            esal = sc.nextInt();

            employees[i] = new Employee(eid, esal, enam);
        }

        System.out.println("\nEmployees are:\n");

        for(Employee y : employees)
        {
            y.showData();
        }

        System.out.print("Enter employee number to search: ");
        int semp = sc.nextInt();

        boolean found = false;

        for(Employee e : employees)
        {
            if(semp == e.eNo)
            {
                found = true;
                System.out.println("Employee found:");
                e.showData();
                break;
            }
        }

        if(!found)
        {
            System.out.println("Employee not found.");
        }

        sc.close();
    }
}
