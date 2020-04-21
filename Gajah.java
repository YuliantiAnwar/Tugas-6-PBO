class Hewan {
	int umur=20;
	
	int getUmur() {
		return umur;	
	}
}

class Gajah extends Hewan {
	
	int getUmur() {
		return 22;	
	}

	public static void main(String[] args){
		Gajah g = new Gajah();
		System.out.println(g.getUmur());	
	}
	

}
