package _5_inheritance.stack;

import java.util.ArrayList;

public class Stack {
   private ArrayList<String> data;

   public Stack(){
       this.data = new ArrayList<>();
   }

   public void push(String item){
       this.data.add(item);
   }

    public String pop(){
      return  this.data.remove(this.data.size()-1);
    }

    public  String peek(){
        return this.data.get(this.data.size()-1);
    }
    public  boolean isEmpty(){
       boolean isIt = false;
       if(this.data.size() == 0){
           isIt = true;
       }
        return isIt;
    }
}
