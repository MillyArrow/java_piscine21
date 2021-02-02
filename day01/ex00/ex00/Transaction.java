package ex00;

import java.util.UUID;

enum TransferType {
	debits,
	credits
}

public class Transaction {
	private final UUID Identifier = UUID.randomUUID();
	private final ex00.User Recipient;
	private final ex00.User Sender;
	private final TransferType Category;
	private final Integer Amount;

	Transaction() {
		Recipient = new ex00.User();
		Sender = new ex00.User();
		Category = TransferType.debits;
		Amount = 0;
	}

	Transaction(User recipient, User sender, TransferType category, Integer amount) {
		Recipient = recipient;
		Sender = sender;
		Category = category;
		Amount = amount;
	}

	public Integer getAmount() {
		return Amount;
	}

	public ex00.TransferType getCategory() {
		return Category;
	}

	public ex00.User getRecipient() {
		return Recipient;
	}

	public ex00.User getSender() {
		return Sender;
	}

	public UUID getIdentifier() {
		return Identifier;
	}

	public void Transfer() {
		Recipient.setBalance(Recipient.getBalance() + Amount);
		Sender.setBalance(Sender.getBalance() - Amount);
	}

	public void print() {
		System.out.println("Recipient:");
		Recipient.print();
		System.out.println("Sender:");
		Sender.print();
		System.out.println("Card category: " + Category);
		System.out.println("Amount: " + Amount);
	}
}