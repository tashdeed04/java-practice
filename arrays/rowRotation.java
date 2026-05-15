public static Integer rowRotation( Integer examWeek, String[][] matrix ){
        int rot = examWeek - 1;
        for (int x = 0; x < rot; x++){
            String [] lstrow = matrix[matrix.length-1];
            for (int i = matrix.length - 1; i >0; i--){
                matrix[i] = matrix[i-1];
            }
            matrix[0] = lstrow;
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print("| " + matrix[i][j] + "  ");
            }
            System.err.println("|");
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j].equals("AA")){
                    return i+1;
                }
            }
        }
        return -1;
    }