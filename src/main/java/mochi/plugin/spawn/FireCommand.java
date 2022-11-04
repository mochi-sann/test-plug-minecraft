package mochi.plugin.spawn;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import java.util.Objects;

public class FireCommand implements CommandExecutor {


    /**
     * Executes the given command, returning its success.
     * <br>
     * If false is returned, then the "usage" plugin.yml entry for this command
     * (if defined) will be sent to the player.
     *
     * @param sender  Source of the command
     * @param command Command which was executed
     * @param label   Alias of the command which was used
     * @param args    Passed command arguments
     * @return true if a valid command, otherwise false
     */
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            int number = Integer.parseInt(args[0]);
            Player player = (Player) sender;
            Location PlayerLoc = player.getLocation();
            World world = Bukkit.getWorld(player.getWorld().getUID());

            for (int i = 0; i < number; i++) {

                Location FireballLoc = PlayerLoc.clone();
                FireballLoc.setX(FireballLoc.getX() + i);
                Fireball ball = (Fireball) Objects.requireNonNull(world).spawnEntity(FireballLoc, EntityType.FIREBALL);

                ball.setDirection(PlayerLoc.getDirection());

//                Bukkit.broadcastMessage(String.valueOf(i));

//                Bukkit.getScheduler ().runTaskLater ((Plugin) this, () -> Bukkit.broadcastMessage ("2"), 5);
            }


            // Here we need to give items to our player
            // Create a new ItemStack (type: diamond)

        }

        return false;
    }
}
