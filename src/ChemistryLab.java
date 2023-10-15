public class ChemistryLab extends Laboratary{
    private int NumberOfRoom;
    private int NumberOfChemistryWorkPlaces;
    public ChemistryLab(){
        NumberOfRoom=110;
        NumberOfChemistryWorkPlaces=12;
    };
    public ChemistryLab(int NumberOfRoom,int NumberOfChemistryWorkPlaces){
        this.NumberOfChemistryWorkPlaces=NumberOfChemistryWorkPlaces;
        this.NumberOfRoom=NumberOfRoom;
    }

    public int GetInfoAboutEquipment () {
        return NumberOfChemistryWorkPlaces;
    }

    @Override
    public int CountCapacity() {
        return GetInfoAboutEquipment()*2;
    }

    public int GetNumberOfRoom() {
        return NumberOfRoom;
    }

    @Override
    public void print() {
        {
            System.out.println("Количество рабочих мест в лаборатории"+GetNumberOfRoom()+" по химии " + CountCapacity());
        }
    }

}
