package fr.plhume.pbutils;

import fr.plhume.pbutils.commands.BroadcastCommand;
import fr.plhume.pbutils.commands.PlayerServerCommand;
import fr.plhume.pbutils.config.PluginConfig;
import net.md_5.bungee.api.plugin.Plugin;

/**
 * @author Plhume
 */
public final class PBungeeUtils extends Plugin {

    private PluginConfig pConfig;

    @Override
    public void onEnable() {
        this.pConfig = new PluginConfig(this);
        pConfig.createFile("config");

        getProxy().getPluginManager().registerCommand(this, new BroadcastCommand());
        getProxy().getPluginManager().registerCommand(this, new PlayerServerCommand());
    }

    @Override
    public void onDisable() {
    }

    public PluginConfig getPluginConfig() {
        return pConfig;
    }
}
