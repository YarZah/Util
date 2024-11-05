public class Util {
    public static int[] removeElement(int[] array, int t){
        int Arrlen = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] == t){
                continue;
            }
            Arrlen++ ;
        }
        int[] newArr = new int[Arrlen];
                int ArrIdx = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == t){
                continue;
            }
            newArr[ArrIdx] = array[i];
            ArrIdx++ ;
        }
        return newArr;
    }
    public static void main (String[] arg){
        int arr[] = new int[]{3, 2, -6, 7, 2, 4};
        int t = 2;
    }

}
