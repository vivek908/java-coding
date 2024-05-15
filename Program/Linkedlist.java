// Input: lists = [[1,4,5],[1,3,4],[2,6]]
// Output: [1,1,2,3,4,4,5,6]
class ListNode{
    int val;
    ListNode next;
    
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
class Linkedlist {
    private ListNode head;

    public Linkedlist(){
        this.head=null;
    }
    public void insert(int val){
        ListNode newNode=new ListNode(val);
        if(head==null){
            head=newNode;
        }
        else{
            ListNode temp=head;
            while (temp.next!=null) {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public void printList(){
        ListNode current=head;
        while(current!=null){
            System.out.println(current.val+" ");
            current=current.next;
        }
        System.out.println();
    }
    public void deleteOddNodes(){
        while(head!=null && head.val%2!=0){
            head=head.next;
        }
        ListNode current=head;
        while(current!=null && current.next!=null){
            if(current.next.val%2!=0){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
    }
    public static ListNode mergeSortedLinkedList(ListNode l1,ListNode l2,ListNode l3){
        ListNode node=new ListNode(0);
        ListNode current=node;
        while(l1!=null || l2!=null || l3!=null){
            int minVal=Integer.MAX_VALUE;
            if(l1!=null) minVal=Math.min(minVal,l1.val);
            if(l2!=null) minVal=Math.min(minVal,l2.val);
            if(l3!=null) minVal=Math.min(minVal,l3.val);

            if(l1!=null && l1.val==minVal){
                current.next=new ListNode(l1.val);
                l1=l1.next;
            }
            else if(l2!=null && l2.val==minVal){
                current.next=new ListNode(l2.val);
                l2=l2.next;
            }
            else{
                current.next=new ListNode(l3.val);
                l3=l3.next;
            }
            current=current.next;
          
        }
        return node.next;
        
    }
    public static void main(String[] args) {
        Linkedlist list1=new Linkedlist();
        Linkedlist list2=new Linkedlist();
        Linkedlist list3=new Linkedlist();
        list1.insert(1);
        list1.insert(4);
        list1.insert(5);
        list2.insert(1);
        list2.insert(3);
        list2.insert(4);
        list3.insert(2);
        list3.insert(6);
        mergeSortedLinkedList(null, null, null);
  
    }
}
