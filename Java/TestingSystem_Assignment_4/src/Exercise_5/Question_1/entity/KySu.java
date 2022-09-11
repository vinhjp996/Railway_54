package Exercise_5.Question_1.entity;

public class KySu extends CanBo {

	// training industry: ngành đào tạo
	private String trainingIndustry;

	public KySu(String name, int age, String address, String trainingIndustry) {
		super(name, age, address);
		this.trainingIndustry = trainingIndustry;

	}

	public String getTrainingIndustry() {
		return trainingIndustry;
	}

	public void setTrainingIndustry(String trainingIndustry) {
		this.trainingIndustry = trainingIndustry;
	}

	@Override
	public String toString() {
		return super.toString() + " KySu [trainingIndustry=" + trainingIndustry + "]";
	}

}
