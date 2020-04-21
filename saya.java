class Mahasiswa {
	int semester=2;
	
	int getSemester() {
		return semester;
	}
}

class saya extends Mahasiswa{
	public static void main(String[] args) {
		saya s = new saya();
		System.out.println(s.getSemester());
	}

}

