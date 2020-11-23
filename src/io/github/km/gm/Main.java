
package io.github.km.gm;


import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Main extends JavaPlugin{

    Logger log = Logger.getLogger("Minecraft"); // Получили логгер маинкрафта

    @Override
    public void onEnable() {
        getLogger().info("Включен");
        getCommand("0").setExecutor(new gm0(this)); //регистрируем команду 0
        getCommand("1").setExecutor(new gm1(this)); //регистрируем команду 1
        getCommand("2").setExecutor(new gm2(this)); //регистрируем команду 2
        getCommand("3").setExecutor(new gm3(this)); //регистрируем команду 3
        // делаем ссылку на класс Commands
    }

    @Override
    public void onDisable(){
        getLogger().info("Выключен");
    }
}