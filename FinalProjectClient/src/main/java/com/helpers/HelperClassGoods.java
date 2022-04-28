/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import my.interfaces.BakedGoods;
import my.interfaces.Users;


/**
 *
 * @author jo
 */
public class HelperClassGoods {
      
    public static String getHTML(List<BakedGoods> info , String title)
    {  String table = "<h1 style='color:maroon;margin-left:38%'>" + title + "</h1>";
        
      
              //  + "<a href='addbakedgoods.html'>Add goods</a><br>"
               // + "<a href='updatebakedgoods.html'>update</a>";
    
      
        
        table += "<table border='10' align='center' bgcolor='pink' cellpadding='50'> <tr> <th> ID </th>  <th> Name </th> <th> Price </th> </tr>";
                
        for(BakedGoods i : info)
        {
            table += "<tr bgcolor='yellow' ><td>" + i.getBakeid()+ "</td>"
                    + "<td>" + i.getBakename() + "</td>"
                    + "<td>" + i.getBakeprice()+ "</td></tr>";
                    
        }
                                
         table += "</tr></table>"
                 
                + "<button style='background-color:ffe0ff;margin-left:33%;margin-right:02%;margin-top:2%;margin-bottom:0%;width:10%;height:8%'><a href='deletebakedgoods.html'>Delete Goods</a></button>"
                + "<button style='background-color:ffe0ff;margin-left:0%;margin-right:2%;margin-top:2%;margin-bottom:0%;width:10%;height:8%'><a href='addbakedgoods.html'>Add Goods</a></button>"
                + "<button style='background-color:ffe0ff;margin-left:0%;margin-right:0%;margin-top:2%;margin-bottom:0%;width:10%;height:8%'><a href='updatebakedgoods.html'>Update Goods</a></button>";
        return table;    
    }

}
