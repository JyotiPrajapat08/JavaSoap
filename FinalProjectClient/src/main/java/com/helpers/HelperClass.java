/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import my.interfaces.Users;


/**
 *
 * @author jo
 */
public class HelperClass {
      
    public static String getHTML(List<Users> info , String title)
    { 
        String table = "<h1 style='color:maroon;margin-left:41%'>" + title + "</h1>";
          table += "</tr></table>"
                + "<button style='background-color:ffe0ff;margin-left:39%;margin-right:02%;margin-top:1%;margin-bottom:2%;width:10%;height:8%'><a href='deleteUsers.html'>Delete your account</a></button>"
                 + "<button style='background-color:ffe0ff;margin-left:0%;margin-right:02%;margin-top:1%;margin-bottom:2%;width:10%;height:8%'><a href='updateUsers.html'>Update your account</a></button>";
          
        table += "<table border='5' align='center' bgcolor='pink' cellpadding='50'> <tr> <th>User ID </th>  <th> User Name </th> </tr>";
                
        for(Users i : info)
        {
            table += "<tr bgcolor='yellow'><td>" + i.getUserid() + "</td>"
                    + "<td>" + i.getUsername() + "</td></tr>";
                    
        }
                                
         table += "</tr></table>";
             //   + "<a href='addUsers.html'>Add Movies</a><br><br>";
              //  + "<a href='deleteMovies.html'>Delete Movies</a><br>";
        return table;    
    }

}
