package DemoOne;

class L6_11 {
	int[] sp = new int[6];
	int wp = 0;

	public void sc(int aa) {
		sp[wp] = aa;
		++wp;
	}

	public void xf() {
		int dd = sp[wp - 1];
		--wp;
	}
}
