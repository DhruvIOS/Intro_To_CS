import java.awt.*;


public class Program1 {
    
    public static void main(String[] args) {

        
        DrawingPanel panel = new DrawingPanel(800, 500);
        
        panel.setBackground(new Color(128,128,128));

        Graphics g = panel.getGraphics();
       

        g.setColor(Color.RED);
        g.fillOval(300, 70, 150, 150);

        


        g.setColor(Color.BLACK);
        g.fillOval(330, 110, 15, 15);
        g.fillOval(400, 110, 15, 15);

        g.drawArc(335, 140, 80, 80, 0, 180);


        
        Font font = new Font("Serif", Font.PLAIN, 45);

        g.setColor(Color.BLUE);
        g.setFont(font);
        g.drawString("GAME OVER", 250, 340);


        Font font2 = new Font("Serif", Font.PLAIN, 20);

        g.setFont(font2);
        g.drawString("YOU ARE A BOT", 300, 370);
    }
}
