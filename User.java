
package modifier_constructor_SetGet;


public class User {
    
    private String username;
    private String password;
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword (String password){
        this.password = password;
    }
    
    public String getUsername (){
        return this.username;
    }
     public String getPassword(){
        return this.password;
    }
     
     public static void main(String[] args) {
        
    
     
   User draken = new User();     
     
   draken.setUsername("draken");
   draken.setPassword("oii");
   
         System.out.println("Username : " + draken.username);
         System.out.println("Password : " + draken.password);
           }
}
