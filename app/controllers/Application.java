package controllers;

import play.*;
import play.mvc.*;


public class Application extends Controller {

    public static void index() {
        System.out.print("test 222 !!");
        render();
    }

}