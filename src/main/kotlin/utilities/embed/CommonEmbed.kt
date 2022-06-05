package utilities.embed

import bot.Identity
import net.dv8tion.jda.api.EmbedBuilder

class CommonEmbed : EmbedBuilder {
    constructor() {
        this.setAuthor(Identity.jda.selfUser.name, Identity.jda.selfUser.avatarUrl)
        this.setColor(255*65536+192*256+203)
    }
}