package ProjectUsingCoreJava.FindMyTrain;

public class Platfrom {
    private int plateFormNumber;
    private Train train;

    public Platfrom(int plateFormNumber) {
        this.plateFormNumber = plateFormNumber;
    }

    public int getPlateFormNumber() {
        return plateFormNumber;
    }

    public void setPlateFormNumber(int plateFormNumber) {
        this.plateFormNumber = plateFormNumber;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Platfrom{");
        sb.append("plateFormNumber=").append(plateFormNumber);
        sb.append(", train=").append(train);
        sb.append('}');
        return sb.toString();
    }
}
