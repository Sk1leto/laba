// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    WorkRoom room1=new WorkRoom(20,true);
    ChemistryLab ch1= new ChemistryLab(115,12);
    ComputerLab cm1=new ComputerLab(13,220);
    LectureHall l1=new LectureHall(10,12,true);
    room1.print();
    l1.print();
        cm1.print();
        ch1.print();

    }
}