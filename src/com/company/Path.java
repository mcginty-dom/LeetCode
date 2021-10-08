package com.company;

import java.util.HashSet;
import java.util.Set;

public class Path {
    private static final int DUMMY_INT = 0;
    private static final boolean DUMMY_BOOL = false;

    //UNIQUE PATHS

    //Medium - https://leetcode.com/problems/unique-paths/
    public int uniquePaths(int m, int n) {
        return DUMMY_INT;
    }

    //Medium - https://leetcode.com/problems/unique-paths-ii/
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return DUMMY_INT;
    }

    //Hard - https://leetcode.com/problems/unique-paths-iii/
    public int uniquePathsIII(int[][] grid) {
        return DUMMY_INT;
    }

    //SHORTEST PATHS

    //Medium - https://leetcode.com/problems/shortest-path-in-binary-matrix/
    public int shortestPathBinaryMatrix(int[][] grid) {
        return DUMMY_INT;
    }

    //Medium - https://leetcode.com/problems/minimum-path-sum/
    public int minPathSum(int[][] grid) {
        return DUMMY_INT;
    }

    //Medium - https://leetcode.com/problems/path-with-minimum-effort/
    public int minimumEffortPath(int[][] heights) {
        return DUMMY_INT;
    }

    //Hard - https://leetcode.com/problems/shortest-path-to-get-all-keys/
    public int shortestPathAllKeys(String[] grid) {
        return DUMMY_INT;
    }

    //Hard - https://leetcode.com/problems/shortest-path-in-a-grid-with-obstacles-elimination/
    public int shortestPath(int[][] grid, int k) {
        return DUMMY_INT;
    }

    //LONGEST PATHS

    //Medium - https://leetcode.com/problems/path-with-maximum-gold/
    public int getMaximumGold(int[][] grid) {
        return DUMMY_INT;
    }

    //Hard - https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
    public int longestIncreasingPath(int[][] matrix) {
        return DUMMY_INT;
    }

    //VALID PATHS

    //Easy - https://leetcode.com/problems/path-crossing/
    //Constraints:
    //  1 <= path.length <= 10^4
    //  path[i] is either 'N', 'S', 'E', or 'W'.
    //Return:
    //  true if you are on a location you have previously visited
    //  false otherwise
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        Set<String> locations = new HashSet<String>();

        //starting point
        locations.add("(0,0)");

        //for every char
        for (char c : path.toCharArray()) {

            //translate char to vector
            switch (c) {
                case 'N':
                    y++;
                    break;
                case 'E':
                    x++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'W':
                    x--;
                    break;
            }

            //if it is a unique location, then add to locations else return paths have been crossed
            String location = "("+x+","+y+")";
            if (!locations.contains(location)) {
                locations.add(location);
            } else {
                return true;
            }
        }

        //if all visited locations have been unique, return false
        return false;
    }

    //Easy - https://leetcode.com/problems/find-if-path-exists-in-graph/
    public boolean validPath(int n, int[][] edges, int start, int end) {
        return DUMMY_BOOL;
    }

    //Medium - https://leetcode.com/problems/check-if-there-is-a-valid-path-in-a-grid/
    public boolean hasValidPath(int[][] grid) {
        return DUMMY_BOOL;
    }

    //Medium - https://leetcode.com/problems/path-with-maximum-probability/
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        return (double) DUMMY_INT;
    }

}
