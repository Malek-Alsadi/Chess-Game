package PiecesCollection;

import GameBases.*;

public class Bishop extends Piece {
    public Bishop(Color color) {
        setColor(color);
    }

    @Override
    public boolean canMove(Location begin, Location end, ChessBoard board) {
        moveAbility movement = new moveAbility(new Diagonal());
        return movement.canMove(begin,end,board);
    }

    @Override
    public String toString() {
        String coloring = "\u001B[3";
        if(getColor().equals(Color.Black))
            coloring += "0m";
        else
            coloring += "7m";
        coloring+=" BISHOP ";
        coloring+="\u001B[0m";
        return coloring;
    }
}
