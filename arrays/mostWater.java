public static void mostWater( Integer[] height ){
        int maxarea = 0;        
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++){
                int x = 0;
                int area = 0;
                if (height[i] < height[j]) {
                    x = height[i];
                } else {
                    x = height[j];
                }
                area = x *(j - i);
                if (area > maxarea){
                    maxarea = area;
                }
            }            
        }
        System.out.println(maxarea);
    }