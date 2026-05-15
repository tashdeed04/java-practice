public static void playGame( Integer[][] arena ){
        int points = 0;
        for (int i = 0; i < arena.length; i++){
            for (int j = 0; j < arena[0].length; j++){
                if (arena[i][j] % 50 == 0 && arena[i][j] != 0) {
                    if (i - 1 >= 0 && arena[i-1][j] == 2){
                        points++;
                    }
                    if (i + 1 < arena.length && arena[i+1][j] == 2){
                        points++;
                    }
                    if (j - 1 >= 0 && arena[i][j-1] == 2){
                        points++;
                    }
                    if (j + 1 < arena[0].length && arena[i][j+1] == 2){
                        points++;
                    }
                }
            }
        }
        int totalpoints = points*2;
        if (totalpoints >= 10){
            System.out.println("Points Gained: "+totalpoints+". Your team has survived the game");
        } else {
            System.out.println("Points Gained: "+totalpoints+". Your team is out.");
        }
    }