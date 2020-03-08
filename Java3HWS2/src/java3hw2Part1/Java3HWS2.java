/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java3hw2Part1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author LAPTOP
 */
public class Java3HWS2 extends Application  {

    public static void main(String[] args) {
        try {
            getExceptionB();
        } catch (ExceptionA ea) {
            System.out.println(ea.getMessage());
        }

        try {
            getExceptionC();
        } catch (ExceptionA ea) {
             System.out.println(ea.getMessage());
        }

    }

    public static void getExceptionB() throws ExceptionB {
        throw new ExceptionB("Exception B");
    }

    public static void getExceptionC() throws ExceptionC {
        throw new ExceptionC("Exception C");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
