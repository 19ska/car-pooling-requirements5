
class MemberCar {
    int memberCarId;
    int memberId;
    int carId;
    String registrationNumber;
    String color;

    public MemberCar() {
		super();
	}

	public MemberCar(int memberCarId, int memberId, int carId, String registrationNumber, String color) {
        this.memberCarId = memberCarId;
        this.memberId = memberId;
        this.carId = carId;
        this.registrationNumber = registrationNumber;
        this.color = color;
    }
	

    public int getMemberCarId() {
		return memberCarId;
	}

	public void setMemberCarId(int memberCarId) {
		this.memberCarId = memberCarId;
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

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static MemberCar createMemberCar(String str) {
        String[] parts = str.split(",");
        int memberCarId = Integer.parseInt(parts[0]);
        int memberId = Integer.parseInt(parts[1]);
        int carId = Integer.parseInt(parts[2]);
        String registrationNumber = parts[3];
        String color = parts[4];
        System.out.println("Parsed color: " + color);
        return new MemberCar(memberCarId, memberId, carId, registrationNumber, color);
    }
}
