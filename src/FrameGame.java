import javax.swing.*;
import java.awt.*;

public class FrameGame extends JFrame {

    final int DISTANCE = 10;
    final int X_Y_START = 0;
    final int WITH_HEIGHT = 400;
    final int BOX_WIN_WITH_HEIGHT = 30;

    private JTextField rect1=new JTextField();
    private JTextField rect2=new JTextField();
    private JTextField rect3=new JTextField();
    private JTextField rect4=new JTextField();
    private JTextField rect5=new JTextField();
    private JTextField rect6=new JTextField();
    private JTextField rect7=new JTextField();
    private JTextField rect8=new JTextField();
    private JTextField rect9=new JTextField();
    private int xWinCounter=0;
    private int oWinCounter=0;
    private Font font=new Font("",Font.BOLD,20);
    private JLabel xWins=new JLabel("Player X win's: 0");
    private JLabel oWins=new JLabel("Player O win's: 0");


    public FrameGame() {
        this.setLayout(null);
        this.setBounds(X_Y_START,X_Y_START, WITH_HEIGHT, WITH_HEIGHT+WITH_HEIGHT/4);
        this.setVisible(true);

        xWins.setBounds(X_Y_START,WITH_HEIGHT,WITH_HEIGHT/2,BOX_WIN_WITH_HEIGHT);
        xWins.setFont(font);
        xWins.setBackground(Color.GREEN);
        xWins.setVisible(true);
        this.add(xWins);

        oWins.setBounds(WITH_HEIGHT/2,WITH_HEIGHT,WITH_HEIGHT/2,BOX_WIN_WITH_HEIGHT);
        oWins.setFont(font);
        oWins.setBackground(Color.GREEN);
        oWins.setVisible(true);
        this.add(oWins);

            rect1.setBounds(X_Y_START,X_Y_START, WITH_HEIGHT /4, WITH_HEIGHT /4); //1,1
            rect1.setFont(font);
            rect1.setBackground(Color.BLACK);
            rect1.setForeground(Color.WHITE);
            rect1.setVisible(true);
            this.add(rect1);


            rect2.setBounds(X_Y_START, WITH_HEIGHT /4 +DISTANCE, WITH_HEIGHT /4, WITH_HEIGHT /4); //1,2
            rect2 .setFont(font);
            rect2.setBackground(Color.BLACK);
            rect2.setForeground(Color.WHITE);
            rect2.setVisible(true);
            this.add(rect2);

            rect3.setBounds(X_Y_START, (WITH_HEIGHT /4 + DISTANCE)*2, WITH_HEIGHT /4, WITH_HEIGHT /4);//1,3
        rect3.setFont(font);
        rect3.setBackground(Color.BLACK);
            rect3.setForeground(Color.WHITE);
            rect3.setVisible(true);
            this.add(rect3);


            rect4.setBounds(X_Y_START+ WITH_HEIGHT /4 + DISTANCE, X_Y_START , WITH_HEIGHT /4, WITH_HEIGHT /4);//2,1
        rect4.setFont(font);
        rect4.setBackground(Color.BLACK);
            rect4.setForeground(Color.WHITE);
            rect4.setVisible(true);
            this.add(rect4);


            rect5.setBounds(X_Y_START+ WITH_HEIGHT /4 + DISTANCE, WITH_HEIGHT /4 +DISTANCE, WITH_HEIGHT /4, WITH_HEIGHT /4);// 2,2
        rect5.setFont(font);
        rect5.setBackground(Color.BLACK);
            rect5.setForeground(Color.WHITE);
            rect5.setVisible(true);
            this.add(rect5);


            rect6.setBounds(X_Y_START+ WITH_HEIGHT /4 + DISTANCE, (WITH_HEIGHT /4 +DISTANCE)*2, WITH_HEIGHT /4, WITH_HEIGHT /4);//2,3
        rect6.setFont(font);
        rect6.setBackground(Color.BLACK);
            rect6.setForeground(Color.WHITE);
            rect6.setVisible(true);
            this.add(rect6);


            rect7.setBounds((X_Y_START+ WITH_HEIGHT /4 + DISTANCE)*2, X_Y_START , WITH_HEIGHT /4, WITH_HEIGHT /4);//3,1
        rect7.setFont(font);
        rect7.setBackground(Color.BLACK);
            rect7.setForeground(Color.WHITE);
            rect7.setVisible(true);
            this.add(rect7);


            rect8.setBounds((X_Y_START+ WITH_HEIGHT /4 + DISTANCE)*2, WITH_HEIGHT /4 +DISTANCE, WITH_HEIGHT /4, WITH_HEIGHT /4);//3,2
        rect8.setFont(font);
            rect8.setBackground(Color.BLACK);
            rect8.setForeground(Color.WHITE);
            rect8.setVisible(true);
            this.add(rect8);


            rect9.setBounds((X_Y_START+ WITH_HEIGHT /4 + DISTANCE)*2, (WITH_HEIGHT /4 +DISTANCE)*2, WITH_HEIGHT /4, WITH_HEIGHT /4);//3,3
        rect9.setFont(font);
            rect9.setBackground(Color.BLACK);
            rect9.setForeground(Color.WHITE);
            rect9.setVisible(true);
            this.add(rect9);

            while (true) {
                chekInput(rect1);
                chekInput(rect2);
                chekInput(rect3);
                chekInput(rect4);
                chekInput(rect5);
                chekInput(rect6);
                chekInput(rect7);
                chekInput(rect8);
                chekInput(rect9);

                if (win("x")){
                    xWinCounter++;
                    xWins.setText("Player X win's:"+String.valueOf(getxWinCounter()));
                    cleanBoard();
                }
                else if (win("o")){
                    oWinCounter++;
                    oWins.setText("Player O win's:"+String.valueOf(getoWinCounter()));
                    cleanBoard();
                }
                else if (isTheGameThan()){
                    cleanBoard();
                }
            }

    }

    public boolean win(String xOrO){
        boolean ans =false;
        if (rect1.getText().equals(xOrO) && rect2.getText().equals(xOrO) && rect3.getText().equals(xOrO)){
            System.out.println(xOrO+" win!!");
            ans=true;
        }
        else if (rect4.getText().equals(xOrO) && rect5.getText().equals(xOrO) && rect6.getText().equals(xOrO)){
            System.out.println(xOrO+" win!!");
            ans=true;
        }
        else if (rect7.getText().equals(xOrO) && rect8.getText().equals(xOrO) && rect9.getText().equals(xOrO)){
            System.out.println(xOrO+" win!!");
            ans=true;
        }
        else if (rect1.getText().equals(xOrO) && rect4.getText().equals(xOrO) && rect7.getText().equals(xOrO)){
            System.out.println(xOrO+" win!!");
            ans=true;
        }
        else if (rect2.getText().equals(xOrO) && rect5.getText().equals(xOrO) && rect8.getText().equals(xOrO)){
            System.out.println(xOrO+" win!!");
            ans=true;
        }
        else if (rect3.getText().equals(xOrO) && rect6.getText().equals(xOrO) && rect9.getText().equals(xOrO)){
            System.out.println(xOrO+" win!!");
            ans=true;
        }
        else if (rect1.getText().equals(xOrO) && rect5.getText().equals(xOrO) && rect9.getText().equals(xOrO)){
            System.out.println(xOrO+" win!!");
            ans=true;
        }
        else if (rect3.getText().equals(xOrO) && rect5.getText().equals(xOrO) && rect7.getText().equals(xOrO)){
            System.out.println(xOrO+" win!!");
            ans=true;
        }

        return ans;
    }

    public void cleanBoard(){
        rect1.setText("");
        rect2.setText("");
        rect3.setText("");
        rect4.setText("");
        rect5.setText("");
        rect6.setText("");
        rect7.setText("");
        rect8.setText("");
        rect9.setText("");
    }

    public boolean isTheGameThan(){
        boolean ans=false;
        if (!rect1.getText().equals("") && !rect2.getText().equals("") && !rect3.getText().equals("") && !rect4.getText().equals("") &&!rect5.getText().equals("")
        && !rect6.getText().equals("") && !rect7.getText().equals("") && !rect8.getText().equals("") && !rect9.getText().equals("") ){
            ans=true;
        }
        return ans;
    }

    public void chekInput(JTextField rect){
        if (!rect.getText().equals("") && !rect.getText().equals("x") && !rect.getText().equals("o")){
            rect.setText("");
            JFrame frame = new JFrame();
            frame.setSize(500,200);
            frame.setVisible(true);
            JLabel text=new JLabel("You input must be x or o , in small letters!!");
            text.setBounds(X_Y_START,X_Y_START,500,200);
            text.setFont(font);
            text.setVisible(true);
            frame.add(text);
        }
    }

    public int getxWinCounter() {
        return xWinCounter;
    }

    public int getoWinCounter() {
        return oWinCounter;
    }
}
