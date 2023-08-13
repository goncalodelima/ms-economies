package pt.gongas.economy.api.events;

import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class OpenRankingEvent extends Event {

    @Getter
    private final HandlerList handlers = new HandlerList();
    @Getter
    private final Player player;
    @Getter
    private final String currency;

    public OpenRankingEvent(Player player, String currency) {
        this.player = player;
        this.currency = currency;
    }

}
