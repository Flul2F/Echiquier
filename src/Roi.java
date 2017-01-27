/**
 * Created by chemin.cdi04 on 27/01/2017.
 */
public class Roi extends Piece {

    protected Roi(char vcouleur, Position vposition) {
        super(vcouleur, vposition);
    }

    @Override
    public void positionPossible(Position vposition) {}

    @Override
    public char getSymbole() {
        return 20;
    }

    @Override
    public int getValeur() {
        return 'R';
    }
}
