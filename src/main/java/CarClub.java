
import java.util.*;

public class CarClub {
    public static Map<String, List<MemberCar>> groupByColor(List<Car> carList, List<Member> memberList, List<MemberCar> memberCarList) {
        Map<String, List<MemberCar>> result = new HashMap<>();
        for (Car car : carList) {
            for (MemberCar memberCar : memberCarList) {
                if (car.carId == memberCar.carId) {
                    String color = memberCar.color; // Debug statement to print the color
                    System.out.println("Color: " + color);
                    result.computeIfAbsent(color, k -> new ArrayList<>()).add(memberCar);
                }
            }
        }
        return result;
    }
}
