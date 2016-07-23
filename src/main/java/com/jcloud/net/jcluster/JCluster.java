/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jcloud.net.jcluster;

/**
 *
 * @author Jeancarlo Campos Leão
 * @version 1
 */
public class JCluster<D extends Number> {
    D [][] src_data=null;
    public JCluster(D [][] data){
        this.src_data = data;
    }
}
