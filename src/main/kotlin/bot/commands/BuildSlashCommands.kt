package bot.commands

import bot.Identity
import net.dv8tion.jda.api.interactions.commands.build.Commands

class BuildSlashCommands(val guildId: Long? = null) {
    init {
        if(guildId != null) {
            val guild = Identity.jda.getGuildById(guildId)
            guild!!.updateCommands()
                .addCommands(Commands.slash("ping", "returns websocket ping"))

                .queue()
        }

    }
}