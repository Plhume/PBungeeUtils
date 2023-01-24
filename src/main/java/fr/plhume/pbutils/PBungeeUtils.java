package fr.plhume.pbutils;

import net.md_5.bungee.api.plugin.Plugin;

public final class PBungeeUtils extends Plugin {

    @Override
    public void onEnable() {
        getProxy().getLogger().info("Plugin enabled!");
    }

    @Override
    public void onDisable() {
        getProxy().getLogger().info("Plugin disabled!");
    }
}
