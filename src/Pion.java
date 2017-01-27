/**
 * Created by chemin.cdi04 on 27/01/2017.
 */
public class Pion extends Piece {
    @Override
    public void positionPossible(Position vposition) {

    }

    @Override
    public char getSymbole() {
        return 'P';
    }

    @Override
    public int getValeur() {
        return 1;
    }

    protected Pion (char vcouleur, Position vposition) {
        super(vcouleur, vposition);
    }
}
