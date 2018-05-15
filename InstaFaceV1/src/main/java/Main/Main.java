/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author nikoskatsilidis
 */
public class Main {

    public static void main(String[] args) {

//        Client client = ClientBuilder.newClient();
//        WebTarget target = client.target("http://localhost:8084/RestServer/api/users");

        //String input = "{\"name\":\"Jack\",\"surname\": \"Fk"}";
        //Response res = target.request(MediaType.APPLICATION_JSON).post(Entity.json(input));
        
//        if (res.getStatus() != 201) {
//            System.out.println("Something went wrong");
//        } else {
//            String result = res.readEntity(String.class);
//            System.out.println(result);
//        }

//        Register2 r = new Register2();
//        
//        r.setTitle("Register");
//        r.setMinimumSize(new Dimension(700,450));
//        r.setMaximumSize(new Dimension(700,450));
//        r.setVisible(true);
//        r.setLocationRelativeTo(null);
//        r.setResizable(false);
//        r.setDefaultCloseOperation(EXIT_ON_CLOSE);
//
//        Register1 r1 = new Register1();
//
//        r1.setTitle("Register");
//        r1.setMinimumSize(new Dimension(700, 470));
//        r1.setMaximumSize(new Dimension(700, 470));
//        r1.setVisible(true);
//        r1.setLocationRelativeTo(null);
//        r1.setResizable(false);
//        r1.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        
        
        Login1 l = new Login1();

        l.setTitle("Login");
        l.setMinimumSize(new Dimension(700, 400));
        l.setMaximumSize(new Dimension(700, 400));
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        l.setResizable(false);
        l.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
