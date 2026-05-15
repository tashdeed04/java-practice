public static int StackDiamondCoun(Stack stack, String str) {
      int counter = 0;
      for (int i = 0; i < str.length(); i++) {
        char charecter = str.charAt(i);
        if (charecter == '<'){
          stack.push('<');
        } else if (charecter == '>') {
          if (! stack.isEmpty() && (char)stack.peek() == '<') {
            stack.pop();
            counter++;
          }
        }
      }
      return counter;
    }