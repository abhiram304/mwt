import java.sql.*;

public class Validate
{
  public static boolean checkUser(String email,String pass)
  {
    boolean st=false;
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
      PreparedStatement ps=con.prepareStatement("select * from register where email=? and pass=?");
      ps.setString(1,email);
      ps.setString(1,pass);
      ResultSet rs=ps.executeQuery();
      st=rs.next();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
    return st;
  }
  
}
