public class ComputerLab extends Laboratary{
    private int NumberOfComputers;
    private  int NumberOfRoom;
    public ComputerLab()
    {
        NumberOfComputers=20;
        NumberOfRoom=210;
    }
    public ComputerLab(int NumberOfComputers,int NumberOfRoom ){
        this.NumberOfRoom=NumberOfRoom;
        this.NumberOfComputers=NumberOfComputers;

    }

    @Override
    public int CountCapacity() {
        return GetInfoAboutEquipment()*2;
    }

    @Override
    public void print() {
        System.out.println("В компьютерной лаборатории "+GetNumberOfRoom()+ " количество рабочих мест  "  + CountCapacity());
    }
    public int GetInfoAboutEquipment () {
        return NumberOfComputers;
    }
    public int GetNumberOfRoom() {
        return NumberOfRoom;
    }

}
