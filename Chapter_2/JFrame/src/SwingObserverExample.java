import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {

    JFrame frame;
    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do");
//        button.addActionListener(new AngelListener());
//        button.addActionListener(new DevilListener());
        button.addActionListener(event ->
                System.out.println("Dont do it"));


        button.addActionListener(event ->
                System.out.println("do it!"));
    }


}

//    class AngelListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent event) {
//            System.out.println("Dont do it");
//        }
//    }
//
//    class DevilListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent event) {
//            System.out.println("do it!");
//
//        }
//    }
//}
