package ProjectUsingCoreJava.FindMyTrain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainSystem {
    private Map<String, Station> stationMap = new HashMap<>();
    private Map<String, Train> trainMap = new HashMap<>();
    private List<Schedule> schedules = new ArrayList<>();

    //adding station method with stationMap
    public void addStations(Station station){
        stationMap.put(station.getStationId(), station);
    }
    //adding station method with trainMap
    public void addTrain(Train train){
        trainMap.put(train.getTrainId(),train);
    }
    //adding station method with schedules
    public void addSchedule(Schedule schedule){
        schedules.add(schedule);
    }

    public List<Schedule> findMyTrains(String startStationName, String endStationName){
       List<Schedule> res = new ArrayList<>();
       for (Schedule schedule : schedules){
           if (schedule.getStation().getStringName().equals(startStationName)|| schedule.getStation().getStringName().equals(endStationName)){
               res.add(schedule);
           }
       }
       return res;

    }
    
}
