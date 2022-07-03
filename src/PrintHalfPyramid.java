public class PrintHalfPyramid {

    public static void printHalfPyramid(int row){
        //until reaches row number
        for(int i=1; i<=row; i++){
            // if i = 1, j=1 and will print *, but wont print more
            // as j's limit is till i, so for every iteration its i numbers of * only.
            for(int j= 1; j<=i; j++){
                System.out.print("* ");
            }//cursor changers everytime it prints one iteration
            System.out.println();
        }
        System.out.println();

    }


    public static void main(String[] args) {
        printHalfPyramid(4);

    }
}
