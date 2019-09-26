package listener;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class LunchListener extends ListenerAdapter {
	@Override
	public void onMessageReceived(MessageReceivedEvent event) {

		String msg = event.getMessage().getContentRaw();

		if (msg.startsWith("!yy")) {
			int idx = msg.indexOf(" ");
			if (idx < 0) {
				event.getChannel().sendMessage("안녕하세요 현창봇입니다. 도움을 원하시면 !yy help 를 입력하세요").queue();
				return;
			}
			String cmd = msg.substring(idx + 1);
			idx = cmd.indexOf(" ");
			String param = "";
			if(idx > 0) {
				param = cmd.substring(idx + 1);
				cmd = cmd.substring(0,idx);
			}
			switch(cmd) {
			case "echo":
				if(param == "") {
					sayMsg("echo 명령어는 메아리 할 말을 입력하셔야 합니다.", event);
				}else {
					sayMsg(param, event);
				}
				break;
			case "help":
				if(param == "") {
					sayMsg("글을 쓰셔야 합니다.",event);
				
				}
			}
		}
	}

	private void sayMsg(String msg, MessageReceivedEvent e) {
		e.getChannel().sendMessage(msg).queue();

	}
}
