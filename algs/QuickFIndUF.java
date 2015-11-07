import java.util.Scanner;
public class QuickFindUF {
	public static int[] id = new int[]{1,2,3,4,5,6,7,8,9,10};
	public static boolean connected(int p, int q) {
		return id[p] == id[q];
	}
	public static void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];
		for(int i = 0; i < id.length; i++) {
			if(id[i] == pid) {
				id[i] = qid;
			}
		}
	} 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		while(running) {
			System.out.println("Connect Query (1), Union (2), or Quit(3)?");
			//int choice = sc.nextInt();
			int choice = 2;
			int node1 = 3;
			int node2 = 5;
			running = false;
			if(choice == 1) {
				System.out.println("First Node?");
				//int node1 = sc.nextInt();
				System.out.println("Second Node?");
				//int node2 = sc.nextInt();
				System.out.println(connected(node1, node2));
			}
			else if(choice == 2) {
				System.out.println("First Node?");
				//int nod e1 = sc.nextInt();
				System.out.println("Second Node?");
				//int node2 = sc.nextInt();
				union(node1, node2);
				for(int i = 0; i < id.length; i++) {
					System.out.println(id[i]);
				}
			}
			else if(choice == 3) {
				running = false;
				System.out.println("Goodbye.");
			}
			else {
				System.out.println("Invalid input.");
			}
		}
	}
}