private int hashFunction(Integer key) {
    int h = (key + 3) % 6;
    return h;
}

public void HashTableRemoval( Integer key ){
      int indexOFkey = hashFunction(key);
      PairNode prv = null;
      for (PairNode cur = ht[indexOFkey]; cur != null; ) {
        if (cur.key == key) {
          if (prv == null) {
            ht[indexOFkey] = cur.next;
          } else {
            prv.next = cur.next;
          }
          return;
        }
        prv = cur;
        cur = cur.next;
      }
    }