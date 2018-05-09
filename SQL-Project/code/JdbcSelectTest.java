package assign_4;

//Bollywood movie database

//Information taken from PlanetBollywood.com
//grant all priveleges on *.* to shiva@localhost identified by 'personal' with grant option;


import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JdbcSelectTest implements ActionListener {
	JTextField tf1,tf2,tf3,tf4,tf5,tf6;
	JLabel label1,label2,label3,label4,label5,label6;
	JButton button1,button2, button3;
	JPanel panel;
	JFrame frame1;
	Component frame;
	
  public static void main(String [] args) 
  {
    Connection con = null;
    try {
      Class.forName("com.mysql.jdbc.Driver") ;
      System.out.println("MySQL JDBC driver loaded.");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?useSSL=false", "myuser", "rahul");
      System.out.println("Connection established");
      Statement stat=con.createStatement();
      stat.execute("drop database dbms");
      stat.execute("create database dbms");
      stat.execute("use dbms");
      System.out.println("Creating database...please wait...");
      stat.execute("create table Patient(P_id int primary key, P_name varchar(50), Age int, History varchar(50), Contact_no bigint)");
      System.out.println("second");
      stat.execute("insert into Patient values (101, 'Aayush Chauhan', 35, 'Allergy', 9650986652)");
      stat.execute("insert into Patient values (102, 'Abhimanyu Lakra', 38, 'Cold', 9650986645)");
      stat.execute("insert into Patient values (103, 'Abhishek Gupta', 42, 'Depression', 9650986433)");
      stat.execute("insert into Patient values (104, 'Aditya Tanwar', 37, 'Arthiritis', 9015722431)");
      stat.execute("insert into Patient values (105, 'Aishwarya Kumar', 65, 'Depression', 9015722434)");
      stat.execute("insert into Patient values (106, 'Ajeet Kumar', 19, 'Asthma', 9015727531)");
      stat.execute("insert into Patient values (107, 'Akash Singh', 34, 'Blood Pressure', 9015722564)");
      stat.execute("insert into Patient values (108, 'Akshat Gupta', 22, 'Lung Condition', 9015723421)");
      stat.execute("insert into Patient values (109, 'Akshit Pal Singh', 46, 'Migraine', 9015734321)");
      stat.execute("insert into Patient values (110, 'Aman Mehra', 28, 'Thyroid', 9015712431)");
      stat.execute("insert into Patient values (111, 'Amogh Gulati', 27, 'Allergy', 9013452431)");
      stat.execute("insert into Patient values (112, 'Ananya Bhatia', 36, 'Depression', 9015096431)");
      stat.execute("insert into Patient values (113, 'Chirag Jain', 39, 'Lung condition', 9015098431)");
      stat.execute("insert into Patient values (114, 'Deepak Nigam', 12, 'Cold', 9011234431)");
      stat.execute("insert into Patient values (115, 'Dhruv Arora', 16, 'Eyesight', 9012342431)");
      stat.execute("insert into Patient values (116, 'Divya Baweja', 17, 'Digestion', 9015725768)");
      stat.execute("insert into Patient values (117, 'Fahad Nayyar', 41, 'HIV/AIDS', 9015720965)");
      stat.execute("insert into Patient values (118, 'Gaurav Nuti', 52, 'Insomnia', 9015109831)");
      stat.execute("insert into Patient values (119, 'Harsh Anand', 14, 'Piles', 9015709091)");
      stat.execute("insert into Patient values (120, 'Isha Goel', 64, 'Migraine', 9015709099)");
      stat.execute("insert into Patient values (121, 'Jayant Tanwar', 34, 'Skin infection',9015707891)");
      stat.execute("insert into Patient values (122, 'Kamal Yadav', 47, 'Depression',9015908091)");
      stat.execute("insert into Patient values (123, 'Karan Tandon', 16, 'Eyesight',9015908891)");
      stat.execute("insert into Patient values (124, 'Kartikeya Verma', 13, 'Eyesight', 9015900091)");
      stat.execute("insert into Patient values (125, 'Madhav Sainanee', 36, 'Insomnia', 9015908343)");
      stat.execute("insert into Patient values (126, 'Manasvi Sharma', 37, 'Pregnancy', 9015908909)");
      stat.execute("insert into Patient values (127, 'Mayank Chopra', 70, 'Diabetes', 9015908885)");
      stat.execute("insert into Patient values (128, 'Nakul Gupta', 63, 'Hearing problem', 9015908090)");
      stat.execute("insert into Patient values (129, 'Naman', 38, 'Depression', 9015907091)");
      stat.execute("insert into Patient values (130, 'Nirav Diwan', 52, 'Heart', 9999907091)");
      stat.execute("insert into Patient values (131, 'Nivedit Mishra', 67, 'Lung condition', 9999905491)");
      stat.execute("insert into Patient values (132, 'Priya Kaushal', 36, 'Depression', 9999990091)");
      stat.execute("insert into Patient values (133, 'Raghav Rathi', 23, 'Cold', 9999900991)");
      stat.execute("insert into Patient values (134, 'Rishabh Sharma', 34, 'Digestion', 9988807091)");
      stat.execute("insert into Patient values (135, 'Rohan Rajpal', 19, 'Skin infection', 9999908091)");
      stat.execute("insert into Patient values (136, 'Sahil Rawat', 29, 'Cold', 9999097091)");
      stat.execute("insert into Patient values (137, 'Sakshi Saini', 18, 'Eyesight', 9998768091)");
      stat.execute("insert into Patient values (138, 'Sarthak Negi', 63, 'Diabetes', 9912907091)");
      stat.execute("insert into Patient values (139, 'Sejal Bhalla', 54, 'Heart', 9997657091)");
      stat.execute("insert into Patient values (140, 'Sejal Jain', 46, 'Migraine', 9999808091)");
      stat.execute("insert into Patient values (141, 'Shaurya Bagga' , 39, 'Heart', 9988907091)");
      stat.execute("insert into Patient values (142, 'Shaurya Kumar' , 78, 'Diabetes', 9999900991)");
      stat.execute("insert into Patient values (143, 'Shloak Aggarwal', 63, 'Blood Pressure', 9911907091)");
      
      
      stat.execute("create table Doctor(D_id int primary key, D_name varchar(50), Specialization varchar(50), Department varchar(50), Age int, Contact_no bigint)");
      stat.execute("insert into Doctor values( 1001, 'Rajender Prasad','Cardiologist','Cardiology',40,9650986542)");
      stat.execute("insert into Doctor values( 1002, 'Gregory House','Psychiatrist','Psychiatry',39,9650986543)");
      stat.execute("insert into Doctor values( 1003, 'Venu Gopal Iyer','Neurologist','Neurology',50,9650986545)");
      stat.execute("insert into Doctor values( 1004, 'Gaurav Gupta','Physiatrist','Physiology',45,9650945542)");
      stat.execute("insert into Doctor values( 1005, 'Aayush Batra','Dermatologist','Dermatology',55,9644986542)");
      stat.execute("insert into Doctor values( 1006, 'R.K. Singh','Orthopedic Surgeon','Orthopedic Surgery',43,9666986542)");
      stat.execute("insert into Doctor values( 1007, 'Rohit Batra','Psychiatrist','Psychiatry',37,9650980942)");
      stat.execute("insert into Doctor values( 1008, 'Rajiv Gupta','Plastic Surgeon','Plastic Surgery',53,9999427756)");
      stat.execute("insert into Doctor values( 1009, 'Pushpendra Singh','Oncologist','Oncology',46,9999547756)");
      stat.execute("insert into Doctor values( 1010, 'Steve Rogers','Cardiologist','Cardiology',36,9999427734)");
      stat.execute("insert into Doctor values( 1011, 'Daniel','Ophthalmologist','Ophthamology',54,9999433756)");
      stat.execute("insert into Doctor values( 1012, 'Jitendra Shah','Obstetrician','Obstetrics',34,9999127756)");
      stat.execute("insert into Doctor values( 1013, 'Amit Aggarwal','Physiatrist','Psychiatry',42,9015722431)");
      stat.execute("insert into Doctor values( 1014, 'Utkarsh Kohli','Allergist','Allergy and Immunology',38,9999437756)");
      stat.execute("insert into Doctor values( 1015, 'K.K. Modi','Cardiovascular Surgeon','Cardiology',50,9999654452)");
      
      
      
      stat.execute("create table Visits (P_id int, D_id int, Date date, PRIMARY KEY(D_id, P_id))");
      stat.execute("insert into Visits values (110, 1015, '2018.04.19')");
      stat.execute("insert into Visits values (103, 1012, '2018.04.12')");
      stat.execute("insert into Visits values (102, 1001, '2018.04.13')");
      stat.execute("insert into Visits values (105, 1003, '2018.04.13')");
      stat.execute("insert into Visits values (101, 1002, '2018.04.14')");
      stat.execute("insert into Visits values (109, 1003, '2018.04.11')");
      stat.execute("insert into Visits values (119, 1004, '2018.04.11')");
      stat.execute("insert into Visits values (118, 1005, '2018.04.11')");
      stat.execute("insert into Visits values (104, 1006, '2018.04.12')");
      stat.execute("insert into Visits values (107, 1017, '2018.04.12')");
      stat.execute("insert into Visits values (106, 1007, '2018.04.14')");
      stat.execute("insert into Visits values (108, 1008, '2018.04.15')");
      stat.execute("insert into Visits values (111, 1009, '2018.04.16')");
      stat.execute("insert into Visits values (112, 1010, '2018.04.15')");
      stat.execute("insert into Visits values (115, 1011, '2018.04.16')");
      stat.execute("insert into Visits values (116, 1012, '2018.04.15')");
      stat.execute("insert into Visits values (114, 1013, '2018.04.16')");
      stat.execute("insert into Visits values (117, 1014, '2018.03.19')");
      stat.execute("insert into Visits values (118, 1015, '2018.03.13')");
      stat.execute("insert into Visits values (119, 1010, '2018.03.12')");
      stat.execute("insert into Visits values (120, 1015, '2018.02.14')");
      stat.execute("insert into Visits values (122, 1001, '2018.02.13')");
      stat.execute("insert into Visits values (123, 1003, '2018.01.15')");
      stat.execute("insert into Visits values (121, 1006, '2018.04.16')");
      stat.execute("insert into Visits values (126, 1002, '2018.04.14')");
      stat.execute("insert into Visits values (124, 1015, '2018.04.13')");
      stat.execute("insert into Visits values (127, 1013, '2018.04.12')");
      stat.execute("insert into Visits values (128, 1013, '2018.03.19')");
      stat.execute("insert into Visits values (125, 1007, '2018.04.12')");
      stat.execute("insert into Visits values (129, 1009, '2018.04.09')");
      stat.execute("insert into Visits values (131, 1012, '2018.04.09')");
      stat.execute("insert into Visits values (130, 1013, '2018.04.01')");
      stat.execute("insert into Visits values (133, 1011, '2018.04.03')");
      stat.execute("insert into Visits values (132, 1009, '2018.04.12')");
      stat.execute("insert into Visits values (135, 1012, '2018.04.12')");
      stat.execute("insert into Visits values (134, 1008, '2018.04.13')");
      stat.execute("insert into Visits values (137, 1009, '2018.04.14')");
      stat.execute("insert into Visits values (136, 1014, '2018.04.19')");
      stat.execute("insert into Visits values (138, 1013, '2018.04.14')");
      stat.execute("insert into Visits values (140, 1005, '2018.04.14')");
      stat.execute("insert into Visits values (139, 1008, '2018.01.13')");
      stat.execute("insert into Visits values (141, 1004, '2018.01.19')");
      stat.execute("insert into Visits values (142, 1001, '2018.01.02')");
      stat.execute("insert into Visits values (143, 1008, '2018.01.12')");
      stat.execute("insert into Visits values (143, 1002, '2018.01.12')");
      stat.execute("insert into Visits values (142, 1002, '2018.02.14')");
      stat.execute("insert into Visits values (122, 1009, '2018.04.14')");
      stat.execute("insert into Visits values (132, 1015, '2018.04.13')");
      stat.execute("insert into Visits values (112, 1014, '2018.03.31')");
      stat.execute("insert into Visits values (136, 1011, '2018.02.23')");
      stat.execute("insert into Visits values (142, 1009, '2018.04.12')");
      stat.execute("insert into Visits values (129, 1007, '2018.04.12')");
      stat.execute("insert into Visits values (111, 1007, '2018.03.15')");
      stat.execute("insert into Visits values (112, 1007, '2018.04.14')");
      stat.execute("insert into Visits values (113, 1007, '2018.03.12')");
      stat.execute("insert into Visits values (134, 1006, '2018.04.13')");
      stat.execute("insert into Visits values (115, 1006, '2018.04.13')");
      stat.execute("insert into Visits values (135, 1006, '2018.04.13')");
      stat.execute("insert into Visits values (118, 1006, '2018.04.14')");
      stat.execute("insert into Visits values (123, 1006, '2018.04.15')");
      stat.execute("insert into Visits values (132, 1014, '2018.04.16')");
      stat.execute("insert into Visits values (112, 1011, '2018.04.16')");
      stat.execute("insert into Visits values (102, 1014, '2018.04.17')");
      stat.execute("insert into Visits values (136, 1015, '2018.04.18')");
      stat.execute("insert into Visits values (141, 1003, '2018.04.17')");
      stat.execute("insert into Visits values (129, 1003, '2018.04.16')");
      stat.execute("insert into Visits values (142, 1003, '2018.04.19')");
      
      stat.execute("create table Medicine(M_id int primary key, Pres_reqd varchar(5), Price int)");
      stat.execute("insert into Medicine values (1000,'NO',91)");
      stat.execute("insert into Medicine values (1001,'YES',120)");
      stat.execute("insert into Medicine values (1002,'NO',216)");
      stat.execute("insert into Medicine values (1003,'YES',240)");
      stat.execute("insert into Medicine values (1004,'NO',273)");
      stat.execute("insert into Medicine values (1005,'YES',103)");
      stat.execute("insert into Medicine values (1006,'YES',185)");
      stat.execute("insert into Medicine values (1007,'YES',87)");
      stat.execute("insert into Medicine values (1008,'YES',50)");
      stat.execute("insert into Medicine values (1009,'YES',254)");
      stat.execute("insert into Medicine values (1010,'YES',248)");
      stat.execute("insert into Medicine values (1011,'NO',149)");
      stat.execute("insert into Medicine values (1012,'NO',125)");
      stat.execute("insert into Medicine values (1013,'YES',86)");
      stat.execute("insert into Medicine values (1014,'NO',103)");
      stat.execute("insert into Medicine values (1015,'YES',138)");
      stat.execute("insert into Medicine values (1016,'YES',77)");
      stat.execute("insert into Medicine values (1017,'NO',173)");
      stat.execute("insert into Medicine values (1018,'YES',89)");
      stat.execute("insert into Medicine values (1019,'YES',68)");
     
      

  
     stat.execute("create table Consumes(M_id int, P_id int , times_a_day int, primary key (M_id,P_id), Foreign Key(P_id)references Patient(P_id),Foreign Key(M_id)references Medicine(M_id) )");
     stat.execute("insert into Consumes values (1002,143,2)");
     stat.execute("insert into Consumes values (1002,111,2)");
     stat.execute("insert into Consumes values (1017,134,3)");
     stat.execute("insert into Consumes values (1004,102,2)");
     stat.execute("insert into Consumes values (1019,123,1)");
     stat.execute("insert into Consumes values (1009,143,2)");
     stat.execute("insert into Consumes values (1001,120,3)");
     stat.execute("insert into Consumes values (1007,126,2)");
     stat.execute("insert into Consumes values (1014,139,2)");
     stat.execute("insert into Consumes values (1007,111,2)");
     stat.execute("insert into Consumes values (1017,130,1)");
     stat.execute("insert into Consumes values (1018,116,1)");
     stat.execute("insert into Consumes values (1015,111,3)");
     stat.execute("insert into Consumes values (1017,126,3)");
     stat.execute("insert into Consumes values (1009,108,3)");
     stat.execute("insert into Consumes values (1003,120,2)");
     stat.execute("insert into Consumes values (1019,109,1)");
     stat.execute("insert into Consumes values (1008,125,1)");
     stat.execute("insert into Consumes values (1001,102,2)");
     stat.execute("insert into Consumes values (1016,126,2)");
     stat.execute("insert into Consumes values (1015,129,3)");
     stat.execute("insert into Consumes values (1002,106,3)");
     stat.execute("insert into Consumes values (1012,119,2)");
     stat.execute("insert into Consumes values (1007,107,2)");
     stat.execute("insert into Consumes values (1019,126,2)");
     stat.execute("insert into Consumes values (1003,126,1)");
     stat.execute("insert into Consumes values (1009,123,3)");
     stat.execute("insert into Consumes values (1013,121,3)");
     stat.execute("insert into Consumes values (1007,135,4)");
     stat.execute("insert into Consumes values (1012,116,4)");
     stat.execute("insert into Consumes values (1001,138,4)");
     stat.execute("insert into Consumes values (1003,137,4)");
     stat.execute("insert into Consumes values (1009,135,3)");
     stat.execute("insert into Consumes values (1019,136,2)");
     stat.execute("insert into Consumes values (1010,138,2)");
     stat.execute("insert into Consumes values (1016,110,2)");
     stat.execute("insert into Consumes values (1019,128,2)");
     stat.execute("insert into Consumes values (1016,124,3)");
     stat.execute("insert into Consumes values (1001,143,3)");
     stat.execute("insert into Consumes values (1016,112,3)");      

      
    
      stat.execute("create table Prescribes(D_id int, M_id int, P_id int,worked varchar(5),PRIMARY KEY(D_id, M_id),Foreign Key(D_id)references Doctor(D_id),Foreign Key(M_id)references Medicine(M_id), Foreign Key(P_id)references Patient(P_id))");
      stat.execute("insert into Prescribes values (1006,1003,111,'YES')");
      stat.execute("insert into Prescribes values (1001,1019,139,'YES')");
      stat.execute("insert into Prescribes values (1011,1004,136,'YES')");
      stat.execute("insert into Prescribes values (1011,1011,126,'YES')");
      stat.execute("insert into Prescribes values (1009,1003,120,'YES')");
      stat.execute("insert into Prescribes values (1015,1013,119,'YES')");
      stat.execute("insert into Prescribes values (1014,1005,113,'YES')");
      stat.execute("insert into Prescribes values (1002,1019,132,'YES')");
      stat.execute("insert into Prescribes values (1007,1003,107,'YES')");
      stat.execute("insert into Prescribes values (1010,1016,139,'YES')");
      stat.execute("insert into Prescribes values (1013,1007,102,'YES')");
      stat.execute("insert into Prescribes values (1006,1007,141,'YES')");
      stat.execute("insert into Prescribes values (1010,1013,126,'YES')");
      stat.execute("insert into Prescribes values (1006,1013,121,'YES')");
      stat.execute("insert into Prescribes values (1003,1018,141,'YES')");
      stat.execute("insert into Prescribes values (1009,1017,142,'YES')");
      stat.execute("insert into Prescribes values (1001,1009,138,'YES')");
      stat.execute("insert into Prescribes values (1014,1010,133,'YES')");
      stat.execute("insert into Prescribes values (1001,1012,107,'YES')");
      stat.execute("insert into Prescribes values (1003,1001,119,'YES')");
      stat.execute("insert into Prescribes values (1008,1008,143,'YES')");
      stat.execute("insert into Prescribes values (1004,1012,114,'YES')");
      stat.execute("insert into Prescribes values (1007,1017,136,'YES')");
      stat.execute("insert into Prescribes values (1011,1017,117,'YES')");
      stat.execute("insert into Prescribes values (1009,1014,111,'YES')");
      stat.execute("insert into Prescribes values (1015,1005,101,'YES')");
      stat.execute("insert into Prescribes values (1015,1001,123,'YES')");
      stat.execute("insert into Prescribes values (1008,1001,125,'YES')");
      stat.execute("insert into Prescribes values (1007,1016,106,'YES')");
      stat.execute("insert into Prescribes values (1003,1019,129,'YES')");
      stat.execute("insert into Prescribes values (1002,1002,133,'YES')");
      stat.execute("insert into Prescribes values (1006,1002,140,'YES')");
      stat.execute("insert into Prescribes values (1015,1017,137,'YES')");
      stat.execute("insert into Prescribes values (1004,1015,138,'YES')");
      stat.execute("insert into Prescribes values (1010,1019,132,'YES')");
      stat.execute("insert into Prescribes values (1003,1014,102,'YES')");
      stat.execute("insert into Prescribes values (1013,1004,111,'YES')");
      stat.execute("insert into Prescribes values (1003,1008,140,'YES')");
      
      
      stat.execute("create table Manufacturer(Man_id int, Med_id int, Quantity int,PRIMARY KEY(Man_id, Med_id),Foreign Key(Med_id)references Medicine(M_id))");
      stat.execute("insert into Manufacturer values (101,1001,1006)");
      stat.execute("insert into Manufacturer values (101,1002,1010)");
      stat.execute("insert into Manufacturer values (105,1019,1007)");
      stat.execute("insert into Manufacturer values (105,1007,1007)");
      stat.execute("insert into Manufacturer values (104,1009,1006)");
      stat.execute("insert into Manufacturer values (102,1008,1003)");
      stat.execute("insert into Manufacturer values (102,1013,1005)");
      stat.execute("insert into Manufacturer values (105,1015,1004)");
      stat.execute("insert into Manufacturer values (101,1008,1005)");
      stat.execute("insert into Manufacturer values (105,1017,1015)");
      stat.execute("insert into Manufacturer values (102,1007,1007)");
      stat.execute("insert into Manufacturer values (105,1011,1005)");
      stat.execute("insert into Manufacturer values (103,1013,1002)");
      stat.execute("insert into Manufacturer values (104,1011,1014)");
      stat.execute("insert into Manufacturer values (101,1007,1006)");
      stat.execute("insert into Manufacturer values (104,1015,1009)");
      stat.execute("insert into Manufacturer values (103,1009,1002)");
      stat.execute("insert into Manufacturer values (105,1001,1002)");
      stat.execute("insert into Manufacturer values (105,1012,1004)");
      stat.execute("insert into Manufacturer values (102,1010,1011)");
      
      
      System.out.println("Database ready");
      
      con.close();
      //JdbcSelectTest sql=new JdbcSelectTest();
    } catch (Exception e) {
        System.err.println("Exception: "+e.getMessage());
      }
  }
  
      public JdbcSelectTest(){
      String Query = JOptionPane.showInputDialog("Which type of query do you wish to run?");
      String Table = JOptionPane.showInputDialog("Enter the table");
      if(Query.equalsIgnoreCase("Insert")){
    	  if(Table.equalsIgnoreCase("Director")){
    		  frame1 = new JFrame("Table=Director, Query=Insert");
    		  tf1 = new JTextField();
    		  tf2 = new JTextField();
    		  tf3 = new JTextField();
    		  tf4 = new JTextField();
    		  button1 = new JButton("Insert Director");
    		  button2 = new JButton("Continue");
    		  button3= new JButton("Exit");
    		  label1 = new JLabel("Enter directorID");
    		  label1.setFont(new Font("Serif", Font.PLAIN, 24));
    		  label2 = new JLabel("Enter DOB");
    		  label2.setFont(new Font("Serif", Font.PLAIN, 24));
    		  label3 = new JLabel("Enter first name");
    		  label3.setFont(new Font("Serif", Font.PLAIN, 24));
    		  label4 = new JLabel("Enter last name");
    		  label4.setFont(new Font("Serif", Font.PLAIN, 24));
    		  panel = new JPanel();
    		  button1.addActionListener(this);
    		  button2.addActionListener(this);
    		  button3.addActionListener(this);
    		  label1.setBounds(50,50,500,50);
    		  label2.setBounds(50,150,500,60);
    		  label3.setBounds(50,250,500,60);
    		  label4.setBounds(50,350,500,60);
    		  tf1.setBounds(50,100,150,30);
    		  tf2.setBounds(50,200,150,30);
    		  tf3.setBounds(50,300,150,30);
    		  tf4.setBounds(50,400,150,30);
    		  button1.setBounds(20,500,200,30);
    		  button2.setBounds(20,550,90,30);
    		  button3.setBounds(130,550,90,30);
    		  panel.setLayout(null);
    		  frame1.setSize(300,700);
    	    
    	    
    		  panel.add(label1);
    		  panel.add(label2);
    		  panel.add(label3);
    		  panel.add(label4);
    		  panel.add(button1);
    		  panel.add(button2);
    		  panel.add(button3);
    		  panel.add(tf1);
    		  panel.add(tf2);
    		  panel.add(tf3);
    		  panel.add(tf4);
    		  frame1.add(panel);
    		  frame1.setVisible(true);
    		  frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		}
    	  else if(Table.equalsIgnoreCase("Genre"))
    	  {
    		  frame1 = new JFrame("Table=Genre, Query=Insert");
    		  tf1 = new JTextField();
    		  tf2 = new JTextField();
    		  button1 = new JButton("Insert Genre");
    		  button2 = new JButton("Continue");
    		  button3= new JButton("Exit");
    		  label1 = new JLabel("Enter genreID");
    		  label1.setFont(new Font("Serif", Font.PLAIN, 24));
    		  label2 = new JLabel("Enter type");
    		  label2.setFont(new Font("Serif", Font.PLAIN, 24));
    		  panel = new JPanel();
    		  button1.addActionListener(this);
    		  button2.addActionListener(this);
    		  button3.addActionListener(this);
    		  label1.setBounds(50,50,500,60);
    		  label2.setBounds(50,150,500,60);
    		  tf1.setBounds(50,100,150,30);
    		  tf2.setBounds(50,200,150,30);
    		  button1.setBounds(20,300,200,30);
    		  button2.setBounds(20,350,90,30);
    		  button3.setBounds(130,350,90,30);
    		  panel.setLayout(null);
    		  frame1.setSize(300,450);

    		  panel.add(label1);
    		  panel.add(label2);
    		  panel.add(button1);
    		  panel.add(button2);
    		  panel.add(button3);
    		  panel.add(tf1);
    		  panel.add(tf2);
    		  frame1.add(panel);
    		  frame1.setVisible(true);
    		  frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  }
    	  else if(Table.equalsIgnoreCase("MovieGenre"))
    	  {
    		  frame1 = new JFrame("Table=MovieGenre, Query=Insert");
    		  tf1 = new JTextField();
    		  tf2 = new JTextField();
    		  button1 = new JButton("Insert MovieGenre");
    		  button2 = new JButton("Continue");
    		  button3= new JButton("Exit");
    		  label1 = new JLabel("Enter genreID");
    		  label1.setFont(new Font("Serif", Font.PLAIN, 24));
    		  label2 = new JLabel("Enter movieID");
    		  label2.setFont(new Font("Serif", Font.PLAIN, 24));
    		  panel = new JPanel();
    		  button1.addActionListener(this);
    		  button2.addActionListener(this);
    		  button3.addActionListener(this);
    		  label1.setBounds(50,50,500,60);
    		  label2.setBounds(50,150,500,60);
    		  tf1.setBounds(50,100,150,30);
    		  tf2.setBounds(50,200,150,30);
    		  button1.setBounds(20,300,200,30);
    		  button2.setBounds(20,350,90,30);
    		  button3.setBounds(130,350,90,30);
    		  panel.setLayout(null);
    		  frame1.setSize(300,450);
    	    
    		  panel.add(label1);
    		  panel.add(label2);
    		  panel.add(button1);
    		  panel.add(button2);
    		  panel.add(button3);
    		  panel.add(tf1);
    		  panel.add(tf2);
    		  frame1.add(panel);
    		  frame1.setVisible(true);
    		  frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  }
    	  else if(Table.equalsIgnoreCase("Actor"))
    	  {
    		  frame1 = new JFrame("Table=Actor, Query=Insert");
    		  tf1 = new JTextField();
    		  tf2 = new JTextField();
    		  tf3 = new JTextField();
    		  tf4 = new JTextField();
    		  tf5 = new JTextField();
    		  button1 = new JButton("Insert Actor");
    		  button2 = new JButton("Continue");
    		  button3= new JButton("Exit");
    		  label1 = new JLabel("Enter actorID");
    		  label1.setFont(new Font("Serif", Font.PLAIN, 24));
    		  label2 = new JLabel("Enter DOB");
    		  label2.setFont(new Font("Serif", Font.PLAIN, 24));
    		  label3 = new JLabel("Enter first name");
    		  label3.setFont(new Font("Serif", Font.PLAIN, 24));
    		  label4 = new JLabel("Enter last name");
    		  label4.setFont(new Font("Serif", Font.PLAIN, 24));
    		  label5 = new JLabel("Enter Gender");
    		  label5.setFont(new Font("Serif", Font.PLAIN, 24));
    		  panel = new JPanel();
    		  button1.addActionListener(this);
    		  button2.addActionListener(this);
    		  button3.addActionListener(this);
    		  label1.setBounds(50,50,500,60);
    		  label2.setBounds(50,150,500,60);
    		  label3.setBounds(50,250,500,60);
    		  label4.setBounds(50,350,500,60);
    		  label5.setBounds(50,450,500,60);
    		  tf1.setBounds(50,100,150,30);
    		  tf2.setBounds(50,200,150,30);
    		  tf3.setBounds(50,300,150,30);
    		  tf4.setBounds(50,400,150,30);
    		  tf5.setBounds(50,500,150,30);
    		  button1.setBounds(20,600,200,30);
    		  button2.setBounds(20,650,90,30);
    		  button3.setBounds(130,650,90,30);
    		  panel.setLayout(null);
    		  frame1.setSize(300,750);
    	    
    		  panel.add(label1);
    		  panel.add(label2);
    		  panel.add(label3);
    		  panel.add(label4);
    		  panel.add(label5);
    		  panel.add(button1);
    		  panel.add(button2);
    		  panel.add(button3);
    		  panel.add(tf1);
    		  panel.add(tf2);
    		  panel.add(tf3);
    		  panel.add(tf4);
    		  panel.add(tf5);
    		  frame1.add(panel);
    		  frame1.setVisible(true);
    		  frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		
    	  }
    	  else if(Table.equalsIgnoreCase("MovieActor"))
    	  {
    		  frame1 = new JFrame("Table=MovieActor, Query=Insert");
    		  tf1 = new JTextField();
    		  tf2 = new JTextField();
    		  button1 = new JButton("Insert MovieActor");
    		  button2 = new JButton("Continue");
    		  button3= new JButton("Exit");
    		  label1 = new JLabel("Enter movieID");
    		  label1.setFont(new Font("Serif", Font.PLAIN, 24));
    		  label2 = new JLabel("Enter actorID");
    		  label2.setFont(new Font("Serif", Font.PLAIN, 24));
    		  panel = new JPanel();
    		  button1.addActionListener(this);
    		  button2.addActionListener(this);
    		  button3.addActionListener(this);
    		  label1.setBounds(50,50,500,60);
    		  label2.setBounds(50,150,500,60);
    		  tf1.setBounds(50,100,150,30);
    		  tf2.setBounds(50,200,150,30);
    		  button1.setBounds(20,300,200,30);
    		  button2.setBounds(20,350,90,30);
    		  button3.setBounds(130,350,90,30);
    		  panel.setLayout(null);
    		  frame1.setSize(300,450);
    	    
    		  panel.add(label1);
    		  panel.add(label2);
    		  panel.add(button1);
    		  panel.add(button2);
    		  panel.add(button3);
    		  panel.add(tf1);
    		  panel.add(tf2);
    		  frame1.add(panel);
    		  frame1.setVisible(true);
    		  frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  }
    	  else if(Table.equalsIgnoreCase("Movies"))
    	  {
    		  frame1 = new JFrame("Table=Movies, Query=Insert");
    		  tf1 = new JTextField();
    		  tf2 = new JTextField();
    		  tf3 = new JTextField();
    		  tf4 = new JTextField();
    		  tf5 = new JTextField();
    		  tf6 = new JTextField();
    		  button1 = new JButton("Insert Movie");
    		  button2 = new JButton("Continue");
    		  button3= new JButton("Exit");
    		  label1 = new JLabel("Enter movieID");
    		  label1.setFont(new Font("Serif", Font.PLAIN, 24));
    		  label2 = new JLabel("Enter Title");
    		  label2.setFont(new Font("Serif", Font.PLAIN, 24));
    		  label3 = new JLabel("Enter directorID");
    		  label3.setFont(new Font("Serif", Font.PLAIN, 24));
    		  label4 = new JLabel("Enter runtime");
    		  label4.setFont(new Font("Serif", Font.PLAIN, 24));
    		  label5 = new JLabel("Enter Year");
    		  label5.setFont(new Font("Serif", Font.PLAIN, 24));
    		  label6 = new JLabel("Enter Average Rating");
    		  label6.setFont(new Font("Serif", Font.PLAIN, 24));
    		  panel = new JPanel();
    		  button1.addActionListener(this);
    		  button2.addActionListener(this);
    		  button3.addActionListener(this);
    		  label1.setBounds(50,25,500,60);
    		  label2.setBounds(50,125,500,60);
    		  label3.setBounds(50,225,500,60);
    		  label4.setBounds(50,325,500,60);
    		  label5.setBounds(50,425,500,60);
    		  label6.setBounds(50,525,500,60);
    		  tf1.setBounds(50,75,150,30);
    		  tf2.setBounds(50,175,150,30);
    		  tf3.setBounds(50,275,150,30);
    		  tf4.setBounds(50,375,150,30);
    		  tf5.setBounds(50,475,150,30);
    		  tf6.setBounds(50,575,150,30);
    		  button1.setBounds(20,620,200,30);
    		  button2.setBounds(20,660,90,30);
    		  button3.setBounds(130,660,90,30);
    		  panel.setLayout(null);
    		  frame1.setSize(300,800);
    	    
    		  panel.add(label1);
    		  panel.add(label2);
    		  panel.add(label3);
    		  panel.add(label4);
    		  panel.add(label5);
    		  panel.add(label6);
    		  panel.add(button1);
    		  panel.add(button2);
    		  panel.add(button3);
    		  panel.add(tf1);
    		  panel.add(tf2);
    		  panel.add(tf3);
    		  panel.add(tf4);
    		  panel.add(tf5);
    		  panel.add(tf6);
    		  frame1.add(panel);
    		  frame1.setVisible(true);
    		  frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		  
    	  }
    	  else
    	  {
    		  
    		JOptionPane.showMessageDialog(frame, "Table does not exist");
    	  }
    
      }
      
      
      else if(Query.equalsIgnoreCase("Update")){
    	if(Table.equalsIgnoreCase("Director")){
    		  frame1 = new JFrame("Table= "+Table+", Query=Update");
    		  tf1 = new JTextField();
    		  tf2 = new JTextField();
    		  button1 = new JButton("Update Director");
    		  button2 = new JButton("Continue");
    		  button3= new JButton("Exit");
    		  label1 = new JLabel("Enter value you want to change");
    		  label1.setFont(new Font("Serif", Font.PLAIN, 24));
    		  label2 = new JLabel("Enter constraint");
    		  label2.setFont(new Font("Serif", Font.PLAIN, 24));
    		  panel = new JPanel();
    		  button1.addActionListener(this);
    		  button2.addActionListener(this);
    		  button3.addActionListener(this);
    		  label1.setBounds(10,50,500,60);
    		  label2.setBounds(50,150,500,60);
    		  tf1.setBounds(50,100,150,30);
    		  tf2.setBounds(50,200,150,30);
    		  button1.setBounds(20,300,200,30);
    		  button2.setBounds(20,350,90,30);
    		  button3.setBounds(130,350,90,30);
    		  panel.setLayout(null);
    		  frame1.setSize(350,450);
    	    
    		  panel.add(label1);
    		  panel.add(label2);
    		  panel.add(button1);
    		  panel.add(button2);
    		  panel.add(button3);
    		  panel.add(tf1);
    		  panel.add(tf2);
    		  frame1.add(panel);
    		  frame1.setVisible(true);
    		  frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  }
    	else if(Table.equalsIgnoreCase("Movies")){
  		  frame1 = new JFrame("Table= "+Table+", Query=Update");
  		  tf1 = new JTextField();
  		  tf2 = new JTextField();
  		  button1 = new JButton("Update Movies");
  		  button2 = new JButton("Continue");
  		  button3= new JButton("Exit");
  		  label1 = new JLabel("Enter value you want to change");
  		  label1.setFont(new Font("Serif", Font.PLAIN, 24));
  		  label2 = new JLabel("Enter constraint");
  		  label2.setFont(new Font("Serif", Font.PLAIN, 24));
  		  panel = new JPanel();
  		  button1.addActionListener(this);
  		  button2.addActionListener(this);
  		  button3.addActionListener(this);
  		  label1.setBounds(10,50,500,60);
		  label2.setBounds(50,150,500,60);
		  tf1.setBounds(50,100,150,30);
		  tf2.setBounds(50,200,150,30);
		  button1.setBounds(20,300,200,30);
		  button2.setBounds(20,350,90,30);
		  button3.setBounds(130,350,90,30);
		  panel.setLayout(null);
		  frame1.setSize(350,450);
	    
  		  panel.add(label1);
  		  panel.add(label2);
  		  panel.add(button1);
  		  panel.add(button2);
  		  panel.add(button3);
  		  panel.add(tf1);
  		  panel.add(tf2);
  		  frame1.add(panel);
  		  frame1.setVisible(true);
  		  frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	  }
    	else if(Table.equalsIgnoreCase("Genre")){
    		  frame1 = new JFrame("Table= "+Table+", Query=Update");
    		  tf1 = new JTextField();
    		  tf2 = new JTextField();
    		  button1 = new JButton("Update Genre");
    		  button2 = new JButton("Continue");
    		  button3= new JButton("Exit");
    		  label1 = new JLabel("Enter value you want to change");
    		  label1.setFont(new Font("Serif", Font.PLAIN, 24));
    		  label2 = new JLabel("Enter constraint");
    		  label2.setFont(new Font("Serif", Font.PLAIN, 24));
    		  panel = new JPanel();
    		  button1.addActionListener(this);
    		  button2.addActionListener(this);
    		  button3.addActionListener(this);
    		  label1.setBounds(10,50,500,60);
    		  label2.setBounds(50,150,500,60);
    		  tf1.setBounds(50,100,150,30);
    		  tf2.setBounds(50,200,150,30);
    		  button1.setBounds(20,300,200,30);
    		  button2.setBounds(20,350,90,30);
    		  button3.setBounds(130,350,90,30);
    		  panel.setLayout(null);
    		  frame1.setSize(350,450);
    	    
    		  panel.add(label1);
    		  panel.add(label2);
    		  panel.add(button1);
    		  panel.add(button2);
    		  panel.add(button3);
    		  panel.add(tf1);
    		  panel.add(tf2);
    		  frame1.add(panel);
    		  frame1.setVisible(true);
    		  frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  }
    	else if(Table.equalsIgnoreCase("MovieActor")){
    		  frame1 = new JFrame("Table= "+Table+", Query=Update");
    		  tf1 = new JTextField();
    		  tf2 = new JTextField();
    		  button1 = new JButton("Update MovieActor");
    		  button2 = new JButton("Continue");
    		  button3= new JButton("Exit");
    		  label1 = new JLabel("Enter value you want to change");
    		  label1.setFont(new Font("Serif", Font.PLAIN, 24));
    		  label2 = new JLabel("Enter constraint");
    		  label2.setFont(new Font("Serif", Font.PLAIN, 24));
    		  panel = new JPanel();
    		  button1.addActionListener(this);
    		  button2.addActionListener(this);
    		  button3.addActionListener(this);
    		  label1.setBounds(10,50,500,60);
    		  label2.setBounds(50,150,500,60);
    		  tf1.setBounds(50,100,150,30);
    		  tf2.setBounds(50,200,150,30);
    		  button1.setBounds(20,300,200,30);
    		  button2.setBounds(20,350,90,30);
    		  button3.setBounds(130,350,90,30);
    		  panel.setLayout(null);
    		  frame1.setSize(350,450);
    	    
    		  panel.add(label1);
    		  panel.add(label2);
    		  panel.add(button1);
    		  panel.add(button2);
    		  panel.add(button3);
    		  panel.add(tf1);
    		  panel.add(tf2);
    		  frame1.add(panel);
    		  frame1.setVisible(true);
    		  frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  }
    	
    	else if(Table.equalsIgnoreCase("MovieGenre")){
    		  frame1 = new JFrame("Table= "+Table+", Query=Update");
    		  tf1 = new JTextField();
    		  tf2 = new JTextField();
    		  button1 = new JButton("Update MovieGenre");
    		  button2 = new JButton("Continue");
    		  button3= new JButton("Exit");
    		  label1 = new JLabel("Enter value you want to change");
    		  label1.setFont(new Font("Serif", Font.PLAIN, 24));
    		  label2 = new JLabel("Enter constraint");
    		  label2.setFont(new Font("Serif", Font.PLAIN, 24));
    		  panel = new JPanel();
    		  button1.addActionListener(this);
    		  button2.addActionListener(this);
    		  button3.addActionListener(this);
    		  label1.setBounds(10,50,500,60);
    		  label2.setBounds(50,150,500,60);
    		  tf1.setBounds(50,100,150,30);
    		  tf2.setBounds(50,200,150,30);
    		  button1.setBounds(20,300,200,30);
    		  button2.setBounds(20,350,90,30);
    		  button3.setBounds(130,350,90,30);
    		  panel.setLayout(null);
    		  frame1.setSize(350,450);
    	    
    		  panel.add(label1);
    		  panel.add(label2);
    		  panel.add(button1);
    		  panel.add(button2);
    		  panel.add(button3);
    		  panel.add(tf1);
    		  panel.add(tf2);
    		  frame1.add(panel);
    		  frame1.setVisible(true);
    		  frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  }
    	else
  	  {
  		  
  		JOptionPane.showMessageDialog(frame, "Table does not exist");
  	  }
      }
      
      else if(Query.equalsIgnoreCase("Delete")){
    	  if(Table.equalsIgnoreCase("Director")){
    		  frame1 = new JFrame("Table= "+Table+", Query=Delete");
    		  tf1 = new JTextField();
    		  button1 = new JButton("Delete Director");
    		  button2 = new JButton("Continue");
    		  button3= new JButton("Exit");
    		  label1 = new JLabel("Enter the constraint");
    		  label1.setFont(new Font("Serif", Font.PLAIN, 24));
    		  panel = new JPanel();
    		  button1.addActionListener(this);
    		  button2.addActionListener(this);
    		  button3.addActionListener(this);
    		  label1.setBounds(20,50,500,60);
    		  tf1.setBounds(50,100,150,30);
    		  button1.setBounds(20,200,200,30);
    		  button2.setBounds(20,250,90,30);
    		  button3.setBounds(130,250,90,30);
    		  panel.setLayout(null);
    		  frame1.setSize(300,350);
    	    
    		  panel.add(label1);
    		  panel.add(button1);
    		  panel.add(button2);
    		  panel.add(button3);
    		  panel.add(tf1);
    		  frame1.add(panel);
    		  frame1.setVisible(true);
    		  frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  }
    	  else if(Table.equalsIgnoreCase("Movies")){
    		  frame1 = new JFrame("Table= "+Table+", Query=Delete");
    		  tf1 = new JTextField();
    		  button1 = new JButton("Delete Movies");
    		  button2 = new JButton("Continue");
    		  button3= new JButton("Exit");
    		  label1 = new JLabel("Enter the constraint");
    		  label1.setFont(new Font("Serif", Font.PLAIN, 24));
    		  panel = new JPanel();
    		  button1.addActionListener(this);
    		  button2.addActionListener(this);
    		  button3.addActionListener(this);
    		  label1.setBounds(20,50,500,60);
    		  tf1.setBounds(50,100,150,30);
    		  button1.setBounds(20,200,200,30);
    		  button2.setBounds(20,250,90,30);
    		  button3.setBounds(130,250,90,30);
    		  panel.setLayout(null);
    		  frame1.setSize(300,350);
    	    
    		  panel.add(label1);
    		  panel.add(button1);
    		  panel.add(button2);
    		  panel.add(button3);
    		  panel.add(tf1);
    		  frame1.add(panel);
    		  frame1.setVisible(true);
    		  frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  }
    	  else if(Table.equalsIgnoreCase("Genre")){
    		  frame1 = new JFrame("Table= "+Table+", Query=Delete");
    		  tf1 = new JTextField();
    		  button1 = new JButton("Delete Genre");
    		  button2 = new JButton("Continue");
    		  button3= new JButton("Exit");
    		  label1 = new JLabel("Enter the constraint");
    		  label1.setFont(new Font("Serif", Font.PLAIN, 24));
    		  panel = new JPanel();
    		  button1.addActionListener(this);
    		  button2.addActionListener(this);
    		  button3.addActionListener(this);
    		  label1.setBounds(20,50,500,60);
    		  tf1.setBounds(50,100,150,30);
    		  button1.setBounds(20,200,200,30);
    		  button2.setBounds(20,250,90,30);
    		  button3.setBounds(130,250,90,30);
    		  panel.setLayout(null);
    		  frame1.setSize(300,350);
    	    
    		  panel.add(label1);
    		  panel.add(button1);
    		  panel.add(button2);
    		  panel.add(button3);
    		  panel.add(tf1);
    		  frame1.add(panel);
    		  frame1.setVisible(true);
    		  frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  }
    	  else if(Table.equalsIgnoreCase("MovieActor")){
    		  frame1 = new JFrame("Table= "+Table+", Query=Delete");
    		  tf1 = new JTextField();
    		  button1 = new JButton("Delete MovieActor");
    		  button2 = new JButton("Continue");
    		  button3= new JButton("Exit");
    		  label1 = new JLabel("Enter the constraint");
    		  label1.setFont(new Font("Serif", Font.PLAIN, 24));
    		  panel = new JPanel();
    		  button1.addActionListener(this);
    		  button2.addActionListener(this);
    		  button3.addActionListener(this);
    		  label1.setBounds(20,50,500,60);
    		  tf1.setBounds(50,100,150,30);
    		  button1.setBounds(20,200,200,30);
    		  button2.setBounds(20,250,90,30);
    		  button3.setBounds(130,250,90,30);
    		  panel.setLayout(null);
    		  frame1.setSize(300,350);
    	    
    		  panel.add(label1);
    		  panel.add(button1);
    		  panel.add(button2);
    		  panel.add(button3);
    		  panel.add(tf1);
    		  frame1.add(panel);
    		  frame1.setVisible(true);
    		  frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  }
    	  else if(Table.equalsIgnoreCase("MovieGenre")){
    		  frame1 = new JFrame("Table= "+Table+", Query=Delete");
    		  tf1 = new JTextField();
    		  button1 = new JButton("Delete MovieGenre");
    		  button2 = new JButton("Continue");
    		  button3= new JButton("Exit");
    		  label1 = new JLabel("Enter the constraint");
    		  label1.setFont(new Font("Serif", Font.PLAIN, 24));
    		  panel = new JPanel();
    		  button1.addActionListener(this);
    		  button2.addActionListener(this);
    		  button3.addActionListener(this);
    		  label1.setBounds(20,50,500,60);
    		  tf1.setBounds(50,100,150,30);
    		  button1.setBounds(20,200,200,30);
    		  button2.setBounds(20,250,90,30);
    		  button3.setBounds(130,250,90,30);
    		  panel.setLayout(null);
    		  frame1.setSize(300,350);
    	      
    		  panel.add(label1);
    		  panel.add(button1);
    		  panel.add(button2);
    		  panel.add(button3);
    		  panel.add(tf1);
    		  frame1.add(panel);
    		  frame1.setVisible(true);
    		  frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  }
    	  else
    	  {
    		 //JOptionPane.showMessageDialog(frame,"Table does not exist", Table, JOptionPane.ERROR_MESSAGE);  
    		JOptionPane.showMessageDialog(frame, "Table does not exist");
    	  }
      }
     
      }
      

	
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if(command=="Exit")
		{
			System.exit(0);
		}
		if(command=="Continue"){
			frame1.dispose();
			JdbcSelectTest sql=new JdbcSelectTest();
		}
		
		Connection con1 = null;
		try {
		      Class.forName("com.mysql.jdbc.Driver") ;
		      //System.out.println("MySQL JDBC driver loaded.");
		 
		      con1 = DriverManager.getConnection("jdbc:mysql:///mydatabase?user=shiva&password=personal");
		      
		      Statement stat1=con1.createStatement();
		      if(command=="Insert Director"){
		      String directorID=tf1.getText();
				String DOB=tf2.getText();
				String firstname=tf3.getText();
				String lastname=tf4.getText();
				
		      stat1.execute("insert into Director values("+directorID+","+DOB+","+firstname+","+lastname+")");
		      JOptionPane.showMessageDialog(frame, "Operation Done");
		      
		      }
		      else if(command=="Insert Genre")
		      {
		    	  String genreID=tf1.getText();
		    	  String type=tf2.getText();
		    	  
		    	  stat1.execute("insert into Genre values("+genreID+","+type+")");
		    	  JOptionPane.showMessageDialog(frame, "Operation Done");
			      
		    	 
		      }
		      
		      else if(command=="Insert MovieGenre")
		      {
		    	  String genreID=tf1.getText();
		    	  String movieID=tf2.getText();
		    	  
		    	  stat1.execute("insert into MovieGenre values("+genreID+","+movieID+")");
		    	  JOptionPane.showMessageDialog(frame, "Operation Done");
		      }
		      else if(command=="Insert Actor")
		      {
		    	  String actorID=tf1.getText();
		    	  String DOB=tf2.getText();
		    	  String firstname=tf3.getText();
		    	  String lastname=tf4.getText();
		    	  String gender=tf5.getText();
		    	  
		    	  stat1.execute("insert into Actor values("+actorID+","+DOB+","+firstname+","+lastname+","+gender+ ")");
		    	  JOptionPane.showMessageDialog(frame, "Operation Done");
		      }
		      else if(command=="Insert MovieActor")
		      {
		    	  String movieID=tf1.getText();
		    	  String actorID=tf2.getText();
		    	  
		    	  stat1.execute("insert into MovieActor values("+movieID+","+actorID+")");
		    	  JOptionPane.showMessageDialog(frame, "Operation Done");
		      }
		      else if(command=="Insert Movie")
		      {
		    	  int movieID=Integer.parseInt(tf1.getText());
		    	  String title=tf2.getText();
		    	  int directorID=Integer.parseInt(tf3.getText());
		    	  int year=Integer.parseInt(tf5.getText());
		    	  String runtime=tf4.getText();
		    	  String avgrating=tf5.getText();
		    	  
		    	  stat1.execute("insert into Movies values("+movieID+","+title+","+directorID+","+runtime+","+year+","+avgrating+ ")");
		    	  JOptionPane.showMessageDialog(frame, "Operation Done");
		      }
		      else if(command=="Update Director"){
		    	  String set=tf1.getText();
		    	  String constraint=tf2.getText();
		    	  stat1.execute("update Director set "+set+"where "+constraint);
		    	  JOptionPane.showMessageDialog(frame, "Operation Done");
		      }
		      else if(command=="Update Movies"){
		    	  String set=tf1.getText();
		    	  String constraint=tf2.getText();
		    	  stat1.execute("update Movies set "+set+"where "+constraint);
		    	  JOptionPane.showMessageDialog(frame, "Operation Done");
		      }
		      else if(command=="Update Genre"){
		    	  String set=tf1.getText();
		    	  String constraint=tf2.getText();
		    	  stat1.execute("update Genre set "+set+"where "+constraint);
		    	  JOptionPane.showMessageDialog(frame, "Operation Done");
		      }
		      else if(command=="Update MovieActor"){
		    	  String set=tf1.getText();
		    	  String constraint=tf2.getText();
		    	  stat1.execute("update MovieActor set "+set+"where "+constraint);
		    	  JOptionPane.showMessageDialog(frame, "Operation Done");
		      }
		      else if(command=="Update MovieGenre"){
		    	  String set=tf1.getText();
		    	  String constraint=tf2.getText();
		    	  stat1.execute("update MovieGenre set "+set+"where "+constraint);
		    	  JOptionPane.showMessageDialog(frame, "Operation Done");
		      }
		      
		      else if(command=="Delete Director"){
		    	  String constraint=tf1.getText();
		    	  stat1.execute("delete from Director where "+constraint);
		    	  JOptionPane.showMessageDialog(frame, "Operation Done");
		      }
		      else if(command=="Delete Movies"){
		    	  String constraint=tf1.getText();
		    	  stat1.execute("delete from Movies where "+constraint);
		    	  JOptionPane.showMessageDialog(frame, "Operation Done");
		      }
		      else if(command=="Delete Genre"){
		    	  String constraint=tf1.getText();
		    	  stat1.execute("delete from Genre where "+constraint);
		    	  JOptionPane.showMessageDialog(frame, "Operation Done");
		      }
		      else if(command=="Delete MovieActor"){
		    	  String constraint=tf1.getText();
		    	  stat1.execute("delete from MovieActor where "+constraint);
		    	  JOptionPane.showMessageDialog(frame, "Operation Done");
		      }
		      else if(command=="Delete MovieGenre"){
		    	  String constraint=tf1.getText();
		    	  stat1.execute("delete from MovieGenre where "+constraint);
		    	  JOptionPane.showMessageDialog(frame, "Operation Done");
		      }
		      con1.close();
	    } catch (Exception e1) {
	    	JOptionPane.showMessageDialog(frame, "Invalid Operation");
	        System.err.println("Exception: "+e1.getMessage());
	      }
	  }
}