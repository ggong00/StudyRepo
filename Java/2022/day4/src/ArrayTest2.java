public class ArrayTest2 {
    public static void main(String[] args) {
//        디폴트값을 원하는 값으로 초기화해서 배열 생성하기
//        int[] subject = new int[] {70, 80,90};
        int[] subject;
        subject = new int[] {70, 80, 90}; // 배열선언과 생성을 분리할 수 있다.
        System.out.println(subject[0]);
        System.out.println(subject[1]);
        System.out.println(subject[2]);


        int[] subject2 = {70 ,80, 90};  //배열선언과 배열생성을 분리할수 없다.
//        int[] subject2;
//        subject2 = {70,80,90};
        System.out.println(subject2[0]);
        System.out.println(subject2[1]);
        System.out.println(subject2[2]);
    }
}
