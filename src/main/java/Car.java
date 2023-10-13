public class Car {
	long id;
	
	private String name;
	private String model;
	private int makeYear;
	private String company;
	private int comfortLevel;

	public String color;


	
	public Car() {
		super();
	}

	public Car(long id, String name, String model, int makeYear, String company, int comfortLevel) {
		this();
		this.id = id;
		this.name = name;
		this.model = model;
		this.makeYear = makeYear;
		this.company = company;
		this.comfortLevel = comfortLevel;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMakeYear() {
		return makeYear;
	}

	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getComfortLevel() {
		return comfortLevel;
	}

	public void setComfortLevel(int comfortLevel) {
		this.comfortLevel = comfortLevel;
	}
	
	//public static Car findCar(long carid) {
	//	return null;
	//}
	
	
	public static Car createCar(String str) {
        String[] parts = str.split(",");
        long id = Long.parseLong(parts[0]);
        String name = parts[1];
        String model = parts[2];
        int makeYear = Integer.parseInt(parts[3]);
        String company = parts[4];
        int comfortLevel = Integer.parseInt(parts[5]);

        return new Car(id, name, model, makeYear, company, comfortLevel);
    }
	
	
	
	
	
	
	
}