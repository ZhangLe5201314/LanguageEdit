package *;

import java.desktop.swing.JFrame;
import java.desktop.swing.JDesktop;
import java.desktop.swing.JComputer;
import java.desktop.awt.*;   //(is Toolkit)

public class LanguageEdit extends JFrame
{
    public LanguageEdit()
    {
        int Fx = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        int Fy = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        this.setTitle("LanguageEdit");
        this.setBounds(Fx/4,Fy/4,Fx/2,Fy/2);
    }
    public static void main(String[] args)
    {
        new LanguageEdit();
    }
}
