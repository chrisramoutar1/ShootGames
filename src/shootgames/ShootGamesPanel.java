/* https://www.youtube.com/watch?v=WHUUzRvlw9o 6:42
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shootgames;


import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author lanceramoutar
 */
public class ShootGamesPanel extends JPanel implements MouseListener{

    private final Image backgroundImg;
    JLabel targetImage = new JLabel();
    String birdImage = "bird.png";
    String bloodImage = "blood.png";
    int hitNums = 0;
    JLabel hitNumsLabel = new JLabel();
    
    
    
    public ShootGamesPanel(){
        backgroundImg = new javax.swing.ImageIcon(getClass().getResource("city.png")).getImage();
hitNumsLabel.setText("Good Shots:" + Integer.toString(hitNums));
targetImage.setIcon(new javax.swing.ImageIcon(getClass().getResource(birdImage)));
setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));

addMouseListener(this);
add(hitNumsLabel);
add(targetImage);



    }
  //  @Override
    public void mouseClicked(MouseEvent e) {
        int crossX = e.getX();
        int crossY = e.getY();
        int targetImageX = targetImage.getX();
        int targetImageY = targetImage.getY();
        
        boolean result = false;

        // check for a horizontal match
        if(targetImageX < crossX && (targetImageX+52) > crossX){
            result = true;
        }

        
        if(result){
            if(targetImageY < crossY && (targetImageY+34) > crossY){
                result = true;
        }
            else{
            result = false;
            
        }
        
    }
        
        if(result){
         targetImage.setIcon(new javax.swing.ImageIcon(getClass().getResource(bloodImage)));
         hitNums = hitNums + 1;
         hitNumsLabel.setText("Good shots: " + Integer.toString(hitNums));
        }
    }

    //@Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //@Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //@Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //@Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //@Override
    public void paintComponent(Graphics g){
        super.paintComponent(g); // backgoruond
        g.drawImage(backgroundImg, 0, 0, null);
        
    }
    
    
}
