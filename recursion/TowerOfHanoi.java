package recursion;

class TowerOfHanoi {

    public int towerOfHanoi(int n, int from, int to, int aux) {

        if (n == 0) {
            return 0;
        }

        int count = 0;

        count += towerOfHanoi(n - 1, from, aux, to);

        System.out.println("Move disk " + n +
                " from rod " + from +
                " to rod " + to);
        count++;

        count += towerOfHanoi(n - 1, aux, to, from);

        return count;
    }

    public static void main(String[] args) {
        int n = 3;
        int from = 1, to = 3, aux = 2;

        TowerOfHanoi obj = new TowerOfHanoi();

        int totalMoves = obj.towerOfHanoi(n, from, to, aux);

        System.out.println("Total moves: " + totalMoves);
    }
}
