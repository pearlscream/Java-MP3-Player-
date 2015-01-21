/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author dimonich
 */
public class FileUtils {
    public static void addFileFilter(JFileChooser jfc, FileFilter ff) {
        jfc.removeChoosableFileFilter(jfc.getFileFilter());
        jfc.setFileFilter(ff);
        jfc.setSelectedFile(new File(""));
    }
    
    public static String getFileNameWithoutExtension(String name) {
        File file = new File(name);
        int index = file.getName().lastIndexOf(".");
        if (index > 0 && index < file.getName().length() - 2) {
            return file.getName().substring(0,index);
        }
        return "noname";
        
    }
    
    public static String getFileExtension (File file) {
        String ext = null;
        String s = file.getName();
        int index = s.lastIndexOf(".");
        if (index > 0 && index < s.length()-1) {
            ext = s.substring(index+1).toLowerCase();
        }
        return ext;         
    }
    
    public static void serialize(Object obj,String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.flush();
            oos.close();
            fos.close();
            
        } catch (IOException ex) {
            Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static Object deserialize(String fileName) {
        try {
            FileInputStream is = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(is);
            Object ts = (Object) ois.readObject();
            is.close();
            return ts;
            
        } catch (IOException ex) {
            Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
