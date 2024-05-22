package com.example.tpo.task1;




public class TangentDecompose {
    private static double factorial(double x) {
        if(x == 0){
            return 1;
        }
        if(x == 1){
            return x;
        }
        return x * factorial(x - 1);
    }

public static double[] bernulli(int n) {
        double[] A = new double[n + 1];
        double[] B = new double[n + 1];
        for (int m = 0; m <= n; m++) {
            A[m] = 1.0 / (m + 1);
            for (int j = m; j >= 1; j--) {
                A[j - 1] = j * (A[j - 1] - A[j]);
            }
            B[m] = A[0]; 
        }
        return B;
    }

    public static double tan_decompose(double x, int length) {
        if (Math.abs(x) > Math.PI / 2){
            return Double.NaN;
        }
        
        double top, bot = 1;
        double ans = 0;
        double tmp = 1;
        double coef = x;
        int bernulli_expand_index = 50;
        double b_n[] = bernulli(bernulli_expand_index);
        for(int i = 1; i < length; i++){

            if(2 * i % bernulli_expand_index == 0){
                bernulli_expand_index = bernulli_expand_index * 2;
                b_n = bernulli(bernulli_expand_index);
            }
            top = Math.pow(-1, i + 1) * Math.pow(2, 2*i) * (Math.pow(2, 2 * i) - 1) * b_n[2*i];
            bot = factorial(2 * i);
            coef = Math.pow(x, 2 * i - 1);
            
            tmp = top / bot * coef;
            ans += tmp;
        }
        return ans;
    }
    

}