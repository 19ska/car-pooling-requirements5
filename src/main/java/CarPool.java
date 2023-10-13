import java.util.Scanner;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class CarPool {
    public static void main(String[] args) {
        ArrayList<Members> memberList = new ArrayList<>();
        ArrayList<Car> carList = new ArrayList<>();
        ArrayList<MemberCarList> memberCarList = new ArrayList<>();
        
        
     // Create member objects
        String[] memberData = {
            "1,joe,root,joe.root@a.com,1234567890,AH1,12-12-2001,12-12-2010",
            "2,ben,stokes,ben.stokes@a.com,2345678901,AH2,12-12-2002,12-12-2011",
            "3,virat,kohli,virat.kohli@a.com,3456789012,AH3,12-12-2003,12-12-2012"
        };

        for (String data : memberData) {
            Members member = Members.createMember(data);
            memberList.add(member);
        }

        // Create car objects
        String[] carData = {
            "1,i10,sports,2007,Hyundai,8",
            "2,alto,kx1,2008,Maruti,6",
            "3,polo,topline,2010,Volks,5",
            "4,kwid,lxi,2010,Renault,5"
        };

        for (String data : carData) {
            Car car = Car.createCar(data);
            carList.add(car);
        }

        // Assign cars to members
        String[] memberCarData = {
            "1,1,2,TN66AB4214,brown",
            "2,1,1,TN38BR9689,white",
            "3,2,4,TN61EB4004,white"
        };

        for (String data : memberCarData) {
            String[] parts = data.split(",");
            int memberId = Integer.parseInt(parts[0]);
            int carId = Integer.parseInt(parts[1]);
            String regNumber = parts[3];
            String color = parts[4];
            memberCarList.add(new MemberCarList(memberId, carId, regNumber, color));
        }
        
        // Group cars by color
        Map<String, List<MemberCarList>> colorToMembers = groupByColor(carList, memberList, memberCarList);

        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Color to search");
        String colorToSearch = scanner.nextLine();
        System.out.println("Number of member cars");
        int numMemberCars = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
     // Collect car number details from the user
        List<String> carNumberDetails = new ArrayList<>();
        System.out.println("Enter the member car details");
        for (int i = 0; i < numMemberCars; i++) {
            String carDetails = scanner.nextLine();
            carNumberDetails.add(carDetails);
        }

        // Output
        System.out.println(colorToSearch + " car registration numbers:");
        for (String carDetails : carNumberDetails) {
            String[] parts = carDetails.split(",");
            String regNumber = parts[3];
            if (colorToMembers.containsKey(colorToSearch)) {
                List<MemberCarList> memberCars = colorToMembers.get(colorToSearch);
                for (MemberCarList memberCar : memberCars) {
                    if (memberCar.regNumber.equals(regNumber)) {
                        System.out.println(regNumber);
                    }
                }
            }
        }

        scanner.close();
    }

        // Output
    //    for (int i = 0; i < numMemberCars; i++) {
      //      String regNumber = scanner.nextLine();
        //    if (colorToMembers.containsKey(colorToSearch)) {
          //      List<MemberCarList> memberCars = colorToMembers.get(colorToSearch);
            //    for (MemberCarList memberCar : memberCars) {
              //      if (memberCar.regNumber.equals(regNumber)) {
                //        System.out.println(regNumber);
                  //  }
                //}
            //}
       // }

        //scanner.close();
    //}
    
    
    public static Map<String, List<MemberCarList>> groupByColor(ArrayList<Car> carList, ArrayList<Members> memberList, ArrayList<MemberCarList> memberCarList) {
        Map<String, List<MemberCarList>> colorToMembers = new HashMap<>();

        for (Car car : carList) {
            String color = car.color;
            if (color != null) {
                color = color.toLowerCase();
            } else {
                color = "Unknown"; // Handle null colors as "Unknown" or whatever you prefer
            }

            List<MemberCarList> membersWithColor = memberCarList.stream()
                    .filter(mc -> mc.carId == car.id)
                    .collect(Collectors.toList());

            if (!colorToMembers.containsKey(color)) {
                colorToMembers.put(color, new ArrayList<>());
            }

            colorToMembers.get(color).addAll(membersWithColor);
        }

        return colorToMembers;
    }

}
        
        
        