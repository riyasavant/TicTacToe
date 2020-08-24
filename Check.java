class Check {
	
	public char[][] grid = new char[3][3];

	Check() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				this.grid[i][j] = '-';
			}
		}
	}
	
	public boolean checkForWinner(char option) {
		
		boolean firstRow = (this.grid[0][0] == option && this.grid[0][1] == option && this.grid[0][2] == option);
		boolean secondRow = (this.grid[1][0] == option && this.grid[1][1] == option && this.grid[1][2] == option);
		boolean thirdRow = (this.grid[2][0] == option && this.grid[2][1] == option && this.grid[2][2] == option);
		boolean firstColumn = (this.grid[0][0] == option && this.grid[1][0] == option && this.grid[2][0] == option);
		boolean secondColumn = (this.grid[0][1] == option && this.grid[1][1] == option && this.grid[2][1] == option);
		boolean thirdColumn = (this.grid[0][2] == option && this.grid[1][2] == option && this.grid[2][2] == option);
		boolean rightDiagonal = (this.grid[0][0] == option && this.grid[1][1] == option && this.grid[2][2] == option);
		boolean leftDiagonal = (this.grid[0][2] == option && this.grid[1][1] == option && this.grid[2][0] == option);
		
		if(firstRow || secondRow || thirdRow || firstColumn || secondColumn || thirdColumn || rightDiagonal || leftDiagonal) {
			return true;
		} else {
			return false;
		}
		
	}

	public void printGrid() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(this.grid[i][j] + "\t");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}
