package LearningJava;

public class GetterSetterExamples {

	int grade;
	String StudName;
	String GradName;



	public void setGrade(int grade) {
		this.grade = grade;
		//System.out.println(this.grade);
	
	
}
	public void getGrade() {
		//this.grade = grade;
		System.out.println("my grade is" + this.grade);
	
	
}
public void getStudName() {
	System.out.println("student name is" + this.StudName);
	}
	public void setStudName(String studName) {
		this.StudName = studName;
}
public String getGradName() {
	return GradName;
	
}
public void setGradName(String gradName) {
	this.GradName = gradName;
}
	
	
	
}
