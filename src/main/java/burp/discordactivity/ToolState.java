package burp.discordactivity;

/**
 * Enum representing the different Burp Suite tools that can be tracked.
 * Vibe coded by @imXhandle | notrubberduck.space
 */
public enum ToolState {
    PROXY("Proxy"),
    IDLE("Idle");

    private final String displayName;

    ToolState(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

