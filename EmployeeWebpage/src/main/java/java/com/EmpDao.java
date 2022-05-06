package java.com;
import java.util.*;     
import java.sql.*;      
    
  public class EmpDao {
		public static final String DB_URL="jdbc:mysql://localhost:3306/db";
		public static final String USERNAME="root";
		public static final String PASSWORD="javalearn22@";
    public static Connection getConnection(){   
        Connection con=null;   
        try{    
            Class.forName("com.mysql.jdbc.Driver");   
            con=DriverManager.getConnection("DB_URL, USERNAME, PASSWORD");      
        }   
        catch(Exception e1) 
        {   
            System.out.println(e1); 
        }   
        return con;    
    }   
    public static int save(Empdet e1){     
        int status=0;   
        try{    
            Connection con=EmpDao.getConnection();     
            PreparedStatement ps=con.prepareStatement("Insert into Employee(id,name,email,department,city) values (?,?,?,?,?)");    
            ps.setString(1,e1.getId());   
            ps.setString(2,e1.getName());     
            ps.setString(3,e1.getEmail());      
            ps.setString(4,e1.getDepartment());   
            ps.setString(5,e1.getCity());     
                
            status=ps.executeUpdate();     
                
            con.close();   
        }   
        catch(Exception ex1)    
        {   
            ex1.printStackTrace();  
        }   
            
        return status;      
    }   
    public static int update(Empdet e1){      
        int status=0;   
        try{    
            Connection con=EmpDao.getConnection();     
            PreparedStatement ps=con.prepareStatement("Update Employee set id=?, name=?,email=?,department=?,city=? where id=?");   
            ps.setString(1,e1.getId());   
            ps.setString(2,e1.getName());     
            ps.setString(3,e1.getEmail());      
            ps.setString(4,e1.getDepartment());   
            ps.setString(5,e1.getCity());     
                
                
            status=ps.executeUpdate();     
                
            con.close();   
        }   
        catch(Exception ex1)    
        {ex1.printStackTrace();}    
            
        return status;      
    }   
    public static int delete(int id){     
        int status=0;   
        try{    
            Connection con=EmpDao.getConnection();     
            PreparedStatement ps=con.prepareStatement("Delete from Employee where id=?");      
            ps.setInt(1,id);      
            status=ps.executeUpdate();     
                
            con.close();   
        }catch(Exception e1){e1.printStackTrace();}     
            
        return status;      
    }   
    public static Empdet getStudentById(int id){      
        Empdet e1=new Empdet();   
            
        try{    
            Connection con=EmpDao.getConnection();     
            PreparedStatement ps=con.prepareStatement("select * from Employee where id=?");    
            ps.setInt(1,id);      
            ResultSet rs=ps.executeQuery();   
            if(rs.next()){     
                e1.setId(rs.getString(1));    
                e1.setName(rs.getString(2));      
                e1.setEmail(rs.getString(3));   
                e1.setDepartment(rs.getString(4));    
                e1.setCity(rs.getString(5));      
            }   
            con.close();   
        }catch(Exception ex1){ex1.printStackTrace();}   
            
        return e1;      
    }   
    public static List<Empdet> getAllStudent(){    
        List<Empdet> list=new ArrayList<Empdet>();    
            
        try{    
            Connection con=EmpDao.getConnection();     
            PreparedStatement ps=con.prepareStatement("select * from student");   
            ResultSet rs=ps.executeQuery();   
            while(rs.next()){      
                Empdet e1=new Empdet();   
                e1.setId(rs.getString(1));    
                e1.setName(rs.getString(2));      
                e1.setEmail(rs.getString(3));   
                e1.setDepartment(rs.getString(4));    
                e1.setCity(rs.getString(5));      
                list.add(e1);   
            }   
            con.close();   
        }catch(Exception e1){e1.printStackTrace();}     
            
        return list;    
    }   
} 
	

