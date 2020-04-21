class ibu {
	String sifat="pemalu";
	
	String getSifat() {
		return sifat;
	}
}

class anak extends ibu{
	public static void main(String[] args) {
		anak a = new anak();
		System.out.println(a.getSifat());
	}

}
