public class House {
    public int floor;

    public House(int floor) {
        this.floor = floor;
    }
    public String toString() {
        String end;
        if (floor % 10 == 1 && floor% 100 != 11){
            end = "ом";
        }else{
            end = "ами";
        }
        return String.format("дом с %d этаж%s", floor, end);
    }
}