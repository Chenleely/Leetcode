import array.move_zero;

public class Test {
    public static void main(String[] args) {
        int[] test={0,1,0,3,12};
        for(int num:test){
            System.out.print(num+"  ");
        }
        System.out.println("");
        move_zero move_zero=new move_zero();
        move_zero.moveZeroes(test);
        for(int num:test){
            System.out.print(num+"  ");
        }
    }
}