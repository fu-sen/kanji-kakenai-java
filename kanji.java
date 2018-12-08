import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class KanjiFrame extends Frame{
    public KanjiFrame( String str ) {
        setTitle(str);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)  {
                System.exit(0);
            }
        });
    }
}

public class kanji extends Frame {

    public static void main(String [] args) {
        KanjiFrame frm = new KanjiFrame("漢字書けな〜い。");

        frm.setSize(580, 470);
        frm.setLayout(new FlowLayout());
        frm.setResizable(false);

        JTextArea inputarea = new JTextArea();
        inputarea.setFont(new Font(Font.SERIF, 0, 128));
        inputarea.setMargin(new Insets(15,0,0,0));
        inputarea.setLineWrap(true);
        JScrollPane inputkanji = new JScrollPane(inputarea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        inputkanji.setPreferredSize(new Dimension(570, 410));
        inputkanji.setBorder(BorderFactory.createLoweredBevelBorder());
        frm.add(inputkanji);

        JLabel titlekanji = new JLabel("漢字書けな〜い。");
        titlekanji.setPreferredSize(new Dimension(570, 20));
        frm.add(titlekanji);

        frm.setVisible(true);
    }
}
