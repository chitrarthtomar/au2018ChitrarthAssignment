package test;



@interface Student{
	int rollno();
	String name();
}



public class AnnotationTest {
	public static void main(String args[]) {
	}
	@Student(rollno=1,name="Chit")
	public String toString() {
		return "toString method is overridden";
	}

}
