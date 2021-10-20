
package fes.aragon.unam.adts;


public class DoubleLinkedList {
     private class NodoDoble<T>{
        T data;
        NodoDoble next;
        NodoDouble prev;
       
        public NodoDoble() {
        }

        public NodoDoble(T data, NodoDoble next, NodoDouble prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
           
        }
    }
        private NodoDouble head;
        private NodoDouble tail;
        private int size;
            
    
 public DoubleLinkedList(){
    head = null;
    tail = null;
    this.size=0;
 }  
public boolean siEmpty(){
    return this.head == null;
} 
public void append(Object valor){
    if(this.tail == null){
        this.tail = new NodoDoble(valor,null,null);
         this.head = this.tail;
    }else{
        this.tail.next = new NodoDoble(valor,null,this.tail);
        this.tail = this.tail.next;
    }
  this.size++;
}
public void trasversal(){
    NodoDoble currNode = this.head;
    while(currNode != null){
        System.out.print(currNode.data+"--->");
        currNode=currNode.next;
      
    }
    System.out.print("");
}
}

       
   

