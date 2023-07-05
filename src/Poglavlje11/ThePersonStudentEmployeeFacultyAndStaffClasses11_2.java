package Poglavlje11;

import Klase.*;

public class ThePersonStudentEmployeeFacultyAndStaffClasses11_2 {
    public static void main(String[] args) {

        Person person = new Person("Aco","Brijestovi 12","065777777",
                "Aco@gmail.com");

        Student student = new Student("Pero", "Njegoseva bb.","065666666",
                "pero@gmail.com",3);

        Employee employee = new Employee("Ana","lipova","065333333",
                "ana@gmail.com",43,1760);

        Faculty faculty = new Faculty("Dara","Sv Save 15.","066332332",
                "dara@gmail.com",42,1900, "Od 7h do 15h",
                "finansijki direktor");

        Staff staff = new Staff("Simo","Kralja Petra 13.","066456789",
                "simo@gmail.com",45,1800,"dr. nauka");

        System.out.println(person.toString()+"\n");
        System.out.println(student.toString()+"\n");
        System.out.println(employee.toString()+"\n");
        System.out.println(faculty.toString()+"\n");
        System.out.println(staff.toString()+"\n");
    }
}
