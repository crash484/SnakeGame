import javax.swing.JFrame;

public class GameFrame extends JFrame {
    GameFrame(){
        //GamePanel panel= new GamePanel(); dont have to do this
        this.add(new GamePanel()); //same and kinda a shortcut
        this.setTitle("snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
