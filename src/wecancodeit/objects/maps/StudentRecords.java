package wecancodeit.objects.maps;

import java.util.List;

import wecancodeit.objects.students.Student; //control space for options for what should be imported

import java.util.ArrayList;

public class StudentRecords {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		{ // same as new ArrayList<Student>(); shorthand version

			Student harvey = new Student(); // variable names are camel case, that's why harvey starts out lower case
											
			harvey.id = "23A52";
			harvey.name = "Harvey Dent";
			students.add(harvey);

			Student jessica = new Student(); // long way before we created a method
			jessica.id = "68Z29";
			jessica.name = "Jessica Jones";
			students.add(jessica);
			
			Student jj = new Student("57w85", "J Jonah Jameson"); //new way after we created the method
			students.add(jj);
			
			System.out.println(students);
			
			String lookingFor = "Harvey Dent";
			for(Student current: students){ //find name in Student class; 'current' exists only inside FOR loop
				System.out.println("Current: " + current);
				if(lookingFor.equalsIgnoreCase(current.name)) { //if(current.name.equalsIgnoreCase(lookingFor)){
					System.out.println("Found my student. His id is " + current.id);
					break; //found student we don't have to look anymore. stops code so the rest of the students don't show up
				}
				
			}
		System.out.println("Meet jj: " + jj);
			
		}
	}

	public static Student createStudent(String idParam, String nameParam) { //method param
		Student s = new Student(); //anything that comes after new is a new constructor; default constructor
		s.id = idParam;
		s.name = nameParam;
		return s;
	}
}
