  
package io.github.km.gm;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gm1 implements CommandExecutor {


    private Main plugin;
	public gm1(Main plugin) {
		this.plugin = plugin;
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)) { //�������� �� ��� ����������� ������� ���� �������?
            sender.sendMessage("�� ���������� ������� �� �� ������!");
            return true;
        }
        Player p = (Player) sender; // ������� ������!
        p.setGameMode(GameMode.CREATIVE); // ��������������� 10 ������, 1 ������ - 2 �������.
        p.sendMessage(ChatColor.GREEN + "��1!"); // ��������� ������ ����� �����������.
        return true;
    }
}