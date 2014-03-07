/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ema.auto;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dani
 */
@ManagedBean
@SessionScoped
public class Bean implements Serializable  {

    private String text;
    public List<String> complete(String query) {
            List<String> results = new ArrayList<String>();
            
                for (int i = 0; i < 10; i++)
                    results.add(query + i);        
                return results;
}
     public String getText(){
         return text;
     }
     
     public void setText(String text){
         this.text = text;
     }
}
