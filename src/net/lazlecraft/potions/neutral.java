package net.lazlecraft.potions;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class neutral implements Listener {
	public static Potions plugin;

	@EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player p = event.getPlayer();
        //Invisibility
        if(p.hasPermission("potions.invisible")) {
            p.removePotionEffect(PotionEffectType.INVISIBILITY);
            p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 18000, 0));
        }
        if(p.hasPermission("potions.nightvision")); {
        	p.removePotionEffect(PotionEffectType.NIGHT_VISION);
        	p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 18000, 0));
        }
	}	
}
