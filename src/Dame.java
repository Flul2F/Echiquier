/**
 * Created by chemin.cdi04 on 27/01/2017.
 */
public class Dame extends Piece {
    @Override
    public void positionPossible(Position vposition) {

    }

    @Override
    public char getSymbole() {
        return 'D';
    }

    @Override
    public int getValeur() {
        return 9;
    }

    protected Dame(char vcouleur, Position vposition) {
        super(vcouleur, vposition);
    }
}
