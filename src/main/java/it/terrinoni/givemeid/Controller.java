/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.terrinoni.givemeid;

import org.bson.types.ObjectId;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;
import static spark.Spark.get;

/**
 *
 * @author Marco Terrinoni
 */
public class Controller {
    public static void main(String[] args) {
        new Controller();
    }
    
    public Controller() {
        Spark.setPort(8082);
        initializeRoute();
    }

    private void initializeRoute() {
        get("/", new Route() {
            @Override
            public Object handle(Request rqst, Response rspns) {
                return "Your new ID is: " + new ObjectId().toHexString();
            }
        });
    }
}
