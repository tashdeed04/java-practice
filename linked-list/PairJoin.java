public static void pairJoin(DNode dh1, DNode dh2) {
      DNode curr1 = dh1.next;
      DNode curr2 = dh2.next;
      DNode tail = dh1;
      
      for (;curr1 != null && curr2 != null;){
        tail.next = curr1;
        curr1.prev = tail;
        tail = curr1;
        curr1 = curr1.next;
        tail.next = curr2;
        curr2.prev = tail;
        tail = curr2;
        curr2 = curr2.next;
      }
      tail.next = dh1;
      dh1.prev = tail;
    }
