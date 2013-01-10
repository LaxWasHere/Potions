package net.lazlecraft.potions;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class positive implements Listener {
	public static Potions plugin;
	

	@EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player p = event.getPlayer();
        //speed boost
        if(p.hasPermission("potions.speed.one")) {
         p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 0));
        }
        if(p.hasPermission("potions.speed.two")) {
        	p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 1));
        }
        if(p.hasPermission("potions.speed.three")) {
        	p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 2));
        }
        // Jump boost
        if(p.hasPermission("potions.jump.one")) {
        	p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 0));
        }
        if(p.hasPermission("potions.jump.two")) {
        	p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 1));
        }
        if(p.hasPermission("potions.jump.three")) {
        	p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 2));
        }
        //Haste	 boost
        if(p.hasPermission("potions.haste.one")) {
        	p.removePotionEffect(PotionEffectType.FAST_DIGGING);
        	p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 18000, 0));
        }
        if(p.hasPermission("potions.haste.two")) {
        	p.removePotionEffect(PotionEffectType.FAST_DIGGING);
        	p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 18000, 1));
        }
        if(p.hasPermission("potions.haste.three")) {
        	p.removePotionEffect(PotionEffectType.FAST_DIGGING);
        	p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 18000, 2));
        }
        //Strength boost
        if(p.hasPermission("potions.strength.one")) {
        	p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
        	p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 18000, 0));
        }
        if(p.hasPermission("potions.strength.two")) {
        	p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
        	p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 18000, 1));
        }
        if(p.hasPermission("potions.strength.three")) {
        	p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
        	p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 18000, 2));
        
        }
    }
    
    @EventHandler
    public void onInventoryClose(InventoryCloseEvent event){
        Player p = (Player) event.getPlayer();
        //Speed boost
        if(p.hasPermission("potions.speed.one")) {
            p.removePotionEffect(PotionEffectType.SPEED);
               p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 0));
           }
           if(p.hasPermission("potions.speed.two")) {
           	p.removePotionEffect(PotionEffectType.SPEED);
               p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 1));
           }
           if(p.hasPermission("potions.speed.three")) {
           	p.removePotionEffect(PotionEffectType.SPEED);
               p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 2));
           }
           // Jump boost
           if(p.hasPermission("potions.jump.one")) {
           	p.removePotionEffect(PotionEffectType.JUMP);
               p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 0));
           }
           if(p.hasPermission("potions.jump.two")) {
           	p.removePotionEffect(PotionEffectType.JUMP);
               p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 1));
           }
           if(p.hasPermission("potions.jump.three")) {
           	p.removePotionEffect(PotionEffectType.JUMP);
               p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 2));
           }
           //Haste boost
           if(p.hasPermission("potions.haste.one")) {
           	p.removePotionEffect(PotionEffectType.FAST_DIGGING);
           	p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 18000, 0));
           }
           if(p.hasPermission("potions.haste.two")) {
           	p.removePotionEffect(PotionEffectType.FAST_DIGGING);
           	p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 18000, 1));
           }
           if(p.hasPermission("potions.haste.three")) {
           	p.removePotionEffect(PotionEffectType.FAST_DIGGING);
           	p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 18000, 2));
           }
           //Strength boost
           if(p.hasPermission("potions.strength.one")) {
           	p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
           	p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 18000, 0));
           }
           if(p.hasPermission("potions.strength.two")) {
           	p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
           	p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 18000, 1));
           }
           if(p.hasPermission("potions.strength.three")) {
           	p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
           	p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 18000, 2));
        }
    }
}
