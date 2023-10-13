

public class Members {
    private long id;
    private String firstname;
    private String lastname;
    private String email;
    private String contactNum;
    private String licStartDate;
    private String licExpiryDate;

    public Members() {
        super();
    }

    public Members(long id, String firstname, String lastname, String email, String contactNum, String licStartDate, String licExpiryDate) {
        this();
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.contactNum = contactNum;
        this.licStartDate = licStartDate;
        this.licExpiryDate = licExpiryDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getLicStartDate() {
        return licStartDate;
    }

    public void setLicStartDate(String licStartDate) {
        this.licStartDate = licStartDate;
    }

    public String getLicExpiryDate() {
        return licExpiryDate;
    }

    public void setLicExpiryDate(String licExpiryDate) {
        this.licExpiryDate = licExpiryDate;
    }

    public static Members createMember(String str) {
        String[] parts = str.split(",");
        Long id = (long) Integer.parseInt(parts[0]);
        String firstName = parts[1];
        String lastName = parts[2];
        String email = parts[3];
        String contactNum = parts[4];
        String licStartDate = parts[5];
        String licExpiryDate = parts[6];

        return new Members(id, firstName, lastName, email, contactNum, licStartDate, licExpiryDate);
    }

    
}
