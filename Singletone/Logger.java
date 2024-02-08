/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singletone;

/**
 *
 * @author DELL
 */
public class Logger {
private Logger() {
// private constructor
}
public static Logger 
myInstance;
public static class LoggerHolder {
public static Logger logger = 
new Logger();
}
public static Logger getInstance(){
return LoggerHolder.logger;
}
public void log(String s) {
// log implementation
System.err.println(s);
}
}
