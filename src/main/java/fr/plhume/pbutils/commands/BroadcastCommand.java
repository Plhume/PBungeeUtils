package fr.plhume.pbutils.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

/**
 * @author Plhume
 */
public class BroadcastCommand extends Command {
    public BroadcastCommand() {
        super("bungeebc");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (!sender.hasPermission("pbutils.bc")) {
            sender.sendMessage(new TextComponent(ChatColor.RED + "Vous n'avez pas la permission de faire cette commande !"));
            return;
        }

        if (args.length == 0) {
            sender.sendMessage(new TextComponent(ChatColor.RED + "Merci d'introduire des arguments dans votre commande !"));
            return;
        }

        StringBuilder sb = new StringBuilder();

        for (String arg : args) {
            sb.append(arg).append(" ");
        }

        String s = sb.toString();
        String coloredString = ChatColor.translateAlternateColorCodes('&', s);
        String prefix = ChatColor.translateAlternateColorCodes('&', "§c[InfoServeur] &6");

        ProxyServer.getInstance().broadcast(new TextComponent(prefix + coloredString));
    }
}
