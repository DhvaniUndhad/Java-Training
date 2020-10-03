package PracticePrograms;

import java.util.List;

public class Trainee {
	
	private String name;
	List<StudyMaterials> studyMaterials;
	private String course;
	public Trainee(String name, List<StudyMaterials> studyMaterials, String course) {
		super();
		this.name = name;
		this.studyMaterials = studyMaterials;
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<StudyMaterials> getStudyMaterials() {
		return studyMaterials;
	}
	public void setStudyMaterials(List<StudyMaterials> studyMaterials) {
		this.studyMaterials = studyMaterials;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	

}
