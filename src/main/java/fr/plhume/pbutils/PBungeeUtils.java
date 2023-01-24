package fr.plhume.pbutils;

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

        getProxy().getLogger().info("Plugin enabled!");
    }

    @Override
    public void onDisable() {
        getProxy().getLogger().info("Plugin disabled!");
    }
}
