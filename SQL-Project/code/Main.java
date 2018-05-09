package assign_4;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.awt.*;
import javax.swing.*;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

import javafx.stage.Stage;

public class Main extends Application  
{
	private Stage primaryStage;
	private static BorderPane mainLayout;
	@Override
	public void start(Stage primaryStage) throws IOException
	{
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Database");
		createDB();
		showView();
		showView1();
	}
	
	private void showView() throws IOException
	{
		mainLayout =FXMLLoader.load(getClass().getResource("View.fxml"));
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void showView1() throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("View1.fxml"));
		BorderPane view2 = loader.load();
		mainLayout.setCenter(view2);
	}
	
	public static void showView2() throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("View2.fxml"));
		BorderPane view2 = loader.load();
		mainLayout.setCenter(view2);
	}
	
	public static void showView3() throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("View3.fxml"));
		BorderPane view2 = loader.load();
		mainLayout.setCenter(view2);
	}
	
	public void createDB()
	{
		Connection con = null;
	    try {
	      Class.forName("com.mysql.jdbc.Driver") ;
	      System.out.println("MySQL JDBC driver loaded.");
	      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?useSSL=false", "myuser", "1234");
	      System.out.println("Connection established");
	      Statement stat=con.createStatement();
	      stat.execute("drop database dbms");
	      stat.execute("create database dbms");
	      stat.execute("use dbms");
	      System.out.println("Creating database...please wait...");
	      stat.execute("create table Patient(P_id int primary key, P_name varchar(50), Age int, History varchar(50), Contact_no bigint)");
	      
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
	      stat.execute("insert into Patient values (136, 'Sahil Rawat', 29, 'Thyroid', 9999097091)");
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
	      stat.execute("insert into Visits values (139, 1001, '2018.04.19')");
	    
	      
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
	     stat.execute("insert into Consumes values (1011,139,3)");  

	      
	    
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
	      stat.execute("insert into Prescribes values (1008,1002,143,'YES')");
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
	      stat.execute("insert into Prescribes values (1001,1011,139,'YES')");
	      
	      
	      
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
	      stat.execute("insert into Manufacturer values (102,1011,1011)");
	      
	      
	      System.out.println("Database ready");
	      
	      con.close();
	      //JdbcSelectTest sql=new JdbcSelectTest();
	    } catch (Exception e) {
	        System.err.println("Exception: "+e.getMessage());
	      }
	}
	
	public static void Query1()
	{
		Connection con = null;
	    try {
	      Class.forName("com.mysql.jdbc.Driver") ;
	      //System.out.println("MySQL JDBC driver loaded.");
	      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?useSSL=false", "myuser", "1234");
	      //System.out.println("Connection established");
	      Statement stat=con.createStatement();
	      stat.execute("use dbms");
	      
	      String s = "select * from Patient where History = 'Depression'";
	      ResultSet rs = stat.executeQuery(s);
	      
	      JFrame frame = new JFrame("Query 1");
	      String[] cols = {"P_id","P_name","Age","History","Contact_no"};
	      
	      Object[][] data = new Object[6][5];
	      int in = 0;
	      while(rs.next())
	      {
	    	data[in][0] = rs.getInt("P_id");
	      	data[in][1] = rs.getString("P_name");
	      	data[in][2] = rs.getInt("Age");
	      	data[in][3] = rs.getString("History");
	      	data[in][4] = rs.getLong("Contact_no");
	      	in++;
	      	//data.add(t);
	      }
	      
	      JTable table = new JTable(data, cols);
	        JScrollPane scrollPane = new JScrollPane(table);
	        table.setFillsViewportHeight(true);
	 
	        JLabel lblHeading = new JLabel("Query1");
	        lblHeading.setFont(new Font("Arial",Font.TRUETYPE_FONT,24));
	 
	        frame.getContentPane().setLayout(new BorderLayout());
	 
	        frame.getContentPane().add(lblHeading,BorderLayout.PAGE_START);
	        frame.getContentPane().add(scrollPane,BorderLayout.CENTER);
	 
	        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(550, 200);
	        frame.setVisible(true);
	        
	      con.close();
	    }
	    catch (Exception e) {
	        System.err.println("Exception: "+e.getMessage());
	      }
	}
	
	public static void Query2()
	{
		Connection con = null;
	    try {
	      Class.forName("com.mysql.jdbc.Driver") ;
	      //System.out.println("MySQL JDBC driver loaded.");
	      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?useSSL=false", "myuser", "1234");
	      //System.out.println("Connection established");
	      Statement stat=con.createStatement();
	      stat.execute("use dbms");
	      
	      String s = "select History, Contact_no from Patient where P_id = 108";
	      ResultSet rs = stat.executeQuery(s);
	      
	      JFrame frame = new JFrame("Query 2");
	      String[] cols = {"History","Contact_no"};
	      
	      Object[][] data = new Object[1][2];
	      int in = 0;
	      while(rs.next())
	      {
	    	data[in][0] = rs.getString("History");
	      	data[in][1] = rs.getLong("Contact_no");
	      	in++;
	      	//data.add(t);
	      }
	      
	      JTable table = new JTable(data, cols);
	        JScrollPane scrollPane = new JScrollPane(table);
	        table.setFillsViewportHeight(true);
	 
	        JLabel lblHeading = new JLabel("Query2");
	        lblHeading.setFont(new Font("Arial",Font.TRUETYPE_FONT,24));
	 
	        frame.getContentPane().setLayout(new BorderLayout());
	 
	        frame.getContentPane().add(lblHeading,BorderLayout.PAGE_START);
	        frame.getContentPane().add(scrollPane,BorderLayout.CENTER);
	 
	        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(550, 200);
	        frame.setVisible(true);
	        
	      con.close();
	    }
	    catch (Exception e) {
	        System.err.println("Exception: "+e.getMessage());
	      }
	}
	
	public static void Query3()
	{
		Connection con = null;
	    try {
	      Class.forName("com.mysql.jdbc.Driver") ;
	      //System.out.println("MySQL JDBC driver loaded.");
	      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?useSSL=false", "myuser", "1234");
	      //System.out.println("Connection established");
	      Statement stat=con.createStatement();
	      stat.execute("use dbms");
	      
	      String s = "select * from Visits where date = '2018.04.15'";
	      ResultSet rs = stat.executeQuery(s);
	      
	      JFrame frame = new JFrame("Query 3");
	      String[] cols = {"P_id","D_id","Data"};
	      
	      Object[][] data = new Object[4][3];
	      int in = 0;
	      while(rs.next())
	      {
	    	data[in][0] = rs.getInt("P_id");
	    	data[in][1] = rs.getInt("D_id");
	      	data[in][2] = rs.getDate("Date");
	      	in++;
	      	//data.add(t);
	      }
	      
	      JTable table = new JTable(data, cols);
	        JScrollPane scrollPane = new JScrollPane(table);
	        table.setFillsViewportHeight(true);
	 
	        JLabel lblHeading = new JLabel("Query3");
	        lblHeading.setFont(new Font("Arial",Font.TRUETYPE_FONT,24));
	 
	        frame.getContentPane().setLayout(new BorderLayout());
	 
	        frame.getContentPane().add(lblHeading,BorderLayout.PAGE_START);
	        frame.getContentPane().add(scrollPane,BorderLayout.CENTER);
	 
	        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(550, 200);
	        frame.setVisible(true);
	        
	      con.close();
	    }
	    catch (Exception e) {
	        System.err.println("Exception: "+e.getMessage());
	      }
	}
	
	public static void Query4()
	{
		Connection con = null;
	    try {
	      Class.forName("com.mysql.jdbc.Driver") ;
	      //System.out.println("MySQL JDBC driver loaded.");
	      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?useSSL=false", "myuser", "1234");
	      //System.out.println("Connection established");
	      Statement stat=con.createStatement();
	      stat.execute("use dbms");
	      
	      String s = "select * from Medicine order by Price";
	      ResultSet rs = stat.executeQuery(s);
	      
	      JFrame frame = new JFrame("Query 4");
	      String[] cols = {"M_id","Pres_reqd","Price"};
	      
	      Object[][] data = new Object[20][3];
	      int in = 0;
	      while(rs.next())
	      {
	    	data[in][0] = rs.getInt("M_id");
	    	data[in][0] = rs.getString("Pres_reqd");
	      	data[in][1] = rs.getInt("Price");
	      	in++;
	      	//data.add(t);
	      }
	      
	      JTable table = new JTable(data, cols);
	        JScrollPane scrollPane = new JScrollPane(table);
	        table.setFillsViewportHeight(true);
	 
	        JLabel lblHeading = new JLabel("Query4");
	        lblHeading.setFont(new Font("Arial",Font.TRUETYPE_FONT,24));
	 
	        frame.getContentPane().setLayout(new BorderLayout());
	 
	        frame.getContentPane().add(lblHeading,BorderLayout.PAGE_START);
	        frame.getContentPane().add(scrollPane,BorderLayout.CENTER);
	 
	        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(550, 200);
	        frame.setVisible(true);
	        
	      con.close();
	    }
	    catch (Exception e) {
	        System.err.println("Exception: "+e.getMessage());
	      }
	}
	
	public static void Query5()
	{
		Connection con = null;
	    try {
	      Class.forName("com.mysql.jdbc.Driver") ;
	      //System.out.println("MySQL JDBC driver loaded.");
	      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?useSSL=false", "myuser", "1234");
	      //System.out.println("Connection established");
	      Statement stat=con.createStatement();
	      stat.execute("use dbms");
	      
	      String s = "select M_id from Medicine where Pres_reqd = 'NO'";
	      ResultSet rs = stat.executeQuery(s);
	      
	      JFrame frame = new JFrame("Query 5");
	      String[] cols = {"M_id"};
	      
	      Object[][] data = new Object[7][1];
	      int in = 0;
	      while(rs.next())
	      {
	    	data[in][0] = rs.getInt("M_id");
	      	in++;
	      	//data.add(t);
	      }
	      
	      JTable table = new JTable(data, cols);
	        JScrollPane scrollPane = new JScrollPane(table);
	        table.setFillsViewportHeight(true);
	 
	        JLabel lblHeading = new JLabel("Query5");
	        lblHeading.setFont(new Font("Arial",Font.TRUETYPE_FONT,24));
	 
	        frame.getContentPane().setLayout(new BorderLayout());
	 
	        frame.getContentPane().add(lblHeading,BorderLayout.PAGE_START);
	        frame.getContentPane().add(scrollPane,BorderLayout.CENTER);
	 
	        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(550, 200);
	        frame.setVisible(true);
	        
	      con.close();
	    }
	    catch (Exception e) {
	        System.err.println("Exception: "+e.getMessage());
	      }
	}
	
	public static void Query6()
	{
		Connection con = null;
	    try {
	      Class.forName("com.mysql.jdbc.Driver") ;
	      //System.out.println("MySQL JDBC driver loaded.");
	      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?useSSL=false", "myuser", "1234");
	      //System.out.println("Connection established");
	      Statement stat=con.createStatement();
	      stat.execute("use dbms");
	      
	      String s = "select P.P_name from Patient P, Consumes C, Manufacturer M where P.P_id = C.P_id and C.M_id = M.Med_id and C.M_id = 1007 and P.History = 'Pregnancy' and M.Man_id = 102";
	      ResultSet rs = stat.executeQuery(s);
	      
	      JFrame frame = new JFrame("Query 6");
	      String[] cols = {"P_name"};
	      
	      Object[][] data = new Object[1][1];
	      int in = 0;
	      while(rs.next())
	      {
	    	data[in][0] = rs.getString("P_name");
	      	in++;
	      	//data.add(t);
	      }
	      
	      JTable table = new JTable(data, cols);
	        JScrollPane scrollPane = new JScrollPane(table);
	        table.setFillsViewportHeight(true);
	 
	        JLabel lblHeading = new JLabel("Query6");
	        lblHeading.setFont(new Font("Arial",Font.TRUETYPE_FONT,24));
	 
	        frame.getContentPane().setLayout(new BorderLayout());
	 
	        frame.getContentPane().add(lblHeading,BorderLayout.PAGE_START);
	        frame.getContentPane().add(scrollPane,BorderLayout.CENTER);
	 
	        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(550, 200);
	        frame.setVisible(true);
	        
	      con.close();
	    }
	    catch (Exception e) {
	        System.err.println("Exception: "+e.getMessage());
	      }
	}
	
	public static void Query7()
	{
		Connection con = null;
	    try {
	      Class.forName("com.mysql.jdbc.Driver") ;
	      //System.out.println("MySQL JDBC driver loaded.");
	      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?useSSL=false", "myuser", "1234");
	      //System.out.println("Connection established");
	      Statement stat=con.createStatement();
	      stat.execute("use dbms");
	      
	      String s = "select M.Med_id from Prescribes P, Manufacturer M where P.M_id = M.Med_id and M.Man_id = 102 and P.D_id = 1001 and P.P_id = 139";
	      ResultSet rs = stat.executeQuery(s);
	      
	      JFrame frame = new JFrame("Query 7");
	      String[] cols = {"Med_id"};
	      
	      Object[][] data = new Object[1][1];
	      int in = 0;
	      while(rs.next())
	      {
	    	data[in][0] = rs.getInt("Med_id");
	      	in++;
	      	//data.add(t);
	      }
	      
	      JTable table = new JTable(data, cols);
	        JScrollPane scrollPane = new JScrollPane(table);
	        table.setFillsViewportHeight(true);
	 
	        JLabel lblHeading = new JLabel("Query7");
	        lblHeading.setFont(new Font("Arial",Font.TRUETYPE_FONT,24));
	 
	        frame.getContentPane().setLayout(new BorderLayout());
	 
	        frame.getContentPane().add(lblHeading,BorderLayout.PAGE_START);
	        frame.getContentPane().add(scrollPane,BorderLayout.CENTER);
	 
	        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(550, 200);
	        frame.setVisible(true);
	        
	      con.close();
	    }
	    catch (Exception e) {
	        System.err.println("Exception: "+e.getMessage());
	      }
	}
	
	public static void Query8()
	{
		Connection con = null;
	    try {
	      Class.forName("com.mysql.jdbc.Driver") ;
	      //System.out.println("MySQL JDBC driver loaded.");
	      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?useSSL=false", "myuser", "1234");
	      //System.out.println("Connection established");
	      Statement stat=con.createStatement();
	      stat.execute("use dbms");
	      
	      String s = "select P.P_name from Patient P, Medicine M, Consumes C, Prescribes Pr where P.P_id = C.P_id and C.M_id = 1002 and P.History = 'Blood Pressure' and M.M_id = Pr.M_id and Pr.D_id = 1008 and Pr.P_id = C.P_id";
	      ResultSet rs = stat.executeQuery(s);
	      
	      JFrame frame = new JFrame("Query 8");
	      String[] cols = {"P_name"};
	      
	      Object[][] data = new Object[1][1];
	      int in = 0;
	      while(rs.next())
	      {
	    	data[in][0] = rs.getString("P_name");
	      	in++;
	      	//data.add(t);
	      }
	      
	      JTable table = new JTable(data, cols);
	        JScrollPane scrollPane = new JScrollPane(table);
	        table.setFillsViewportHeight(true);
	 
	        JLabel lblHeading = new JLabel("Query8");
	        lblHeading.setFont(new Font("Arial",Font.TRUETYPE_FONT,24));
	 
	        frame.getContentPane().setLayout(new BorderLayout());
	 
	        frame.getContentPane().add(lblHeading,BorderLayout.PAGE_START);
	        frame.getContentPane().add(scrollPane,BorderLayout.CENTER);
	 
	        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(550, 200);
	        frame.setVisible(true);
	        
	      con.close();
	    }
	    catch (Exception e) {
	        System.err.println("Exception: "+e.getMessage());
	      }
	}
	
	public static void Query9()
	{
		Connection con = null;
	    try {
	      Class.forName("com.mysql.jdbc.Driver") ;
	      //System.out.println("MySQL JDBC driver loaded.");
	      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?useSSL=false", "myuser", "1234");
	      //System.out.println("Connection established");
	      Statement stat=con.createStatement();
	      stat.execute("use dbms");
	      
	      String s = "select P.P_name from Patient P, Visits V, Doctor D where V.P_id = P.P_id and V.D_id = D.D_id and V.Date = '2018.04.19' and P.History = 'Thyroid'";
	      ResultSet rs = stat.executeQuery(s);
	      
	      JFrame frame = new JFrame("Query 9");
	      String[] cols = {"P_name"};
	      
	      Object[][] data = new Object[2][1];
	      int in = 0;
	      while(rs.next())
	      {
	    	data[in][0] = rs.getString("P_name");
	      	in++;
	      	//data.add(t);
	      }
	      
	      JTable table = new JTable(data, cols);
	        JScrollPane scrollPane = new JScrollPane(table);
	        table.setFillsViewportHeight(true);
	 
	        JLabel lblHeading = new JLabel("Query9");
	        lblHeading.setFont(new Font("Arial",Font.TRUETYPE_FONT,24));
	 
	        frame.getContentPane().setLayout(new BorderLayout());
	 
	        frame.getContentPane().add(lblHeading,BorderLayout.PAGE_START);
	        frame.getContentPane().add(scrollPane,BorderLayout.CENTER);
	 
	        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(550, 200);
	        frame.setVisible(true);
	        
	      con.close();
	    }
	    catch (Exception e) {
	        System.err.println("Exception: "+e.getMessage());
	      }
	}
	
	public static void Query10()
	{
		Connection con = null;
	    try {
	      Class.forName("com.mysql.jdbc.Driver") ;
	      //System.out.println("MySQL JDBC driver loaded.");
	      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?useSSL=false", "myuser", "1234");
	      //System.out.println("Connection established");
	      Statement stat=con.createStatement();
	      stat.execute("use dbms");
	      
	      String s = "select P.P_name from Patient P, Consumes C, Manufacturer M where P.P_id = C.P_id and C.M_id = M.Med_id and M.Man_id = 101";
	      ResultSet rs = stat.executeQuery(s);
	      
	      JFrame frame = new JFrame("Query 10");
	      String[] cols = {"P_name"};
	      
	      Object[][] data = new Object[12][1];
	      int in = 0;
	      while(rs.next())
	      {
	    	data[in][0] = rs.getString("P_name");
	      	in++;
	      	//data.add(t);
	      }
	      
	      JTable table = new JTable(data, cols);
	        JScrollPane scrollPane = new JScrollPane(table);
	        table.setFillsViewportHeight(true);
	 
	        JLabel lblHeading = new JLabel("Query10");
	        lblHeading.setFont(new Font("Arial",Font.TRUETYPE_FONT,24));
	 
	        frame.getContentPane().setLayout(new BorderLayout());
	 
	        frame.getContentPane().add(lblHeading,BorderLayout.PAGE_START);
	        frame.getContentPane().add(scrollPane,BorderLayout.CENTER);
	 
	        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(550, 200);
	        frame.setVisible(true);
	        
	      con.close();
	    }
	    catch (Exception e) {
	        System.err.println("Exception: "+e.getMessage());
	      }
	}
	
	public static void Query11()
	{
		Connection con = null;
	    try {
	      Class.forName("com.mysql.jdbc.Driver") ;
	      //System.out.println("MySQL JDBC driver loaded.");
	      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?useSSL=false", "myuser", "1234");
	      //System.out.println("Connection established");
	      Statement stat=con.createStatement();
	      stat.execute("use dbms");
	      
	      String s = "select M.Med_id, M.Man_id from Prescribes P, Manufacturer M where P.M_id = M.Med_id and P.D_id = 1001 and P.P_id = 139";
	      ResultSet rs = stat.executeQuery(s);
	      
	      JFrame frame = new JFrame("Query 11");
	      String[] cols = {"Med_id","Man_id"};
	      
	      Object[][] data = new Object[4][2];
	      int in = 0;
	      while(rs.next())
	      {
	    	data[in][0] = rs.getInt("Med_id");
	    	data[in][1] = rs.getInt("Man_id");
	    	in++;
	      	//data.add(t);
	      }
	      
	      JTable table = new JTable(data, cols);
	        JScrollPane scrollPane = new JScrollPane(table);
	        table.setFillsViewportHeight(true);
	 
	        JLabel lblHeading = new JLabel("Query11");
	        lblHeading.setFont(new Font("Arial",Font.TRUETYPE_FONT,24));
	 
	        frame.getContentPane().setLayout(new BorderLayout());
	 
	        frame.getContentPane().add(lblHeading,BorderLayout.PAGE_START);
	        frame.getContentPane().add(scrollPane,BorderLayout.CENTER);
	 
	        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(550, 200);
	        frame.setVisible(true);
	        
	      con.close();
	    }
	    catch (Exception e) {
	        System.err.println("Exception: "+e.getMessage());
	      }
	}
	
	public static void Query12()
	{
		Connection con = null;
	    try {
	      Class.forName("com.mysql.jdbc.Driver") ;
	      //System.out.println("MySQL JDBC driver loaded.");
	      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?useSSL=false", "myuser", "1234");
	      //System.out.println("Connection established");
	      Statement stat=con.createStatement();
	      stat.execute("use dbms");
	      
	      String s = "delete from Visits where P_id = 119 and D_id = 1010";
	      boolean rs = stat.execute(s);
	        
	      con.close();
	    }
	    catch (Exception e) {
	        System.err.println("Exception: "+e.getMessage());
	      }
	}
	
	public static void Query13()
	{
		Connection con = null;
	    try {
	      Class.forName("com.mysql.jdbc.Driver") ;
	      //System.out.println("MySQL JDBC driver loaded.");
	      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?useSSL=false", "myuser", "1234");
	      //System.out.println("Connection established");
	      Statement stat=con.createStatement();
	      stat.execute("use dbms");
	      
	      String s = "insert into Visits values (108, 1003, '2018.01.14')";
	      boolean rs = stat.execute(s);
	        
	      con.close();
	    }
	    catch (Exception e) {
	        System.err.println("Exception: "+e.getMessage());
	      }
	}
	
	public static void Query14()
	{
		Connection con = null;
	    try {
	      Class.forName("com.mysql.jdbc.Driver") ;
	      //System.out.println("MySQL JDBC driver loaded.");
	      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?useSSL=false", "myuser", "1234");
	      //System.out.println("Connection established");
	      Statement stat=con.createStatement();
	      stat.execute("use dbms");
	      
	      String s = "update Visits SET date='2018.02.14' where P_id =108 and D_id = 1003";
	      boolean rs = stat.execute(s);
	        
	      con.close();
	    }
	    catch (Exception e) {
	        System.err.println("Exception: "+e.getMessage());
	      }
	}

	public static void main(String[] args) 
	{
		launch(args);
	}
}
