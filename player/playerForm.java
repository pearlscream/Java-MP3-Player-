/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import com.easynth.lookandfeel.EaSynthLookAndFeel;
import java.awt.Toolkit;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.event.InputEvent;
/**
 *
 * @author dimonich
 */
public class playerForm extends javax.swing.JFrame implements Serializable {
    private DefaultListModel mp3ListModel = new DefaultListModel();
    private MP3Player player = new MP3Player();
    
    /**
     * Creates new form playerForm
     */
    public playerForm() {
        this.setResizable(false);
        initComponents();
        Image image = Toolkit.getDefaultToolkit().createImage( getClass().getResource("/images/KTjgG7yAc.png") );
        this.setIconImage( image );
        System.out.println("Hallo world");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        panelSearch = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfieldFind = new javax.swing.JTextPane();
        btnFind = new javax.swing.JButton();
        panelMain = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnDown = new javax.swing.JButton();
        btnUp = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPlayList = new javax.swing.JList();
        scrlVolume = new javax.swing.JSlider();
        btnVolume = new javax.swing.JToggleButton();
        btnPrevious = new javax.swing.JButton();
        btnPlay = new javax.swing.JButton();
        btnPause = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuOpen = new javax.swing.JMenuItem();
        menuSave = new javax.swing.JMenuItem();
        menuService = new javax.swing.JMenu();
        menuLook = new javax.swing.JMenu();
        menuSkin1 = new javax.swing.JMenuItem();
        menuSkin2 = new javax.swing.JMenuItem();

        jFileChooser1.setAcceptAllFileFilterUsed(false);
        jFileChooser1.setMultiSelectionEnabled(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java MP3 player by @pearlscream");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tfieldFind.setText("Введите имя песни");
        tfieldFind.setToolTipText("");
        jScrollPane1.setViewportView(tfieldFind);

        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_16.png"))); // NOI18N
        btnFind.setText("Найти");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSearchLayout = new javax.swing.GroupLayout(panelSearch);
        panelSearch.setLayout(panelSearchLayout);
        panelSearchLayout.setHorizontalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFind)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSearchLayout.setVerticalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFind)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMain.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelMain.setToolTipText("");
        panelMain.setName("MP3 Player by pearlscream"); // NOI18N

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus_16.png"))); // NOI18N
        btnAdd.setToolTipText("добавить песню");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove_icon.png"))); // NOI18N
        btnDel.setToolTipText("удалить песню");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-down-icon.png"))); // NOI18N
        btnDown.setToolTipText("листать вниз");
        btnDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownActionPerformed(evt);
            }
        });

        btnUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-up-icon.png"))); // NOI18N
        btnUp.setToolTipText("листать вверх");
        btnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lstPlayList.setModel(mp3ListModel);
        lstPlayList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstPlayListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lstPlayList);

        scrlVolume.setMaximum(200);
        scrlVolume.setMinorTickSpacing(5);
        scrlVolume.setSnapToTicks(true);
        scrlVolume.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                scrlVolumeStateChanged(evt);
            }
        });

        btnVolume.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/speaker.png"))); // NOI18N
        btnVolume.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mute.png"))); // NOI18N

        btnPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/prev-icon.png"))); // NOI18N
        btnPrevious.setToolTipText("");

        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Play.png"))); // NOI18N
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        btnPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pause-icon.png"))); // NOI18N
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });

        btnStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stop-red-icon.png"))); // NOI18N
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next-icon.png"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnDown, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                        .addComponent(btnVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(scrlVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPause, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd)
                        .addComponent(btnDel)
                        .addComponent(btnDown)
                        .addComponent(btnUp))
                    .addComponent(jSeparator1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrlVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolume))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnStop)
                        .addComponent(btnNext))
                    .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPlay)
                        .addComponent(btnPrevious)
                        .addComponent(btnPause)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuFile.setText("Файл");

        menuOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/open-icon.png"))); // NOI18N
        menuOpen.setText("Открыть плейлист");
        menuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpenActionPerformed(evt);
            }
        });
        menuFile.add(menuOpen);

        menuSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save_16.png"))); // NOI18N
        menuSave.setText("Сохранить плейлист");
        menuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaveActionPerformed(evt);
            }
        });
        menuFile.add(menuSave);

        jMenuBar.add(menuFile);

        menuService.setText("Сервис");

        menuLook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gear_16.png"))); // NOI18N
        menuLook.setText("Внешний вид");
        menuLook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLookActionPerformed(evt);
            }
        });

        menuSkin1.setText("Стиль 1");
        menuSkin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSkin1ActionPerformed(evt);
            }
        });
        menuLook.add(menuSkin1);

        menuSkin2.setText("Стиль 2");
        menuSkin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSkin2ActionPerformed(evt);
            }
        });
        menuLook.add(menuSkin2);

        menuService.add(menuLook);

        jMenuBar.add(menuService);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        String searchStr = tfieldFind.getText();
        if (searchStr == null || searchStr.trim().equals("")) {
            return; 
        }
        ArrayList<Integer> mp3FindedIndexes = new ArrayList<>();
        for (int i = 0; i < mp3ListModel.size();i++) {
            MP3 mp3 = (MP3) mp3ListModel.getElementAt(i);
            if (mp3.getName().toUpperCase().contains(searchStr.toUpperCase())) {
                mp3FindedIndexes.add(i);
            }
        }
        
        int[] selectIndexes = new int[mp3FindedIndexes.size()];
        if (selectIndexes.length == 0) {
            JOptionPane.showMessageDialog(this, "Поиск по строке\'"+searchStr+"\'не дал результатов");
            tfieldFind.requestFocus();
            tfieldFind.selectAll();
            return;
        }
        
        for (int i = 0; i < selectIndexes.length;i++) {
            selectIndexes[i]=mp3FindedIndexes.get(i);   
        }
        lstPlayList.setSelectedIndices(selectIndexes);
        
    }//GEN-LAST:event_btnFindActionPerformed

    private void menuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpenActionPerformed
        FileUtils.addFileFilter(jFileChooser1, new MP3PlayerFileFilter("pls", "Файл плейлиста"));
        int result = jFileChooser1.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jFileChooser1.getSelectedFile();
            DefaultListModel mp3ListModel = (DefaultListModel) FileUtils.deserialize(selectedFile.getPath());
            this.mp3ListModel = mp3ListModel;
            lstPlayList.setModel(mp3ListModel);
        }
    }//GEN-LAST:event_menuOpenActionPerformed

    private void menuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaveActionPerformed
        FileUtils.addFileFilter(jFileChooser1, new MP3PlayerFileFilter("pls","Файл плейлиста"));
        int result = jFileChooser1.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jFileChooser1.getSelectedFile();
            if (selectedFile.exists()) {
                int resultOverride = JOptionPane.showConfirmDialog(this, "Файл существует","Перезаписать?", JOptionPane.YES_NO_CANCEL_OPTION);
                switch (resultOverride) {
                    case JOptionPane.NO_OPTION :
                        menuSaveActionPerformed(evt);
                    case JOptionPane.CANCEL_OPTION :
                        jFileChooser1.cancelSelection();
                    return;
                }
               jFileChooser1.approveSelection();
               
            }
        String fileExtension = FileUtils.getFileExtension(selectedFile);
        String fileNameForSave = (fileExtension != null && fileExtension.equals("pls")) ? selectedFile.getPath() : selectedFile.getPath() + ".pls";
        FileUtils.serialize(mp3ListModel,fileNameForSave);
        }
    }//GEN-LAST:event_menuSaveActionPerformed

    private void menuSkin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSkin1ActionPerformed
        
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(playerForm.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        SwingUtilities.updateComponentTreeUI(this);
    
    }//GEN-LAST:event_menuSkin1ActionPerformed

    private void menuLookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuLookActionPerformed

    private void menuSkin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSkin2ActionPerformed
        try {
            UIManager.setLookAndFeel(new EaSynthLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(playerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_menuSkin2ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        FileUtils.addFileFilter(jFileChooser1, new MP3PlayerFileFilter("mp3","Музыкальный файл MP3"));
        int result = jFileChooser1.showOpenDialog(this);
        
        if (result == JFileChooser.APPROVE_OPTION) {
            
            File[] selectedFiles = jFileChooser1.getSelectedFiles();
                for(File file : selectedFiles) {
                    MP3 mp3 = new MP3(file.getName(), file.getPath());
                    mp3ListModel.addElement(mp3);
          
                }
            
            
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        int[] indexPlayList = lstPlayList.getSelectedIndices();
        if (indexPlayList.length > 0) {
            ArrayList <MP3> mp3ListForRemove = new ArrayList<MP3>();
            for (int i = 0; i < indexPlayList.length;i++) {
                MP3 mp3 = (MP3)mp3ListModel.getElementAt(indexPlayList[i]);
                mp3ListForRemove.add(mp3);
            }
            
        for (MP3 mp3 : mp3ListForRemove) {
            mp3ListModel.removeElement(mp3);
        }
        }
        
        
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownActionPerformed
        int nextIndex = lstPlayList.getSelectedIndex()+1;
        if (nextIndex < lstPlayList.getModel().getSize()) {
            lstPlayList.setSelectedIndex(nextIndex);
        }
    }//GEN-LAST:event_btnDownActionPerformed

    private void btnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpActionPerformed
       int nextIndex = lstPlayList.getSelectedIndex()-1;
        if (nextIndex < lstPlayList.getModel().getSize()) {
            lstPlayList.setSelectedIndex(nextIndex);
        }
    }//GEN-LAST:event_btnUpActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        int[] indexPlayList = lstPlayList.getSelectedIndices();
        if (indexPlayList.length > 0) {
            MP3 mp3 = (MP3) mp3ListModel.getElementAt(indexPlayList[0]);
            player.play(mp3.getPath());
            player.setVolume(scrlVolume.getValue(),scrlVolume.getMaximum());
        }
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed

        player.pause();
    }//GEN-LAST:event_btnPauseActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
          player.stop();
    }//GEN-LAST:event_btnStopActionPerformed

    private void scrlVolumeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_scrlVolumeStateChanged
        player.setVolume(scrlVolume.getValue(), scrlVolume.getMaximum());
        
        if (scrlVolume.getValue() == 0) {
            btnVolume.setSelected(true);
        } else {
            btnVolume.setSelected(false);
        }
        
    }//GEN-LAST:event_scrlVolumeStateChanged

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        
    }//GEN-LAST:event_btnNextActionPerformed

    private void lstPlayListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstPlayListMouseClicked
        if (evt.getModifiers() == InputEvent.BUTTON1_MASK && evt.getClickCount()==2) {
            int[] indexPlayList = lstPlayList.getSelectedIndices();
            if(indexPlayList.length > 0) {
                MP3 mp3 = (MP3) mp3ListModel.getElementAt(indexPlayList[0]);
                player.play(mp3.getPath());
                player.setVolume(scrlVolume.getValue(), scrlVolume.getMaximum());
            }
            
        }
    }//GEN-LAST:event_lstPlayListMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(playerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(playerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(playerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(playerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new playerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnDown;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnStop;
    private javax.swing.JButton btnUp;
    private javax.swing.JToggleButton btnVolume;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList lstPlayList;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuLook;
    private javax.swing.JMenuItem menuOpen;
    private javax.swing.JMenuItem menuSave;
    private javax.swing.JMenu menuService;
    private javax.swing.JMenuItem menuSkin1;
    private javax.swing.JMenuItem menuSkin2;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelSearch;
    private javax.swing.JSlider scrlVolume;
    private javax.swing.JTextPane tfieldFind;
    // End of variables declaration//GEN-END:variables

    private ImageIcon createIcon(String imagesKTjgG7yAc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
