class Solution {
     
    public boolean canReach(int[] arr, int start) {
        return dfs(arr, start, new boolean[arr.length]);
    }
    public boolean dfs(int[] arr, int curr, boolean[] visited) {
        if(curr < 0 || curr >= arr.length || visited[curr]) return false;
        if(arr[curr] == 0) return true;
        visited[curr] = true;
        return dfs(arr, curr + arr[curr], visited) || dfs(arr, curr - arr[curr], visited);
    }
}
