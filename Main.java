// Main.java
public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        System.out.println("RoundPeg fits in RoundHole: " + hole.fits(roundPeg));  // Output: true

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);

        // Using adapter to fit square pegs into round hole
        Adapter smallSquarePegAdapter = new Adapter(smallSquarePeg);
        Adapter largeSquarePegAdapter = new Adapter(largeSquarePeg);

        System.out.println("Small SquarePeg fits in RoundHole: " + hole.fits(smallSquarePegAdapter));
        System.out.println("Large SquarePeg fits in RoundHole: " + hole.fits(largeSquarePegAdapter));
    }
}
