package me.vlod.imgurscraper.discord.webhook;

public class DiscordEmbedAuthor {
	public String name;

	public DiscordEmbedAuthor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
