import java.util.Scanner;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		int option,priority, flag = 1;
		//Integer[] listItem = new Integer[10] ;
		Integer item = null, del = null;
		Scanner sc = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		Prioritizer<Integer> p1 = new Prioritizer1<Integer>();
		Prioritizer<Integer> p2 = new Prioritizer2<Integer>();
		Prioritizer<Integer> p3 = new Prioritizer3<Integer>();
		
		System.out.println("Select one of the prioritizer");
		System.out.println("1) Prioritizer1");
		System.out.println("2) Prioritizer2");
		System.out.println("3) Prioritizer3");
		while(!sc.hasNextInt()) {
			sc.next();
		}
		priority = sc.nextInt();
		
		
		while(flag == 1) {
			
			System.out.println("Select one of the options");
			System.out.println("1) Insert");
			System.out.println("2) Remove Any");
			System.out.println("3) Remove Next In Index");
			System.out.println("4) Get Size");
			System.out.println("5) Exit");
			
			while(!sc.hasNextInt()) {
				sc.next();
			}
			option = sc.nextInt();
			
			if(priority == 1)
			{
				if(option == 1)
				{
					if(p1.isInInsertionPhase())
					{
						System.out.println("Enter the number you want to insert");
						item = (Integer)input.nextInt();
						p1.insert(item);
					}
					else
					{
						p1.changePhase();
						System.out.println("Enter the number you want to insert");
						item = (Integer)input.nextInt();
						p1.insert(item);
					}
				}
				else if(option == 2)
				{
					if(p1.isInInsertionPhase())
					{
						p1.changePhase();
						System.out.println("Enter the number you want to remove");
						del = (Integer)input.nextInt();
						p1.removeAny(del);

					}
					else
					{
						System.out.println("Enter the number you want to remove");
						del = (Integer)input.nextInt();
						p1.removeAny(del);
					}
				}
				else if(option == 3)
				{
					if(p1.isInInsertionPhase())
					{
						p1.changePhase();
						p1.removeNextInOrder();
					}
					else
					{
						p1.removeNextInOrder();
					}
				}
				else if(option == 4)
				{
					System.out.println("Size of the array is"+p1.getSize());
				}
				else
				{
					flag = 0;
					break;
				}
			}
			else if(priority == 2)
			{
				if(option == 1)
				{
					if(p2.isInInsertionPhase())
					{
						System.out.println("Enter the number you want to insert");
						item = (Integer)input.nextInt();
						p2.insert(item);
					}
					else
					{
						p2.changePhase();
						System.out.println("Enter the number you want to insert");
						item = (Integer)input.nextInt();
						p2.insert(item);
					}
				}
				else if(option == 2)
				{
					if(p2.isInInsertionPhase())
					{
						p2.changePhase();
						System.out.println("Enter the number you want to remove");
						del = (Integer)input.nextInt();
						p2.removeAny(del);

					}
					else
					{
						System.out.println("Enter the number you want to remove");
						del = (Integer)input.nextInt();
						p2.removeAny(del);
					}
				}
				else if(option == 3)
				{
					if(p2.isInInsertionPhase())
					{
						p2.changePhase();
						p2.removeNextInOrder();
					}
					else
					{
						p2.removeNextInOrder();
					}
				}
				else if(option == 4)
				{
					System.out.println("Size of the array is"+p2.getSize());
				}
				else
				{
					flag = 0;
					break;
				}
			}
			else if(priority == 3)
			{
				if(option == 1)
				{
					if(p3.isInInsertionPhase())
					{
						System.out.println("Enter the number you want to insert");
						item = (Integer)input.nextInt();
						p3.insert(item);
					}
					else
					{
						p3.changePhase();
						System.out.println("Enter the number you want to insert");
						item = (Integer)input.nextInt();
						p1.insert(item);
					}
				}
				else if(option == 2)
				{
					if(p3.isInInsertionPhase())
					{
						p3.changePhase();
						System.out.println("Enter the number you want to remove");
						del = (Integer)input.nextInt();
						p3.removeAny(del);

					}
					else
					{
						System.out.println("Enter the number you want to remove");
						del = (Integer)input.nextInt();
						p3.removeAny(del);
					}
				}
				else if(option == 3)
				{
					if(p3.isInInsertionPhase())
					{
						p3.changePhase();
						p3.removeNextInOrder();
					}
					else
					{
						p3.removeNextInOrder();
					}
				}
				else if(option == 4)
				{
					System.out.println("Size of the array is"+p3.getSize());
				}
				else
				{
					flag = 0;
					break;
				}
			}
		}
	}
}
