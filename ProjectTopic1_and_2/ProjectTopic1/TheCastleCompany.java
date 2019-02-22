package ProjectTopic1;


public class TheCastleCompany {
	
	private Land land;

	public TheCastleCompany(Land land) {
		this.land = land;
	}
	
	public int peaks() {
		
		int[] arr = land.getArr();

        // Check for special cases
        if (arr == null) {
            return 0;
        }

        int num = 0, left, right; // num = the number of peaks

        
        for (Integer i : land) {
            boolean isPeak = true;
            // Check from left to right
            left = Math.max(0, i - 1);
            right = Math.min(arr.length - 1, i + 1);
            for (int j = left; j <= right; j++) {
                // Skip if we are on current
                if (i == j) {
                    continue;
                }
                if (arr[i] < arr[j]) {
                    isPeak = false;
                    break;
                }
            }

            if (isPeak) {
                System.out.println("The is a Peak at index " + i + " = " + arr[i]);
                num++;
                i += 1;
            }
        }

        return num;
    }
	
	public int valleys() {
		
		int[] arr = land.getArr();

        
        if (arr == null) {
            return 0;
        }

        int num = 0, left, right; // num = the number of valleys

       
        for (Integer i : land) {
            boolean isPeak = true;
            // Check from left to right
            left = Math.max(0, i - 1);
            right = Math.min(arr.length - 1, i + 1);
            for (int j = left; j <= right; j++) {
                // Skip if we are on current
                if (i == j) {
                    continue;
                }
                if (arr[i] > arr[j]) {
                    isPeak = false;
                    break;
                }
            }

            if (isPeak) {
                System.out.println("The is a Valle at index " + i + " = " + arr[i]);
                num++;
                i += 1;
            }
        }

        return num;
    }
	
	public void numberOfCastles() {
		int i = peaks() + valleys();
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Conrnerstone should build on that stretch of land " + i + " castles");
		
	}

	    

}
	
