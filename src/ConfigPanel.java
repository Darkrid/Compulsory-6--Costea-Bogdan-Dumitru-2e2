import javax.swing.*;

public class ConfigPanel extends JPanel {
    MainFrame frame;
    JLabel label;
    JSpinner spinnerRow;
    JSpinner spinnerCol;
    JButton button;

    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        label = new JLabel("Grid size: ");
        spinnerRow = new JSpinner(new SpinnerNumberModel(10, 2, 100, 1));
        spinnerCol = new JSpinner(new SpinnerNumberModel(10,2,100,1));
        button = new JButton("Create");
        add(label);
        add(spinnerRow);
        add(spinnerCol);
        add(button);
    }

    public int getRows() {
        return (int) spinnerRow.getValue();
    }

    public int getColumns() {
        return (int) spinnerCol.getValue();
    }
}
