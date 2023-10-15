
public class WorkRoom implements Object,ClassRoom {
    private int NumberOfTables;
    private boolean Computer;

    public WorkRoom(){
        Computer=true;
        NumberOfTables=12;
    };
    public WorkRoom(int NumberOfTables,boolean Computer){
        this.NumberOfTables=NumberOfTables;
        this.Computer=Computer;
    }
    public boolean GetNumberOfComputers(){
        return Computer;
    }
    @Override
    public void print() {
        if (!Computer){
        System.out.println(" Общее количество мест в кабинете "+ CountCapacity()+ " Имеется компьютер");
        }
        else{
            System.out.println(" Общее количество мест в кабинете "+ CountCapacity()+ " не имеется компьютер");
        }
    }

    @Override
    public int CountCapacity() {
        return NumberOfTables*2;

    }
}
