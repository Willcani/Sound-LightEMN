package sound;

public class Matrice {

	public float[] freq;
	public int n;
	public float[][] matrice;

	public Matrice(float[] f, int i) {
		this.freq = Fourier.regrouper(f, i);
		this.n = i;
		this.construireMatrice();
	}

	public void construireMatrice() {
		this.matrice = new float[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n - i; j++) {
<<<<<<< HEAD
				float f = this.freq[i];
				matrice[i][j] = f;
				matrice[j][i] = f;
				matrice[n - i - 1][n - j - 1] = f;
				matrice[n - j - 1][n - i - 1] = f;
			}
		}

	}

	public void construireMatriceNulle() {
		this.matrice = new float[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				matrice[i][j] = 0;

=======
				float f =  this.freq[i];
				matrice[i][j] = f;
				matrice[j][i] = f;
				matrice[n-i-1][n-j-1] =  f;
				matrice[n-j-1][n-i-1]= f;
			}
		}
		

	}
	public void construireMatriceNulle(){
		this.matrice = new float[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				
				matrice[i][j] = 0;
				
>>>>>>> origin/HEAD
			}
		}
	}

	public void afficher() {
<<<<<<< HEAD

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" " + this.matrice[i][j]);
			}
			System.out.println("");
		}

	}

	public float get(int i, int j) {
=======
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" "+this.matrice[i][j]);
			}
			System.out.println("");
		}
		
	}
	
	public float get(int i, int j){
>>>>>>> origin/HEAD
		return this.matrice[i][j];
	}

}