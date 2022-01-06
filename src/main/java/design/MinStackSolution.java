package design;

public class MinStackSolution {

}

class MinStack {

    Node head;

    public MinStack() {}

    public void push(int val) {
        if(head==null){
            head=new Node(val,val);
        }else{
            int minVal=val<head.minVal?val:head.minVal;
            Node newHead = new Node(val,minVal);
            newHead.next = head;
            head=newHead;
        }
    }

    public void pop() {
        if(head!=null){
            this.head=head.next;
        }
    }

    public Integer top() {
        if(head!=null){
            return head.val;
        }
        return null;
    }

    public Integer getMin() {
        if(head!=null){
            return head.minVal;
        }
        return null;
    }

}

class Node {
    int  val;
    Node next;
    int minVal;
    public Node(int val, int minVal){
        this.val   =val;
        this.minVal= minVal;
    }
}








/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

