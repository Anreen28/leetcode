import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];
        
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<Character>();
            cols[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];

                if (current == '.') continue;

                if (rows[i].contains(current)) {
                    return false;
                } else {
                    rows[i].add(current);
                }

                if (cols[j].contains(current)) {
                    return false;
                } else {
                    cols[j].add(current);
                }

                int boxIndex = (i / 3) * 3 + (j / 3);
                if (boxes[boxIndex].contains(current)) {
                    return false;
                } else {
                    boxes[boxIndex].add(current);
                }
            }
        }

        return true;
    }
}
