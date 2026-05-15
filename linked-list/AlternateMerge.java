public static Node alternateMerge( Node head1, Node head2 ){
      for (Node curr1 = head1, curr2 = head2;curr1 != null && curr2 != null;){
        Node tmp1 = curr1.next;
        Node tmp2 = curr2.next;
        curr1.next = curr2;
        
        if (tmp1 != null){
          curr2.next = tmp1;
        }
        curr1 = tmp1;
        curr2 = tmp2;
      }
      return head1;
    }