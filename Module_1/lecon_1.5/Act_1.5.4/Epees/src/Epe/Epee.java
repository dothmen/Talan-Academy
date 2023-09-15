package Epe;

public class Epee {

	public static void main(String[] args) {
		String[] collegues = {"Alice", "Bob", "Charlie", "David", "Eve"};

        int N = collegues.length;
        boolean permute;

        do {
            permute = false;

            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    int l1 = collegues[i].length();
                    int l2 = collegues[j].length();
                    int min = Math.min(l1, l2);

                    for (int k = 0; k < min; k++) {
                        if (collegues[i].charAt(k) > collegues[j].charAt(k)) {
                         
                            String temp = collegues[i];
                            collegues[i] = collegues[j];
                            collegues[j] = temp;
                            permute = true;
                            break;
                        }
                    }
                }
            }
            
            N--;
        } while (N > 1 && permute);

        System.out.println("Tableau trié : " + Arrays.toString(collegues));
       
    }

	
	}


