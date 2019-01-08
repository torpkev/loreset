package work.torp.loreset;

import org.bukkit.plugin.java.JavaPlugin;
import work.torp.loreset.commands.Lore;
import work.torp.loreset.alerts.Alert;
import work.torp.loreset.Main;


public class Main extends JavaPlugin {
	
	// Main
	private static Main instance;
    public static Main getInstance() {
		return instance;
	}
    
    // On Enable/Disable
    @Override
	public void onEnable() {
    	
    	instance = this;
		saveDefaultConfig();
		Alert.Log("Main", "Starting Lore-Set");

    	
    	getCommand("lore").setExecutor(new Lore()); // Register my command
    }
    
    @Override
	public void onDisable() {

    }
}
