package com.tistory.localhost.tutorialplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Tutorialplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup
        getLogger().info("플러그인 로딩됨.");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("플러그인 종료됨.");
    }
}
