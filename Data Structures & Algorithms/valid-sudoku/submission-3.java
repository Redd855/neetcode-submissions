class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<Character> rowCount = new HashSet<>();
        Set<Character> columnCount = new HashSet<>();
        HashSet<Character>[][] quadrantCount = new HashSet[3][3];

        // Check rows and quadrants
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                char c = board[i][j];

                if (c != '.') {

                    if (!rowCount.add(c)) {
                        return false;
                    }

                    int quadrantRow = i / 3;
                    int quadrantColumn = j / 3;

                    if (quadrantCount[quadrantRow][quadrantColumn] == null) {
                        quadrantCount[quadrantRow][quadrantColumn] = new HashSet<>();
                    }

                    if (!quadrantCount[quadrantRow][quadrantColumn].add(c)) {
                        return false;
                    }
                }
            }

            rowCount.clear();
        }

        // Check columns
        for (int j = 0; j < board[0].length; j++) {
            columnCount.clear();

            for (int i = 0; i < board.length; i++) {

                char c = board[i][j];

                if (c != '.') {
                    if (!columnCount.add(c)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}