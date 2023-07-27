package pkg09Generics;

public class Ex05Enum {
    public static void main(String[] args) {
        System.out.println(Direction1.NORTH);
        System.out.println(Direction2.NORTH.name());
        System.out.println(Direction2.NORTH.ordinal());

        System.out.println();
        System.out.println(Direction3.EAST);
        System.out.println(Direction3.EAST.name());
        System.out.println(Direction3.EAST.getValue());

        System.out.println();
        System.out.println(Direction4.WEST.getSymbol());
    }
}

class Direction1 {
    final static int NORTH = 0; final static int EAST = 1;
    final static int SOUTH = 2; final static int WEST = 3;



}

enum Direction2 {
    NORTH, EAST, SOUTH, WEST
}

enum Direction3 {
    NORTH(10), EAST(20), SOUTH(30), WEST(40);
    private final int value;

    Direction3(int value) {
        this.value = value;
    }

    public  int getValue() {
        return value;
    }
}

enum Direction4 {
    NORTH(10, "^"), EAST(20, ">"), SOUTH(30,"∨"), WEST(40,"<");
    private final int value;
    private final String symbol;
    Direction4(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public  int getValue() {
        return value;
    }
    public String getSymbol() {
        return symbol;
    }
}