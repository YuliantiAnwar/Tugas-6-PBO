class sepatu {
	String warna;
	
	String getWarna() {
		return warna;
	}
}

class  Adidas extends sepatu{
	public static void main(String[] args) {
		Adidas a = new Adidas();
		a.setWarna("pink");
		System.out.println(a.getWarna());
	}
	//method untuk set variabel warna
	void setWarna(String warna) {
		this.warna=warna;
	}
}
