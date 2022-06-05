import bot.Identity
import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvException;
import utils.logger.Logger

fun main(args: Array<String>) {
    val dotenv = Dotenv.configure().load()

    Logger.info("Launching...")
    Identity(dotenv.get("TOKEN"))
}