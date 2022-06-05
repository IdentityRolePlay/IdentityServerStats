package bot

import bot.commands.BuildSlashCommands
import bot.listeners.CommandListener
import bot.listeners.Listener
import utils.logger.Logger
import net.dv8tion.jda.api.JDA
import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.entities.Activity
import net.dv8tion.jda.api.entities.Guild
import net.dv8tion.jda.api.requests.GatewayIntent
import net.dv8tion.jda.api.utils.ChunkingFilter
import net.dv8tion.jda.api.utils.cache.CacheFlag

object Identity {
    lateinit var builder: JDABuilder
    var isReady = false
    lateinit var jda: JDA
    lateinit var guild: Guild

    operator fun invoke(token: String) {
        Logger.info("Creating builder")
        builder = JDABuilder.createDefault(token)
        builder.setActivity(Activity.watching("Identity RP"))
        builder.addEventListeners(
            Listener(),
            CommandListener()
        )
        Logger.info("Building builder")
        jda = builder.build()
        jda.awaitReady()

        BuildSlashCommands(919816624121462786)

    }

    private fun configMemory(builder: JDABuilder) {
        Logger.info("Setting memory preferences")
        builder.disableCache(CacheFlag.ACTIVITY)
        builder.setChunkingFilter(ChunkingFilter.NONE)
        builder.disableIntents(GatewayIntent.GUILD_MESSAGES)
        builder.setLargeThreshold(50)
    }
}