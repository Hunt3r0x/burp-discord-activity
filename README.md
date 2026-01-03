# Burp Discord Activity

Show off your Burp Suite work on Discord! This extension updates your Discord status to show what tools you're using and what target you're testing.

**Vibe coded by [@imXhandle](https://twitter.com/imXhandle) | [notrubberduck.space](https://notrubberduck.space)**

## What It Does

- Shows your active Burp Suite tools (Proxy, Repeater, Intruder, Scanner) on Discord
- Displays your current target domain
- Auto-switches to "Idle" after 5 minutes of no activity
- Handles multiple tools at once
- Reconnects automatically if Discord restarts

## Quick Start

1. **Build it**: `gradlew clean build` (or `gradlew.bat clean build` on Windows)
2. **Load in Burp**: Extensions → Add → Select `build/libs/BurpDiscordActivity-1.0.0.jar`
3. **Run Discord**: Make sure Discord desktop app is open
4. **Start hacking**: Your Discord status will update automatically!

## Requirements

- Java 17+
- Burp Suite (Pro or Community with Montoya API)
- Discord desktop app

## How It Looks

**When you're active:**
- Details: `Testing example.com`
- State: `Proxy, Scanner • Burp Suite`

**When idle:**
- Details: `Testing None`
- State: `Idle • Burp Suite`

## Troubleshooting

- **Discord not updating?** Make sure Discord desktop app is running
- **Extension not loading?** Check Burp's Errors tab for details
- **Wrong info showing?** It shows the most common target from your last 50 requests

## What I Added

I created this extension to:
- Track Burp Suite tool activity in real-time
- Display target domains from HTTP requests
- Handle Discord connection issues gracefully
- Support multiple simultaneous tools
- Add idle detection after 5 minutes
- Include proper error handling and reconnection logic

## Tech Stuff

Built with Java 17 and the Burp Suite Montoya API. Uses Discord IPC for Rich Presence updates. All dependencies are bundled in the JAR.

## License

Free to use for educational and professional purposes.

## Author

Vibe coded by **[@imXhandle](https://twitter.com/imXhandle)** | **[notrubberduck.space](https://notrubberduck.space)**