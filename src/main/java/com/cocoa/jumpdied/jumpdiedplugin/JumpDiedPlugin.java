package com.cocoa.jumpdied.jumpdiedplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class JumpDiedPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new JumpEvent(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
