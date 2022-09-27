import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int codigo1, codigo2, qtd1, qtd2;
		double preco1, preco2;
		
		System.out.println("-----STORE-----");
		
		System.out.println("Enter the product code:");
		codigo1 = scanner.nextInt();
		System.out.println("Enter the price of the product:");
		preco1 = scanner.nextDouble();
		System.out.println("Enter the purchased quantity of the product:");
		qtd1 = scanner.nextInt();
		
		System.out.println("Enter the code of the second product:");
		codigo2 = scanner.nextInt();
		System.out.println("Enter the price of the second product:");
		preco2 = scanner.nextDouble();
		System.out.println("Enter the purchased quantity of the second product:");
		qtd2 = scanner.nextInt();
		scanner.close();
		
		double total = (preco1 * qtd1) + (preco2 * qtd2);
		
		System.out.printf("Product code: %d. price: %.2f. purchased quantity: %d.%n", codigo1, preco1, qtd1);
		System.out.printf("Product code: %d. price: %.2f. purchased quantity: %d.%n", codigo2, preco2, qtd2);
		System.out.printf("Total purchased: %.2f", total);
		System.out.println();
		
		System.out.println("-----Thanks for shopping in our store!-----");
	}
}
