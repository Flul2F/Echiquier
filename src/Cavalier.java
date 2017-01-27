/**
 * Created by chemin.cdi04 on 27/01/2017.
 */
public class Cavalier extends Piece {
    @Override
    public void positionPossible(Position vposition) {

    }

    @Override
    public char getSymbole() {
        return 'C';
    }

    @Override
    public int getValeur() {
        return 3;
    }

    protected Cavalier (char vcouleur, Position vposition) {
        super(vcouleur, vposition);
    }
}
