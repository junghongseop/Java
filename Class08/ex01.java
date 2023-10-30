package Class08;
import java.util.HashMap;

class Car{
    String name;
    int number;

    // 디폴트 생서자
    //  public Car(){
    //    this.name = "car";
    //    this.number = 1234;
    // }
    // 매개변수 2개짜리 생성자
    public Car(String name, int number) {
        this.name = name;
        this.number = number;
    }
    //toString
    @Override
    public String toString() {
        return "name:" + name + ",number:" + number;
    }
    //equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return number == car.number && name.equals(car.name);
    }
    //hashCode
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + number;
        return result;
    }

}

public class ex01 {
    public static void main(String[] args) throws Exception {
        Car ex1 = new Car( "car1", 1111 );
        Car ex2 = new Car( "car1", 1111 );
        Car ex3 = new Car( "car2", 2222 );

        System.out.println( ex1 );
        System.out.println( ex2 );
        System.out.println( ex3 );
        System.out.println( ex1 == ex2 );
        System.out.println( ex1.equals(ex2) );

        HashMap< Car, String> hm1 = new HashMap<>(); //hashMap생성
        //<ex1, "data1">  put
        hm1.put(ex1, "data1");
        //<ex2, "data2">  put
        hm1.put(ex2, "data2");
        //<ex3, "data3">  put
        hm1.put(ex3, "data3");
        //  hm1 출력
        System.out.println(hm1);

    }
}
