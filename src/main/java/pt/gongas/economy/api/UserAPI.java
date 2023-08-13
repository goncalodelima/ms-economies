package pt.gongas.economy.api;

import pt.gongas.economy.EconomyPlugin;
import pt.gongas.economy.user.User;
import pt.gongas.economy.user.manager.UserManager;

public class UserAPI {

    private final UserManager userManager = EconomyPlugin.getInstance().getUserManager();

    /**
     * Loads the user associated with the given player name. If the user does not exist,
     * a new user instance is created and returned.
     *
     * @param playerName The name of the player for which to load the user.
     * @return The user instance associated with the player name, or a new user instance if it doesn't exist.
     */
    public User loadUser(String playerName) {
        return userManager.loadUser(playerName);
    }

    /**
     * Retrieves the user associated with the given player name, if it exists.
     *
     * @param playerName The name of the player for which to retrieve the user.
     * @return The user instance associated with the player name, or null if the user doesn't exist.
     */
    public User getUser(String playerName) {
        return userManager.getUser(playerName);
    }

}
