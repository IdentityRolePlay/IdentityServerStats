package bot.commands

import bot.Identity
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent
import utilities.embed.CommonEmbed

class InfoCommand(val event: SlashCommandInteractionEvent) {
    fun ping() {
        event.replyEmbeds(CommonEmbed().setDescription("Approximate ws ping: ${Identity.jda.gatewayPing}ms").build()).queue()
    }
}