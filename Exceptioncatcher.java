//////////////////////////////////
//  Author: Phillip Plangetis   //
//  Date: 5/7/23                //
//  Program: Exception Catcher  //
//////////////////////////////////

package com.mycompany.exceptioncatcher;
import java.util.Scanner;
import java.io.*;

public class Exceptioncatcher {
         try static {
                getExceptionB();
            } catch (ExceptionA ea) {
                ea.printStackTrace();
            }

            try {
                getExceptionC();
            } catch (ExceptionA ea){
                ea.printStackTrace();
            }
            
        public static void  getExceptionB() throws ExceptionB {
            throw new ExceptionB("Exception B");
        }

        public static void  getExceptionC() throws ExceptionC {
            throw new ExceptionC("Exception C");
        }
}

public class ExceptionA extends Exception {

        public ExceptionA(String message) {
            super(message);
        }
    }

  public class ExceptionB extends ExceptionA {

        public ExceptionB(String message) {
            super(message);
        }
    }

public class ExceptionC extends ExceptionB {

        public ExceptionC(String message) {
            super(message);
        }
    }