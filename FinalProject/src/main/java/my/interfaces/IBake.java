/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.interfaces;

import com.models.BakedGoods;
import com.models.Users;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author ASUS
 */
@WebService
public interface IBake {
    
    @WebMethod
    @WebResult(name = "usersList")
    public List<Users> getAllUsers();
    
    @WebMethod
    @WebResult(name="insertUser")
    public String insertUsers(int userid,String username, String password);
    
    @WebMethod
    @WebResult(name="deleteUser")
    public String deleteUser (int userid);
    
    @WebMethod
    @WebResult(name="login")
    public boolean getLogin (String username, String password );
    
    
    
    @WebMethod
    @WebResult(name = "BakedGoodsList")
    public List<BakedGoods> getAllBakedGoods();
    
    @WebMethod
    @WebResult(name="insertBakedGoods")
    public String insertBakedGoods(int bakeid,String bakename, Double bakeprice);
    
    @WebMethod
    @WebResult(name = "UpdatedUser")
    public int updatedUser(String username, String password, int userid);
    
    @WebMethod
    @WebResult(name = "UpdatedBakedGoods")
    public int updatedBakedGoods(String bakename, Double bakeprice, int bakeid);
//    @WebMethod
//    @WebResult(name="updateUser")
//    public boolean updateUser(int userid);
            
            
    @WebMethod
    @WebResult(name="deleteBakedGoods")
    public String deleteBakedGoods (int bakeid);
    

}
