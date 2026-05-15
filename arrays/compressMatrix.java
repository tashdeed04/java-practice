public static Integer[][] compressMatrix( Integer[][] matrix ){
        
        int x = matrix.length;
        int y = matrix[0].length;
        Integer [][] res = new Integer[x/2][y/2];
        for (int i = 0; i < x; i += 2){
            for (int j = 0; j < y; j += 2){
                int temp1 = matrix[i][j] + matrix[i][j+1];
                int temp2 = matrix[i+1][j] + matrix[i+1][j+1];
                int total = temp1 + temp2;
                res[i/2][j/2] = total;
            }
        }
        return res;
    }