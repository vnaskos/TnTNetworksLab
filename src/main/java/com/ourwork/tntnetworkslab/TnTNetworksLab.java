/*
 * Lab Application for
 * Telecommunications and Transmission Networks
 * Technical Educational Institute of Central Macedonia
 */
package com.ourwork.tntnetworkslab;

import com.ourwork.tntnetworkslab.cli.TnTNetworksCli;

/**
 * Main Project Class
 */
public class TnTNetworksLab {
    
    public static void main(String args[]) {
        TnTNetworksCli cli = new TnTNetworksCli();
        cli.executeBasicManager();
    }
    
}
