/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

import java.io.Serializable;

/**
 *
 * @author dimonich
 */
public class MP3 implements Serializable{
    private String name;
    private String path;

    public MP3(String name, String path) {
        this.name = name;
        this.path = path;
    }
    

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPath(String path) {
        this.path = path;
    }
 
     public String toString() {
         return FileUtils.getFileNameWithoutExtension(name);
     }
    
}
