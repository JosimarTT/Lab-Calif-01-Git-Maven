package com.tecsup.lab01.controller;
import java.util.Scanner;

import com.tecsup.lab01.model.User;

public class UserController extends User{
	
	public static void main( String[] args )
	    {
		User user = new User ();
System.out.println("Nombre: "+user.nombre);
   System.out.println("Apellido paterno: "+user.apellido);
     System.out.println("Edad: "+user.edad);
	    }
	
}
