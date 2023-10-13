
class Member {
    int memberId;
    String firstName;
    String lastName;
    String email;
    long phoneNumber;
    String licenseNumber;
    String dateOfJoining;
    String dateOfExpiry;
    
    

    public Member() {
		super();
	}

	public Member(int memberId, String firstName, String lastName, String email, long phoneNumber, String licenseNumber, String dateOfJoining, String dateOfExpiry) {
        this.memberId = memberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.licenseNumber = licenseNumber;
        this.dateOfJoining = dateOfJoining;
        this.dateOfExpiry = dateOfExpiry;
    }
	
	

    public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public static Member createMember(String str) {
        String[] parts = str.split(",");
        int memberId = Integer.parseInt(parts[0]);
        String firstName = parts[1];
        String lastName = parts[2];
        String email = parts[3];
        long phoneNumber = Long.parseLong(parts[4]);
        String licenseNumber = parts[5];
        String dateOfJoining = parts[6];
        String dateOfExpiry = parts[7];
        return new Member(memberId, firstName, lastName, email, phoneNumber, licenseNumber, dateOfJoining, dateOfExpiry);
    }
}
