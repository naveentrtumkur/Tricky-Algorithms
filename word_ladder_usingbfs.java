// Word ladder problem using Java.

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(beginWord == null || endWord == null || beginWord.length() != endWord.length())  return 0;
        HashSet<String> set = new HashSet<>(wordList);
        if(!set.contains(endWord))  return 0; //if the endword isn't present then return 0.
        Queue<String> queue = new LinkedList<>();   // For BFS.
        int step = 1;
        queue.add(beginWord);
        while(!queue.isEmpty()) {
            int n = queue.size();
            for(int i = 0; i < n; i++) {
                String curr = queue.poll();
                for(int j = 0; j < curr.length(); j++) {
                    for(char c = 'a'; c <= 'z'; c++) {
                        StringBuilder sb = new StringBuilder(curr);
                        sb.setCharAt(j, c);
                        String next = sb.toString();
                        if(next.equals(endWord))
                            return step + 1;
                        if(set.contains(next)) {
                            queue.add(next);
                            set.remove(next);
                        }
                    }
                }
            }
            step++;
        }
        return 0;
    }
}
