package dbot;

import listener.LunchListener;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;

public class MainApp {
	public static void main(String[] args) {
		JDABuilder builder = new JDABuilder(AccountType.BOT);
		String token = "NjI2NjA5NzA2NTY3NDY3MDA5.XYwoQQ.CaM2Ez_sP7_5b6f6Mc5D6vdKEBs";
		builder.setToken(token);
		
		try {
			builder.addEventListeners(new LunchListener());
			builder.build();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
