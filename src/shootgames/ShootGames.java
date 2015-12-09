/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shootgames;

import javax.swing.JApplet;

/**
 *
 * @author lanceramoutar
 */
public class ShootGames extends JApplet {

    //@Override
    public void init() {
        ShootGamesPanel shootGamesPanel = new ShootGamesPanel();
        add(shootGamesPanel);
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
