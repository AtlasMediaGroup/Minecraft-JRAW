package me.totalfreedom.jraw;

import org.bukkit.plugin.java.JavaPlugin;

public class JRAW extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        getLogger().info("Successfully loaded JRAW.");
    }

    @Override
    public void onDisable()
    {
        getLogger().info("Successfully unloaded JRAW.");
    }
}