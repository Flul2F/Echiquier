/**
 * Created by chemin.cdi04 on 27/01/2017.
 */
public abstract class Piece {
    protected char couleur;
    protected Position position;

    public void seDeplacer() {

    }

    public abstract void positionPossible(Position vposition);

    public abstract char getSymbole();

    public abstract int getValeur();

    protected Piece(char vcouleur, Position vposition){
        this.couleur = vcouleur;
        this.position = vposition;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "couleur=" + couleur +
                ", position=" + position +
                ", valeur=" + getValeur() +
                ", symbole=" + getSymbole() +
                '}';
    }
}
