import com.ibm.dtfj.java.JavaThread;

import javax.swing.*;
import java.awt.*;

public class Rect {

    private int x;
    private int y;

    public Rect(int x,int y){
        this.x=x;
        this.y=y;
        JTextField rect=new JTextField();
        rect.setBounds(x,y,100,100);
        rect.setBackground(Color.BLACK);
        rect.setForeground(Color.WHITE);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
