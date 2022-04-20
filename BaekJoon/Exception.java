package ifexamole;

public class javatest {

    public static void main(String[] args) {
        try{
            int i = 0;
            System.out.println("값을 입력해주세요.");
            Scanner instr = new Scanner(System.in);
            i = instr.nextINt();

            int[] numbers = {1,2,3,4,5};
            System.out.println("요청된 값"+number[i]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("특정오류만 잡혔습니다.");
            System.out.println("오류내용은, "+getMessage());
        }
    }
}