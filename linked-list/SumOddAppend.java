public static void sumOddAppend(Node dh) {
      int sum = 0;
      Node prev = dh;
      Node curr = dh.next;
      
      for (curr = dh.next; curr != dh;){
        if ((int) curr.elem%2 != 0){
          sum += (int) curr.elem;
          prev.next = curr.next;
          curr = prev.next;
        } else {
          prev = curr;
          curr = curr.next;
        }
      }
      prev.next = new Node (sum);
      prev.next.next = dh;
    }