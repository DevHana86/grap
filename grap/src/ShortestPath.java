public class ShortestPath {
    public static Result DM_SP(int[][] graph, int start) {
        throw new UnsupportedOperationException("다익스트라 구현 전");
    }

    public static final class Result {
        public final long[] distance;
        public final int[] previous;

        public Result(long[] distance, int[] previous) {
            this.distance = distance;
            this.previous = previous;
        }
    }
}