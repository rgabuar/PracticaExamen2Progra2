/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaexamen2progra2i.DAO;

import java.sql.SQLException;
import practicaexamen2progra2i.Connections.MySQLBD;
import practicaexamen2progra2i.DATA.Prize;

/**
 *
 * @author Administrador
 */
public class PrizeDao {
    
    private MySQLBD mysqlbd;
    
    public void insertarDatos(Prize prize) throws SQLException{
        mysqlbd = new MySQLBD();
        String sql = "insert into prize(PrizeAmount,PrizeName,PrizeTickets,PrizeDescription)"+ 
                      "values ('"+prize.getPrize_amount()+"'"
                + ",'"+prize.getPrize_Name()+"','"+prize.getPrize_Tickets_Needed()+"',"
                + "'"+prize.getDescription()+"')";
        mysqlbd.execute(sql);
        mysqlbd.closeExecute();
    }
    
    public void BorrarDatos(Prize prize) throws SQLException{
        mysqlbd = new MySQLBD();
        String sql = "insert into prize(PrizeAmount,PrizeName,PrizeTickets,PrizeDescription)"+ 
                      "values ('"+prize.getPrize_amount()+"'"
                + ",'"+prize.getPrize_Name()+"','"+prize.getPrize_Tickets_Needed()+"',"
                + "'"+prize.getDescription()+"')";
        mysqlbd.execute(sql);
        mysqlbd.closeExecute();
    }
}

