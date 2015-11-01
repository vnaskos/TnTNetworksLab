/*
 * Lab Application for
 * Telecommunications and Transmission Networks
 * Technical Educational Institute of Central Macedonia
 */
package com.ourwork.tntnetworkslab;

import com.ourwork.tntnetworkslab.ui.TableManager;
import javax.swing.UIManager;

/**
 * Main Project Class
 */
public class TnTNetworksLab {
    
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TableManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        TableManager tb = new TableManager();
        tb.setLocationRelativeTo(null);
        tb.setVisible(true);
    }
    
}
