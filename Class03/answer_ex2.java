package Class03;

import java.util.Arrays;

class answer_ex2 {
    public static void main(String[] args) throws Exception {

        int[][] apt = { {111000,125000,136000,98000} ,{136000,142000,112000,135000},{127000,133000,155000,143000} };
        double[] sumFloor = new double[ apt.length ] ;

        for( int i = 0 ; i < apt.length ; i ++ ){
            for( int j = 0 ; j < apt[i].length ; j ++ ){
                sumFloor[i] += apt[i][j] ;
            }
            System.out.printf("%d층의 관리비 평균은 %.2f원 입니다.\n", i+1, sumFloor[i] / apt[i].length );
        }


        System.out.printf("아파트 전체층의 관리비 평균은 %.2f원 입니다.", Arrays.stream( sumFloor ).sum() / sumFloor.length );
    }
}