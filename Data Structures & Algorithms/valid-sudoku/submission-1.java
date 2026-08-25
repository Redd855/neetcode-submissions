class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<Character> rowCount = new ArrayList<>();
        List<Character> columnCount = new ArrayList<>();
        ArrayList<Character>[][] quadrantCount = new ArrayList[3][3];

        // Check rows and quadrants
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                char c = board[i][j];

                if (c != '.') {
                    if (!rowCount.contains(c)) {
                        rowCount.add(c);
                    }
                    else {
                        return false;
                    }

                    int quadrantRow = i / 3;
                    int quadrantColumn = j / 3;

                    if (quadrantCount[quadrantRow][quadrantColumn] == null) {
                        quadrantCount[quadrantRow][quadrantColumn] = new ArrayList<>();
                    }

                    if (!quadrantCount[quadrantRow][quadrantColumn].contains(c)) {
                        quadrantCount[quadrantRow][quadrantColumn].add(c);
                    }
                    else {
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
                    if (!columnCount.contains(c)) {
                        columnCount.add(c);
                    }
                    else {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}