import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<BankAccount> ba = new ArrayList<>();
		ArrayList<BankTransactions> bt = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		try {
			File input1 = new File("bankaccount.txt");
			Scanner d1 = new Scanner(input1);
			d1.nextLine();
			while (d1.hasNextLine()) {
				String[] data1 = d1.nextLine().split(",");
				ba.add(new BankAccount(data1[0], Integer.parseInt(data1[1]), data1[2], data1[3], data1[4],Integer.parseInt(data1[5])));
			}
			d1.close();
		} catch (FileNotFoundException e) {
			System.out.println("BankAccount File is not found");
			e.printStackTrace();
		}
		try {
			File input2 = new File("banktransactions.txt");
		    Scanner d2 = new Scanner(input2);
		    d2.nextLine();
		    while (d2.hasNextLine()) {
		    	String[] data2 = d2.nextLine().split(",");
		    	bt.add(new BankTransactions(data2[0],data2[1],Integer.parseInt(data2[2])));
		    }
		    d2.close();
		} catch (FileNotFoundException e) {
			System.out.println("Bank Transactions file is not found");
			e.printStackTrace();
		}
		System.out.println("Enter the input name");
		String inputName=sc.nextLine();
		System.out.format("%-15s%-15s%-15s%-15s%-15s%-20s%-20s\n","SNo","Name","Bank","Age","Gender","Transaction Date","Transaction Amount");
		int i = 1;
		Collections.sort(bt);
		Set<String> hs=new HashSet<>();
		for (BankAccount bao : ba)
		{
			if (bao.getName().equals(inputName))
			{
			    String bankName=bao.getBank();
			    if(!hs.contains(bankName))
			    {
			        for(BankAccount bao1 : ba)
			        {
			            if(bao1.getName().equals(inputName)&&bao1.getBank().equals(bankName))
			            {
			                System.out.format("%-15d%-15s", i, inputName);
    				        for (BankTransactions bto : bt)
    				        {
    					        if (bao1.getCn().equals(bto.getCn()))
    					        {
    					            System.out.format("%-15s%-15d%-15s%-20s%-20d\n",bankName,bao.getAge(),bao.getGender(),bto.getTd(), bto.getAmt());
    					            System.out.format("%-15s%-15s", " ", " ");
    					        }
    				        }
    				        System.out.println();
    				        i++;
			            }
			        }
			        hs.add(bankName);
			    }
			}
		}
	}
}
