import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("ping").setExecutor(new PingCommand());
      
        System.out.println("Enabled!");
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
