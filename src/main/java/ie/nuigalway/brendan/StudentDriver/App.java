package ie.nuigalway.brendan.StudentDriver;

import java.util.ArrayList;

import ie.nuigalway.brendan.StudentRegistration.CourseProgram;
import ie.nuigalway.brendan.StudentRegistration.Module;
import ie.nuigalway.brendan.StudentRegistration.Student;

public class App 
{
    public static void main( String[] args )
    {
    	Student a = new Student("alan", "1/1/1990", 27, 12345);
        Student b = new Student("barry", "1/1/1991", 26, 12346);
        Student c = new Student("clare", "1/1/1992", 25, 12347);
        Student d = new Student("dave", "1/1/1993", 24, 12348);
    	ArrayList<Student> studentListMaths = new ArrayList<Student>();
    	studentListMaths.add(a);
    	ArrayList<Student> studentListEnglish = new ArrayList<Student>();
    	studentListEnglish.add(a);
    	ArrayList<Student> studentListScience = new ArrayList<Student>();
    	studentListScience.add(a);
    	ArrayList<Student> studentListProgramming = new ArrayList<Student>();
    	studentListProgramming.add(b);
        Module m1 = new Module("maths", studentListMaths, "EE333" );
        Module m2 = new Module("english", studentListEnglish, "EE334" );
        Module m3 = new Module("science", studentListScience, "EE335" );
        Module m4 = new Module("programming", studentListProgramming, "EE336" );
        m1.addStudent(b);
        m2.addStudent(b);
        m1.addStudent(c);
        m3.addStudent(c);
        m4.addStudent(c);
        m2.addStudent(d);
        m3.addStudent(d);
        m4.addStudent(d);
        ArrayList<Module> modules = new ArrayList<Module>();
        modules.add(m1);modules.add(m2);modules.add(m3);modules.add(m4);
        
        CourseProgram cp = new CourseProgram("MESP Course", modules, null, null);
        System.out.println("Course Name: " + cp.getCourseName());
        
        for (Module m : cp.getModuleList()){
        	System.out.println("Module Name: " + m.getModuleName());
        	System.out.println("Registered Students: ");
        	for (Student s : m.getStudentList()){
        		System.out.println(s.getName());
        	}
        }    
    }
}
