class Check {
	
	public char[][] grid = new char[3][3];
	
	Check() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				this.grid[i][j] = '-';
			}
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
	
	public boolean firstRow(char option) {
		if(this.grid[0][0] == option && this.grid[0][1] == option && this.grid[0][2] == option) {
			return true;
		}
		return false;
	}
	
	public boolean secondRow(char option) {
		if(this.grid[1][0] == option && this.grid[1][1] == option && this.grid[1][2] == option) {
			return true;
		}
		return false;
	}
	
	public boolean thirdRow(char option) {
		if(this.grid[2][0] == option && this.grid[2][1] == option && this.grid[2][2] == option) {
			return true;
		}
		return false;
	}
	
	public boolean firstColumn(char option) {
		if(this.grid[0][0] == option && this.grid[1][0] == option && this.grid[2][0] == option) {
			return true;
		}
		return false;
	}
	
	public boolean secondColumn(char option) {
		if(this.grid[0][1] == option && this.grid[1][1] == option && this.grid[2][1] == option) {
			return true;
		}
		return false;
	}
	
	public boolean thirdColumn(char option) {
		if(this.grid[0][2] == option && this.grid[1][2] == option && this.grid[2][2] == option) {
			return true;
		}
		return false;
	}
	
	public boolean rightDiagonal(char option) {
		if(this.grid[0][0] == option && this.grid[1][1] == option && this.grid[2][2] == option) {
			return true;
		}
		return false;
	}
	
	public boolean leftDiagonal(char option) {
		if(this.grid[0][2] == option && this.grid[1][1] == option && this.grid[2][0] == option) {
			return true;
		}
		return false;
	}
	
}
