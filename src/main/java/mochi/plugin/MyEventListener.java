package mochi.plugin;

import java.util.Objects;

import org.bukkit.*;
import org.bukkit.block.data.type.Fire;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.meta.FireworkMeta;

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
//            Bukkit.broadcastMessage("スニークしたぞ スニークの状態" +
//                    event.getPlayer().isSneaking());
            World world = Bukkit.getWorld(event.getPlayer().getWorld().getUID());
            Location PlayerLocation = event.getPlayer().getLocation();
            Bukkit.broadcastMessage(String.valueOf(PlayerLocation.getX()));

            Bukkit.broadcastMessage(String.valueOf(PlayerLocation.getY()));
            PlayerLocation.add(3, 3, 3).setYaw(0);
            PlayerLocation.setPitch(20);
            Firework FireWokRoket = (Firework) Objects.requireNonNull(world).spawnEntity(PlayerLocation, EntityType.FIREWORK);
            FireworkMeta data = FireWokRoket.getFireworkMeta();
            data.addEffect(FireworkEffect.builder().withColor(Color.GREEN).withFlicker().flicker(true).withColor(Color.BLACK).with(FireworkEffect.Type.BALL_LARGE).build());
            data.setPower(2);
            FireWokRoket.setFireworkMeta(data);
        }
    }
}
