package aaaaaaaaaaaa.aaaaaaaaaaaaaaa;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public final class Aaaaaaaaaaaaaaa extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("start plugin");

    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("test disable");

    }
    /**
     * コマンド実行処理
     */
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
        // test コマンドの処理
        if(cmd.getName().equalsIgnoreCase("test")){
            // 取りあえずログ出力して終わる
            getLogger().info(String.valueOf(RunTest.add(1000 , 200)));

        }
        // 該当するコマンド無し
        return false;
    }
}