/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.mongodb.AggregationOptions;
import com.mongodb.AggregationOutput;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.Cursor;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.awt.Component;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Math.toIntExact;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.bson.Document;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import yelp_mongo.Yelp_mongo;


/**
 *
 * @author Sanjay Desai
 */
public class hw extends javax.swing.JFrame {

    /**
     * Creates new form hw3
     *///Dbconnection A1 = new Dbconnection();
      //Connection con = A1.getconnection();
    public hw() {
        initComponents();
    }

    MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
        MongoDatabase db = mongoClient.getDatabase("mydb");
         
          
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jComboBox14 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jComboBox15 = new javax.swing.JComboBox<>();
        jTextField6 = new javax.swing.JTextField();
        jComboBox16 = new javax.swing.JComboBox<>();
        jTextField7 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Business"));

        jLabel3.setText("Check-In");

        jLabel4.setText("Review");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6" }));

        jLabel6.setText("From");

        jLabel7.setText("To");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6" }));

        jLabel8.setText("No. of Check-ins");

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<", ">", "=", "<=", ">=" }));

        jLabel9.setText("From");

        jLabel11.setText("To");

        jLabel12.setText("yyyy-mm-dd");

        jLabel13.setText("Stars");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<", ">", "=", "<=", ">=" }));

        jLabel14.setText("Votes");

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<", ">", "=", "<=", ">=" }));

        jLabel5.setText("Category");

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Active Life", "Arts & Entertainment ", "Automotive ", "Car Rental ", "Cafes", "Beauty & Spas", "Convenience Stores ", "Dentists", "Doctors ", "Drugstores ", "Department Stores ", "Education ", "Event Planning & Services", "Flowers & Gifts", "Food ", "Health & Medical ", "Home Services", "Home & Garden", "Hospitals ", "Hotels & Travel", "Hardware Stores", "Grocery ", "Medical Centers", "Nurseries & Gardening", "Nightlife", "Restaurants ", "Shopping ", "Transportation" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList2);

        jTextField9.setText("0");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField10.setText("0");

        jTextField11.setText("0");
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jButton3.setText("Execute Query");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField12.setText("0");

        jTextField13.setText("0");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "5", "10", "20", "30", "50" }));

        jLabel2.setText("Proximity");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Point Of Interest", "4840 E Indian School Rd\\nSte 101\\nPhoenix, AZ 85018", "631 S Main St\\nDe Forest, WI 53532", "5813 Main St\\nMc Farland, WI 53558", "2039 Allen Blvd\\nMiddleton, WI 53562", "6230 University Ave\\nMiddleton, WI 53562" }));

        jLabel21.setText("Point of Interest");

        jLabel22.setText("yyyy-mm-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(576, 576, 576))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel2))
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(93, 93, 93)
                                        .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(jLabel13))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addGap(120, 120, 120)
                                        .addComponent(jLabel3)
                                        .addGap(146, 146, 146))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel9))
                                        .addGap(26, 26, 26)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel10))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel22)
                                                    .addComponent(jLabel12))))))))
                        .addGap(144, 144, 144)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel21))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jButton3)
                        .addContainerGap())))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("User"));

        jLabel15.setText("Member Since:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel16.setText("yyyy-mm");

        jLabel17.setText("Review count:");

        jLabel18.setText("Fans:");

        jLabel19.setText("Avg Stars:");

        jLabel20.setText("No. Friends:");

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<", "=", ">" }));

        jTextField4.setText("0");

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<", "=", ">" }));
        jComboBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox14ActionPerformed(evt);
            }
        });

        jTextField5.setText("0");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<", "=", ">" }));

        jTextField6.setText("0");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<", "=", ">" }));

        jTextField7.setText("0");

        jLabel1.setText("Select:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AND", "OR" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 153, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton1.setText("Execute Query");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField8.setText("                            ");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Yelping_since", "Friends", "ReviewNo", "Name", "User_Id", "Fans", "Avg_Stars", "Type"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Business_id", "Category", "Subcategory", "Stars"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField8))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 224, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      MongoCollection<Document> coll = db.getCollection("user");
      String member_value = jTextField2.getText();
      String review_value = jTextField4.getText();
      String fans_value = jTextField5.getText();
      String average_stars_value = jTextField6.getText();
      String friends_value = jTextField7.getText();
      String review_dropdown = jComboBox13.getSelectedItem().toString();
      String fans_dropdown = jComboBox14.getSelectedItem().toString();
      String stars_dropdown = jComboBox15.getSelectedItem().toString();
      String friends_dropdown = jComboBox16.getSelectedItem().toString();
      BasicDBObject qryUser = new BasicDBObject();
      BasicDBList UserList = new BasicDBList();
FindIterable<Document> cursor;
      String select= jComboBox1.getSelectedItem().toString();
      if(member_value == null && review_value.equals("0") && fans_value.equals("0") && average_stars_value.equals("0") && friends_value.equals("0") )
      {
          
           qryUser = null;
          
      }
      if(member_value == null || member_value.equals(""))
      {
          member_value = "1999-01";
      }
//      if(review_value == null || review_value.equals(""))
//      {
//          review_value = "0";
//      }
//      if(fans_value == null || fans_value.equals(""))
//      {
//          fans_value = "0";
//      }
//      if(average_stars_value == null || average_stars_value.equals(""))
//      {
//          average_stars_value = "0";
//      }
//      if(friends_value == null || friends_value.equals(""))
//      {
//          friends_value = "0";
//      }
      
      if(!friends_value.equals("0"))
      {
          BasicDBObject fv = new BasicDBObject("friends."+friends_value,new BasicDBObject("$exists",true));
          UserList.add(fv);
      }
      if(!member_value.equals("0"))
      {
          BasicDBObject mv = new BasicDBObject("yelping_since",new BasicDBObject("$gt",member_value));
          UserList.add(mv);
      }
      if(!review_value.equals("0"))
      {
          if(review_dropdown.equals(">"))
          {
          BasicDBObject rv = new BasicDBObject("review_count",new BasicDBObject("$gt",Integer.parseInt(review_value)));
          UserList.add(rv);
          }
          if(review_dropdown.equals("<"))
          {
          BasicDBObject rv = new BasicDBObject("review_count",new BasicDBObject("$lt",Integer.parseInt(review_value)));
          UserList.add(rv);
          }
          if(review_dropdown.equals("="))
          {
          BasicDBObject rv = new BasicDBObject("review_count",Integer.parseInt(review_value));
          UserList.add(rv);
          }
          
          
      }
      if(!fans_value.equals("0"))
      {
          if(fans_dropdown.equals(">"))
          {
          BasicDBObject f = new BasicDBObject("fans",new BasicDBObject("$gt",Integer.parseInt(fans_value)));
          UserList.add(f);
          }
          if(review_dropdown.equals("<"))
          {
          BasicDBObject f = new BasicDBObject("fans",new BasicDBObject("$lt",Integer.parseInt(fans_value)));
          UserList.add(f);
          }
          if(review_dropdown.equals("="))
          {
          BasicDBObject f = new BasicDBObject("fans",Integer.parseInt(fans_value));
          UserList.add(f);
          }
      }
          if(!average_stars_value.equals("0"))
      {
          if(stars_dropdown.equals(">"))
          {
          BasicDBObject as = new BasicDBObject("average_stars",new BasicDBObject("$gt",Integer.parseInt(average_stars_value)));
          UserList.add(as);
          }
          if(review_dropdown.equals("<"))
          {
          BasicDBObject as = new BasicDBObject("average_stars",new BasicDBObject("$lt",Integer.parseInt(average_stars_value)));
          UserList.add(as);
          }
          if(review_dropdown.equals("="))
          {
          BasicDBObject as = new BasicDBObject("average_stars",Integer.parseInt(average_stars_value));
          UserList.add(as);
          }
      }
          
        if("AND".equals(jComboBox1.getSelectedItem().toString()))
        {
            qryUser = new BasicDBObject("$and",UserList);
        }
        if("OR".equals(jComboBox1.getSelectedItem().toString()))
        {
            qryUser = new BasicDBObject("$or",UserList);
        }
         if(qryUser == null)
         {
             jTextField8.setText("db.user.find()");
             cursor = coll.find();
             
         }
         else{
             
             jTextField8.setText("db.user.find("+qryUser.toString()+")");
             cursor = coll.find(qryUser);
         }
         String Columnames[] = {"yelping_since","review_count","name","user_id","average_stars"};   
                    DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
                    dtm.setColumnCount(0);
                    dtm.setRowCount(0);
                    int numberOfColumns = Columnames.length;

                    for (int i = 0; i < numberOfColumns; i++) {
                        String name = Columnames[i];
                        dtm.addColumn(name);

                    }
                    
                    
                cursor.forEach(new Block<Document>() {
                @Override
                public void apply(final Document document) {
                    
                                Object rowData[] = new Object[numberOfColumns];
                       
                                rowData[0] = document.get("yelping_since");
                                rowData[1] = document.get("review_count");
                                rowData[2] = document.get("name");
                                rowData[3] = document.get("user_id");
                                rowData[4] = document.get("average_stars");
                                
//                                System.out.print(document.get("yelping_since")+"\t");                                
//                                System.out.print(document.get("review_count")+"\t");                                
//                                System.out.print(document.get("name")+"\t");                                
//                                System.out.print(document.get("user_id")+"\t");                                
//                                System.out.print(document.get("average_stars")+"\t");                                
//                                System.out.println();
                                dtm.addRow(rowData);
                                rowData = null;
                }
            });
                            
                    jTable2.setRowSelectionAllowed(true);
                    jTable2.setModel(dtm);

                    jTable2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                    dtm.fireTableDataChanged();
                    
                  // mongoClient.close();
   

            
//        
//        
//      

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox14ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
               
//        ResultSet rs1;
//         
//        try {
             MongoCollection<Document> coll = db.getCollection("business");
             //MongoCollection<Document> catcollection = db.getCollection("catout");
             MongoCollection<Document> rcoll = db.getCollection("review");
             //final DBCollection collection = db.getCollection("review");
             MongoCollection<Document> ccoll = db.getCollection("checkin");
             String from_dropdown = jComboBox3.getSelectedItem().toString();
             String to_dropdown = jComboBox6.getSelectedItem().toString();

             String from_value = jTextField9.getText();
             String to_value = jTextField10.getText();
             String check_count_value = jTextField11.getText();
            
             String check_count_dropdown = jComboBox8.getSelectedItem().toString();
             String fromdate_value = jTextField1.getText();
             String todate_value = jTextField3.getText();
             String stars_value = jTextField12.getText();
             String votes_value = jTextField13.getText();
             String stars_dropdown = jComboBox4.getSelectedItem().toString();
             String votes_dropdown = jComboBox12.getSelectedItem().toString();
             String select= jComboBox1.getSelectedItem().toString();
            List<String> category_value = jList2.getSelectedValuesList();
            String poi = jComboBox5.getSelectedItem().toString();
            String proximity = jComboBox2.getSelectedItem().toString();
            BasicDBObject qryBusiness = new BasicDBObject();
            BasicDBObject qryReview = new BasicDBObject();
            BasicDBList BusinessList = new BasicDBList();
            BasicDBList ReviewList = new BasicDBList();
            FindIterable<Document> cursor;
            FindIterable<Document> cursor1;
            List<String> catout = new ArrayList<String>();
            List<String> proout = new ArrayList<String>();
            List<String> checkinout = new ArrayList<String>();
            List<String> reviewout = new ArrayList<String>();
            List<String> finalout = new ArrayList<String>();

            
            if(category_value.isEmpty() )//&& poi == null && proximity == null && from_value == null && fromdate_value == null)
            {
                BasicDBObject nu = new BasicDBObject();
                FindIterable<Document> fi;
                fi = coll.find(nu);
                jTextField8.setText("db.business.find()");
                String Columnames[] = {"business_id","state","city","stars"};   
                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    dtm.setColumnCount(0);
                    dtm.setRowCount(0);
                    int numberOfColumns = Columnames.length;

                    for (int i = 0; i < numberOfColumns; i++) {
                        String name = Columnames[i];
                        dtm.addColumn(name);

                    }
                    
                    
                fi.forEach(new Block<Document>() {
                @Override
                public void apply(final Document document) {
                    
                                Object rowData[] = new Object[numberOfColumns];
                       
                                rowData[0] = document.get("business_id");
                                rowData[1] = document.get("state");
                                rowData[2] = document.get("city");
                                rowData[3] = document.get("stars");
                               
                                
                              
                                dtm.addRow(rowData);
                                rowData = null;
                }
            });
                            
                    jTable1.setRowSelectionAllowed(true);
                    jTable1.setModel(dtm);

                    jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                    dtm.fireTableDataChanged();
                    
            }
            else{
            
             Object[] l = jList2.getSelectedValues();
             //BasicDBList subcat = new BasicDBList();
           BasicDBList clist = new BasicDBList(); 
           BasicDBObject qrycategory;
            if (l.length > 0) {
               for (int i = 0; i < l.length; i++) {
                   BasicDBObject buinessop = new BasicDBObject("categories",l[i]);
            clist.add(buinessop);
                }
            }
               qrycategory = new BasicDBObject("$or",clist);
//               subcatquery = new BasicDBObject("$out","subcat");
//               subcat.add(qrycategory);
//               subcat.add(subcatquery);
//               System.out.println(subcat);
               cursor = coll.find(qrycategory);
               
                System.out.println(qrycategory);
                //BasicDBObject category = new BasicDBObject();
                cursor.forEach(new Block<Document>() {
                @Override
                public void apply(final Document document) {
                                                            
                                
                                System.out.println(document.get("business_id"));
                                //category.put((String)document.get("business_id"), db);
                                
                                catout.add((String) document.get("business_id"));
//                                System.out.println(document.get("state"));
//                                System.out.println(document.get("city"));
//                                System.out.println(document.get("stars"));
//                               
                                
                }
            });
                
                MongoCollection<Document> collecttest = db.getCollection("test");
                 String[] addresses5 = {"","4840 E Indian School Rd\\nSte 101\\nPhoenix, AZ 85018",
"631 S Main St\\nDe Forest, WI 53532",
"5813 Main St\\nMc Farland, WI 53558",
"2039 Allen Blvd\\nMiddleton, WI 53562",
"6230 University Ave\\nMiddleton, WI 53562"};
    String[][] latLong = {{"33.499313000000001", "-111.98375799999999"},{"43.2408748","-89.343721700000003"},{"43.014164000000001","-89.288567"},{"43.090642000000003","-89.485168999999999"},{"43.0910607","-89.487486700000005"}};


BasicDBObject queryBusiness = new BasicDBObject();
             BasicDBList businessinputlist = new BasicDBList();

 String selectedAddress= jComboBox5.getSelectedItem().toString();
            String selectedProximity= jComboBox2.getSelectedItem().toString();
            Double pro = Double.parseDouble(selectedProximity)/3963.2 ; 
            int index = Arrays.asList(addresses5).indexOf(selectedAddress);
            Double Latitude = Double.parseDouble(latLong[index][0]);
            Double Longitude = Double.parseDouble(latLong[index][1]);  
                System.out.println("lat" + Latitude);
                System.out.println("longi" + Longitude);
                //BasicDBObject lat = new BasicDBObject(Latitude.toString(),Longitude);
                BasicDBList c1 = new BasicDBList();
                BasicDBList cs = new BasicDBList();
                cs.add(Latitude);
                cs.add(Longitude);
                c1.add(cs);
                c1.add(pro);
                BasicDBObject c = new BasicDBObject("$centerSphere",c1);
                 BasicDBObject bq = new BasicDBObject("loc",new BasicDBObject("$geoWithin",c) );
                FindIterable<Document> fi;
                fi = collecttest.find(bq);
                System.out.println(bq);
                jTextField8.setText("db.test.find("+bq+")");
                 fi.forEach(new Block<Document>() {
                @Override
 public void apply(final Document document) {
                    
                    
                    System.out.println(document.get("business_id"));
                    
                    proout.add((String) document.get("business_id"));
                    
                    //System.out.println(document.get("loc"));
                }
            });
                int checkinempty = 0;
        if(from_value == null || to_value == null || check_count_value.equals("0"))
        {
            checkinempty = 1;
            List<String>  pr = new ArrayList<String>(catout);
           System.out.println(pr.size());
pr.retainAll(proout);
System.out.println(pr.size());
String Columnames[] = {"Business_id","state","city","stars"};   
                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    dtm.setColumnCount(0);
                    dtm.setRowCount(0);
                    int numberOfColumns = Columnames.length;
                    Object rowData[] = new Object[numberOfColumns];

                    for (int i = 0; i < numberOfColumns; i++) {
                        String name = Columnames[i];
                        dtm.addColumn(name);

                    }
                    for(int i=0;i<pr.size();i++)
                    {
                        
                        
                        
                        rowData[0] = pr.get(i);
                        BasicDBObject c11 = new BasicDBObject("business_id",pr.get(i));
                        FindIterable<Document> f1;
                        f1 = coll.find(c11);
                        f1.forEach(new Block<Document>() {
                @Override
                public void apply(final Document document) {
                    
                                Object rowData[] = new Object[numberOfColumns];
                                rowData[0] = document.get("business_id");
                                rowData[1] = document.get("state");
                                rowData[2] = document.get("city");
                                rowData[3] = document.get("stars");
                                dtm.addRow(rowData);
                        rowData = null;
                                
                }
                        });
                        
                       
//                                
//                                
//                              
                               
                    }
                    
                    

                            
                    jTable1.setRowSelectionAllowed(true);
                    jTable1.setModel(dtm);

                    jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                    dtm.fireTableDataChanged();
                    
        }
        if(checkinempty != 1)
             {
                 
                   BasicDBList checkinputlist = new BasicDBList();
   //               
                  ArrayList<String> list1;
                    list1 = new ArrayList<String>();
                    list1.add("0");
                    list1.add("1");
                    list1.add("2");
                    list1.add("3");
                    list1.add("4");
                    list1.add("5");
                    list1.add("6");
                   
                    
                
                    
                    int from = list1.indexOf(from_dropdown) ;
                    int to =  list1.indexOf(to_dropdown) ;
                    int count = to-from;
                    int hoursfrom1 = Integer.parseInt(from_value);
                    int hoursto1 = Integer.parseInt(to_value);
                    int count1 = hoursto1-hoursfrom1;
                
                    FindIterable<Document> iterable = ccoll.find();
                    
                    iterable.forEach(new Block<Document>() {
                 @Override
                 public void apply(final Document document) {
                   //System.out.println(document.get("checkin_info"));
                   
                   String s = document.toJson();
                  s.replace("Document", "");
                 // System.out.println(s);
                  JSONParser parser = new JSONParser();
              try{
                  Object obj = parser.parse(s);   
                  JSONObject doc = (JSONObject)obj;
                    
                   //System.out.println(doc.get("checkin_info"));
                   JSONObject cinfo = (JSONObject) doc.get("checkin_info");
                   if(count>=0)
                    {   
                        long num_checkin=0;
                        for(int i=from; i<=to; i++)
                        {
                            if(count1>=0)
                            {
                                for(int j=hoursfrom1; j<=hoursto1; j++)
                                { 
                                    //System.out.println(cinfo.get(j+"-"+i));
                                       if(cinfo.containsKey(j+"-"+i))
                                     {
                                       num_checkin = num_checkin +(long)cinfo.get(j+"-"+i);
         //                              System.out.println(document.get("checkin_info."+j+"-"+i));
                                       
                                     }
                                     
                    
                                }
                            }
                        }
                        if(num_checkin != 0)
                        {
                        if(jComboBox8.getSelectedItem().equals(">") && num_checkin > Long.parseLong(check_count_value))
                        {
                                System.out.println(num_checkin+" checkins into "+ doc.get("business_id"));
                                checkinout.add((String) document.get("business_id"));
                                
                            
                        }
                        if(jComboBox8.getSelectedItem().equals("<")&& num_checkin < Long.parseLong(check_count_value))
                        {
                        System.out.println(num_checkin+" checkins into  "+ doc.get("business_id"));
                                                        checkinout.add((String) document.get("business_id"));

                         
                        }
                        if(jComboBox8.getSelectedItem().equals("=")&& num_checkin == Long.parseLong(check_count_value))
                        {
                        System.out.println(num_checkin+" checkins into  "+ doc.get("business_id"));
                                                        checkinout.add((String) document.get("business_id"));

                         
                        }
                        }
                        
                        num_checkin = 0;
                 
                   
                     
                 }
                    }catch(Exception e ){
              System.out.println(e);
              }
             }});
                
            if(fromdate_value != null && todate_value!= null)
                {
                    BasicDBObject fdv = new BasicDBObject("date",new BasicDBObject("$gte",fromdate_value));
                    ReviewList.add(fdv);
                    BasicDBObject tdv = new BasicDBObject("date",new BasicDBObject("$lte",todate_value));
                    ReviewList.add(tdv);
                }
                 if(stars_value != null)
                {
                    if(stars_dropdown == ">")
                    {
                        BasicDBObject sv = new BasicDBObject("stars",new BasicDBObject("$gt",Integer.parseInt(stars_value)));
                    ReviewList.add(sv);
                    }
                     if(stars_dropdown == "<")
                    {
                        BasicDBObject sv = new BasicDBObject("stars",new BasicDBObject("$lt",Integer.parseInt(stars_value)));
                    ReviewList.add(sv);
                    }
                      if(stars_dropdown == "=")
                    {
                        BasicDBObject sv = new BasicDBObject("stars",Integer.parseInt(stars_value));
                    ReviewList.add(sv);
                    }
                }
                 
                    if(votes_value != null)
                {
                    if(votes_dropdown == ">")
                    {
                        BasicDBObject vv = new BasicDBObject("votes",new BasicDBObject("$gt",Integer.parseInt(votes_value)));
                    //ReviewList.add(vv);
                    }
                     if(votes_dropdown == "<")
                    {
                        BasicDBObject vv = new BasicDBObject("votes",new BasicDBObject("$lt",Integer.parseInt(votes_value)));
                    //ReviewList.add(vv);
                    }
                      if(votes_dropdown == "=")
                    {
                        BasicDBObject vv = new BasicDBObject("votes",Integer.parseInt(votes_value));
                    //ReviewList.add(vv);
                    }
                }
                  qryReview = new BasicDBObject("$and",ReviewList);
                  if(qryReview == null)
         {
             //jTextField8.setText("db.review.find()");
             cursor1 = rcoll.find();
             
         }
         else{
             
             //jTextField8.setText("db.review.find("+qryReview.toString()+")");
             cursor1 = rcoll.find(qryReview);
         }
        
        cursor1.forEach(new Block<Document>() {
                @Override
                public void apply(final Document document) {
                                System.out.println(document.get("business_id"));   
                                                                reviewout.add((String) document.get("business_id"));

                }
            });
        if("AND".equals(jComboBox1.getSelectedItem().toString()))
        {
          //jTextField8.setText("db.checkin.find("+"{}"+","+"{business_id"+":1}"+")");
           List<String>  fin = new ArrayList<String>(catout);
           System.out.println(fin.size());
fin.retainAll(proout);
System.out.println(fin.size());


    fin.retainAll(checkinout);


System.out.println(fin.size());

        
fin.retainAll(reviewout);

//
System.out.println(fin.size());
String Columnames[] = {"Business_id","state","city","stars"};   
                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    dtm.setColumnCount(0);
                    dtm.setRowCount(0);
                    int numberOfColumns = Columnames.length;
                    Object rowData[] = new Object[numberOfColumns];

                    for (int i = 0; i < numberOfColumns; i++) {
                        String name = Columnames[i];
                        dtm.addColumn(name);

                    }
                    for(int i=0;i<fin.size();i++)
                    {
                        
                        
                        
                        rowData[0] = fin.get(i);
                        BasicDBObject c11 = new BasicDBObject("business_id",fin.get(i));
                        FindIterable<Document> f1;
                        f1 = coll.find(c11);
                        f1.forEach(new Block<Document>() {
                @Override
                public void apply(final Document document) {
                    
                                Object rowData[] = new Object[numberOfColumns];
                                rowData[0] = document.get("business_id");
                                rowData[1] = document.get("state");
                                rowData[2] = document.get("city");
                                rowData[3] = document.get("stars");
                                dtm.addRow(rowData);
                        rowData = null;
                                
                }
                        });
                        
                       
//                                
//                                
//                              
                               
                    }
                    
                    

                            
                    jTable1.setRowSelectionAllowed(true);
                    jTable1.setModel(dtm);

                    jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                    dtm.fireTableDataChanged();
                    
        }
        if("OR".equals(jComboBox1.getSelectedItem().toString()))
        {
            //MongoCollection<Document> = db.getCollection("business");
            //jTextField8.setText("db.checkin.find("+"{}"+","+"{business_id"+":1}"+")");
            List<String> fin = new ArrayList<String>(catout); //create a Set with all the elements in a
fin.addAll(proout);
System.out.println(fin.size());
fin.addAll(checkinout);
System.out.println(fin.size());
fin.addAll(reviewout);
System.out.println(fin.size());


String Columnames[] = {"Business_id","state","city","stars"};   
                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    dtm.setColumnCount(0);
                    dtm.setRowCount(0);
                    int numberOfColumns = Columnames.length;
                    //Object rowData[] = new Object[numberOfColumns];
                    //Object rd1,rd2,rd3; 

                    for (int i = 0; i < numberOfColumns; i++) {
                        String name = Columnames[i];
                        dtm.addColumn(name);

                    }
                    for(int i=0;i<fin.size();i++)
                    {
                        
                        Object rowData[] = new Object[numberOfColumns];
                        
                        rowData[0] = fin.get(i);
                        
                        BasicDBObject c11 = new BasicDBObject("business_id",fin.get(i));
                        FindIterable<Document> f1;
                        f1 = coll.find(c11);
                        f1.forEach(new Block<Document>() {
                @Override
                public void apply(final Document document) {
                    
                                Object rowData[] = new Object[numberOfColumns];
                                rowData[0] = document.get("business_id");
                                rowData[1] = document.get("state");
                                rowData[2] = document.get("city");
                                rowData[3] = document.get("stars");
                                dtm.addRow(rowData);
                                rowData = null;
                    }
                        });
                        
                        
                                
               }
 //                       });
                        
                       
                       
                    
                                //Object rowData[] = new Object[numberOfColumns];
          
                        
//                                
//                                
//                              
                               
                                
                   
                        
                        
                          
                    
                            
                    jTable1.setRowSelectionAllowed(true);
                    jTable1.setModel(dtm);

                    jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                    dtm.fireTableDataChanged();
                    

        }
         if(qryBusiness == null)
         {
             //jTextField8.setText("db.business.find()");
             cursor = coll.find();
             
         }
         else{
             
             //jTextField8.setText("db.business.find("+qryBusiness.toString()+")");
             cursor = coll.find(qryBusiness);
         }
         
                  
//         } catch (SQLException ex) {
//             Logger.getLogger(hw.class.getName()).log(Level.SEVERE, null, ex);
//         }
//             
//             
//         
//     
    
      
      
        }
             
             
             }  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed
  
   
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
         
         
             MongoCollection<Document> rcoll = db.getCollection("review");
             String user = jTable2.getValueAt(jTable2.getSelectedRow(),3).toString();
             

             BasicDBObject userid = new BasicDBObject("user_id",user);
             
             FindIterable<Document> cursor2;
             
             jTextField8.setText("db.review.find("+userid.toString()+")");
             cursor2 = rcoll.find(userid);
             
             
//             ResultSet rs = stmt.executeQuery(qry);
             String Columnames[] = {"user_id","business_id","text"};   
                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    dtm.setColumnCount(0);
                    dtm.setRowCount(0);
                    int numberOfColumns = Columnames.length;

                    for (int i = 0; i < numberOfColumns; i++) {
                        String name = Columnames[i];
                        dtm.addColumn(name);

                    }
                    
                    
                cursor2.forEach(new Block<Document>() {
                @Override
                public void apply(final Document document) {
                    
                                Object rowData[] = new Object[numberOfColumns];
                       
                                rowData[0] = document.get("user_id");
                                rowData[1] = document.get("business_id");
                                rowData[2] = document.get("text");
                                
                 
                                dtm.addRow(rowData);
                                rowData = null;
                }
            });
             
             
         
             
        
         
         
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //try {
         MongoCollection<Document> rcoll = db.getCollection("review");
             String business = jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();
             

             BasicDBObject businessid = new BasicDBObject("business_id",business);
             
             FindIterable<Document> cursor2;
             
             jTextField8.setText("db.review.find("+businessid.toString()+")");
             cursor2 = rcoll.find(businessid);
             
             
//             ResultSet rs = stmt.executeQuery(qry);
             String Columnames[] = {"user_id","business_id","text"};   
                    DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
                    dtm.setColumnCount(0);
                    dtm.setRowCount(0);
                    int numberOfColumns = Columnames.length;

                    for (int i = 0; i < numberOfColumns; i++) {
                        String name = Columnames[i];
                        dtm.addColumn(name);

                    }
                    
                    
                cursor2.forEach(new Block<Document>() {
                @Override
                public void apply(final Document document) {
                    
                                Object rowData[] = new Object[numberOfColumns];
                       
                                rowData[0] = document.get("user_id");
                                rowData[1] = document.get("business_id");
                                rowData[2] = document.get("text");
                                
                 
                                dtm.addRow(rowData);
                                rowData = null;
                }
            });
             
            
    }//GEN-LAST:event_jTable1MouseClicked
    public static DefaultTableModel buildTableModel(ResultSet rs)
        throws SQLException {

    ResultSetMetaData metaData = rs.getMetaData();

    
    Vector<String> columnNames = new Vector<String>();
    int columnCount = metaData.getColumnCount();
    for (int column = 1; column <= columnCount; column++) {
        columnNames.add(metaData.getColumnName(column));
    }

   
    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
    while (rs.next()) {
        Vector<Object> vector = new Vector<Object>();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            vector.add(rs.getObject(columnIndex));
        }
        data.add(vector);
    }

    return new DefaultTableModel(data, columnNames);

}
    
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
            java.util.logging.Logger.getLogger(hw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
