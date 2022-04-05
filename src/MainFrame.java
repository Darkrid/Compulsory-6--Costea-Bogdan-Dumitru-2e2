import javax.swing.*;
import static java.awt.BorderLayout.*;

public class MainFrame extends JFrame {
    ConfigPanel configPanel;
    DrawPanel drawPanel;
    ControlPanel controlPanel;

    public MainFrame() {
        super("Application");
        init();
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        configPanel = new ConfigPanel(this);
        drawPanel = new DrawPanel(this);
        controlPanel = new ControlPanel(this);
        add(configPanel, NORTH);
        add(drawPanel, CENTER);
        add(controlPanel, SOUTH);
        pack();
    }
}
