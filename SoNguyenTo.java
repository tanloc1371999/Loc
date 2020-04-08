package SoHoc;

public class SoNguyenTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cac so nguyen to nho hon 1000 la: ");
		for(int i = 0;i < 1000; i++) {
			if (isPrimeNumber(i)) {
			System.out.println(i + " ");	
			}
		}
	}
	public static boolean isPrimeNumber (int n) {
	if ( n < 2) {
		return false;
	}
		int squareRoot = (int) Math.sqrt(n);
		for (int i = 2; i <= squareRoot; i++) {
			if (n % i == 0) {
		return false;
			}
		}
		return true;
	}
	}

	
