/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author dimonich
 */
public class MP3PlayerFileFilter extends FileFilter {
    private String fileExtension;
    private String fileDescription;

    public MP3PlayerFileFilter(String fileExtension,String fileDescription) {
        this.fileExtension = fileExtension;
        this.fileDescription = fileDescription;    
    }

    @Override
    public boolean accept(File file) {
        return file.isDirectory() || file.getAbsolutePath().endsWith(fileExtension);
    }
    

    @Override
    public String getDescription() {
        return fileDescription + "(*."+fileExtension+")";
    }
    
    
}
