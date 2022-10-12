import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
class Main {
	private static boolean q = true;
	private static ArrayList<String> arrayList = new ArrayList<>();
	public static void main(String[] args) throws FileNotFoundException {
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);
		Scanner scanner = new Scanner(System.in);

		cStudents(fileScanner);

		do{
			pMenu();
			oMenu(scanner.nextInt());
		}while(q);
		scanner.close();
	}

	public static void pMenu(){
		System.out.println("Press 1 to learn about salary.\nPress 2 to learn about the job.\nPress 3 to learn about demand.\nPress 4 to view current students.\nPress 5 to quit");
	}
	public static void oMenu(int i){
		switch(i){
			case 1:
				System.out.println("$98,345 average salary in South Florida!");
				break;
			case 2:
				System.out.println("US News - 100 Best Jobs!");
				break;
			case 3:
				System.out.println("Top 10 Forbes In-Demand Jobs!");
				break;
			case 4:
				System.out.println("Current Students:");
				arrayList.forEach(System.out::println);
				break;
			case 5:
				q = false;
				break;
		}
	}
	public static void cStudents(Scanner fs) throws FileNotFoundException{
		while(fs.hasNextLine()){
			arrayList.add(fs.nextLine());
		}
	}
}