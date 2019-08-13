package myspring.di.annot;

import org.springframework.stereotype.Component;

@Component("consolPrinter")
public class ConsolPrinter implements Printer {

	@Override
	public void print(String message) {
		System.out.println(message);
	}

}
