/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restserver;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("api")
public class ApplicationContext extends ResourceConfig {

    public ApplicationContext() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        try {
            String databaseUrl = "jdbc:mysql://localhost:8889/instaface?user=root&password=root";
// create a connection source to our database
            ConnectionSource connectionSource
                    = new JdbcConnectionSource(databaseUrl);
// instantiate the dao
// if you need to create the ’accounts’ table make this call
            TableUtils.createTableIfNotExists(connectionSource, User.class);

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        packages("com.mycompany.restserver");
        register(UserOperations.class);
    }
}
