package it.dorayakimc.core;

import org.bukkit.plugin.java.JavaPlugin;

public final class DorayakiCore extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        getLogger().info("§a[DorayakiCore] Anti-Cheat Core abilitato con successo per ᴅᴏʀᴀʏᴀᴋɪᴍᴄ!");
    }

    @Override
    public void onDisable() {
        getLogger().info("§c[DorayakiCore] Anti-Cheat Core disabilitato.");
    }
}
