public class IdentityMatrixChecker {
  public static void main (String [] args) {
    int [ ] [ ] A = {{1,  0,  0,  1},
                       {0,  1,  0,  0},
                       {1,  0,  1,  0},
                       {0,  1,  0,  1}};

    for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if ((i == j && A[i][j] != 1) || (i != j && A[i][j] != 0)) {
                    System.out.println("Not an Identity matrix");
                    return;
                }
            }
        }
        
        System.out.println("Identity matrix");
    