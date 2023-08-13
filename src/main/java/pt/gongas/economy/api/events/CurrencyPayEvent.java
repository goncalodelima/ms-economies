package pt.gongas.economy.api.events;

import lombok.Getter;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import pt.gongas.economy.user.User;

public class CurrencyPayEvent extends Event {

    @Getter
    private final HandlerList handlers = new HandlerList();
    @Getter
    private final User sender;
    @Getter
    private final User receiver;
    @Getter
    private final double amountPaid;

    public CurrencyPayEvent(User sender, User receiver, double amountPaid) {
        this.sender = sender;
        this.receiver = receiver;
        this.amountPaid = amountPaid;
    }

}
