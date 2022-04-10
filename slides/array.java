public class array {

    public array() {

        int[] arr = new int[10];
        // Later on we decide arr needs to be larger.
        int[] newArr = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++)
            newArr[i] = arr[i];
        arr = newArr;

    }
}
