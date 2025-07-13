class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int res = 0;
        Arrays.sort(players);
        Arrays.sort(trainers);

        for (int i = 0; i < trainers.length; i++) {
            if (players[res] <= trainers[i] && ++res == players.length) return res;
        }

        return res;
    }
}