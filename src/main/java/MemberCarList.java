public class MemberCarList {
	private int memberId;
   int carId;
    String regNumber;
    private String color;
	public MemberCarList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberCarList(int memberId, int carId, String regNumber, String color) {
		super();
		this.memberId = memberId;
		this.carId = carId;
		this.regNumber = regNumber;
		this.color = color;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}