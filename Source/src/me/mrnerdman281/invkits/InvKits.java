package me.mrnerdman281.invkits;

import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class InvKits extends JavaPlugin {
  
	public final Logger log = Logger.getLogger("Minecraft");
	
	@Override
	public void onEnable() {
		PluginDescriptionFile desc = this.getDescription();
		log.info(desc.getName() + " v" + desc.getVersion() + " has been enabled. How cool is that?!");
	}
	
	@Override
	public void onDisable() {
		PluginDescriptionFile desc = this.getDescription();
		log.info(desc.getName() + " has been disabled.");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(cmd.getName().equalsIgnoreCase("invkit")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				if(args.length == 1) {
					if(args[0].equalsIgnoreCase("diamond")) {
						if (player.hasPermission("invkit.diamond")) {
							player.getInventory().addItem(new ItemStack(276), new ItemStack(277), new ItemStack(278), new ItemStack(279), new ItemStack(293));
							player.getInventory().setHelmet(new ItemStack(310));
							player.getInventory().setChestplate(new ItemStack(311));
							player.getInventory().setLeggings(new ItemStack(312));
							player.getInventory().setBoots(new ItemStack(313));
							Bukkit.getServer().broadcastMessage(ChatColor.BOLD + player.getDisplayName() + ChatColor.RESET + " received a " + ChatColor.AQUA + "diamond" + ChatColor.RESET + " inventory kit!");
						}else {
							player.sendMessage(ChatColor.RED + "Error: You do not have sufficient permissions");
						}
						return true;
					}else if(args[0].equalsIgnoreCase("gold")) {
						if (player.hasPermission("invkit.gold")) {
							player.getInventory().addItem(new ItemStack(283), new ItemStack(284), new ItemStack(285), new ItemStack(286), new ItemStack(294));
							player.getInventory().setHelmet(new ItemStack(314));
							player.getInventory().setChestplate(new ItemStack(315));
							player.getInventory().setLeggings(new ItemStack(316));
							player.getInventory().setBoots(new ItemStack(317));
							Bukkit.getServer().broadcastMessage(ChatColor.BOLD + player.getDisplayName() + ChatColor.RESET + " received a " + ChatColor.GOLD + "gold" + ChatColor.RESET + " inventory kit!");
						}else {
							player.sendMessage(ChatColor.RED + "Error: You do not have sufficient permissions");
						}
						return true;
					}else if(args[0].equalsIgnoreCase("stone")) {
						if (player.hasPermission("invkit.stone")) {
							player.getInventory().addItem(new ItemStack(272), new ItemStack(273), new ItemStack(274), new ItemStack(275), new ItemStack(291));
							player.getInventory().setHelmet(new ItemStack(298));
							player.getInventory().setChestplate(new ItemStack(299));
							player.getInventory().setLeggings(new ItemStack(300));
							player.getInventory().setBoots(new ItemStack(301));
							Bukkit.getServer().broadcastMessage(ChatColor.BOLD + player.getDisplayName() + ChatColor.RESET + " received a " + ChatColor.GRAY + "stone" + ChatColor.RESET + " inventory kit, with " + ChatColor.BLACK + "leather" + ChatColor.RESET + " armor!");
						}else {
							player.sendMessage(ChatColor.RED + "Error: You do not have sufficient permissions");
						}
						return true;
					}else if(args[0].equalsIgnoreCase("wood")) {
						if (player.hasPermission("invkit.wood")) {
							player.getInventory().addItem(new ItemStack(268), new ItemStack(269), new ItemStack(270), new ItemStack(271), new ItemStack(290));
							Bukkit.getServer().broadcastMessage(ChatColor.BOLD + player.getDisplayName() + ChatColor.RESET + " received a " + ChatColor.BLACK + "wood" + ChatColor.RESET + " inventory kit!");
						}else {
							player.sendMessage(ChatColor.RED + "Error: You do not have sufficient permissions");
						}
						return true;
					}else {
						player.sendMessage(ChatColor.RED + "Error: \"" + args[0] + "\" is not a valid material");
					}
				}else if(args.length == 2) {
					if(Bukkit.getServer().getPlayer(args[1]).isOnline()) {
						Player receiver = Bukkit.getServer().getPlayer(args[1]);
						if(args[0].equalsIgnoreCase("diamond")) {
							if (receiver.hasPermission("invkit.give.diamond")) {
								receiver.getInventory().addItem(new ItemStack(276), new ItemStack(277), new ItemStack(278), new ItemStack(279), new ItemStack(293));
								receiver.getInventory().setHelmet(new ItemStack(310));
								receiver.getInventory().setChestplate(new ItemStack(311));
								receiver.getInventory().setLeggings(new ItemStack(312));
								receiver.getInventory().setBoots(new ItemStack(313));
								Bukkit.getServer().broadcastMessage(ChatColor.BOLD + receiver.getDisplayName() + ChatColor.RESET + " received a " + ChatColor.AQUA + "diamond" + ChatColor.RESET + " inventory kit from" + ChatColor.BOLD + player.getDisplayName() + ChatColor.RESET + "!");
							}else {
								player.sendMessage(ChatColor.RED + "Error: You do not have sufficient permissions");
							}
							return true;
						}else if(args[0].equalsIgnoreCase("gold")) {
							if (receiver.hasPermission("invkit.give.gold")) {
								receiver.getInventory().addItem(new ItemStack(283), new ItemStack(284), new ItemStack(285), new ItemStack(286), new ItemStack(294));
								receiver.getInventory().setHelmet(new ItemStack(314));
								receiver.getInventory().setChestplate(new ItemStack(315));
								receiver.getInventory().setLeggings(new ItemStack(316));
								receiver.getInventory().setBoots(new ItemStack(317));
								Bukkit.getServer().broadcastMessage(ChatColor.BOLD + receiver.getDisplayName() + ChatColor.RESET + " received a " + ChatColor.GOLD + "gold" + ChatColor.RESET + " inventory kit from" + ChatColor.BOLD + player.getDisplayName() + ChatColor.RESET + "!");
							}else {
								player.sendMessage(ChatColor.RED + "Error: You do not have sufficient permissions");
							}
							return true;
						}else if(args[0].equalsIgnoreCase("stone")) {
							if (receiver.hasPermission("invkit.give.stone")) {
								receiver.getInventory().addItem(new ItemStack(272), new ItemStack(273), new ItemStack(274), new ItemStack(275), new ItemStack(291));
								receiver.getInventory().setHelmet(new ItemStack(298));
								receiver.getInventory().setChestplate(new ItemStack(299));
								receiver.getInventory().setLeggings(new ItemStack(300));
								receiver.getInventory().setBoots(new ItemStack(301));
								Bukkit.getServer().broadcastMessage(ChatColor.BOLD + receiver.getDisplayName() + ChatColor.RESET + " received a " + ChatColor.GRAY + "stone" + ChatColor.RESET + " inventory kit, with " + ChatColor.BLACK + "leather" + ChatColor.RESET + " armor, from" + ChatColor.BOLD + player.getDisplayName() + ChatColor.RESET + "!");
							}else {
								player.sendMessage(ChatColor.RED + "Error: You do not have sufficient permissions");
							}
							return true;
						}else if(args[0].equalsIgnoreCase("wood")) {
							if (receiver.hasPermission("invkit.give.wood")) {
								receiver.getInventory().addItem(new ItemStack(268), new ItemStack(269), new ItemStack(270), new ItemStack(271), new ItemStack(290));
								Bukkit.getServer().broadcastMessage(ChatColor.BOLD + receiver.getDisplayName() + ChatColor.RESET + " received a " + ChatColor.BLACK + "wood" + ChatColor.RESET + " inventory kit from" + ChatColor.BOLD + player.getDisplayName() + ChatColor.RESET + "!");
							}else {
								player.sendMessage(ChatColor.RED + "Error: You do not have sufficient permissions");
							}
							return true;
						}else {
							player.sendMessage(ChatColor.RED + "Error: \"" + args[0] + "\" is not a valid material");
						}
					}else {
						player.sendMessage(ChatColor.RED + "Error: \"" + args[1] + "\" is not online");
					}
				}else {
					player.sendMessage(ChatColor.RED + "Error: This command has 1 or 2 argument(s), not " + args.length);
				}
			}else {
				sender.sendMessage("This command is for players");
				return true;
			}
		}else if(cmd.getName().equalsIgnoreCase("invclear")) {
			if(sender instanceof Player) {
				Player player = (Player) sender;
				if(args.length == 0) {
					player.getInventory().clear();
					Bukkit.getServer().broadcastMessage(ChatColor.BOLD + player.getDisplayName() + ChatColor.RESET + " cleared their inventory!");
					return true;
				}else {
					player.sendMessage(ChatColor.RED + "Error: This command does not have any arguments");
				}
			}else {
				sender.sendMessage("This command is for players");
				return true;
			}
		}
		return false;
	}
	
}

