package _5_Jadi_Galaxy_;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();
        int[] dimensions = Parser.parser(reader.read());
        int x = dimensions[0];
        int y = dimensions[1];

        Matrix galaxy = new Matrix(x, y);

       galaxy.fillTheMatrix(x, y);

        String command = reader.read();
        long sum = 0;
        while (!command.equals("Let the Force be with you")) {

            int[] playerPosition = Parser.parser(command);
            int[] enemyPosition = Parser.parser(reader.read());

            int enemyRow = enemyPosition[0];
            int enemyCols = enemyPosition[1];

            while (enemyRow >= 0 && enemyCols >= 0) {

                if ( galaxy.isItInTheField(enemyRow, enemyCols)) {
                    galaxy.setMatrix(enemyRow, enemyCols);
                }
                enemyRow--;
                enemyCols--;
            }


            int playerRow = playerPosition[0];
            int playerCols = playerPosition[1];

            while (playerRow >= 0 && playerCols < galaxy.getLength()) {
                if ( galaxy.isPlayerInTheField(playerRow, playerCols)) {
                    sum += galaxy.getMatrix(playerRow, playerCols);

                }
                playerCols++;
                playerRow--;
            }

            command = reader.read();
        }

        System.out.println(sum);
    }


}
