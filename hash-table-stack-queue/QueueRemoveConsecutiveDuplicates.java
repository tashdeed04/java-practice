public static String QueueRemoveConsecutiveDuplicates(String text){
      LinkedListQueue q = new LinkedListQueue();
      int i = 0;
      while (i < text.length()) {
        q.enqueue(text.charAt(i));
        i++;
      }
      
      String finRes = "";
      if (!q.isEmpty()) {
        char lstCharecter = (char) q.dequeue();
        finRes += lstCharecter;
        
        while (!q.isEmpty()) {
          char curCharecter = (char) q.dequeue();
          if (curCharecter != lstCharecter) {
            finRes += curCharecter;
            lstCharecter = curCharecter;
          }
        }
      }
      return finRes;
    }