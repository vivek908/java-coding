class LL{
    Node head;
    int size;
    LL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
         Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }    
    }
    public void addFirst(String data) {
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        return;
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while (currNode.next!=null) {
                currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLastNode=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLastNode=secondLastNode.next;
        }
        secondLastNode.next=null;
    }
    public void printList(){
        if(head==null){
            System.out.println("empty list");
        }
        Node currNode=head;
        while (currNode!=null) {
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("is");
        list.addLast("a");
        list.addFirst("this");
        list.addLast("list");
       // list.deleteFirst();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
    }
}