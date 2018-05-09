package assign_4;

//Bollywood movie database

//Information taken from PlanetBollywood.com
//grant all priveleges on *.* to shiva@localhost identified by 'personal' with grant option;


import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SQL implements ActionListener {
	JTextField tf1,tf2,tf3,tf4,tf5,tf6;
	JLabel label1,label2,label3,label4,label5,label6;
	JButton button1,button2, button3;
	JPanel panel;
	JFrame frame1;
	Component frame;
	
public static void main(String [] args) {
  Connection con = null;
  try {
    Class.forName("com.mysql.jdbc.Driver") ;
    System.out.println("MySQL JDBC driver loaded.");

    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?useSSL=false", "myuser", "rahul");
    System.out.println("Connection established");
    Statement stat=con.createStatement();
    stat.execute("drop database mydatabase");
    stat.execute("create database mydatabase");
    stat.execute("use mydatabase");
    System.out.println("Creating database...please wait...");
    
    stat.execute("create table Director(directorID int primary key, DOB date, firstname text, lastname text )");
    stat.execute("insert into Director values (1, '1971.04.28', 'Nikhil', 'Advani')");
    stat.execute("insert into Director values (2, '1963.02.24', 'Sanjay Leela', 'Bhansali')");
    stat.execute("insert into Director values (3, '1949.09.20', 'Mahesh', 'Bhatt')");
    stat.execute("insert into Director values (4, '1968.08.26', 'Madhur', 'Bhandarkar')");
    stat.execute("insert into Director values (5, '1960.08.06', 'Vishal', 'Bharadwaj')");
    stat.execute("insert into Director values (6, '1956.09.05', 'Vidhu Vinod', 'Chopra')");
    stat.execute("insert into Director values (7, '1932.09.25', 'Yash', 'Chopra')");
    stat.execute("insert into Director values (8, '1949.10.03', 'J.P.', 'Dutta')");
    stat.execute("insert into Director values (9, '1945.01.24', 'Subhash', 'Ghai')");
    stat.execute("insert into Director values (10, '1964.02.15', 'Ashutosh', 'Gowariker')");
    stat.execute("insert into Director values (11, '1962.11.20', 'Rajkumar', 'Hirani')");
    stat.execute("insert into Director values (12, '1931.02.03', 'Nasir', 'Hussain')");
    stat.execute("insert into Director values (13, '1952.02.27', 'Prakash', 'Jha')");
    stat.execute("insert into Director values (14, '1972.05.25', 'Karan', 'Johar')");
    stat.execute("insert into Director values (15, '1945.12.06', 'Shekhar', 'Kapur')");
    stat.execute("insert into Director values (16, '1965.01.09', 'Farah', 'Khan')");
    stat.execute("insert into Director values (17, '1972.09.10', 'Anurag', 'Kashyap')");
    stat.execute("insert into Director values (18, '1950.01.01', 'Deepa', 'Mehta')");
    stat.execute("insert into Director values (19, '1963.07.07', 'Rakeysh Omprakash', 'Mehra')");
    stat.execute("insert into Director values (20, '1957.10.15', 'Mira', 'Nair')");
    stat.execute("insert into Director values (21, '1956.06.02', 'Mani', 'Ratnam')");
    stat.execute("insert into Director values (22, '1949.09.06', 'Rakesh', 'Roshan')");
    stat.execute("insert into Director values (23, '1947.01.23', 'Ramesh', 'Sippy')");
    stat.execute("insert into Director values (24, '1962.04.07', 'Ramgopal', 'Varma')");
    stat.execute("insert into Director values (25, '1952.09.04', 'Rishi', 'Kapoor')");
    stat.execute("insert into Director values (26, '1968.11.08', 'Vipul','Shah')");
    stat.execute("insert into Director values (27, NULL, 'Rajshree','Ojha')");
    stat.execute("insert into Director values (28, NULL, 'Rajkumar','Santoshi')");
    stat.execute("insert into Director values (29, NULL, 'Mansoor','Khan')");
    stat.execute("insert into Director values (30, NULL, 'Rahul','Rawail')");
    stat.execute("insert into Director values (31, NULL, 'Siddharth Raj','Anand')");
    stat.execute("insert into Director values (32, '1967.01.27', 'Vikram','Bhatt')");
    stat.execute("insert into Director values (33, NULL, 'Rajiv','Rai')");
    stat.execute("insert into Director values (34, NULL, 'Santosh','Sivan')");
    stat.execute("insert into Director values (35, NULL, 'Kirti','Kumar')");
    stat.execute("insert into Director values (36, NULL, 'Abbas Mustan','')");
    stat.execute("insert into Director values (37, NULL, 'Raj','Kanwar')");
    stat.execute("insert into Director values (38, '1960.08.16', 'David','Dhawan')");
    stat.execute("insert into Director values (39, '1956.04.13', 'Satish','Kaushik')");
    stat.execute("insert into Director values (40, '1961.10.14', 'Parmeet','Sethi')");
    stat.execute("insert into Director values (41, NULL , 'Maneesh','Sharma')");
    stat.execute("insert into Director values (42, NULL , 'E.Niwas','')");
    stat.execute("insert into Director values (43, '1935.12.08', 'Dharmendra', '')");
    stat.execute("insert into Director values (44, NULL , 'Dharmesh', 'Darshan')");
    stat.execute("insert into Director values (45, '1957.01.30' , 'Priyadarshan', '')");
    stat.execute("insert into Director values (46, NULL , 'Vivek', 'Sharma')");
    stat.execute("insert into Director values (47, NULL , 'Guddu', 'Dhanoa')");
    stat.execute("insert into Director values (48, NULL , 'Aziz', 'Mirza')");
    stat.execute("insert into Director values (49, NULL, 'Anees','Bazmee')");      
    stat.execute("insert into Director values (50, '1974.03.14', 'Rohit','Shetty')");
    stat.execute("insert into Director values (51, NULL, 'Ayan','Mukerji')");
    stat.execute("insert into Director values (52, '1973.04.03', 'Prabhu','Deva')");
   stat.execute("insert into Director values (53, NULL, 'Anil','Sharma')");
    stat.execute("insert into Director values (54, '1965.02.22', 'Sooraj','Barjatya')");
    stat.execute("insert into Director values (55, NULL, 'Anand','Rai')");
    stat.execute("insert into Director values (56, NULL, 'Vijay Krishna','Acharya')");
    stat.execute("insert into Director values (57, NULL, 'Kunal','Kohli')");
    stat.execute("insert into Director values (58, '1982.03.04', 'Kunal','Deshmukh')");
    
    
    
    
    stat.execute("create table Movies (movieID int, Title text, directorID int, runtime double, Year int, avgRating double, primary key(movieID, directorID),Foreign Key(directorID)references Director(directorID))");
    stat.execute("insert into Movies values( 1, 'Aa Ab Laut Chalen',25, 2.45, 1999 , 7)");
    stat.execute("insert into Movies values( 2, 'Action Replay',26, 2.50, 2010 , 7)");
    stat.execute("insert into Movies values( 3, 'Aisha',27, 2.30, 2010 , 5.5)");
    stat.execute("insert into Movies values( 4, 'Ajab Prem ki Ghazab Kahani',28, 3.10, 2009 , 5.5)");
    stat.execute("insert into Movies values( 5, 'Akele Hum Akele Tum',29, 3.00, 1995 , 9)");
    stat.execute("insert into Movies values( 6, 'Anjaam',30, 2.20, 1994 , 5)");
    stat.execute("insert into Movies values( 7, 'Anjaana Anjaani',31, 2.30, 2010 , 5.5)");
    stat.execute("insert into Movies values( 8, 'Ankahee',32, 2.40, 2006 , 6.5)");
    stat.execute("insert into Movies values( 9, 'Asambhav',33, 2.55, 2004 , 4)");
    stat.execute("insert into Movies values( 10, 'Ashoka',34, 3.30, 2001 , 8)");
    stat.execute("insert into Movies values( 11, 'Aunty No.1',35, 2.50, 1998 , 5)");
    stat.execute("insert into Movies values( 12, 'Aur Pyar Ho Gaya',30, 2.35, 1997 , 4)");
    stat.execute("insert into Movies values( 13, 'Baadshah',36, 2.45, 1999 , 5)");
    stat.execute("insert into Movies values( 14, 'Bachna Ae Haseeno',41, 3.10, 2008 , 5.5)");
    stat.execute("insert into Movies values( 15, 'Badal',37, 2.50, 2000 , 6)");
    stat.execute("insert into Movies values( 16, 'Bade Miyan Chhote Miyan',38, 3.00, 1998 , 6)");
    stat.execute("insert into Movies values( 17, 'Badhaai Ho Badhaai',39, 3.20, 2002 , 7)");
    stat.execute("insert into Movies values( 18, 'Badmaash Company',40, 2.40, 2010 , 7)");
    stat.execute("insert into Movies values( 19, 'Band Baaja Baraat',41, 2.45, 2010 , 7)");
    stat.execute("insert into Movies values( 20, 'Bardaasht',42, 2.30, 2004 , 7)");
    stat.execute("insert into Movies values( 21, 'Barsaat',43, 2.35, 2005 , 7)");
    stat.execute("insert into Movies values( 22, 'Bewafa',44, 3.00, 2009 , 4)");
    stat.execute("insert into Movies values( 23, 'Bhool Bhulaiya',45, 2.50, 2007 , 7)");
    stat.execute("insert into Movies values( 24, 'Bhoot',24, 3.10, 2004 , 8)");
    stat.execute("insert into Movies values( 25, 'Bhoothnath',46, 2.55, 2008 , 6.5)");
    stat.execute("insert into Movies values( 26, 'Bichoo',47, 2.35, 2000 , 8)");
    stat.execute("insert into Movies values( 27, 'Billu',45, 3.00, 2009 , 3)");
    stat.execute("insert into Movies values( 28, 'Biwi No.1',38, 2.55, 1999 , 9)");
    stat.execute("insert into Movies values( 29, 'Black',2, 3.50, 2005 , 9.5)");
    stat.execute("insert into Movies values( 30, 'Bluffmaster',23, 2.55, 2006 , 7.5)");
    stat.execute("insert into Movies values( 31, 'Bunty aur Babli',7, 3.00, 2005 , 7)");
    stat.execute("insert into Movies values( 32, 'Chalte Chalte',48, 3.40, 2003 , 6.5)");
    stat.execute("insert into Movies values( 33, 'Chandni Chowk to China',1, 3.00, 2009 , 5)");
    stat.execute("insert into Movies values( 34, 'Company',24, 2.50, 2002 , 9.5)");
    stat.execute("insert into Movies values( 35, 'Dabangg',17, 2.50, 2010 , 7)");
    stat.execute("insert into Movies values( 36, 'De Dana Dan',45, 3.00, 2009 , 3.5)");
    stat.execute("insert into Movies values( 37, 'Deewana Mastana',38, 3.10, 1997 , 8)");
    stat.execute("insert into Movies values( 38, 'Deewane Huye Pagal',32, 2.30, 2005 , 6.5)");
    stat.execute("insert into Movies values( 39, 'Deewangee',49, 3.20, 2002 , 7)");
    stat.execute("insert into Movies values( 40, 'Delhi-6',19, 3.10, 2008 , 7)");
    stat.execute("insert into Movies values(41, 'Tum Mile',58, 2.50, 2009, 7.5 )");
    stat.execute("insert into Movies values(42, 'Thoda Pyar Thoda Magic',57, 3.00, 2008, 7 )");
    stat.execute("insert into Movies values(43, 'Tees Maar Khan',16, 3.10, 2011, 2 )");
    stat.execute("insert into Movies values(44, 'Tashan',56, 2.30, 2008, 5 )");
    stat.execute("insert into Movies values(45, 'Tanu weds Manu',55, 2.40, 2011, 7.5 )");
    stat.execute("insert into Movies values(46, 'Umrao Jaan',8, 3.30, 2006, 6 )");
    stat.execute("insert into Movies values(47, 'Vivah',54, 3.40, 2006, 7.5 )");
    stat.execute("insert into Movies values(48, 'Veer Zaara',7, 4.00, 2004, 9.5 )");
    stat.execute("insert into Movies values(49, 'Veer',53, 2.35, 2010, 7 )");
    stat.execute("insert into Movies values(50, 'Whats your Raashee',10, 2.45, 2009, 7 )");
    stat.execute("insert into Movies values(51, 'Welcome',49, 2.30, 2007, 6 )");
    stat.execute("insert into Movies values(52, 'Wanted',52, 3.00, 2009, 7 )");
    stat.execute("insert into Movies values(53, 'Wake up Sid',51, 2.10, 2009, 8 )");
    stat.execute("insert into Movies values(54, 'Yuvvraaj',9, 3.30, 2008, 6 )");
    stat.execute("insert into Movies values(55, 'Yuva',21, 2.50, 2004, 9 )");
    stat.execute("insert into Movies values(56, 'Yess Boss',48, 2.45, 1997, 9.5 )");
    stat.execute("insert into Movies values(57, 'Yeh Hai Jalwa',38, 3.00, 2002, 6 )");
    stat.execute("insert into Movies values(58, 'Zameen',50, 2.55, 2003, 7 )");
    
    
    
    
    stat.execute("create table Genre (genreID INTEGER PRIMARY KEY, type text)");
    stat.execute("insert into Genre values (1, 'Action')");
    stat.execute("insert into Genre values (2, 'Adventure')");
    stat.execute("insert into Genre values (3, 'Comedy')");
    stat.execute("insert into Genre values (4, 'Crime')");
    stat.execute("insert into Genre values (5, 'Drama')");
    stat.execute("insert into Genre values (6, 'Detective Story')");
    stat.execute("insert into Genre values (7, 'Epic/Myth')");
    stat.execute("insert into Genre values (8, 'Fanatasy')");
    stat.execute("insert into Genre values (9, 'Gangster')");
    stat.execute("insert into Genre values (10, 'Horror')");
    stat.execute("insert into Genre values (11, 'Love/Romance')");
    stat.execute("insert into Genre values (12, 'Science Fiction')");
    stat.execute("insert into Genre values (13, 'Thriller')");
    stat.execute("insert into Genre values (14, 'Family')");
    
    
    
    stat.execute("create table Actor(actorID int primary key, DOB date, firstname text, lastname text, gender char )");
    stat.execute("insert into Actor values (1, '1965.03.14', 'Aamir', 'Khan','M')");
    stat.execute("insert into Actor values (2, '1976.03.15', 'Abhay', 'Deol','M')");
    stat.execute("insert into Actor values (3, '1976.02.05', 'Abhishek', 'Bachchan','M')");
    stat.execute("insert into Actor values (4, '1978.06.25', 'Aftab', 'Shivdasani','M')");
    stat.execute("insert into Actor values (5, '1969.04.02', 'Ajay', 'Devgn','M')");
    stat.execute("insert into Actor values (6, '1975.03.28', 'Akshaye', 'Khanna','M')");
    stat.execute("insert into Actor values (7, '1967.09.09', 'Akshay', 'Kumar','M')");
    stat.execute("insert into Actor values (8, '1942.10.11', 'Amitabh', 'Bachchan','M')");
    stat.execute("insert into Actor values (9, '1959.12.24', 'Anil', 'Kapoor','M')");
    stat.execute("insert into Actor values (10, '1972.11.26', 'Arjun', 'Rampal','M')");
    stat.execute("insert into Actor values (11, '1968.04.19', 'Arshad', 'Warsi','M')");
    stat.execute("insert into Actor values (12, '1967.01.27', 'Bobby', 'Deol','M')");
    stat.execute("insert into Actor values (13, '1923.09.26', 'Dev', 'Anand','M')");
    stat.execute("insert into Actor values (14, '1935.12.08', 'Dharmendra', '','M')");
    stat.execute("insert into Actor values (15, '1979.03.24', 'Emraan', 'Hashmi','M')");
    stat.execute("insert into Actor values (16, '1974.03.08', 'Fardeen', 'Khan','M')");
    stat.execute("insert into Actor values (17, '1974.01.09', 'Farhan', 'Akhtar','M')");
    stat.execute("insert into Actor values (18, '1981.01.31', 'Amrita', 'Arora','M')");
    stat.execute("insert into Actor values (19, '1963.12.21', 'Govinda', '','M')");
    stat.execute("insert into Actor values (20, '1974.01.10', 'Hrithik', 'Roshan','M')");
    stat.execute("insert into Actor values (21, '1983.01.13', 'Imran', 'Khan','M')");
    stat.execute("insert into Actor values (22, '1962.11.30', 'Irrfan', 'Khan','M')");
    stat.execute("insert into Actor values (23, '1972.12.17', 'John', 'Abraham','M')");
    stat.execute("insert into Actor values (24, '1982.09.28', 'Ranbir', 'Kapoor','M')");
    stat.execute("insert into Actor values (25, '1978.12.17', 'Ritesh', 'Deshmukh','M')");
    stat.execute("insert into Actor values (26, '1985.07.06', 'Ranveer', 'Singh','M')");
    stat.execute("insert into Actor values (27, '1970.08.16', 'Saif Ali', 'Khan','M')");
    stat.execute("insert into Actor values (28, '1965.12.27', 'Salman', 'Khan','M')");
    stat.execute("insert into Actor values (29, '1959.07.29', 'Sanjay', 'Dutt','M')");
    stat.execute("insert into Actor values (30, '1981.02.25', 'Shahid', 'Kapoor','M')");
    stat.execute("insert into Actor values (31, '1965.11.02', 'Shahrukh', 'Khan','M')");
    stat.execute("insert into Actor values (32, '1980.07.05', 'Zayed', 'Khan','M')");
    stat.execute("insert into Actor values (33, '1980.11.13', 'Harman', 'Baweja','M')");
    stat.execute("insert into Actor values (34, '1970.06.01', 'R', 'Madhavan','M')");
    stat.execute("insert into Actor values (35, '1973.11.01', 'Aishwarya', 'Rai','F')");
    stat.execute("insert into Actor values (36, '1976.06.09', 'Amisha', 'Patel','F')");
    stat.execute("insert into Actor values (37, '1981.06.07', 'Amrita', 'Rao','F')");
    stat.execute("insert into Actor values (38, '1986.04.10', 'Ayesha', 'Takia','F')");
    stat.execute("insert into Actor values (39, '1979.01.07', 'Bipasha', 'Basu','F')");
    stat.execute("insert into Actor values (40, '1981.06.09', 'Celina', 'Jetley','F')");
    stat.execute("insert into Actor values (41, '1986.01.05', 'Deepika', 'Padukone','F')");
    stat.execute("insert into Actor values (42, '1981.12.09', 'Diya', 'Mirza','F')");
    stat.execute("insert into Actor values (43, '1981.11.02', 'Esha', 'Deol','F')");
    stat.execute("insert into Actor values (44, '1948.04.09', 'Jaya', 'Bachchan','F')");
    stat.execute("insert into Actor values (45, '1967.11.13', 'Juhi', 'Chawla','F')");
    stat.execute("insert into Actor values (46, '1980.09.21', 'Kareena', 'Kapoor','F')");
    stat.execute("insert into Actor values (47, '1974.06.25', 'Karishma', 'Kapoor','F')");
    stat.execute("insert into Actor values (48, '1984.07.16', 'Katrina', 'Kaif','F')");
    stat.execute("insert into Actor values (49, '1984.01.07', 'Koena', 'Mitra','F')");
    stat.execute("insert into Actor values (50, '1978.04.16', 'Lara', 'Dutta','F')");
    stat.execute("insert into Actor values (51, '1967.05.15', 'Madhuri', 'Dixit','F')");
    stat.execute("insert into Actor values (52, '1981.10.24', 'Mallika', 'Sherawat','F')");
    stat.execute("insert into Actor values (53, '1970.08.16', 'Manisha', 'Koirala','F')");
    stat.execute("insert into Actor values (54, '1985.01.18', 'Minisha', 'Lamba','F')");
    stat.execute("insert into Actor values (55, '1980.08.27', 'Neha', 'Dhupia','F')");
    stat.execute("insert into Actor values (56, '1975.01.31', 'Preity', 'Zinta','F')");
    stat.execute("insert into Actor values (57, '1982.07.18', 'Priyanka', 'Chopra','F')");
    stat.execute("insert into Actor values (58, '1978.03.21', 'Rani', 'Mukherjee','F')");
    stat.execute("insert into Actor values (59, '1975.06.08', 'Shilpa', 'Shetty','F')");
    stat.execute("insert into Actor values (60, '1975.11.19', 'Shusmita', 'Sen','F')");
    stat.execute("insert into Actor values (61, '1975.01.01', 'Sonali', 'Bendre','F')");
    stat.execute("insert into Actor values (62, '1985.06.09', 'Sonam', 'Kapoor','F')");
    stat.execute("insert into Actor values (63, '1974.12.29', 'Twinkle', 'Khanna','F')");
    stat.execute("insert into Actor values (64, '1972.02.04', 'Urmila', 'Matondkar','F')");
    stat.execute("insert into Actor values (65, '1978.01.01', 'Vidya', 'Balan','F')");
    stat.execute("insert into Actor values (66, '1979.04.23', 'Yana', 'Gupta','F')");
    stat.execute("insert into Actor values (67, '1974.10.26', 'Raveena', 'Tandon','F')");
    stat.execute("insert into Actor values (68, '1988.05.01', 'Anushka', 'Sharma','F')");
    stat.execute("insert into Actor values (69, '1987.06.02', 'Sonakshi', 'Sinha','F')");
    stat.execute("insert into Actor values (70, '1981.09.21', 'Rimi', 'Sen','F')");
    stat.execute("insert into Actor values (71, '1979.12.03', 'Konkana', 'Sharma','F')");
    stat.execute("insert into Actor values (72, '1984.05.25', 'Zarine', 'Khan','F')");
    stat.execute("insert into Actor values (73, '1987.03.20', 'Kangana', 'Ranaut','F')");
    stat.execute("insert into Actor values (74, '1978.10.04', 'Soha Ali', 'Khan','F')");
    
   
    
    

   stat.execute("create table MovieActor(movieID int, actorID int , primary key (movieID, actorID), Foreign Key(movieID)references Movies(movieID),Foreign Key(actorID)references Actor(actorID) )");
      stat.execute("insert into MovieActor values(1,6)");
    stat.execute("insert into MovieActor values(1,35)");
   stat.execute("insert into MovieActor values(2,7)");
   stat.execute("insert into MovieActor values(2,35)");
    stat.execute("insert into MovieActor values(3,2)");
    stat.execute("insert into MovieActor values(3,62)");
   stat.execute("insert into MovieActor values(4,24)");
   stat.execute("insert into MovieActor values(4,48)");
   stat.execute("insert into MovieActor values(5,1)");
   stat.execute("insert into MovieActor values(5,53)");
    stat.execute("insert into MovieActor values(6,31)");
    stat.execute("insert into MovieActor values(6,51)");
    stat.execute("insert into MovieActor values(7,24)");
    stat.execute("insert into MovieActor values(7,57)");
    stat.execute("insert into MovieActor values(8,4)");
    stat.execute("insert into MovieActor values(8,36)");
    stat.execute("insert into MovieActor values(9,10)");
    stat.execute("insert into MovieActor values(9,57)");
   stat.execute("insert into MovieActor values(10,31)");
   stat.execute("insert into MovieActor values(10,46)");
    stat.execute("insert into MovieActor values(11,19)");
    stat.execute("insert into MovieActor values(11,67)");
    stat.execute("insert into MovieActor values(12,12)");
    stat.execute("insert into MovieActor values(12,69)");
    stat.execute("insert into MovieActor values(13,31)");
    stat.execute("insert into MovieActor values(13,63)");
    stat.execute("insert into MovieActor values(14,24)");
    stat.execute("insert into MovieActor values(14,41)");
   stat.execute("insert into MovieActor values(15,12)");
   stat.execute("insert into MovieActor values(15,58)");
    stat.execute("insert into MovieActor values(16,19)");
    stat.execute("insert into MovieActor values(16,67)");
    stat.execute("insert into MovieActor values(17,9)");
    stat.execute("insert into MovieActor values(17,59)");
    stat.execute("insert into MovieActor values(18,30)");
    stat.execute("insert into MovieActor values(18,68)");
    stat.execute("insert into MovieActor values(19,26)");
    stat.execute("insert into MovieActor values(19,68)");
    stat.execute("insert into MovieActor values(20,12)");
    stat.execute("insert into MovieActor values(20,50)");
    stat.execute("insert into MovieActor values(21,12)");
    stat.execute("insert into MovieActor values(21,63)");
    stat.execute("insert into MovieActor values(22,9)");
    stat.execute("insert into MovieActor values(22,46)");
    stat.execute("insert into MovieActor values(23,7)");
    stat.execute("insert into MovieActor values(23,65)");
    stat.execute("insert into MovieActor values(24,5)");
    stat.execute("insert into MovieActor values(24,65)");
    stat.execute("insert into MovieActor values(25,8)");
    stat.execute("insert into MovieActor values(25,45)");
    stat.execute("insert into MovieActor values(26,12)");
    stat.execute("insert into MovieActor values(26,58)");
   stat.execute("insert into MovieActor values(27,31)");
   stat.execute("insert into MovieActor values(27,50)"); 
   stat.execute("insert into MovieActor values(28,13)");
   stat.execute("insert into MovieActor values(28,62)");
    stat.execute("insert into MovieActor values(29,8)");
    stat.execute("insert into MovieActor values(29,58)");
    stat.execute("insert into MovieActor values(30,3)");
    stat.execute("insert into MovieActor values(30,57)");
    stat.execute("insert into MovieActor values(31,3)");
    stat.execute("insert into MovieActor values(31,58)");
    stat.execute("insert into MovieActor values(32,31)");
    stat.execute("insert into MovieActor values(32,58)");
    stat.execute("insert into MovieActor values(33,7)");
    stat.execute("insert into MovieActor values(33,41)");
   stat.execute("insert into MovieActor values(34,5)");
   stat.execute("insert into MovieActor values(34,53)");
   stat.execute("insert into MovieActor values(35,28)");
   stat.execute("insert into MovieActor values(35,69)");
    stat.execute("insert into MovieActor values(36,7)");
    stat.execute("insert into MovieActor values(36,48)");
    stat.execute("insert into MovieActor values(37,9)");
    stat.execute("insert into MovieActor values(37,45)");
    stat.execute("insert into MovieActor values(38,7)");
    stat.execute("insert into MovieActor values(38,70)");
    stat.execute("insert into MovieActor values(39,6)");
    stat.execute("insert into MovieActor values(39,64)");
   stat.execute("insert into MovieActor values(40,3)");
   stat.execute("insert into MovieActor values(40,62)");
   stat.execute("insert into MovieActor values(41,15)");
   stat.execute("insert into MovieActor values(41,70)");
    stat.execute("insert into MovieActor values(42,27)");
    stat.execute("insert into MovieActor values(42,58)");
   stat.execute("insert into MovieActor values(43,7)");
   stat.execute("insert into MovieActor values(43,48)");
   stat.execute("insert into MovieActor values(44,7)");
   stat.execute("insert into MovieActor values(44,46)");
   stat.execute("insert into MovieActor values(45,34)");
   stat.execute("insert into MovieActor values(45,69)");
    stat.execute("insert into MovieActor values(46,3)");
    stat.execute("insert into MovieActor values(46,35)");
    stat.execute("insert into MovieActor values(47,30)");
    stat.execute("insert into MovieActor values(47,37)");
    stat.execute("insert into MovieActor values(48,31)");
    stat.execute("insert into MovieActor values(48,56)");
    stat.execute("insert into MovieActor values(49,28)");
    stat.execute("insert into MovieActor values(49,68)");
    stat.execute("insert into MovieActor values(50,33)");
    stat.execute("insert into MovieActor values(50,57)");
    stat.execute("insert into MovieActor values(51,7)");
    stat.execute("insert into MovieActor values(51,48)");
    stat.execute("insert into MovieActor values(52,28)");
    stat.execute("insert into MovieActor values(52,72)");
   stat.execute("insert into MovieActor values(53,24)");
   stat.execute("insert into MovieActor values(53,67)");
    stat.execute("insert into MovieActor values(54,28)");
    stat.execute("insert into MovieActor values(54,48)");
    stat.execute("insert into MovieActor values(55,3)");
    stat.execute("insert into MovieActor values(55,58)");
    stat.execute("insert into MovieActor values(56,31)");
    stat.execute("insert into MovieActor values(56,45)");
    stat.execute("insert into MovieActor values(57,28)");
    stat.execute("insert into MovieActor values(57,36)");
    stat.execute("insert into MovieActor values(58,5)");
    stat.execute("insert into MovieActor values(58,39)");
    
  
    
    
  
    stat.execute("create table MovieGenre(genreID int  , movieID int primary key, Foreign Key(movieID)references Movies(movieID),Foreign Key(genreID)references Genre(GenreID) )");
    stat.execute("insert into MovieGenre values(14,1)");
    stat.execute("insert into MovieGenre values(3,2)");
    stat.execute("insert into MovieGenre values(11,3)");
    stat.execute("insert into MovieGenre values(3,4)");
    stat.execute("insert into MovieGenre values(5,5)");
    stat.execute("insert into MovieGenre values(5,6)");
    stat.execute("insert into MovieGenre values(11,7)");
    stat.execute("insert into MovieGenre values(5,8)");
    stat.execute("insert into MovieGenre values(1,9)");
    stat.execute("insert into MovieGenre values(7,10)");
    stat.execute("insert into MovieGenre values(3,11)");
    stat.execute("insert into MovieGenre values(5,12)");
    stat.execute("insert into MovieGenre values(3,13)");
    stat.execute("insert into MovieGenre values(11,14)");
    stat.execute("insert into MovieGenre values(5,15)");
    stat.execute("insert into MovieGenre values(3,16)");
    stat.execute("insert into MovieGenre values(14,17)");
    stat.execute("insert into MovieGenre values(13,18)");
    stat.execute("insert into MovieGenre values(5,19)");
    stat.execute("insert into MovieGenre values(1,20)");
    stat.execute("insert into MovieGenre values(1,21)");
    stat.execute("insert into MovieGenre values(5,22)");
    stat.execute("insert into MovieGenre values(13,23)");
    stat.execute("insert into MovieGenre values(10,24)");
    stat.execute("insert into MovieGenre values(14,25)");
    stat.execute("insert into MovieGenre values(1,26)");
    stat.execute("insert into MovieGenre values(3,27)");
    stat.execute("insert into MovieGenre values(3,28)");
    stat.execute("insert into MovieGenre values(5,29)");
    stat.execute("insert into MovieGenre values(13,30)");
    stat.execute("insert into MovieGenre values(3,31)");
    stat.execute("insert into MovieGenre values(5,32)");
    stat.execute("insert into MovieGenre values(1,33)");
    stat.execute("insert into MovieGenre values(5,34)");
    stat.execute("insert into MovieGenre values(1,35)");
    stat.execute("insert into MovieGenre values(3,36)");
    stat.execute("insert into MovieGenre values(3,37)");
    stat.execute("insert into MovieGenre values(3,38)");
    stat.execute("insert into MovieGenre values(13,39)");
    stat.execute("insert into MovieGenre values(5,40)");
    stat.execute("insert into MovieGenre values(11,41)");
    stat.execute("insert into MovieGenre values(14,42)");
    stat.execute("insert into MovieGenre values(3,43)");
    stat.execute("insert into MovieGenre values(1,44)");
    stat.execute("insert into MovieGenre values(11,45)");
    stat.execute("insert into MovieGenre values(7,46)");
    stat.execute("insert into MovieGenre values(14,47)");
    stat.execute("insert into MovieGenre values(11,48)");
    stat.execute("insert into MovieGenre values(7,49)");
    stat.execute("insert into MovieGenre values(11,50)");
    stat.execute("insert into MovieGenre values(3,51)");
    stat.execute("insert into MovieGenre values(1,52)");
    stat.execute("insert into MovieGenre values(3,53)");
    stat.execute("insert into MovieGenre values(5,54)");
    stat.execute("insert into MovieGenre values(1,55)");
    stat.execute("insert into MovieGenre values(5,56)");
    stat.execute("insert into MovieGenre values(3,57)");
    stat.execute("insert into MovieGenre values(3,58)");
    
    System.out.println("Database ready");
    
    ResultSet rs = stat.executeQuery("select * from Genre");
    while(rs.next())
    {
    	int g = rs.getInt("genreID");
    	String t = rs.getString("type");
    	
    	System.out.println(g + "," + t);
    }
    
    con.close();
    //SQL sql=new SQL();
    
  } catch (Exception e) {
      System.err.println("Exception: "+e.getMessage());
    }
}

    public SQL(){
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
			SQL sql=new SQL();
		}
		
		Connection con1 = null;
		try {
		      Class.forName("com.mysql.jdbc.Driver") ;
		      //System.out.println("MySQL JDBC driver loaded.");
		 
		      con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase?useSSL=false", "myuser", "rahul");
		      
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

