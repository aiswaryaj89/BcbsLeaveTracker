package com.leavetracker.util;

import java.sql.Connection;

public class DbUtil {

	private static Connection dbConnection = null;

	public static Connection getConnection() {
	      if (dbConnection != null) {
	          return dbConnection;
	      } else {
	          try {
	        	  //write code to get dbconnection
	          }
	        	  catch (Exception e) {
	                  e.printStackTrace();
	              }
	              return dbConnection;
	          }
	    }
	          }
	             

