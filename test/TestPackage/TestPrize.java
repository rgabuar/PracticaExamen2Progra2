/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestPackage;

import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import practicaexamen2progra2i.DAO.PrizeDao;
import practicaexamen2progra2i.DATA.Prize;

/**
 *
 * @author Administrador
 */
public class TestPrize {
    
    private Prize prize;
    private PrizeDao prizeDao = new PrizeDao();
    
    public TestPrize() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() throws SQLException {
    prize = new Prize(5, 10, "Real", 50, "Madrid");
    prizeDao.insertarDatos(prize);
    }
}



