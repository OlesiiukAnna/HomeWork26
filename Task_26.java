package home.Task_26;

/*
You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water.
Grid cells are connected horizontally/vertically (not diagonally).
The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
The island doesn't have "lakes" (water inside that isn't connected to the water around the island).
One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100.
Determine the perimeter of the island.
 */
class Task_26 {
    static int calculatePerimeter(int[][] grid) {
        int perimeter = 0;
        for (int[] row : grid) {
            int previousNumberInRow = 0;
            for (int value : row) {
                if (value == 1 && previousNumberInRow == 0) {
                    perimeter += 2;
                }
                previousNumberInRow = value;
            }
        }
        for (int i = 0; i < grid[0].length; i++) {
            int previousNumberInColumn = 0;
            for (int[] ints : grid) {
                if (ints[i] == 1 && previousNumberInColumn == 0) {
                    perimeter += 2;
                }
                previousNumberInColumn = ints[i];
            }
        }
        return perimeter;
    }
}
