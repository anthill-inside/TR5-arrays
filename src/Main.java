//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        for (int i = 1; i <= 10; i++) {
//            for(int j = 10;j >= i;j--){
//                System.out.print("*"+ "\t");
//            }
//            System.out.println();
//        }

        int min=1,max=10;

        for (int i = min; i <= max; i++) {
            for(int j = min;j <= max;j++){
                if(i>=max-j+1 && i>=j){
                    System.out.print("*"+ "\t");
                }else{
                    System.out.print(0 + "\t");
                }
            }
            System.out.println();
        }
    }
}