package com.fedex.test.simple;

import java.io.IOException;

import org.apache.commons.io.FileSystemUtils;

public class IOTester {
   public static void main(String[] args) {
      try {
    	  System.out.println("abdul");
         System.out.println("Free Space " + FileSystemUtils.freeSpaceKb("C:/") + " Bytes");
      } catch(IOException e) {
         System.out.println(e.getMessage());
      }
   }
}


