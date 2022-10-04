package com.company.Testing;

public abstract class Testing {
     private String type;

     public Testing(String type){
          this.type=type;
     }

     public String getType() {
          return type;
     }

     public void setType(String type) {
          this.type = type;
     }

     public void typeofTesting(){
          System.out.println("ttt");
     }
}
