
public class ArrayAppl {
    public static void main(String[] args) {
        int[] Arr = new int[10];
        printArray(Arr);
        fillArray(Arr,1,5);
        printArray(Arr);
        System.out.println(sumArray(Arr));
        System.out.println(avgArray(Arr));
        System.out.println(max(Arr));
        System.out.println(searchFirst(Arr,4));
        printArray(search(Arr,4));

    }
    public static void printArray(int[] Arr){
        for (int i=0;i<Arr.length;i++){
            System.out.println("["+i+"]= "+Arr[i]);
        }
    }
    public static int sumArray(int[] Arr){
        int summ = 0;
        for (int j : Arr) {
            summ += j;
        }
        return summ;
    }

    public static int max(int[] Arr){
        int max = Arr[0];
        for (int j : Arr) {
            if(max<j){
                max = j;
            }
        }
        return max;
    }
    public static double avgArray(int[] Arr){
        return sumArray(Arr)/(Arr.length*1.0);
    }
    public static void fillArray(int[] Arr,int from, int to){
        for (int i=0;i<Arr.length;i++){
            Arr[i] = (int) (from + Math.random()*(to-from+1));
        }
    }

    public static int searchFirst(int[] Arr,int value){
        for (int i=0;i<Arr.length;i++){
            if(Arr[i]==value){
                return i;
            }
        }
        return -1;
    }

    public static int[] search(int[] Arr,int value){
        int[] result = new int[0];
        for (int i=0;i<Arr.length;i++){
            if(Arr[i]==value){
                result = push(result,i);
            }
        }
        return result;
    }

    private static int[] push(int[] Arr, int value) {
        int[] longer = new int[Arr.length + 1];
        System.arraycopy(Arr, 0, longer, 0, Arr.length);
        longer[Arr.length] = value;
        return longer;
    }

}
