package bot.listeners

import bot.commands.InfoCommand
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter

class CommandListener : ListenerAdapter() {

    @Override
    override fun onSlashCommandInteraction(event: SlashCommandInteractionEvent) {
        if(event.guild == null) return

        when(event.name) {
            "ping" -> InfoCommand(event).ping()
            else -> event.reply("Could not find this command").setEphemeral(true)
        }
    }
}