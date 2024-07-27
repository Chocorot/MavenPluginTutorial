import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class PingCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (strings.length == 1) {
            String message = strings[0];
            commandSender.sendMessage("Pong:" + message);
        }else {
            commandSender.sendMessage("Pong");
        }

        return false;
    }
}
