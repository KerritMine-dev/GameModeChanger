
package io.github.km.gm;


import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Main extends JavaPlugin{

    Logger log = Logger.getLogger("Minecraft"); // �������� ������ ����������

    @Override
    public void onEnable() {
        getLogger().info("�������");
        getCommand("0").setExecutor(new gm0(this)); //������������ ������� 0
        getCommand("1").setExecutor(new gm1(this)); //������������ ������� 1
        getCommand("2").setExecutor(new gm2(this)); //������������ ������� 2
        getCommand("3").setExecutor(new gm3(this)); //������������ ������� 3
        // ������ ������ �� ����� Commands
    }

    @Override
    public void onDisable(){
        getLogger().info("��������");
    }
}