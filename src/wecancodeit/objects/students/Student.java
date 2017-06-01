package wecancodeit.objects.students;

public class Student {

	public String id;
	public String name;
	
	public Student (){	//constructors always look like this. no extra stuff like 'String' inside
	}
	
	public Student(String idParam, String nameParam) { //same as the 'public static Student' in the StudentRecords class
	id = idParam;			//this.id = id; is another way to write		
	name = nameParam;
	}
	
	
	@Override 
	public String toString (){ //shows toString Object from Object class
		return "Student with id: " + id + ", name: " + name;
	
	}
}
