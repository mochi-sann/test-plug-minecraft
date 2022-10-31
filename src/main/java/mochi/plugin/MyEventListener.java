package mochi.plugin;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

import java.util.Objects;

public class MyEventListener implements Listener {
    /**
     * プレイヤーが入ったら動く
     * @param event イベント
     */
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Bukkit.broadcastMessage("welcome " + event.getPlayer().getName() + " to my server");

    }

    @EventHandler
    public void onPlayerneak(PlayerToggleSneakEvent event ) {

        if (!event.getPlayer().isSneaking()) {

//            Bukkit.broadcastMessage("スニークしたぞ スニークの状態" + event.getPlayer().isSneaking());
            World world = Bukkit.getWorld(event.getPlayer().getWorld().getUID())
                    ;
            Location PlyerLocation = event.getPlayer().getLocation();
            Bukkit.broadcastMessage(String.valueOf(PlyerLocation.getX()));
            Objects.requireNonNull(world).spawnEntity(PlyerLocation, EntityType.FIREWORK);
        }
    }

}

