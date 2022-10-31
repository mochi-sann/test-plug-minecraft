package mochi.plugin;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.Objects;


public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("start plugin");
        Objects.requireNonNull(this.getCommand("kit")).setExecutor(new CommandKit());

        getServer().getPluginManager().registerEvents(new MyEventListener(), this);



    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("test disable");

    }


}