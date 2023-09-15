/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mrlees.upperguidemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author clees
 */
public class DatabaseAccess {
        //private static final String CONN_URL = "jdbc:mysql://computing.gfmat.org:3306/";
    private static final String CONN_URL = "jdbc:mysql://localhost:3306/";
    private static final String DB_NAME = "testdb";
    private static final String USERNAME = "clees_demo";
    private static final String PASSWORD = "Nky^K^*WqAscLExxjs2Y6WButrdsmmBuzb^CDEdVSCL@CfpNSMj5nB&r5BeYDBZsFnGDucf9yNe52unyfya8w%b7cUeeubynP4S9pHKz!PWUpszT&fuCLrC5CLPZ8e77";

    public static void sqlTestDBConnection() {
        try ( Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USERNAME, PASSWORD)) {
            System.out.println("CONNECTION MADE!");
            con.close();
        } catch (SQLException e) {
            System.out.println("SOMETHING WENT WRONG..." + e.getMessage());
        }
    }
}
