/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trie.Project;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sai Nikhilesh Reddy <sainikhilaie@gmail.com>
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        
        ResultTable.getTableHeader().setFont(new Font("SansSerif",Font.BOLD,14));
        ResultTable.getTableHeader().setOpaque(false);
        ResultTable.getTableHeader().setBackground(new Color(32, 136, 203));
        ResultTable.getTableHeader().setForeground(new Color(255,255,255));
        ResultTable.setRowHeight(18);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WholePane = new javax.swing.JPanel();
        InputPane = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        source = new javax.swing.JLabel();
        event = new javax.swing.JLabel();
        task = new javax.swing.JLabel();
        levelField = new javax.swing.JTextField();
        dateField = new javax.swing.JTextField();
        timeField = new javax.swing.JTextField();
        sourceField = new javax.swing.JTextField();
        eventField = new javax.swing.JTextField();
        taskField = new javax.swing.JTextField();
        LoadBtn = new javax.swing.JButton();
        SearchBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        output = new javax.swing.JLabel();
        OutputPane = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResultTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Windows Log Files Filter");
        setResizable(false);

        WholePane.setBackground(new java.awt.Color(0, 0, 0));
        WholePane.setPreferredSize(new java.awt.Dimension(996, 370));

        InputPane.setBackground(new java.awt.Color(255, 255, 255));

        Title.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Windows Application Log Filter");

        level.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        level.setText("Level");

        date.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        date.setText("Date");

        time.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        time.setText("Time");

        source.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        source.setText("Source");

        event.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        event.setText("Event ID");

        task.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        task.setText("Task Category");

        LoadBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LoadBtn.setText("Load");
        LoadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadBtnActionPerformed(evt);
            }
        });

        SearchBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        ExitBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });

        output.setBackground(new java.awt.Color(255, 255, 255));
        output.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        output.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout InputPaneLayout = new javax.swing.GroupLayout(InputPane);
        InputPane.setLayout(InputPaneLayout);
        InputPaneLayout.setHorizontalGroup(
            InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPaneLayout.createSequentialGroup()
                .addGroup(InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(InputPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, InputPaneLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InputPaneLayout.createSequentialGroup()
                                .addGroup(InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(level, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(source, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(event, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(task, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(taskField)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InputPaneLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(timeField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(levelField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sourceField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(InputPaneLayout.createSequentialGroup()
                                        .addComponent(eventField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InputPaneLayout.createSequentialGroup()
                                .addComponent(LoadBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InputPaneLayout.setVerticalGroup(
            InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPaneLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addGroup(InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(levelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(level, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time))
                .addGroup(InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InputPaneLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sourceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(source)))
                    .addGroup(InputPaneLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(event)
                            .addComponent(eventField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addGroup(InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(taskField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(task))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoadBtn)
                    .addComponent(SearchBtn)
                    .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        ResultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Level", "Date", "Time", "Source", "Event ID", "Task Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ResultTable.setFocusable(false);
        ResultTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        ResultTable.setRowHeight(20);
        ResultTable.setRowSelectionAllowed(false);
        ResultTable.setSelectionBackground(new java.awt.Color(51, 204, 0));
        ResultTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        ResultTable.setShowVerticalLines(false);
        ResultTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(ResultTable);

        javax.swing.GroupLayout OutputPaneLayout = new javax.swing.GroupLayout(OutputPane);
        OutputPane.setLayout(OutputPaneLayout);
        OutputPaneLayout.setHorizontalGroup(
            OutputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        OutputPaneLayout.setVerticalGroup(
            OutputPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout WholePaneLayout = new javax.swing.GroupLayout(WholePane);
        WholePane.setLayout(WholePaneLayout);
        WholePaneLayout.setHorizontalGroup(
            WholePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WholePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InputPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OutputPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        WholePaneLayout.setVerticalGroup(
            WholePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WholePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(WholePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OutputPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InputPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WholePane, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WholePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(999, 402));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitBtnActionPerformed

    private LogNavigator logNav = new LogNavigator();
    
    public void loadTable(List<Integer> list){
        DefaultTableModel model = (DefaultTableModel) this.ResultTable.getModel();
        model.setRowCount(0);
        
        long counter = 0;
        try{
            for (int lineNo : list){
                TrieNode trie = logNav.Lines.get(lineNo);
                Object[] data = trie.LineData;
                model.addRow(data);
                counter++;
            }
            this.ResultTable.setDefaultRenderer(Object.class, new MyTableRenderer());
            output.setText(counter+" Rows Found!!!");
        }catch(NullPointerException ex){
        }
    }
    
    private void LoadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadBtnActionPerformed
        // TODO add your handling code here:
        //FileNameExtensionFilter filter = new FileNameExtensionFilter("csv","csv","log","log","txt");
        JFileChooser fileChooser = new JFileChooser(new File(System.getProperty("user.home") + System.getProperty("file.separator")));
        //fileChooser.setFileFilter(filter);
        int data = fileChooser.showSaveDialog(null);
        if(data == JFileChooser.APPROVE_OPTION){
            String filepath = fileChooser.getSelectedFile().getAbsolutePath();
            try {
                logNav.loadData(filepath);
                loadTable(logNav.searchData(new String [] {}));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("User cancelled the operation.");
        }
    }//GEN-LAST:event_LoadBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
        String [] userData = new String [] {
            levelField.getText(),
            dateField.getText(),
            timeField.getText(),
            sourceField.getText(),
            eventField.getText(),
            taskField.getText()
        };
        List<Integer> list = logNav.searchData(userData);
        loadTable(list);
    }//GEN-LAST:event_SearchBtnActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitBtn;
    private javax.swing.JPanel InputPane;
    private javax.swing.JButton LoadBtn;
    private javax.swing.JPanel OutputPane;
    private javax.swing.JTable ResultTable;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel WholePane;
    private javax.swing.JLabel date;
    private javax.swing.JTextField dateField;
    private javax.swing.JLabel event;
    private javax.swing.JTextField eventField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel level;
    private javax.swing.JTextField levelField;
    private javax.swing.JLabel output;
    private javax.swing.JLabel source;
    private javax.swing.JTextField sourceField;
    private javax.swing.JLabel task;
    private javax.swing.JTextField taskField;
    private javax.swing.JLabel time;
    private javax.swing.JTextField timeField;
    // End of variables declaration//GEN-END:variables
}