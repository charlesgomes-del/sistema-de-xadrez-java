package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import chess.ChessException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            try {
                UI.clearScreen();
                UI.printMatch(chessMatch, chessMatch.getCapturedPieces());
                System.out.println();

                System.out.print("Origem: ");
                ChessPosition source = UI.readChessPosition(sc);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);

                System.out.println();
                System.out.print("Destino: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

                // INTERCEPTAÇÃO DA PROMOÇÃO
                if (chessMatch.getPromoted() != null) {
                    System.out.print("Entre com a peca para promocao (B/N/R/Q): ");
                    String type = sc.nextLine().toUpperCase();
                    while (!type.equals("B") && !type.equals("N") && !type.equals("R") && !type.equals("Q")) {
                        System.out.print("Tipo invalido! Entre com a peca para promocao (B/N/R/Q): ");
                        type = sc.nextLine().toUpperCase();
                    }
                    chessMatch.replacePromotedPiece(type);
                }

                if (chessMatch.getCheckmate()) {
                    UI.clearScreen();
                    UI.printMatch(chessMatch, chessMatch.getCapturedPieces());
                    break;
                }
            }
            catch (ChessException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
                System.out.print("\nPressione Enter para continuar...");
                sc.nextLine();
            }
            catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
                System.out.print("\nPressione Enter para continuar...");
                sc.nextLine();
            }
        }
    }
}