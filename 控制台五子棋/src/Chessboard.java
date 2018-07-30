/**
 * Created by lenovo on 2018/7/27.
 */
public class Chessboard {
    static int BOARD_SIZE = 22;
    String[][] board;
    /**
     * 返回棋盘，以二位数据组的形式保存棋盘
     * @return 返回棋盘
     */
    public String[][] getBoard()
    {
        return this.board;
    }

    /**
     * 初始化棋盘，游戏开始时就要调用该方法
     */
    public void initBoard()
    {
        //初始化棋盘
        board = new String[BOARD_SIZE][BOARD_SIZE];
        for(int i=0;i<BOARD_SIZE;i++){
            for(int j=0;j<BOARD_SIZE;j++){
                board[i][j] =  "十";
            }
        }
    }

    /**
     * 在各方每一次下棋后，棋盘发生改变则要将棋盘输出
     */
    public void printBoard()
    {
        for(int i=0;i<BOARD_SIZE;i++){
            for(int j=0;j<BOARD_SIZE;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * 该方法用于将棋子设置到棋盘上
     * @param posX 是新下棋子的x坐标
     * @param posY 是新下棋子的y坐标
     * @param chessman 是新下棋子的类型
     */
    public void setBoard(int posX,int posY,String chessman)
    {
        this.board[posX][posY] = chessman;
    }

    public static void main(String[] args) {
        Chessboard cb = new Chessboard();
        cb.initBoard();
        cb.printBoard();
    }
}
