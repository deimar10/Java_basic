package week5;

public class Ex87 {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Ex87(int rooms, int squareMeters, int pricePerSquareMeter){
       this.rooms = rooms;
       this.squareMeters = squareMeters;
       this.pricePerSquareMeter = pricePerSquareMeter;
    }
    public boolean larger(Ex87 twoRoomsBrooklyn){
        if (twoRoomsBrooklyn.squareMeters < this.squareMeters){
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Ex87  studioManhattan = new Ex87(1, 16,
                5500);
        Ex87 twoRoomsBrooklyn = new Ex87(2,38,
                4200);
        Ex87 fourAndKitchenBronx = new Ex87(3, 78,
                2500);

        System.out.println(studioManhattan.larger(twoRoomsBrooklyn));
        System.out.println( fourAndKitchenBronx.larger(twoRoomsBrooklyn) );
    }
}
