package basic.static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A Count = " + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("A Count = " + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("A Count = " + data3.count);
    }
}
