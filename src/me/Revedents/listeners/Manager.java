package me.Revedents.listeners;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

import me.Revedents.Main;
import me.Revedents.listeners.entity.EntityDamage;
import me.Revedents.listeners.entity.EntitySpawn;
import me.Revedents.listeners.player.BlockBreak;
import me.Revedents.listeners.player.BlockPlace;
import me.Revedents.listeners.player.PlayerJoin;
import me.Revedents.listeners.player.PlayerMove;
import me.Revedents.listeners.player.PlayerQuit;
import me.Revedents.listeners.useless.CraftItem;
import me.Revedents.listeners.useless.ExplosionPrime;
import me.Revedents.listeners.useless.FoodLevelChange;
import me.Revedents.listeners.useless.InventoryOpen;
import me.Revedents.listeners.useless.PlayerDropItem;
import me.Revedents.listeners.useless.PortalCreate;
import me.Revedents.listeners.useless.WeatherChange;
import me.Revedents.selector.SelectorManager;

public class Manager extends Main {

	// Register the events for the Boot Method.
	public static void register() {
		final PluginManager manager = Bukkit.getPluginManager();
		manager.registerEvents(new PlayerJoin(), Main.getInstance());
		manager.registerEvents(new PlayerQuit(), Main.getInstance());
		manager.registerEvents(new PlayerMove(), Main.getInstance());
		manager.registerEvents(new BlockBreak(), Main.getInstance());
		manager.registerEvents(new BlockPlace(), Main.getInstance());
		manager.registerEvents(new EntityDamage(), Main.getInstance());
		manager.registerEvents(new EntitySpawn(), Main.getInstance());
		manager.registerEvents(new CraftItem(), Main.getInstance());
		manager.registerEvents(new ExplosionPrime(), Main.getInstance());
		manager.registerEvents(new FoodLevelChange(), Main.getInstance());
		manager.registerEvents(new InventoryOpen(), Main.getInstance());
		manager.registerEvents(new PlayerDropItem(), Main.getInstance());
		manager.registerEvents(new PortalCreate(), Main.getInstance());
		manager.registerEvents(new WeatherChange(), Main.getInstance());
		manager.registerEvents(new SelectorManager(), Main.getInstance());
	}
}