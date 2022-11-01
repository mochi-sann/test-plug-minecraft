package mochi.plugin;

import java.util.Objects;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("start plugin");
        Objects.requireNonNull(this.getCommand("kit"))
                .setExecutor(new CommandKit());

        getServer().getPluginManager().registerEvents(new MyEventListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("test disable");
    }
}
