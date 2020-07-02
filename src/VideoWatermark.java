import javax.swing.*;

public class VideoWatermark {

    public VideoWatermark(){
        new Window(new ImageCreator());
    }

    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(VideoWatermark::new);
    }
}

