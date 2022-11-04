package mochi.plugin;


import org.bukkit.*;
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
        Bukkit.broadcastMessage("welcome " + event.getPlayer().getName() + " to my server");
    }

    @EventHandler
    public void onPlayerSneak(PlayerToggleSneakEvent event) {

//        if (!event.getPlayer().isSneaking()) {
////            Bukkit.broadcastMessage("スニークしたぞ スニークの状態" +
////                    event.getPlayer().isSneaking());
//            World world = Bukkit.getWorld(event.getPlayer().getWorld().getUID());
//            Location PlayerLocation = event.getPlayer().getLocation();
//
//            Vector PlayerDire = PlayerLocation.getDirection().clone();
//            Fireball ball = (Fireball) Objects.requireNonNull(world).spawnEntity(PlayerLocation, EntityType.FIREBALL);
//            Vector BallDire = ball.getDirection();
////            Bukkit.broadcastMessage(String.valueOf(BallDire) + PlayerDire);
//            ball.setDirection(PlayerDire);
////            Firework FireWokRoket = (Firework) Objects.requireNonNull(world).spawnEntity(PlayerLocation, EntityType.FIREWORK);
////            FireworkMeta data = FireWokRoket.getFireworkMeta(:w);
////            data.addEffect(FireworkEffect.builder().withColor(Color.GREEN).withFlicker().flicker(true).withColor(Color.BLACK).with(FireworkEffect.Type.BALL_LARGE).build());
////            data.setPower(2);
////            FireWokRoket.setFireworkMeta(data);
//        }
    }
}
