/**
 * Created by lenovo on 2018/7/22.
 */

/**
 * ����һ��random�ķ���
 * import java.util.Random
 * Random rand = new Random();
 * //����Ĭ������ʱ��ĺ���Ϊ���ӽ������ɣ�Ҳ�����Լ�ָ��ĳ����Ϊ����
 * int i;
 * i =rand,nextInt(num);����num���µ��������������num
 */
import java.io.*;
/**
 * ���鱾�����̴����������
 * @author linshuhao
 * @version 1.0
 */
public class Gobang
{
    // �������̵Ĵ�С
    private static int BOARD_SIZE = 15;
    // ����һ����ά�������䵱����
    private String[][] board;
    public void initBoard()
    {
        // ��ʼ����������
        board = new String[BOARD_SIZE][BOARD_SIZE];
        // ��ÿ��Ԫ�ظ�Ϊ"��"�������ڿ���̨��������
        for (int i = 0 ; i < BOARD_SIZE ; i++)
        {
            for ( int j = 0 ; j < BOARD_SIZE ; j++)
            {
                board[i][j] = "+";
            }
        }
    }
    // �ڿ���̨������̵ķ���
    public void printBoard()
    {
        // ��ӡÿ������Ԫ��
        for (int i = 0 ; i < BOARD_SIZE ; i++)
        {
            for ( int j = 0 ; j < BOARD_SIZE ; j++)
            {
                // ��ӡ����Ԫ�غ󲻻���
                System.out.print(board[i][j]);
            }
            // ÿ��ӡ��һ������Ԫ�غ����һ�����з�
            System.out.print("\n");
        }
    }
    //�ж���Ӯ
    //ch������־�ŵ�ǰ��˭������
    public boolean judge(int xPos , int yPos ,String ch)
    {
        //�ĸ�������ж�
        int yMid = yPos;
        int xMid = xPos;
        //����
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
        //����
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
    //������
    public boolean human() throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = null;
        // br.readLine()��ÿ���ڼ���������һ�����ݰ��س����û�����������ݽ���br��ȡ����
        inputStr = br.readLine();
        // ���û�������ַ����Զ��ţ�,����Ϊ�ָ������ָ���2���ַ���
        String[] posStrArr = inputStr.replaceAll(" ","").split(",");
        // ��2���ַ���ת�����û����������
        int xPos = Integer.parseInt(posStrArr[0]);
        int yPos = Integer.parseInt(posStrArr[1]);
        // �Ѷ�Ӧ������Ԫ�ظ�Ϊ"��"��.
        while(board[yPos-1][xPos-1] == "*" || board[yPos-1][xPos-1] == "a"){
            System.out.println("����λ���Ѿ����壬���������룺");
            inputStr = br.readLine();
            // ���û�������ַ����Զ��ţ�,����Ϊ�ָ������ָ���2���ַ���
            posStrArr = inputStr.replaceAll(" ","").split(",");
            // ��2���ַ���ת�����û����������
            xPos = Integer.parseInt(posStrArr[0]);
            yPos = Integer.parseInt(posStrArr[1]);
        }
        board[yPos - 1][xPos - 1] = "a";
        //�ж��Ƿ��Ѿ�Ӯ��
        return judge(xPos-1,yPos-1,"a");
    }
    //��������
    public boolean computer()
    {
        //Math.random�������ص��ǡ�0.0,1����ôһ���������ֵ
        //��ô������Ҫ����15���ڵģ�����15����ɵ�
        int xPos = (int)(Math.random()*15);
        int yPos = (int)(Math.random()*15);
        while(board[yPos][xPos] == "*" || board[yPos][xPos] == "a"){
            xPos = (int)(Math.random()*15);
            yPos = (int)(Math.random()*15);
        }
        System.out.println("Computer get the POS is ("+xPos+","+yPos+")");

        board[yPos][xPos] = "*";
        //�ж��Ƿ��Ѿ�Ӯ��
        return judge(xPos,yPos,"*");
    }
    public static void main(String[] args) throws Exception
    {
        Gobang gb = new Gobang();
        gb.initBoard();
        gb.printBoard();
        System.out.println("����������������꣬Ӧ��x,y�ĸ�ʽ��");
        boolean win;
        while(true){
            win=gb.human();
            if (win){
                System.out.println("human win!");
                break;
            }
			/*
			 �����������2����������Ϊ������������꣬����board���顣
			 ���漰
				1.�������Ч�ԣ�ֻ�������֣����ܳ������̷�Χ
				2.����µ���ĵ㣬�����ظ����塣
				3.ÿ���������Ҫɨ��˭Ӯ��
			 */
            gb.computer();
            if (win){
                System.out.println("Computer win!");
                break;
            }
            gb.printBoard();
            System.out.println("����������������꣬Ӧ��x,y�ĸ�ʽ��");
        }
        gb.printBoard();
    }
}
