import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ControlPanel extends JPanel {
    MainFrame frame;
    JButton saveButton;
    JButton loadButton;
    JButton exitButton;

    public ControlPanel(MainFrame frame){
        this.frame=frame;
        init();
    }

    private void init(){
        setLayout(new GridLayout(1,4));
        saveButton = new JButton("Save");
        loadButton = new JButton("Load");
        exitButton = new JButton("Exit");
        add(saveButton);
        add(loadButton);
        add(exitButton);
        saveButton.addActionListener(this::saveGame);
        loadButton.addActionListener(this::loadGame);
        exitButton.addActionListener(this::exitGame);
    }

    private void saveGame(ActionEvent event){}

    private void loadGame(ActionEvent event){}

    private void exitGame(ActionEvent event){
        frame.dispose();
    }
}
