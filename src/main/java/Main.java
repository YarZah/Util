public class Main {
    public static void main(String[] arg) {
        int array[] = new int[]{3, 2, -6, 7, 2, 4};
        int t = 2;
        int[] result = Util.removeElement(array, t);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
