import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class RatingsDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		HashMap<String, RatingStats> ratings = new HashMap<String, RatingStats>(10);
		
		Scanner inputStream = new Scanner(new FileInputStream("ratings.txt"));
		inputStream.nextLine();
		String title = inputStream.nextLine();
		double number = inputStream.nextDouble();

		ratings.put(title, new RatingStats(number));
		while (inputStream.hasNextLine()) {
			inputStream.nextLine();

			title = inputStream.nextLine();
			number = inputStream.nextDouble();
			if(!(ratings.containsKey(title))) {
				ratings.put(title, new RatingStats(number));
			} else {
				RatingStats e = ratings.get(title);
				e.addRatingsSum(number);
				e.addRatingsCount();
			}

		}
		Set<String> movies = ratings.keySet();
		for(String movieName: movies) {
			System.out.print(movieName + ": ");
			RatingStats f = ratings.get(movieName);
			System.out.print(f.toString());
			System.out.println();
			
		}
		inputStream.close();
	}

}
