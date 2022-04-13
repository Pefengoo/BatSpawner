package me.Efe.CreeperSpawn.commands;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import me.Efe.CreeperSpawn.Main;

public class CreeperCommands implements CommandExecutor{
	private Main plugin;
	
	public CreeperCommands(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("creeperspawn").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender; 
		Location loc = p.getLocation();
		World w = p.getWorld();
		
		for(int i = 0; i < 10; i++) {
		    w.spawnEntity(loc, EntityType.CREEPER);
		}
		
		    return false;
	}
}
