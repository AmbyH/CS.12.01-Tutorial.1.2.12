public class Successors {
    public static Position findPosition(int num, int[][] arr) {
        Position out = new Position(arr.length, arr[0].length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == num) {
                    out = new Position(i, j);
                    return out;
                }
            }
        }
        return null;
    }

    public static Position[][] getSuccessorArray(int[][] arr) {
        Position[][] out = new Position[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                out[i][j] = findPosition(arr[i][j] + 1, arr);
            }
        }
        return out;
    }
}
