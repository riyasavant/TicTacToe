
class Person extends Grid {
	public String name;
	public char option;
	
	//Constructor
	Person(String name, char option) {
		this.name = name;
		this.option = option;
	}
	
	public void printData() {
		System.out.println("Hey there, " + this.name + "! You chose " + this.option);
	}

}
