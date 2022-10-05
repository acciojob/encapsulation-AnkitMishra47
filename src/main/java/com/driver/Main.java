package com.driver;

public class Main {
  
  public static void main(String[] args){
    RWOnly rwOnly = new RWOnly(); 
    rwOnly.setA(5);
    System.out.println(rwOnly.getA());
  }
  
}
