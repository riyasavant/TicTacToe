class Grid extends Check {
	
	public boolean input(char option, int position) {
		switch(position) {
			case 1:
				super.grid[0][0] = option;
				break;
			case 2:
				super.grid[0][1] = option;
				break;
			case 3:
				super.grid[0][2] = option;
				break;
			case 4:
				super.grid[1][0] = option;
				break;
			case 5:
				super.grid[1][1] = option;
				break;
			case 6:
				super.grid[1][2] = option;
				break;
			case 7:
				super.grid[2][0] = option;
				break;
			case 8:
				super.grid[2][1] = option;
				break;
			case 9:
				super.grid[2][2] = option;
				break;
		}
		
		if(super.checkForWinner(option)) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
