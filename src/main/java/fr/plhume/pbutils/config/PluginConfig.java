package fr.plhume.pbutils.config;

import fr.plhume.pbutils.PBungeeUtils;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;

import java.io.File;
import java.io.IOException;

/**
 * @author Plhume
 */
@SuppressWarnings("all")
public class PluginConfig {

    private final PBungeeUtils plugin;

    public PluginConfig(PBungeeUtils plugin) {
        this.plugin = plugin;
    }

    public void createFile(String fileName){
        if(!plugin.getDataFolder().exists()){
            plugin.getDataFolder().mkdir();
        }

        File file = new File(plugin.getDataFolder(), fileName + ".yml");

        if(!file.exists()){
            try {
                file.createNewFile();

                if(fileName.equals("config")){
                    Configuration config = getConfig(fileName);

                    saveConfig(config, fileName);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Configuration getConfig(String fileName){
        try {
            return ConfigurationProvider.getProvider(YamlConfiguration.class).load(new File(plugin.getDataFolder(), fileName + ".yml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void saveConfig(Configuration config, String fileName){
        try {
            ConfigurationProvider.getProvider(YamlConfiguration.class).save(config, new File(plugin.getDataFolder(), fileName + ".yml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
