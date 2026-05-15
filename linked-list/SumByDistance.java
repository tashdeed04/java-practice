public static int SumByDistance(Node head, Integer[] distArr){
      int totalsum = 0;
      for  (int i = 0; i < distArr.length; i++){
        int distance = distArr[i];
        Node tmp = head;
        int counter = 0;
        for (int j = 0; tmp != null && j < distance; j++){
          tmp = tmp.next;
          counter++;
        }
        if (tmp != null) {
          totalsum += (int) tmp.elem;
        } 
      }
      return totalsum;
    }
