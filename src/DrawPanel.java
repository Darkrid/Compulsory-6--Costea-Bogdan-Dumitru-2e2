import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    MainFrame frame;
    int rows, cols;
    int panelWidth = 400, panelHeight = 400;
    int boardWidth, boardHeight;
    int cellWidth, cellHeight;
    int padX, padY;
    int stoneSize = 20;

    public DrawPanel(MainFrame frame){
        this.frame=frame;
        init(frame.configPanel.getRows(),frame.configPanel.getColumns());
    }

    private void init(int rows, int cols){
        this.rows=rows;
        this.cols=cols;
        this.padX=stoneSize+10;
        this.padY=stoneSize+10;
        this.cellHeight=(panelHeight-2*padY)/(rows-1);
        this.cellWidth=(panelWidth-2*padX)/(cols-1);
        this.boardHeight=(rows-1)*cellHeight;
        this.boardWidth=(cols-1)*cellWidth;
        setPreferredSize(new Dimension(panelWidth,panelHeight));
    }

    @Override
    protected void paintComponent(Graphics graphics){
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setColor(Color.WHITE);
        graphics2D.fillRect(0,0,panelWidth,panelHeight);
        paintGrid(graphics2D);
    }

    private void paintGrid(Graphics2D graphics2D){
        graphics2D.setColor(Color.DARK_GRAY);
        for(int r=0;r<rows;r++) {
            int x1 = padX;
            int y1 = padY + r * cellHeight;
            int x2 = padX + boardWidth;
            int y2 = y1;
            graphics2D.drawLine(x1, y1, x2, y2);
        }
        for(int c=0;c<cols;c++){
            int x1=padX+ c*cellWidth;
            int y1=padY;
            int x2=x1;
            int y2=padY+boardHeight;
            graphics2D.drawLine(x1, y1, x2, y2);
        }
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                int x=padX+c*cellWidth;
                int y=padY+r*cellHeight;
                graphics2D.setColor(Color.LIGHT_GRAY);
                graphics2D.drawOval(x-stoneSize/2,y-stoneSize/2,stoneSize,stoneSize);
            }
        }
    }
}
