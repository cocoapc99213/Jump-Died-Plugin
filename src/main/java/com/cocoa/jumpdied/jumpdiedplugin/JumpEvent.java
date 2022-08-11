package com.cocoa.jumpdied.jumpdiedplugin;

import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerStatisticIncrementEvent;

public class JumpEvent implements Listener {
    @EventHandler
    public void onPlayerStatisticIncrement(PlayerStatisticIncrementEvent event) {
        if (event.getPlayer().isOp()){
            return;
        }
        else{
            if(event.getStatistic() == Statistic.JUMP) {

                event.getPlayer().setHealth(0);
            }
        }
    }
}
