import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Member objects from the provided data
        List<Member> memberList = new ArrayList<>();
        memberList.add(Member.createMember("1,joe,root,joe.root@a.com,1234567890,AH1,12-12-2001,12-12-2010"));
        memberList.add(Member.createMember("2,ben,stokes,ben.stokes@a.com,2345678901,AH2,12-12-2002,12-12-2011"));
        memberList.add(Member.createMember("3,virat,kohli,virat.kohli@a.com,3456789012,AH3,12-12-2003,12-12-2012"));

        // Create Car objects from the provided data
        List<Car> carList = new ArrayList<>();
        carList.add(Car.createCar("1,i10,sports,2007,Hyundai,8"));
        carList.add(Car.createCar("2,alto,kx1,2008,Maruti,6"));
        carList.add(Car.createCar("3,polo,topline,2010,Volks,5"));
        carList.add(Car.createCar("4,kwid,lxi,2010,Renault,5"));

        // Create MemberCar objects
        List<MemberCar> memberCarList = new ArrayList<>();

        System.out.println("Number of member cars");
        int numMemberCars = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter the member car details");
        for (int i = 1; i <= numMemberCars; i++) {
            System.out.print(i + ": ");
            String memberCarInput = scanner.nextLine();
            memberCarList.add(MemberCar.createMemberCar(memberCarInput));
        }

        // Group member cars by color
        System.out.println("Color to search");
        String color = scanner.nextLine();

        Map<String, List<MemberCar>> colorToMemberCars = CarClub.groupByColor(carList, memberList, memberCarList);

        // Display the result
        System.out.println(color + " car registration numbers:");
        List<MemberCar> memberCars = colorToMemberCars.getOrDefault(color, new ArrayList<>());
        for (MemberCar memberCar : memberCars) {
            System.out.println(memberCar.registrationNumber);
        }

        scanner.close();
    }
}
        
        
        