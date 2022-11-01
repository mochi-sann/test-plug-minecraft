package mochi.plugin;

import java.util.Objects;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class MyEventListener implements Listener {
    /**
     * プレイヤーが入ったら動く
     *
     * @param event イベント
     */
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Bukkit.broadcastMessage("welcome " + event.getPlayer().getName() +
                " to my server");
    }

    @EventHandler
    public void onPlayerSneak(PlayerToggleSneakEvent event) {

        if (!event.getPlayer().isSneaking()) {

            Bukkit.broadcastMessage("スニークしたぞ スニークの状態" +
                    event.getPlayer().isSneaking());
            World world = Bukkit.getWorld(event.getPlayer().getWorld().getUID());
            Location PlayerLocation = event.getPlayer().getLocation();
            Bukkit.broadcastMessage(String.valueOf(PlayerLocation.getX()));
            EntityType FireWork = EntityType.FIREWORK;
            Objects.requireNonNull(world).spawnEntity(PlayerLocation, FireWork);
        }
    }
}
