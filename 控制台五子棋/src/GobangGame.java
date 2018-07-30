import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by lenovo on 2018/7/27.
 * GobangGame 是进行游戏的类，此类控制游戏的开始，重玩与结束
 */
public class GobangGame {
    private final int WIN_COUNT = 5;
    private int posX = 0;
    private int posY = 0;
    private Chessboard chessboard;
    public GobangGame(){};

    /**
     * 以一个Chessboard实例去初始化这个类
     * @param chessboard
     */
    public GobangGame(Chessboard chessboard)
    {
        this.chessboard = chessboard;
    }

    /**
     * 验证控制台的输入字符串是否合法，如果合法返回true，反之false
     * 抛出Exception异常
     * @param inputStr
     * @return
     */
    public boolean isValid(String inputStr) throws Exception
    {
        //将用户输入的字符串以逗号(,)作为分隔，分隔成两个字符串
         String[] posStrArr = inputStr.split(",");
         try {
             posX = Integer.parseInt( posStrArr[0] ) - 1;
             posY = Integer.parseInt( posStrArr[1] ) - 1;
         } catch (NumberFormatException e) {
             chessboard.printBoard();
             System.out.println("请以(数字,数字)的格式输入：");
             return false;
         }
        //检查输入数值是否在范围之内
        if( posX < 0 || posX >= Chessboard.BOARD_SIZE || posY < 0   || posY >= Chessboard.BOARD_SIZE ) {
             chessboard.printBoard();
             System.out.println( "X 与 Y 坐标只能大于等于 1,与小于等于"    + Chessboard.BOARD_SIZE + ",请重新输入：" );
             return false;
         }
         //检查输入位置是否已经有了棋子
        String[][] board = chessboard.getBoard();
         if(board[posX][posY] != "十"){
             chessboard.printBoard();
             System.out.println("此位置已经有棋子了，请重新输入：");
             return false;
         }
         return true;
    }

    /**
     * 开始游戏
     */
    public void start() throws Exception
    {
        //true 为游戏结束
        boolean isOver = false;
        chessboard.initBoard();
        chessboard.printBoard();
        //获取键盘输入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = null;
        while((inputStr = br.readLine()) != null){
            isOver = false;
            if(!isValid(inputStr)){
                //如果不合法，就要求重新输入
                continue;
            }
            //把对应的数组元素赋值为“●"
            String chessman = Chessman.BLACK.getChessman();
            chessboard.setBoard(posX,posY,chessman);
            if(isWon(posX,posY,chessman)){
                isOver = true;
            }
            else{
                //计算机下棋
                int[] computerPosArr = computerDo();
                chessman = Chessman.WHITE.getChessman();
                chessboard.setBoard(computerPosArr[0],computerPosArr[1],chessman);
                if(isWon(posX,posY,chessman)){
                    isOver = true;
                }
            }
            //如果产生胜者了，询问用户是否继续游戏
            if(isOver){
                //如果继续，重新初始化棋盘，继续游戏
                if(isReplay(chessman)){
                    chessboard.initBoard();
                    chessboard.printBoard();
                    continue;
                }
                break;
            }
            chessboard.printBoard();
            System.out.println("请输入您下棋的坐标，应以x,y的格式输入：");
        }
    }

    /**
     * 是否重新开始游戏，是返回true，否返回false
     * @param chessman 代表黑子或白子
     * @return
     */
    public boolean isReplay(String chessman) throws Exception
    {
        chessboard.printBoard();
        String message = chessman.equals(Chessman.BLACK.getChessman())?"恭喜您，您赢了":"很遗憾，您输了";
        System.out.println(message + "再下一局？（y/n）");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if(br.readLine().equals("y")){
            //开始新的一局
            return true;
        }
        else return  false;
    }

    //重载对isRepeat函数
    public void isReplay(boolean flag) throws Exception
    {
        if(flag == false) {
            System.out.println("再下一局？（y/n）");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            if (br.readLine().equals("y")) {
                //开始新的一局
                start();
            } else System.exit(0);
        }
    }
    /**
     * 计算机随机下棋，并返回新下棋子的位子的x，y坐标，存于int【】中
     * @return x，y的坐标
     */
    public int[] computerDo() throws  Exception
    {
        String[][] board = chessboard.getBoard();
        //false为棋盘全满
        boolean flag = false;
        out:
        for(int i=0;i<Chessboard.BOARD_SIZE;i++){
            for(int j=0;j<Chessboard.BOARD_SIZE;j++){
                if(board[i][j] == "十"){
                    flag = true;
                    break out; //跳出两重循环
                }
            }
        }
        if(flag == false){
            System.out.println("和棋！");
            //这里可以设置一个flag进行对和棋的操作
            isReplay(flag);
//重新开始？？？？
        }
        else{
            //随机生成X坐标
            int posX = (int)(Math.random()*(Chessboard.BOARD_SIZE - 1));
            //随机生成Y坐标
            int posY = (int)(Math.random()*(Chessboard.BOARD_SIZE - 1));
            //判断位置是否有棋
            while(board[posX][posY] != "十"){
                posX = (int)(Math.random()*(Chessboard.BOARD_SIZE - 1));
                posY = (int)(Math.random()*(Chessboard.BOARD_SIZE - 1));
            }
            int[] result = {posX ,posY};
            return result;
        }
        int[] a = {};
        return a;
    }

    /**
     * 判断输赢，
     * @param posX 新下棋子的x坐标
     * @param posY 新下棋子的y坐标
     * @param ico 新下棋子的类型
     * @return 赢返回true，输返回false
     */
    public boolean isWon(int posX,int posY,String ico)
    {
        //直线起点X坐标
        int startX =0;
        //直线起点Y坐标
        int startY =0;
        //直线结束X坐标
        int endX = Chessboard.BOARD_SIZE -1;
        //直线结束Y坐标
        int endY = endX;
        //同条直线上相邻棋子的累计数
        int sameCount = 0;
        int temp = 0;
        //计算起点的最小X坐标和Y坐标
        temp = posX - WIN_COUNT +1;
        startX = temp < 0?0:temp;
        temp = posY - WIN_COUNT +1;
        startY = temp <0?0:temp;
        //计算终点的最大X坐标和Y坐标
        temp = posX + WIN_COUNT -1;
        endX = temp > Chessboard.BOARD_SIZE -1 ? chessboard.BOARD_SIZE-1 :temp;
        temp = posY + WIN_COUNT -1;
        endY = temp > Chessboard.BOARD_SIZE -1 ? chessboard.BOARD_SIZE-1 :temp;
        //从左到右方向计算相同相邻棋子的数目
        String[][] board = chessboard.getBoard();
        for(int i=startY;i<endY;i++){
            if(board[posX][i] == ico && board[posX][i+1] == ico){
                sameCount++;
            }else if(sameCount != WIN_COUNT - 1){
                sameCount = 0;
            }
        }
        if (sameCount == 0) {
            // 从上到下计算相同相邻棋子的数目
            for (int i = startX; i < endX; i++) {
                if (board[i][posY] == ico && board[i + 1][posY] == ico) {
                    sameCount++;
                } else if (sameCount != WIN_COUNT - 1) {
                    sameCount = 0;
                }
            }
        }
        if (sameCount == 0) {
            // 从左上到右下计算相同相邻棋子的数目
            int j = startY;
            for (int i = startX; i < endX; i++) {
                if (j < endY) {
                    if (board[i][j] == ico && board[i + 1][j + 1] == ico) {
                        sameCount++;
                    } else if (sameCount != WIN_COUNT - 1) {
                        sameCount = 0;
                    }
                    j++;
                }
            }
        }
        return sameCount == WIN_COUNT - 1 ? true : false;
    }

    public static void main(String[] args) throws  Exception{
        GobangGame gb = new GobangGame(new Chessboard());
        gb.start();
    }
}
