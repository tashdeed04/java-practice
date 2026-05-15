public static String checkSimilar( Node building1, Node building2 ){
      Node x1 = building1;
      Node x2 = building2;
      
      while (x1 != null && x2 != null){
        if (!x1.elem.equals(x2.elem)){
          return "Not Similar";
        }
        x1 = x1.next;
        x2 = x2.next;
      }
      if (x1 != null || x2 != null){
      return "Not Similar";
    }
      return "Similar";
    }