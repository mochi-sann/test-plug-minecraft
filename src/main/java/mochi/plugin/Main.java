package mochi.plugin;

import java.util.Objects;

import mochi.plugin.event.Kikori;
import mochi.plugin.spawn.FireCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("start plugin");
        Objects.requireNonNull(this.getCommand("kit"))
                .setExecutor(new CommandKit());

        Objects.requireNonNull(this.getCommand("fire"))
                .setExecutor(new FireCommand());
        getServer().getPluginManager().registerEvents(new MyEventListener(), this);
        getServer().getPluginManager().registerEvents(new Kikori(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("test disable");
    }
}
