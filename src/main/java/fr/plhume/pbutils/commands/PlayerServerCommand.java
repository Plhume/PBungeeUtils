package fr.plhume.pbutils.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

/**
 * @author Plhume
 */
public class PlayerServerCommand extends Command {
    public PlayerServerCommand() {
        super("getplayer");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (!sender.hasPermission("pbutils.getplayer")) {
            sender.sendMessage(new TextComponent(ChatColor.RED + "Vous n'avez pas la permission de faire cette commande !"));
            return;
        }

        if (args.length == 0) {
            sender.sendMessage(new TextComponent(ChatColor.RED + "Merci d'introduire des arguments dans votre commande !"));
            return;
        }
        }
    }
}

