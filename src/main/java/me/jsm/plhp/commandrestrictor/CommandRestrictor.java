package me.jsm.plhp.commandrestrictor;

import org.bukkit.plugin.java.JavaPlugin;
import restrictor.Help;

public final class CommandRestrictor extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("Help").setExecutor(new Help());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
