class saudaraku {
	
	void nama() {
		System.out.println("Nama-nama saudaraku : ");
	}	

}

class pertama extends saudaraku {
	
	void nama() {
		System.out.println("Ridwan");
	}
}

class kedua extends saudaraku {
	
	void nama() {
		System.out.println("Nagita");
	}
}


class polymorphism{
	
	public static void main(String[] args) {
		saudaraku s = new saudaraku();
		s.nama();
		
		
		saudaraku p = new pertama();
		p.nama();
		
		saudaraku k = new kedua();
		k.nama();
	}
}
