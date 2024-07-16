public class Adapter extends RoundPeg {
    private SquarePeg Peg;
    public Adapter(SquarePeg Peg){

        this.Peg=Peg;
    }

    @Override
    public double GetRadius(){
        return (Math.sqrt(2) * Peg.GetWidth()) / 2;
    }
}

