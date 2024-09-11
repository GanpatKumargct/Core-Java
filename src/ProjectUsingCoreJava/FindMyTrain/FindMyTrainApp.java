package ProjectUsingCoreJava.FindMyTrain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMyTrainApp {
    public static void main(String[] args) {
        TrainSystem system = new TrainSystem();


        //adding Station
        Station station1 = new Station("S00041", "salem");
        Station station2 = new Station("S00055", "mumbai");

        //adding newTrain
        Train train1 = new Train("12003","Ernakulam Express","SuperFast");
        Train train2 = new Train("12680","SMVT Express","Passenger");

        //Adding platform
        Platfrom p1 = new Platfrom(1);
        Platfrom p2 = new Platfrom(2);

        List<Platfrom> platfromList = new ArrayList<>();
        platfromList.add(p1);
        platfromList.add(p2);

        //adding platform in to station
        station1.setPlatfromList(platfromList);
        station2.setPlatfromList(platfromList);


        //Adding Schedule
        Schedule s1=new Schedule(train1,station1,"9AM","9:05AM",p1);
        Schedule s2=new Schedule(train2,station2,"10AM","10:02AM",p2);

        //adding station to system
        system.addStations(station1);
        system.addStations(station2);

        //adding train to system
        system.addTrain(train1);
        system.addTrain(train2);

        //adding schedule to system
        system.addSchedule(s1);
        system.addSchedule(s2);

        //let's find train between stations
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the source :");
        String source =sc.nextLine();
        System.out.println("Enter the destination:");
        String des=sc.nextLine();
        List<Schedule> myTrains = system.findMyTrains(source, des);
        System.out.println("Your Trains Between "+ source+"and "+des);
        for(Schedule schedule:myTrains)
        {
            System.out.println(schedule);
        }
    }

}
