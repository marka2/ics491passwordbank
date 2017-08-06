import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
@ManagedBean
@RequestScoped
public class User{
    int userid;
    String table;
    String website;
    String username;
    String password;

    ArrayList usersList ;
    private Map<String,Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
    Connection connection;
    Statement statement;
    
    public int getUserid(){
        return userid;
    }

    private void setUserid(){
        Integer one = this.username.hashCode()+10;
        Integer two = this.password.hashCode()+100;
        this.userid = one ^ two;
    }

    public String getWebsite(){
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    
    public String getUsername(){
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }    

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String login() {
        setUserid();
        System.out.println(this.userid);
        try {
            if(getLoginConnection()==null){
              return "/login.xhtml?faces-redirect=true";
            }
        }catch (Exception e) {
            
        }
        return "/user_display.xhtml?faces-redirect=true";


        
    }
    // Used to establish connection during login
    public Connection getLoginConnection(){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            String db = "the_bank";
            String uname = this.username;
            String pword = this.password;
            try{
                connection = DriverManager.getConnection("jdbc:derby://localhost:1527/"+db,uname,pword);
                table = "passes";
            } catch (SQLException e) {
                System.out.print(e);
            }

        }catch(Exception e){
            System.out.println(e);
            return null;
        }
        return connection;
    }
    
    // Used to establish connection during data display
    public Connection getConnection(){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            String db = "the_bank";
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/"+db,"test", "test");
            table = "passes";
            return connection;
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    // Used to fetch all records
    public ArrayList usersList(){
        try{
            usersList = new ArrayList();
            connection = getConnection();
            Statement stmt=getConnection().createStatement();  
            ResultSet rs=stmt.executeQuery("select * from "+table);  
            while(rs.next()){
                User user = new User();
                user.setWebsite(rs.getString("website"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                usersList.add(user);
            }
            connection.close();        
        }catch(Exception e){
            System.out.println(e);
        }
        return usersList;
    }
    // Used to save user record
    public String save(){
        int result = 0;
        try{
            connection = getConnection();
            PreparedStatement stmt = connection.prepareStatement("insert into " + table + "(website,username,password) values(?,?,?)");
            stmt.setString(1, website);
            stmt.setString(2, username);
            stmt.setString(3, password);
            result = stmt.executeUpdate();
            connection.close();
        }catch(Exception e){
            System.out.println(e);
        }
        if(result !=0)
            return "user_display.xhtml?faces-redirect=true";
        else return "create.xhtml?faces-redirect=true";
    }
    // Used to fetch record to update
    public String edit(int id){
        User user = null;
        System.out.println(id);
        try{
            connection = getConnection();
            Statement stmt=getConnection().createStatement();  
            ResultSet rs=stmt.executeQuery("select * from " + table + " where userid = "+(userid));
            rs.next();
            user = new User();
            user.setWebsite(rs.getString("website"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            sessionMap.put("editUser", user);
            connection.close();
        }catch(Exception e){
            System.out.println(e);
        }       
        return "/edit.xhtml?faces-redirect=true";
    }
    // Used to update user record
//    public String update(User u){
//        //int result = 0;
//        try{
//            connection = getConnection();  
//            PreparedStatement stmt=connection.prepareStatement("update "+ table + " set website=?, username=?, password=?");  
//            stmt.setString(1, website);
//            stmt.setString(2, username);
//            stmt.setString(3, password); 
//            stmt.executeUpdate();
//            connection.close();
//        }catch(Exception e){
//            System.out.println();
//        }
//        return "/user_display.xhtml?faces-redirect=true";      
//    }
    // Used to delete user record
//    public void delete(int id){
//        try{
//            connection = getConnection();  
//            PreparedStatement stmt = connection.prepareStatement("delete from "+table+" where userid = "+userid);  
//            stmt.executeUpdate();  
//        }catch(Exception e){
//            System.out.println(e);
//        }
//    }
}