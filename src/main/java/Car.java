
class Car {
    int carId;
    String modelName;
    String variant;
    int year;
    String make;
    int seats;

    public Car() {
		super();
	}

	public Car(int carId, String modelName, String variant, int year, String make, int seats) {
        this.carId = carId;
        this.modelName = modelName;
        this.variant = variant;
        this.year = year;
        this.make = make;
        this.seats = seats;
    }
	

    public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getVariant() {
		return variant;
	}

	public void setVariant(String variant) {
		this.variant = variant;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public static Car createCar(String str) {
        String[] parts = str.split(",");
        int carId = Integer.parseInt(parts[0]);
        String modelName = parts[1];
        String variant = parts[2];
        int year = Integer.parseInt(parts[3]);
        String make = parts[4];
        int seats = Integer.parseInt(parts[5]);
        return new Car(carId, modelName, variant, year, make, seats);
    }
}
