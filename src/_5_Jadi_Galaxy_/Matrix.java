package _5_Jadi_Galaxy_;

public class Matrix {
    private int x;
    private int y;
   private int[][] matrix;

   public Matrix(int x, int y){
       this.x = x;
       this.y = y;
       this.matrix = new int[x][y];
   }

    public void fillTheMatrix(int x, int y) {
        int value = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                this.matrix[i][j] = value++;
            }
        }
    }

    public int getLength() {
        return this.matrix[1].length;
    }

    public boolean  isItInTheField (int row, int col){
       boolean isIt = false;
       if(row < this.matrix.length && col >= 0 && col < this.matrix[0].length){

           isIt = true;
       }
       return isIt;
    }
    public boolean  isPlayerInTheField (int row, int col){
        boolean isIt = false;
        if(row < this.matrix.length && col >= 0 && col < this.matrix[0].length){

            isIt = true;
        }
        return isIt;
    }
    public void setMatrix(int x, int y) {
        this.matrix [x][y] = 0;
    }

    public int getMatrix(int x, int y) {
       int sum = this.matrix[x][y];
       this.matrix[x][y] = 0;
        return sum;
    }

}
