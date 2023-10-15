public class LectureHall implements Object,ClassRoom {
    private int NumberOfRows;
    private int NumberOfPlaces;
    private boolean projector;
    public LectureHall(){
        NumberOfPlaces = 12;
        NumberOfRows = 14;
        projector=true;
    }
    public LectureHall(int NumberOfPlaces,int NumberOfRows,boolean projector){
        this.projector=projector;
        this.NumberOfPlaces=NumberOfPlaces;
        this.NumberOfRows=NumberOfRows;
    }
    public LectureHall(int NumberOfPlaces,int NumberOfRows){
        this.NumberOfRows=NumberOfRows;
        this.NumberOfPlaces=NumberOfPlaces;
        projector=false;

    }
    @Override
    public void print() {
        if (!projector) {
            System.out.println("Колличество посадочных мест в лекциооной аудитории " + CountCapacity() + ".Имеется проектор.");
        }else{
            System.out.println("Колличество посадочных мест в лекциооной аудитории " + CountCapacity() + ".Не имеется проектор.");
        }
    }
    @Override
    public int CountCapacity() {
       return NumberOfPlaces*NumberOfRows;
    }

}
