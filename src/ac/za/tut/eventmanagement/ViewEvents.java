/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.eventmanagement;

import techDiscipline.m.kn.lp.xe.am.Event;
import java.awt.event.ItemEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lintshiwe
 */
public class ViewEvents extends javax.swing.JFrame {

    private String filter;

    /**
     * Creates new form ViewEvents
     */
    public ViewEvents() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        filterType = new javax.swing.JComboBox<>();
        fIlterValue = new javax.swing.JTextField();
        EventSearchLabel = new javax.swing.JLabel();
        ReadBTN = new javax.swing.JButton();
        homebtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TechDisciples");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(21, 52, 175));
        setForeground(new java.awt.Color(0, 51, 255));
        setLocationByPlatform(true);

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setFont(new java.awt.Font("STCaiyun", 1, 18)); // NOI18N
        jLabel1.setText("                                             View Events");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        TextArea.setBackground(new java.awt.Color(242, 242, 242));
        TextArea.setColumns(20);
        TextArea.setLineWrap(true);
        TextArea.setRows(5);
        TextArea.setFocusTraversalPolicyProvider(true);
        jScrollPane1.setViewportView(TextArea);

        jLabel2.setText("Filter By ");

        filterType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Category", "Event Name", "Date" }));
        filterType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filterTypeItemStateChanged(evt);
            }
        });

        fIlterValue.setText(" ");

        EventSearchLabel.setText(" ");

        ReadBTN.setText("Read ");
        ReadBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadBTNActionPerformed(evt);
            }
        });

        homebtn.setText("Home Page");
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(homebtn)
                                .addGap(55, 55, 55)
                                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(EventSearchLabel))
                                .addGap(165, 165, 165)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(filterType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fIlterValue, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ReadBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filterType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fIlterValue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EventSearchLabel)
                    .addComponent(ReadBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        this.dispose();
        new HomePage().setVisible(true);
    }//GEN-LAST:event_homebtnActionPerformed

    private void filterTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filterTypeItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {

            String filter = (String) filterType.getSelectedItem();

            if (filter.equalsIgnoreCase("Date")) {
                EventSearchLabel.setText("Enter Date");
                fIlterValue.setVisible(true);

            } else if (filter.equalsIgnoreCase("category")) {
                EventSearchLabel.setText("Enter Category");
                fIlterValue.setVisible(true);

            } else if (filter.equalsIgnoreCase("Event Name")) {
                EventSearchLabel.setText("Enter Event Name");
                fIlterValue.setVisible(true);

            } else {
                EventSearchLabel.setText(" ");
                fIlterValue.setVisible(false);
                ReadBTN.setText("Read All");

            }

        }
    }//GEN-LAST:event_filterTypeItemStateChanged

    private void ReadBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadBTNActionPerformed

        ArrayList<Event> allEvents = readAll();
        String events = "";
        
       
        
        

        if (((String) filterType.getSelectedItem()).equalsIgnoreCase("category")) {
            String category = fIlterValue.getText();

        
            for (int x = 0; x < allEvents.size(); x++) {

                if (category.equalsIgnoreCase(allEvents.get(x).getEventCategory())) {

                    events += allEvents.get(x).toString()
                            + "\n---------------------------\n";;
                }
            }
            
            
        } else if (((String) filterType.getSelectedItem()).equalsIgnoreCase("Event Name")) {

            String eventName = fIlterValue.getText();

            for (int x = 0; x < allEvents.size(); x++) {

                if (eventName.equalsIgnoreCase(allEvents.get(x).getEventName())) {

                    events += allEvents.get(x).toString()
                            + "\n---------------------------\n";;
                }
            }

        } else if (((String) filterType.getSelectedItem()).equalsIgnoreCase("date")) {

           String date= fIlterValue.getText();

            for (int x = 0; x < allEvents.size(); x++) {

                if (date.equalsIgnoreCase(allEvents.get(x).getDate())) {

                    events += allEvents.get(x).toString()
                            + "\n---------------------------\n";
                }
            }

        } else {

            for (int x = 0; x < allEvents.size(); x++) {

                events += allEvents.get(x).toString()
                        + "\n---------------------------\n";

            }

        }

        
        
        if(events.isEmpty()){
             TextArea.setText("No Events was Found");
        }else{
            TextArea.setText(events);
        }
        
    }//GEN-LAST:event_ReadBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EventSearchLabel;
    private javax.swing.JButton ReadBTN;
    private javax.swing.JTextArea TextArea;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton exitBtn;
    private javax.swing.JTextField fIlterValue;
    private javax.swing.JComboBox<String> filterType;
    private javax.swing.JButton homebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Event> readAll() {

        ArrayList<Event> list = new ArrayList<>();
        File file = new File("events.text");

        try (BufferedReader bfr = new BufferedReader(new FileReader(file))) {

            if (file.exists()) {

                String line;

                while ((line = bfr.readLine()) != null) {

                    String[] eventsArray = line.split("#");

                    String eventId = eventsArray[0];
                    String eventName = eventsArray[1];
                    String eventCategory = eventsArray[2];
                    String date = eventsArray[3];
                    String time = eventsArray[4];
                    String duration = eventsArray[5];

                    list.add(new Event(eventId, eventName, eventCategory, date, duration, time));

                }

            } else {
                JOptionPane.showMessageDialog(null, "file does not exits", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (IOException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return list;

    }
}
