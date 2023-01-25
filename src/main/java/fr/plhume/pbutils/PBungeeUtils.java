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
    }

    @Override
    public void onDisable() {
    }

    public PluginConfig getPluginConfig() {
        return pConfig;
    }
}
