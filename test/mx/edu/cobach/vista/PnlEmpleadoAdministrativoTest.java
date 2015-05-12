/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Alex
 */
public class PnlEmpleadoAdministrativoTest{
    
    private FrameFixture window;
    
    @Before
    public void setUp(){
        window = new FrameFixture(new Login());
    }
    
    @After
    public void tearDown(){
        window.cleanUp();
    }
    
    @Test
    public void clickIngresar(){
        window.textBox("usuario").enterText("alex1514");
        window.textBox("contrasena").enterText("123456");
        window.button("ingresar").click();
    }
}
    