package game;

import javax.swing.JFrame;

public class main {
    public main(){
        JFrame frame = new JFrame();
        GamePanel gamepanel = new GamePanel();
        
        frame.add(gamepanel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("SnakeCoding");
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new main();
    }

}
