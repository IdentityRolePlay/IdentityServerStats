package bot.listeners

import bot.Identity
import net.dv8tion.jda.api.events.ReadyEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter
import utils.logger.Logger

class Listener : ListenerAdapter() {
    @Override
    override fun onReady(event: ReadyEvent) {
        Logger.info("${event.jda.selfUser.name} is ready")
        Identity.isReady = true;
    }
}