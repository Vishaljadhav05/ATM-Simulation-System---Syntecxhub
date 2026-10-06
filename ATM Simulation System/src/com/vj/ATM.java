package com.vj;

import java.util.Scanner;

public class ATM
{

	private int balance;

	public ATM(int initialBalance)
	{

		this.balance = initialBalance;

	}

	public static void waitForEnter() 
	{

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		scanner.nextLine(); // This will wait for the user to press enter

	}

	public int getBalance() 
	{

		return this.balance;

	}

	public boolean withdraw(int amount) 
	{

		if (amount > this.balance)
		{

			return false;

		}

		this.balance -= amount;

		return true;

	}

	public void deposit(int amount) 
	{

		this.balance += amount;

	}

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{

		Scanner scanner = new Scanner(System.in);

		// Create an ATM object with an initial balance of $1000

		ATM atm = new ATM(1000);

		while (true) 
		{

			System.out.println("1. View Balance");

			System.out.println("2. Withdraw");

			System.out.println("3. Deposit");

			System.out.println("4. Exit");

			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();

			switch (choice) 
			{

			case 1:

				System.out.println("Your balance is: $" + atm.getBalance());

				waitForEnter();

				break;

			case 2:

				System.out.print("Enter the amount to withdraw: ");

				int withdrawAmount = scanner.nextInt();

				boolean success = atm.withdraw(withdrawAmount);

				if (success) 
				{

					System.out.println("Withdrawal successful.");

				} else 
				{

					System.out.println("Insufficient balance.");

				}

				waitForEnter();

				break;

			case 3:

				System.out.print("Enter the amount to deposit: ");

				int depositAmount = scanner.nextInt();

				atm.deposit(depositAmount);

				System.out.println("Deposit successful.");

				waitForEnter();

				break;

			case 4:

				System.out.println("Thank you for using the ATM!");

				System.exit(0);

			default:

				System.out.println("Invalid choice.");

				break;

			}

		}

	}

}



// Output:-

/*
 
1. View Balance
2. Withdraw
3. Deposit
4. Exit
Enter your choice: 1
Your balance is: $1000

1. View Balance
2. Withdraw
3. Deposit
4. Exit
Enter your choice: 2
Enter the amount to withdraw: 500
Withdrawal successful.

1. View Balance
2. Withdraw
3. Deposit
4. Exit
Enter your choice: 1
Your balance is: $500

1. View Balance
2. Withdraw
3. Deposit
4. Exit
Enter your choice: 3
Enter the amount to deposit: 1000
Deposit successful.

1. View Balance
2. Withdraw
3. Deposit
4. Exit
Enter your choice: 1
Your balance is: $1500

1. View Balance
2. Withdraw
3. Deposit
4. Exit
Enter your choice: 4
Thank you for using the ATM!
 
*/
