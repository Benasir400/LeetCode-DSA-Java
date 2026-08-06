class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
       int c = 0;
        int n = tickets.length;
        int index = 0;

        while(tickets[k] > 0) {

            if(tickets[index] > 0) {
                tickets[index]--;
                c++;
            }

            index = (index + 1) % n;
        }

        return c;
    }
}