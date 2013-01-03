package net.lazlecraft.potions;

import java.io.IOException;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Potions extends JavaPlugin implements Listener {

    @Override
    public void onEnable(){
    	
     try {
    	    Metrics metrics = new Metrics(this);
    	    metrics.start();
    	} catch (IOException e) {
    	    // Failed to submit the stats :-(
    	}
     
     PluginManager pm = getServer().getPluginManager();
     pm.registerEvents(new positive(), this);
     
    }
    
    //To whoever is reading this source, this is my notepad and the plugin's diary.
    //December 29, 12' Dear Diary. Today I got forked by LaxWasHere.
    //December 30, 12' Dear Diary. Today all my positive effects is finished.
    //December 30, 12' Dear Diary. Today LaxWasHere enrolled me to a class called Metrics.
    //December 31, 12' Dear Diary. Today LaxWasHere placed me inside a jar.
    //January  3,  12' Dear Diary. Today I got to ride in this amazing teleporter called FTP.
    //January  3,  12' Dear Diary. Today I arrived on this amazing hotel called GitHub.
    //
    //List of effects at http://lazle.us/WexCVI
    //Original code from http://dev.bukkit.org/server-mods/speed-boost/
    //Todo figure out how to add the damn Metrics. - Done
    //Todo Add all the negative potions effect.
    //Todo Add all neutral potions. Invi, Night Vision. Wither too?
    
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (!(sender instanceof Player)) {
        	//I hate commands from the console.
            sender.sendMessage("Go Away, Console!");
            return false;
        }
        Player p = (Player) sender;
        if (commandLabel.equalsIgnoreCase("potions") || commandLabel.equalsIgnoreCase("laxwashere")) {
        	p.sendMessage(ChatColor.GREEN + "List of all permissions can be found at http://lazle.us/PPotions");
        }
        return false;
    }
}