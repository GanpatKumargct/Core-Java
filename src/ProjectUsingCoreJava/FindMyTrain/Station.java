package ProjectUsingCoreJava.FindMyTrain;

import java.util.ArrayList;
import java.util.List;

public class Station {
    private String stationId;
    private String stationName;

    private List<Platfrom> platfromList;

    public Station(String stationId, String stationName) {
        this.stationId = stationId;
        this.stationName = stationName;
        this.platfromList = new ArrayList<>();
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getStringName() {
        return stationName;
    }

    public void setStringName(String stringName) {
        this.stationName = stringName;
    }

    public List<Platfrom> getPlatfromList() {
        return platfromList;
    }

    public void setPlatfromList(List<Platfrom> platfromList) {
        this.platfromList = platfromList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Station{");
        sb.append("stationId='").append(stationId).append('\'');
        sb.append(", stringName='").append(stationName).append('\'');
        sb.append(", platfromList=").append(platfromList);
        sb.append('}');
        return sb.toString();
    }


}
