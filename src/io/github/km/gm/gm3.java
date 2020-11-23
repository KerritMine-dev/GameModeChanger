  
package io.github.km.gm;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gm3 implements CommandExecutor {


    private Main plugin;
	public gm3(Main plugin) {
		this.plugin = plugin;
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)) { //Является ли наш отправитель команды хеал игроком?
            sender.sendMessage("Вы выполняете команду не от игрока!");
            return true;
        }
        Player p = (Player) sender; // Создаем объект!
        p.setGameMode(GameMode.SPECTATOR); // Восстанавливаем 10 сердец, 1 сердце - 2 единицы.
        p.sendMessage(ChatColor.GREEN + "Гм3!"); // Сообщение игроку после восстановки.
        return true;
    }
}