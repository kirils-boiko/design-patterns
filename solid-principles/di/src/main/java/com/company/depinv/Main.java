package com.company.depinv;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Message msg = new Message("My message");
		MessagePrinter printer = new MessagePrinter();

		try (PrintWriter writer = new PrintWriter(new FileWriter("test_msg.txt"))) {
			printer.writeMessage(msg, new JSONFormatter(), writer);
		}

		msg = new Message("My other message");
		try (PrintWriter writer = new PrintWriter(new FileWriter("test_msg_other.txt"))) {
			printer.writeMessage(msg, new TextFormatter(), writer);
		}

		msg = new Message("My message printed to console");
		try (PrintWriter writer = new PrintWriter(System.out)) {
			printer.writeMessage(msg, new JSONFormatter(), writer);
		}

	}

}
