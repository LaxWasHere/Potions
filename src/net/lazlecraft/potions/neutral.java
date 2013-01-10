package net.lazlecraft.potions;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class neutral implements Listener {
	public static Potions plugin;

	@EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player p = event.getPlayer();
        if(p.hasPermission("potions.neutral.invisible")) {
        	System.out.println("OJ INVI");
         p.removePotionEffect(PotionEffectType.INVISIBILITY);
            p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 18000, 1));
        }
        if(p.hasPermission("potions.neutral.nightvision")) {
        	System.out.println("OJ INVI");
        	p.removePotionEffect(PotionEffectType.NIGHT_VISION);
            p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 18000, 1));
        }
        if(p.hasPermission("potions.neutral.aqua")) {
        	System.out.println("OJ INVI");
        	p.removePotionEffect(PotionEffectType.WATER_BREATHING);
            p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 18000, 1));
        }
	}
	
        @EventHandler
        public void onInventoryClose(InventoryCloseEvent event){
            Player p = (Player) event.getPlayer();
            //Invisible
            if(p.hasPermission("potions.neutral.invisible")) {
            	System.out.println("IC INVI");
             p.removePotionEffect(PotionEffectType.INVISIBILITY);
                p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 18000, 1));
            }
            if(p.hasPermission("potions.neutral.nightvision")) {
            	System.out.println("IC INVI");
            	p.removePotionEffect(PotionEffectType.NIGHT_VISION);
                p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 18000, 1));
            }
            if(p.hasPermission("potions.neutral.aqua")) {
            	System.out.println("IC INVI");
            	p.removePotionEffect(PotionEffectType.WATER_BREATHING);
                p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 18000, 1));
           }
     }
}