package Class03;

public class ex02 {
    public static void main(String[] args) throws Exception{
        int[][] apt =
                {
                        {111000, 125000, 136000, 98000},
                        {136000, 142000, 112000, 135000},
                        {127000, 133000, 155000, 143000}
                };
        double[] sumFloor = new double[apt.length];

        int totalUnits = 0;
        double totalSum = 0;

        for (int i = 0; i < apt.length; i++) {
            int sum = 0;
            for (int j = 0; j < apt[i].length; j++) {
                sum += apt[i][j];
            }
            totalUnits += apt[i].length;
            totalSum += sum;

            sumFloor[i] = sum;

            System.out.printf("%d층의 관리비 평균은 %.2f원 입니다.%n", (i +1), (sumFloor[i] / apt[i].length));
        }
        double overallAveragePerFloor = totalSum / apt.length;

        System.out.printf("아파트 전체층의 관리비 평균은 %.2f원 입니다.", overallAveragePerFloor);
    }
}
