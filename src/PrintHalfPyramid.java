public class PrintHalfPyramid {

    public static void printHalfPyramid(int row){

        for(int i=1; i<=row; i++){
            for(int j= 1; j<=i; j++){
                System.out.print("* ");
            }System.out.println();
        }
        System.out.println();

    }


    public static void main(String[] args) {
        printHalfPyramid(4);

    }
}
