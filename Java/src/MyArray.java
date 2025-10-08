import java.util.Arrays;

public class MyArray {
    private int[] array = {};

    public MyArray() {
        int defaultSize = 10;
        array = new int[defaultSize];
        System.out.println("기본 크기 10인 배열이 생성되었습니다.");
    }

    public MyArray(int size) {
        array = new int[size];
        System.out.println("입력된 크기 " + size + "인 배열이 생성되었습니다.");
    }

    public void insert(int index, int num) {
        if(index < array.length)
            array[index] = num;
        else
            System.out.println("잘못된 인덱스 값입니다. 다시 입력해주세요.");
    }

    public void delete(int target) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == target)
                array[i] = 0;
        }
    }

    public int search(int target) {
        int result = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == target)
                result = array[i];
        }

        if(result == 0){
            System.out.println("요청한 자료를 찾지 못하였습니다.");
            return -1;
        }
        else
            return result;
    }

    public void printArray() {
        System.out.print("배열출력: ");
        for(int j : array) {
            System.out.print(j + " ");
        }
    }
}
