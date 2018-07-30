/**
 * Created by lenovo on 2018/7/22.
 */

import java.io.*;
/**
 * 对书本的棋盘代码进行完善
 * @author linshuhao
 * @version 1.0
 */
public class Gobang
{
    // 定义棋盘的大小
    private static int BOARD_SIZE = 15;
    // 定义一个二维数组来充当棋盘
    private String[][] board;
    public void initBoard()
    {
        // 初始化棋盘数组
        board = new String[BOARD_SIZE][BOARD_SIZE];
        // 把每个元素赋为"╋"，用于在控制台画出棋盘
        for (int i = 0 ; i < BOARD_SIZE ; i++)
        {
            for ( int j = 0 ; j < BOARD_SIZE ; j++)
            {
                board[i][j] = "+";
            }
        }
    }
    // 在控制台输出棋盘的方法
    public void printBoard()
    {
        // 打印每个数组元素
        for (int i = 0 ; i < BOARD_SIZE ; i++)
        {
            for ( int j = 0 ; j < BOARD_SIZE ; j++)
            {
                // 打印数组元素后不换行
                System.out.print(board[i][j]);
            }
            // 每打印完一行数组元素后输出一个换行符
            System.out.print("\n");
        }
    }
    //判断输赢
    //ch参数标志着当前是谁在下棋
    public boolean judge(int xPos , int yPos ,String ch)
    {
        //四个方向的判断
        int yMid = yPos;
        int xMid = xPos;
        //上下
        int count=1;
        if(yMid >= 0 || yMid < 15){
            while(yMid > 0 ){
                yMid--;
                if(board[yMid][xPos] == ch)
                    count++;
                else break;
            }
            yMid = yPos;
            while(yMid < 14){
                yMid++;
                if(board[yMid][xPos] == ch)
                    count++;
                else break;
            }
            if(count >= 5){
                return true;
            }
            else count = 1;
        }
        //左右
        yMid = yPos;
        xMid = xPos;
        count=1;
        if(xMid >= 0 || xMid < 15){
            while(xMid > 0 ){
                xMid--;
                if(board[yPos][xMid] == ch)
                    count++;
                else break;
            }
            xMid = xPos;
            while(yMid < 14){
                xMid--;
                if(board[yPos][xMid] == ch)
                    count++;
                else break;
            }
            if(count >= 5){
                return true;
            }
            else count = 1;
        }


        return false;
    }
    //人下棋
    public boolean human() throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = null;
        // br.readLine()：每当在键盘上输入一行内容按回车，用户刚输入的内容将被br读取到。
        inputStr = br.readLine();
        // 将用户输入的字符串以逗号（,）作为分隔符，分隔成2个字符串
        String[] posStrArr = inputStr.replaceAll(" ","").split(",");
        // 将2个字符串转换成用户下棋的座标
        int xPos = Integer.parseInt(posStrArr[0]);
        int yPos = Integer.parseInt(posStrArr[1]);
        // 把对应的数组元素赋为"●"。.
        while(board[yPos-1][xPos-1] == "*" || board[yPos-1][xPos-1] == "a"){
            System.out.println("输入位置已经有棋，请重新输入：");
            inputStr = br.readLine();
            // 将用户输入的字符串以逗号（,）作为分隔符，分隔成2个字符串
            posStrArr = inputStr.replaceAll(" ","").split(",");
            // 将2个字符串转换成用户下棋的座标
            xPos = Integer.parseInt(posStrArr[0]);
            yPos = Integer.parseInt(posStrArr[1]);
        }
        board[yPos - 1][xPos - 1] = "a";
        //判断是否已经赢了
        return judge(xPos-1,yPos-1,"a");
    }
    //电脑下棋
    public boolean computer()
    {
        //Math.random函数返回的是【0.0,1）这么一个区间的数值
        //那么，我们要的是15以内的，包含15，则可得
        int xPos = (int)(Math.random()*15);
        int yPos = (int)(Math.random()*15);
        while(board[yPos][xPos] == "*" || board[yPos][xPos] == "a"){
            xPos = (int)(Math.random()*15);
            yPos = (int)(Math.random()*15);
        }
        System.out.println("Computer get the POS is ("+xPos+","+yPos+")");

        board[yPos][xPos] = "*";
        //判断是否已经赢了
        return judge(xPos,yPos,"*");
    }
    public static void main(String[] args) throws Exception
    {
        Gobang gb = new Gobang();
        gb.initBoard();
        gb.printBoard();
        System.out.println("请输入您下棋的座标，应以x,y的格式：");
        boolean win;
        while(true){
            win=gb.human();
            if (win){
                System.out.println("human win!");
                break;
            }
			/*
			 电脑随机生成2个整数，作为电脑下棋的座标，赋给board数组。
			 还涉及
				1.座标的有效性，只能是数字，不能超出棋盘范围
				2.如果下的棋的点，不能重复下棋。
				3.每次下棋后，需要扫描谁赢了
			 */
            gb.computer();
            if (win){
                System.out.println("Computer win!");
                break;
            }
            gb.printBoard();
            System.out.println("请输入您下棋的座标，应以x,y的格式：");
        }
        gb.printBoard();
    }
}
