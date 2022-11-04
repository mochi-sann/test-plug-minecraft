package mochi.plugin.event;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

/**
 *
 */
public class Kikori implements Listener {
    @EventHandler
    public void onPlayerDestroyingTree(BlockBreakEvent event) {

        Block b = event.getBlock();
        Player player = event.getPlayer();
//        Bukkit.broadcastMessage(b.toString());
//

        if (b.getType() == Material.OAK_LOG) {
            Bukkit.broadcastMessage("オークを破壊しました");
        }

    }
}
