package PracticePrograms;

import java.util.Arrays;
import java.util.List;

public class ManyToManyAssociation {

	public static void main(String[] args) {
		

	}

}

class StudyMaterials{
	
	List<Trainee> trainee;
	private String materialName;
	public StudyMaterials(List<Trainee> trainee, String materialName) {
		super();
		this.trainee = trainee;
		this.materialName = materialName;
	}
	public List<Trainee> getTrainee() {
		return trainee;
	}
	public void setTrainee(List<Trainee> trainee) {
		this.trainee = trainee;
	}
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	
}
