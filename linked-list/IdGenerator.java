public static Node idGenerator(Node head1, Node head2, Node head3){
      Node rvrs = null;
      Node curr = head1;
      
      while (curr != null){
        Node newNode = new Node(curr.elem, rvrs);
        rvrs = newNode;
        curr = curr.next;
      }
      Node dh = new Node(null, null);
      Node tail = dh;
      Node tmp = rvrs;
      
      while (tmp != null) {
        tail.next = new Node(tmp.elem, null);
        tail = tail.next;
        tmp = tmp.next;
      }
      Node curr2 = head2;
      Node curr3 = head3;
      
      while (curr2 != null && curr3 != null) {
        int sum = (Integer)curr2.elem + (Integer)curr3.elem;
        if (sum >= 10) sum = sum % 10;
        tail.next = new Node(sum, null);
        tail = tail.next;
        curr2 = curr2.next;
        curr3 = curr3.next;
      }
      return dh.next;
    }
