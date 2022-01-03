package com.gfl;

public class MyProduct {
  
    String prop1;
    String prop2;
    
    public static class Builder{
      private String prop1;
      private String prop2;

      public void setProp1(String prop1){
        this.prop1 = prop1;
      }

      public void setProp2(String prop2){
        this.prop2 = prop2;
      }

      public MyProduct build(){
         MyProduct mp = new MyProduct();
          mp.prop1 = this.prop1;
          mp.prop2 = this.prop2;
         return mp;
      }
    
    }

    public static Builder getBuilder(){
      return new Builder();
    }

    public String toString(){
      return ""+this.prop1+" "+ this.prop2;
    }

}
